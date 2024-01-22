package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.EmploymentDto;
import com.example.randomuserdata.model.Employment;
import org.springframework.stereotype.Component;

@Component
public class EmploymentMapper implements IMapEntities<EmploymentDto,Employment>{

 @Override
 public Employment mapToEntity(EmploymentDto employmentDto) {
  return map(employmentDto, new Employment());
 }

 @Override
 public Employment map(EmploymentDto employmentDto, Employment employment) {
  employment.setTitle(employmentDto.getTitle());
  employment.setKeySkill(employmentDto.getKeySkill());
  return employment;
 }
}
