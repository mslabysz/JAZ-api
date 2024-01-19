package com.example.randomuserclient.apiclient;

import com.example.randomuserclient.contracts.UserDto;

import java.util.List;

public interface IRandomUsersApiClient {
    List<UserDto> getRandomUserData(int numberOfUsers);
}
