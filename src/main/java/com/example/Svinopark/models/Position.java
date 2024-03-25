package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "position", schema = "schema", catalog = "Svinopark")
public class Position {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long positionId;
    @Column(name = "positionname")
    private String positionName;
}
