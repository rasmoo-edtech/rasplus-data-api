package com.rasmoo.client.data.service;


import com.rasmoo.client.data.dto.PaymentProcessDto;

public interface PaymentInfoService {

    Boolean process(PaymentProcessDto dto);
}
