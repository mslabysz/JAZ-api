package com.example.randomuserupdater.mappers;

import com.example.randomuserdata.model.Address;
import com.example.randomuserclient.contracts.AddressDto;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper implements IMap<AddressDto, Address>{

    @Override
    public AddressDto toDto(Address address) {
        AddressDto dto = new AddressDto();
        dto.setCity(address.getCity());
        dto.setStreetName(address.getStreetName());
        dto.setStreetAddress(address.getStreetAddress());
        dto.setZipCode(address.getZipCode());
        dto.setState(address.getState());
        dto.setCountry(address.getCountry());
        dto.setCoordinates(new CoordinatesMapper().toDto(address.getCoordinates()));
        return dto;
    }
    @Override
    public Address toEntity(AddressDto dto) {
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setStreetName(dto.getStreetName());
        address.setStreetAddress(dto.getStreetAddress());
        address.setZipCode(dto.getZipCode());
        address.setState(dto.getState());
        address.setCountry(dto.getCountry());
        address.setCoordinates(new CoordinatesMapper().toEntity(dto.getCoordinates()));
        return address;
    }
}
