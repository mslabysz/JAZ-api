package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.*;
import com.example.randomuserdata.model.*;

public interface IHaveMappers {
    IMapEntities<AddressDto, Address> address();
    IMapEntities<CoordinatesDto, Coordinates> coordinates();
    IMapEntities<CreditCardDto, CreditCard> creditCard();
    IMapEntities<EmploymentDto, Employment> employment();
    IMapEntities<UserDto, User> user();
    IMapEntities<SubscriptionDto, Subscription> subscription();
}
