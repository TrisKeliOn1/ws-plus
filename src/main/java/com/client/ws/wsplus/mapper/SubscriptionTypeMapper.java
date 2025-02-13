package com.client.ws.wsplus.mapper;

import com.client.ws.wsplus.dto.SubscriptionTypeDto;
import com.client.ws.wsplus.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
                .id(dto.getId())
                .name(dto.getName())
                .accessMonth(dto.getAccessMonth())
                .price(dto.getPrice())
                .productKey(dto.getProductKey())
                .build();
    }
}
