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
    @JoinColumn(referencedColumnName = "ticketcategoryid")
    private TicketCategory ticketCategory;
    @ManyToOne
    @JoinColumn(referencedColumnName = "employeeid")
    private Employee employee;
    @ManyToOne
    @JoinColumn(referencedColumnName = "userid")
    private User user;
}
