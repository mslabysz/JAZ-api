package com.example.randomuserdata.repositories;

public interface IHaveAllRepos {
    AddressRepository getAddressRepository();
    CreditCardRepository getCreditCardRepository();
    EmploymentRepository getEmploymentRepository();
    UserRepository getUserRepository();
    SubscriptionRepository getSubscriptionRepository();
    CoordinatesRepository getCoordinatesRepository();
}
