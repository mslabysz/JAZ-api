package com.example.randomuserupdater.updater;

import com.example.randomuserdata.model.Address;
import com.example.randomuserclient.contracts.AddressDto;

public class AddressMapper {

    public AddressDto toDto(Address address) {
        AddressDto dto = new AddressDto();
        dto.setCity(address.getCity());
        dto.setStreetName(address.getStreetName());
        dto.setStreetAddress(address.getStreetAddress());
        dto.setZipCode(address.getZipCode());
        dto.setState(address.getState());
        dto.setCountry(address.getCountry());
        // Assuming CoordinatesDto exists and has a similar structure to Coordinates
        dto.setCoordinates(new CoordinatesMapper().toDto(address.getCoordinates()));
        return dto;
    }

    public Address toEntity(AddressDto dto) {
        Address address = new Address();
        address.setCity(dto.getCity());
        address.setStreetName(dto.getStreetName());
        address.setStreetAddress(dto.getStreetAddress());
        address.setZipCode(dto.getZipCode());
        address.setState(dto.getState());
        address.setCountry(dto.getCountry());
        // Assuming Coordinates exists and has a similar structure to CoordinatesDto
        address.setCoordinates(new CoordinatesMapper().toEntity(dto.getCoordinates()));
        return address;
    }
}
