package com.example.randomuserupdater.updater;

import com.example.randomuserclient.apiclient.IRandomUsersApiClient;
import com.example.randomuserclient.contracts.UserDto;
import com.example.randomuserdata.repositories.IHaveAllRepos;
import com.example.randomuserupdater.mappers.IHaveMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Updater implements IUpdate{
    private final IHaveMappers mappers;
    private final IRandomUsersApiClient client;
    private final IHaveAllRepos repos;
    @Autowired
    public Updater(IHaveMappers mappers, IRandomUsersApiClient client, IHaveAllRepos repos) {
        this.mappers = mappers;
        this.client = client;
        this.repos = repos;
    }

    @Override
    public void update(int size) {
        client.getRandomUserData(size)
                .forEach(this::repoSaving);
    }
    void repoSaving(UserDto userDto){
        var user=mappers.user().mapToEntity(userDto);
        var employment=mappers.employment().mapToEntity(userDto.getEmployment());
        var address=mappers.address().mapToEntity(userDto.getAddress());
        var coordinates=mappers.coordinates().mapToEntity(userDto.getAddress().getCoordinates());
        var creditCard=mappers.creditCard().mapToEntity(userDto.getCreditCard());
        var subscription=mappers.subscription().mapToEntity(userDto.getSubscription());

        employment=repos.getEmploymentRepository().save(employment);
        user.setEmployment(employment);

        coordinates=repos.getCoordinatesRepository().save(coordinates);
        address.setCoordinates(coordinates);
        address=repos.getAddressRepository().save(address);

        user.setAddress(address);
        user.setCoordinates(coordinates);
        user=repos.getUserRepository().save(user);

        creditCard.setUser(user);
        creditCard=repos.getCreditCardRepository().save(creditCard);
        user.setCreditCard(creditCard);

        subscription.setUser(user);
        subscription=repos.getSubscriptionRepository().save(subscription);
        user.setSubscription(subscription);

    }
}
