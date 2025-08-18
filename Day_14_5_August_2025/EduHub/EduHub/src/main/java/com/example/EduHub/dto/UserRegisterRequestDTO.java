package com.example.EduHub.dto;

import com.example.EduHub.enums.UserType;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterRequestDTO {
    private String name;
    private String email;
    private String password;
    private UserType userType;

    // For STUDENT
    private String collegeName;
    private String course;
    private Integer year;

    // For XEROX_SHOP
    private String location;
    private String contactNumber;
}

