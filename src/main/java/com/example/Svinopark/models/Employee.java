package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee", schema = "schema", catalog = "Svinopark")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long employeeId;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "birthdate")
    private String birthDate;
    @Column(name = "employeesex")
    private String employeeSex;
    @Column(name = "passport")
    private String passport;
    @ManyToOne
    @JoinColumn(referencedColumnName = "positionid")
    private Position position;
    @ManyToOne
    @JoinColumn(referencedColumnName = "areaid")
    private Area area;
}
