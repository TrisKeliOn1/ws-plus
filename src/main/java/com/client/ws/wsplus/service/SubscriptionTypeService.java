package com.client.ws.wsplus.service;

import com.client.ws.wsplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionType subscriptionType);

    SubscriptionType update(Long id, SubscriptionType subscriptionType);

    void delete (Long id);
}
