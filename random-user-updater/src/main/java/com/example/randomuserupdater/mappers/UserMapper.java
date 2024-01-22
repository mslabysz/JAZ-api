package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.UserDto;
import com.example.randomuserdata.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements IMapEntities<UserDto,User> {

    @Override
    public User mapToEntity(UserDto userDto) {
        return map(userDto, new User());
    }

    @Override
    public User map(UserDto userDto, User user) {
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setGender(userDto.getGender());
        user.setEmail(userDto.getEmail());
        user.setUsername(userDto.getUsername());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setAvatar(userDto.getAvatar());
        user.setSocialInsuranceNumber(userDto.getSocialInsuranceNumber());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setUid(userDto.getUid());
        return user;
    }
}
