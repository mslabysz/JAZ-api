package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.CreditCardDto;
import com.example.randomuserdata.model.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class CreditCardMapper implements IMap<CreditCardDto, CreditCard>{
            @Override
            public CreditCardDto toDto(CreditCard creditCard) {
                CreditCardDto dto = new CreditCardDto();
                dto.setCcNumber(creditCard.getCcNumber());
                return dto;
            }
            @Override
            public CreditCard toEntity(CreditCardDto dto) {
                CreditCard creditCard = new CreditCard();
                creditCard.setCcNumber(dto.getCcNumber());
                return creditCard;
            }
}
