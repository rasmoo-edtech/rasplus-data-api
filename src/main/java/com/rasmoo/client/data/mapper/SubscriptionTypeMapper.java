package com.rasmoo.client.data.mapper;

import com.rasmoo.client.data.dto.SubscriptionTypeDto;
import com.rasmoo.client.data.model.SubscriptionType;

public class SubscriptionTypeMapper {

    public static SubscriptionType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionType.builder()
                .id(dto.id())
                .name(dto.name())
                .accessMonths(dto.accessMonths())
                .price(dto.price())
                .productKey(dto.productKey())
                .build();
    }

}
