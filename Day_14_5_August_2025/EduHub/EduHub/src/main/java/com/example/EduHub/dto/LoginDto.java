package com.example.EduHub.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class LoginDto {
    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}