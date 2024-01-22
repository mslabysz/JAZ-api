package com.example.randomuserdata.repositories;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AllRepos implements IHaveAllRepos{
    private final AddressRepository addressRepository;
    private final CreditCardRepository creditCardRepository;
    private final EmploymentRepository employmentRepository;
    private final UserRepository userRepository;
    private final SubscriptionRepository subscriptionRepository;
    private final CoordinatesRepository coordinatesRepository;
    @Override
    public AddressRepository getAddressRepository() {
        return addressRepository;
    }

    @Override
    public CreditCardRepository getCreditCardRepository() {
        return creditCardRepository;
    }

    @Override
    public EmploymentRepository getEmploymentRepository() {
        return employmentRepository;
    }

    @Override
    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Override
    public SubscriptionRepository getSubscriptionRepository() {
        return subscriptionRepository;
    }

    @Override
    public CoordinatesRepository getCoordinatesRepository() {
        return coordinatesRepository;
    }
}
