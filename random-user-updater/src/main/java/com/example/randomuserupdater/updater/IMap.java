package com.example.randomuserupdater.updater;

public interface IMap <TDto, TEntity>{
    TEntity map(TDto dto);
}
