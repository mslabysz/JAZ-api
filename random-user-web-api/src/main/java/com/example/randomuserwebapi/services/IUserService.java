package com.example.randomuserwebapi.services;

import com.example.randomuserwebapi.contracts.UserDto;

import java.util.List;

public interface IUserService {
    UserDto getById(long id);
    long save(UserDto userDto);
    UserDto deleteById(long id);
    UserDto updateById(long id, UserDto userDto);
    List<UserDto> getAllUsers();
}
