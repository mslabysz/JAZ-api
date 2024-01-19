package com.example.randomuserupdater.updater;

import com.example.randomuserclient.contracts.CoordinatesDto;
import com.example.randomuserdata.model.Coordinates;

public class CoordinatesMapper {

        public CoordinatesDto toDto(Coordinates coordinates) {
            CoordinatesDto dto = new CoordinatesDto();
            dto.setLat(coordinates.getLat());
            dto.setLng(coordinates.getLng());
            return dto;
        }

        public Coordinates toEntity(CoordinatesDto dto) {
            Coordinates coordinates = new Coordinates();
            coordinates.setLat(dto.getLat());
            coordinates.setLng(dto.getLng());
            return coordinates;
        }
}
