package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.CoordinatesDto;
import com.example.randomuserdata.model.Coordinates;
import org.springframework.stereotype.Component;

@Component
public class CoordinatesMapper implements IMapEntities<CoordinatesDto, Coordinates>{
    @Override
    public Coordinates mapToEntity(CoordinatesDto coordinatesDto) {
        return map(coordinatesDto, new Coordinates());
    }

    @Override
    public Coordinates map(CoordinatesDto coordinatesDto, Coordinates coordinates) {
        coordinates.setLat(coordinatesDto.getLat());
        coordinates.setLng(coordinatesDto.getLng());
        return coordinates;
    }
}
