package com.example.randomuserupdater.mappers;

import com.example.randomuserclient.contracts.SubscriptionDto;
import com.example.randomuserdata.model.Subscription;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionMapper implements IMapEntities<SubscriptionDto, Subscription>{

    @Override
    public Subscription mapToEntity(SubscriptionDto subscriptionDto) {
        return map(subscriptionDto, new Subscription());
    }

    @Override
    public Subscription map(SubscriptionDto subscriptionDto, Subscription subscription) {
        subscription.setPlan(subscriptionDto.getPlan());
        subscription.setStatus(subscriptionDto.getStatus());
        subscription.setPaymentMethod(subscriptionDto.getPaymentMethod());
        subscription.setTerm(subscriptionDto.getTerm());
        return subscription;
    }
}
