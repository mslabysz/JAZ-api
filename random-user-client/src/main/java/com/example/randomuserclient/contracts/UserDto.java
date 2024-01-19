package com.example.randomuserclient.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private int id;
    private String uid;
    private String password;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String username;
    private String email;
    private String avatar;
    private String gender;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("social_insurance_number")
    private String socialInsuranceNumber;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
    private EmploymentDto employment;
    private AddressDto address;
    private CoordinatesDto coordinates;
    @JsonProperty("credit_card")
    private CreditCardDto creditCard;
    private SubscriptionDto subscription;
}
