package com.example.randomuserupdater.mappers;

public interface IMap <TDto, TEntity>{
    TDto toDto(TEntity entity);
    TEntity toEntity(TDto dto);
}
