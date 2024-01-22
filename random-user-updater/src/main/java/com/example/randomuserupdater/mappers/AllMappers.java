package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.*;
import com.example.randomuserdata.model.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Getter
public class AllMappers implements IHaveMappers{
    private final IMapEntities<AddressDto, Address> address;
    private final IMapEntities<CoordinatesDto, Coordinates> coordinates;
    private final IMapEntities<CreditCardDto, CreditCard> creditCard;
    private final IMapEntities<EmploymentDto, Employment> employment;
    private final IMapEntities<UserDto, User> user;
    private final IMapEntities<SubscriptionDto, Subscription> subscription;
    @Override
    public IMapEntities<AddressDto, Address> address() {
        return address;
    }

    @Override
    public IMapEntities<CoordinatesDto, Coordinates> coordinates() {
        return coordinates;
    }

    @Override
    public IMapEntities<CreditCardDto, CreditCard> creditCard() {
        return creditCard;
    }

    @Override
    public IMapEntities<EmploymentDto, Employment> employment() {
        return employment;
    }

    @Override
    public IMapEntities<UserDto, User> user() {
        return user;
    }

    @Override
    public IMapEntities<SubscriptionDto, Subscription> subscription() {
        return subscription;
    }
}
