package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cage", schema = "schema", catalog = "Svinopark")
public class Cage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int cageId;
    @Column(name = "animalage")
    private int size;
    @ManyToOne
    @JoinColumn(name = "foodtypeid")
    private Area area;
}
