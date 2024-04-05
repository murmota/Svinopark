package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cage", schema = "schema", catalog = "Svinopark")
public class Cage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long cageId;
    @Column(name = "size")
    private int size;
    @ManyToOne
    @JoinColumn(name = "foodtypeid")
    private FoodType foodType;
}
