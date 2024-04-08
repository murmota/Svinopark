package com.example.Svinopark.dto;

import lombok.Data;

@Data
public class SignupRequest {
    private String userName;
    private int age;
    private String password;
}
