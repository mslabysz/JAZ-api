package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.CoordinatesDto;
import com.example.randomuserdata.model.Coordinates;
import org.springframework.stereotype.Component;

@Component
public class CoordinatesMapper implements IMap<CoordinatesDto, Coordinates>{

        @Override
        public CoordinatesDto toDto(Coordinates coordinates) {
            CoordinatesDto dto = new CoordinatesDto();
            dto.setLat(coordinates.getLat());
            dto.setLng(coordinates.getLng());
            return dto;
        }
        @Override
        public Coordinates toEntity(CoordinatesDto dto) {
            Coordinates coordinates = new Coordinates();
            coordinates.setLat(dto.getLat());
            coordinates.setLng(dto.getLng());
            return coordinates;
        }
}
