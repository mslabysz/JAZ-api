package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.CreditCardDto;
import com.example.randomuserdata.model.CreditCard;
import org.springframework.stereotype.Component;

@Component
public class CreditCardMapper implements IMapEntities<CreditCardDto,CreditCard>{

    @Override
    public CreditCard mapToEntity(CreditCardDto creditCardDto) {
        return map(creditCardDto, new CreditCard());
    }

    @Override
    public CreditCard map(CreditCardDto creditCardDto, CreditCard creditCard) {
        creditCard.setCcNumber(creditCardDto.getCcNumber());
        return creditCard;
    }
}
