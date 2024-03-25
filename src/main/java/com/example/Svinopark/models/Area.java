package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "area", schema = "schema", catalog = "Svinopark")
public class Area {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long areaId;
    @Column(name = "areaName")
    private String areaName;
}
