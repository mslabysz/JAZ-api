package com.example.randomuserdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String city;
    private String streetName;
    private String streetAddress;
    private String zipCode;
    private String state;
    private String country;
    @OneToOne
    private Coordinates coordinates;
    @OneToMany(mappedBy = "address")
    private List<User> user;
}
