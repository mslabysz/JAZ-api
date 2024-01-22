package com.example.randomuserdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
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
    @ManyToOne
    private Address address;
    @OneToOne
    private Coordinates coordinates;
    @OneToOne(mappedBy = "user")
    private CreditCard creditCard;
    @OneToOne(mappedBy = "user")
    private Subscription subscription;


}
