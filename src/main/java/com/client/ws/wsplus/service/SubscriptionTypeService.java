package com.client.ws.wsplus.service;

import com.client.ws.wsplus.dto.SubscriptionTypeDto;
import com.client.ws.wsplus.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete (Long id);
}
