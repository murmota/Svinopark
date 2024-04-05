package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "User", schema = "schema", catalog = "Svinopark")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long userId;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userAge")
    private int userAge;
    @Column(name = "role")
    private String role;
}
