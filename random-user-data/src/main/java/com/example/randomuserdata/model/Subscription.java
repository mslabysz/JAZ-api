package com.example.randomuserdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subscription {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String plan;
    private String status;
    private String paymentMethod;
    private String term;
    @OneToOne
    private User user;
}
