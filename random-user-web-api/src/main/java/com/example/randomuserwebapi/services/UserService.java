package com.example.randomuserwebapi.services;

import com.example.randomuserdata.model.User;
import com.example.randomuserdata.repositories.IHaveAllRepos;
import com.example.randomuserwebapi.contracts.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService{
    private final IHaveAllRepos database;
    @Override
    public UserDto getById(long id) {
        var user = database.getUserRepository().findById(id).orElse(null);
        if(user == null){
            return null;
        }
        return mapFromUser(user);
    }

    @Override
    public long save(UserDto userDto) {
        User user=getUserFromDto(userDto);
        var u=database.getUserRepository().save(user);
        return u.getId();
    }

//    @Override
//    public UserDto deleteById(long id) {
//        var user = database.getUserRepository().findById(id).orElse(null);
//        if(user == null){
//            return null;
//        }
//        database.getUserRepository().delete(user);
//        return mapFromUser(user);
//    }
    @Override
public UserDto deleteById(long id) {
    var user = database.getUserRepository().findById(id).orElse(null);
    if(user == null){
        return null;
    }
    if(user.getSubscription() != null) {
        database.getSubscriptionRepository().delete(user.getSubscription());
    }
    if(user.getCreditCard() != null) {
        database.getCreditCardRepository().delete(user.getCreditCard());
    }
    database.getUserRepository().delete(user);
    return mapFromUser(user);
}

    @Override
    public UserDto updateById(long id, UserDto userDto) {
        var user = database.getUserRepository().findById(id).orElse(null);
        if(user == null){
            return null;
        }
        database.getUserRepository().save(getUserFromDto(userDto, user));
        return userDto;
    }
    public List<UserDto> getAllUsers(){
        var users = database.getUserRepository().findAll();
        if(users == null){
            return null;
        }
        return users.stream().map(UserService::mapFromUser).toList();
    }
private static User getUserFromDto(UserDto userDto, User user){
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUsername(userDto.getUsername());
        user.setGender(userDto.getGender());
        user.setSocialInsuranceNumber(userDto.getSocialInsuranceNumber());
        user.setDateOfBirth(userDto.getDateOfBirth());
        return user;
}
private static User getUserFromDto(UserDto userDto) {
    return getUserFromDto(userDto, new User());
}
private static UserDto mapFromUser(User user) {
    return UserDto.builder()
            .id(user.getId())
            .firstName(user.getFirstName())
            .lastName(user.getLastName())
            .username(user.getUsername())
            .gender(user.getGender())
            .socialInsuranceNumber(user.getSocialInsuranceNumber())
            .dateOfBirth(user.getDateOfBirth())
            .build();
}
}
