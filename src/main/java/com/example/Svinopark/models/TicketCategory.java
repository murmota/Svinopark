package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticketcategory", schema = "schema", catalog = "Svinopark")
public class TicketCategory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int ticketCategoryId;
    @Column(name = "tickettype")
    private String ticketType;
    @Column(name = "price")
    private double price;
}
