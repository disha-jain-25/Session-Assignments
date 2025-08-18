package com.example.EduHub.service;

import com.example.EduHub.dto.AuthResponse;
import com.example.EduHub.dto.LoginDto;
import com.example.EduHub.dto.UserRegisterRequestDTO;

public interface AuthService {

     String registerUser(UserRegisterRequestDTO dto);
     AuthResponse loginUser(LoginDto dto);
}
