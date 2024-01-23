package com.example.randomuserwebapi.services;

import com.example.randomuserdata.model.User;
import com.example.randomuserwebapi.contracts.UserDto;

import java.util.List;

public interface IUserService {
    UserDto getById(long id);
    long save(UserDto userDto);
    UserDto deleteById(long id);
    UserDto updateById(long id, UserDto userDto);
    List<UserDto> getAllUsers();
    List<UserDto> getOlderThan(int age);
    List<UserDto> getYoungerThan(int age);
    List<UserDto> getFemaleUsers();
    List<UserDto> getMaleUsers();
    List<UserDto> getOtherGenderUsers();
}
