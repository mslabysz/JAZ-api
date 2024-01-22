package com.example.randomuserupdater.mappers;

import com.example.randomuserdata.model.Address;
import com.example.randomuserclient.contracts.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper implements IMapEntities<AddressDto, Address>{


    @Override
    public Address mapToEntity(AddressDto addressDto) {
        return map(addressDto, new Address());
    }

    @Override
    public Address map(AddressDto addressDto, Address address) {
        address.setCity(addressDto.getCity());
        address.setStreetName(addressDto.getStreetName());
        address.setStreetAddress(addressDto.getStreetAddress());
        address.setZipCode(addressDto.getZipCode());
        address.setState(addressDto.getState());
        address.setCountry(addressDto.getCountry());
        return address;
    }
}
