package com.rasmoo.client.data.service;


import com.rasmoo.client.data.dto.SubscriptionTypeDto;
import com.rasmoo.client.data.model.SubscriptionType;

import java.util.List;

public interface SubscriptionTypeService {

    List<SubscriptionType> findAll();

    SubscriptionType findById(Long id);

    SubscriptionType create(SubscriptionTypeDto dto);

    SubscriptionType update(Long id, SubscriptionTypeDto dto);

    void delete(Long id);
}
