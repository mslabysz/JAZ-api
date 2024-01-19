package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.SubscriptionDto;
import com.example.randomuserdata.model.Subscription;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionMapper implements IMap<SubscriptionDto, Subscription>{
    @Override
    public SubscriptionDto toDto(Subscription subscription) {
        SubscriptionDto dto = new SubscriptionDto();
        dto.setPlan(subscription.getPlan());
        dto.setStatus(subscription.getStatus());
        dto.setPaymentMethod(subscription.getPaymentMethod());
        dto.setTerm(subscription.getTerm());
        return dto;
    }
    @Override
    public Subscription toEntity(SubscriptionDto dto) {
        Subscription subscription = new Subscription();
        subscription.setPlan(dto.getPlan());
        subscription.setStatus(dto.getStatus());
        subscription.setPaymentMethod(dto.getPaymentMethod());
        subscription.setTerm(dto.getTerm());
        return subscription;
    }
}
