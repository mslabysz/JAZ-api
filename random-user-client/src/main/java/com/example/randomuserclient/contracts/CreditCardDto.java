package com.example.randomuserclient.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreditCardDto {
    @JsonProperty("cc_number")
    private String ccNumber;

}
