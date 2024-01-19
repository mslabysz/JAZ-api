package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.EmploymentDto;
import com.example.randomuserdata.model.Employment;
import org.springframework.stereotype.Component;

@Component
public class EmploymentMapper implements IMap<EmploymentDto, Employment>{
    @Override
 public EmploymentDto toDto(Employment employment) {
  EmploymentDto dto = new EmploymentDto();
  dto.setTitle(employment.getTitle());
  dto.setKeySkill(employment.getKeySkill());
  return dto;
 }
 @Override
 public Employment toEntity(EmploymentDto dto) {
  Employment employment = new Employment();
  employment.setTitle(dto.getTitle());
  employment.setKeySkill(dto.getKeySkill());
  return employment;
 }

}
