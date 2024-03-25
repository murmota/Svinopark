package com.example.Svinopark.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ticket", schema = "schema", catalog = "Svinopark")
public class Ticket {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long ticketId;
    @Column(name = "time")
    private String time;
    @ManyToOne
    @JoinColumn(name  = "ticketcategoryid")
    private TicketCategory ticketCategory;
    @ManyToOne
    @JoinColumn(name  = "employeeid")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name  = "userid")
    private User user;
}
