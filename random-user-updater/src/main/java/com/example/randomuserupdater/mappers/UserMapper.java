package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.UserDto;
import com.example.randomuserdata.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements IMap<UserDto, User> {
    @Override
    public UserDto toDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUid(user.getUid());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setUsername(user.getUsername());
        userDto.setEmail(user.getEmail());
        userDto.setAvatar(user.getAvatar());
        userDto.setGender(user.getGender());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setSocialInsuranceNumber(user.getSocialInsuranceNumber());
        userDto.setDateOfBirth(user.getDateOfBirth());
        userDto.setEmployment(new EmploymentMapper().toDto(user.getEmployment()));
        userDto.setAddress(new AddressMapper().toDto(user.getAddress()));
        userDto.setCoordinates(new CoordinatesMapper().toDto(user.getCoordinates()));
        userDto.setCreditCard(new CreditCardMapper().toDto(user.getCreditCard()));
        userDto.setSubscription(new SubscriptionMapper().toDto(user.getSubscription()));
        return userDto;
    }
    @Override
    public User toEntity(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setUid(userDto.getUid());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setAvatar(userDto.getAvatar());
        user.setGender(userDto.getGender());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setSocialInsuranceNumber(userDto.getSocialInsuranceNumber());
        user.setDateOfBirth(userDto.getDateOfBirth());
        user.setEmployment(new EmploymentMapper().toEntity(userDto.getEmployment()));
        user.setAddress(new AddressMapper().toEntity(userDto.getAddress()));
        user.setCoordinates(new CoordinatesMapper().toEntity(userDto.getCoordinates()));
        user.setCreditCard(new CreditCardMapper().toEntity(userDto.getCreditCard()));
        user.setSubscription(new SubscriptionMapper().toEntity(userDto.getSubscription()));
        return user;
    }
}
