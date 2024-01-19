package com.example.randomuserclient.contracts;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmploymentDto {
    private String title;
    @JsonProperty("key_skill")
    private String keySkill;

}
