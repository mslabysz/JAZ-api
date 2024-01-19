package com.example.randomuserdata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class User {
    @Id
    private int id;
    private String uid;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    private String phoneNumber;
    private String socialInsuranceNumber;
    private String dateOfBirth;
    @OneToOne
    private Employment employment;
    @OneToOne
    private Address address;
    @OneToOne
    private Coordinates coordinates;
    @OneToOne
    private CreditCard creditCard;
    @OneToOne
    private Subscription subscription;
}
