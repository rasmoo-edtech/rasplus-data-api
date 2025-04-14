package com.rasmoo.client.data.service.impl;


import com.rasmoo.client.data.dto.PaymentProcessDto;
import com.rasmoo.client.data.service.PaymentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentInfoServiceImpl implements PaymentInfoService {

    @Override
    public Boolean process(PaymentProcessDto dto) {
        return false;
    }
}
