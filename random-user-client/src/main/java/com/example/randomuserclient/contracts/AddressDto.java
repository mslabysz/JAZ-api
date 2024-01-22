package com.example.randomuserclient.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private String city;
    @JsonProperty("street_name")
    private String streetName;
    @JsonProperty("street_address")
    private String streetAddress;
    @JsonProperty("zip_code")
    private String zipCode;
    private String state;
    private String country;
    private CoordinatesDto coordinates;
}
