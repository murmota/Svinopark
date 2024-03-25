package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "animal", schema = "schema", catalog = "Svinopark")
public class Animal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long animalId;
    @Column(name = "animalname")
    private String animalName;
    @Column(name = "animalage")
    private int animalAge;
    @ManyToOne
    @JoinColumn(referencedColumnName = "foodtypeid")
    private FoodType foodType;
    @ManyToOne
    @JoinColumn(referencedColumnName = "cageid")
    private Cage cage;
}
