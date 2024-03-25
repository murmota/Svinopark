package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "foodtype", schema = "schema", catalog = "Svinopark")
public class FoodType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int foodTypeId;
    @Column(name = "foodtypename")
    private String foodTypeName;
}
