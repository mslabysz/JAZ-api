package com.example.randomuserupdater.updater;

import com.example.randomuserclient.contracts.CreditCardDto;
import com.example.randomuserdata.model.CreditCard;

public class CreditCardMapper {

            public CreditCardDto toDto(CreditCard creditCard) {
                CreditCardDto dto = new CreditCardDto();
                dto.setCcNumber(creditCard.getCcNumber());
                return dto;
            }

            public CreditCard toEntity(CreditCardDto dto) {
                CreditCard creditCard = new CreditCard();
                creditCard.setCcNumber(dto.getCcNumber());
                return creditCard;
            }
}
