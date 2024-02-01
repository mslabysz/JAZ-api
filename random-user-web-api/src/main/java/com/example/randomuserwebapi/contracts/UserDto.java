package com.example.randomuserwebapi.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@Accessors(chain = true)
public class UserDto {
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String username;
    private String gender;
    @JsonProperty("social_insurance_number")
    private String socialInsuranceNumber;
    @JsonProperty("date_of_birth")
    private String dateOfBirth;
}