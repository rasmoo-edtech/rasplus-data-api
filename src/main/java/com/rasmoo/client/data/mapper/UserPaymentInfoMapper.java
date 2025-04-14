package com.rasmoo.client.data.mapper;


import com.rasmoo.client.data.dto.UserPaymentInfoDto;
import com.rasmoo.client.data.model.User;
import com.rasmoo.client.data.model.UserPaymentInfo;

public class UserPaymentInfoMapper {

    public static UserPaymentInfo fromDtoToEntity(UserPaymentInfoDto dto, User user){
        return UserPaymentInfo.builder()
                .id(dto.id())
                .cardNumber(dto.cardNumber())
                .cardExpirationMonth(dto.cardExpirationMonth())
                .cardExpirationYear(dto.cardExpirationYear())
                .cardSecurityCode(dto.cardSecurityCode())
                .price(dto.price())
                .dtPayment(dto.dtPayment())
                .installments(dto.installments())
                .user(user)
                .build();

    }
}
