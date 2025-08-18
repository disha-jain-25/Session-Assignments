package com.example.EduHub.service.impl;

import com.example.EduHub.dto.*;
import com.example.EduHub.entity.Student;
import com.example.EduHub.entity.User;
import com.example.EduHub.entity.XeroxShop;
import com.example.EduHub.enums.UserType;
import com.example.EduHub.repository.StudentRepository;
import com.example.EduHub.repository.UserRepository;
import com.example.EduHub.repository.XeroxShopRepository;
import com.example.EduHub.security.JwtService;
import com.example.EduHub.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final StudentRepository studentRepository;
    private final XeroxShopRepository xeroxShopRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;


    public String registerUser(UserRegisterRequestDTO dto) {
        if (userRepository.findByEmail(dto.getEmail()).isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        User user = User.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .password(passwordEncoder.encode(dto.getPassword()))
                .userType(dto.getUserType())
                .build();

        user = userRepository.save(user);
        if (dto.getUserType() == UserType.STUDENT) {
            Student student = new Student();
            student.setCollegeName(dto.getCollegeName());
            student.setCourse(dto.getCourse());
            student.setYear(dto.getYear());
            student.setUser(user);
            studentRepository.save(student);
        } else if (dto.getUserType() == UserType.XEROX_SHOP) {
            XeroxShop xeroxShop = new XeroxShop();
            xeroxShop.setLocation(dto.getLocation());
            xeroxShop.setContactNumber(dto.getContactNumber());
            xeroxShop.setUser(user);
            xeroxShopRepository.save(xeroxShop);
        }
        return "User registered successfully as " + dto.getUserType();
    }

    @Override
    public AuthResponse loginUser(LoginDto dto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword())
        );

        User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        String accessToken = jwtService.generateAccessToken(user);
        String refreshToken = jwtService.generateRefreshToken(user);

        return new AuthResponse(accessToken, refreshToken,"Login Successfully");
    }
}

