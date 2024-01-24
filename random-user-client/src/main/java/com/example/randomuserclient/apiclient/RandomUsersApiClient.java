package com.example.randomuserclient.apiclient;

import com.example.randomuserclient.contracts.UserDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RandomUsersApiClient implements IRandomUsersApiClient{
    private final RestTemplate restTemplate;

    public RandomUsersApiClient() {
        this.restTemplate = new RestTemplate();
    }
//    @Override
//    public List<UserDto> getRandomUserData(int numberOfUsers) {
//        var url = "https://random-data-api.com/api/v2/users?size=%d".formatted(numberOfUsers);
//        ResponseEntity<List<UserDto>> response = restTemplate.exchange(
//                url,
//                HttpMethod.GET,
//                null,
//                new ParameterizedTypeReference<List<UserDto>>(){});
//        return response.getBody();
//    }
    @Override
public List<UserDto> getRandomUserData(int numberOfUsers) {
    List<UserDto> allUsers = new ArrayList<>();
    int pageSize = 100; // Set the size of each batch
    int numberOfPages = (int) Math.ceil((double) numberOfUsers / pageSize);

    for (int i = 0; i < numberOfPages; i++) {
        var url = "https://random-data-api.com/api/v2/users?size=%d&page=%d".formatted(pageSize, i);
        ResponseEntity<List<UserDto>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDto>>(){});
        allUsers.addAll(response.getBody());
    }

    return allUsers;
}
}
