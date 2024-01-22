package com.example.randomuserupdater.mappers;

public interface IMapEntities <TDto, TEntity> {
TEntity mapToEntity(TDto dto);
TEntity map(TDto dto, TEntity entity);
}
