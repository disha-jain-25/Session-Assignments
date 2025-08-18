package com.example.EduHub.controller;

import com.example.EduHub.dto.*;
import com.example.EduHub.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRegisterRequestDTO dto) {
        String response = authService.registerUser(dto);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDto dto) {
        AuthResponse response = authService.loginUser(dto);
        return ResponseEntity.ok(response);
    }
}

