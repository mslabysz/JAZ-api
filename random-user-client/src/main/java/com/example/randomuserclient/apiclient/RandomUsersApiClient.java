package com.example.randomuserclient.apiclient;

import com.example.randomuserclient.contracts.UserDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RandomUsersApiClient implements IRandomUsersApiClient{
    private final RestTemplate restTemplate;

    public RandomUsersApiClient() {
        this.restTemplate = new RestTemplate();
    }
    @Override
    public List<UserDto> getRandomUserData(int numberOfUsers) {
        var url = "https://random-data-api.com/api/v2/users?size=%d".formatted(numberOfUsers);
        ResponseEntity<List<UserDto>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDto>>(){});
        return response.getBody();
    }
}
