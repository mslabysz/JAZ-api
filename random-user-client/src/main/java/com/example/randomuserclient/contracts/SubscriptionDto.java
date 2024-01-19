package com.example.randomuserclient.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionDto {
    private String plan;
    private String status;
    @JsonProperty("payment_method")
    private String paymentMethod;
    private String term;
}