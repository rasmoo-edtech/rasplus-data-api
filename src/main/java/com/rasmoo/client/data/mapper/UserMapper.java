package com.rasmoo.client.data.mapper;


import com.rasmoo.client.data.dto.UserDto;
import com.rasmoo.client.data.model.SubscriptionType;
import com.rasmoo.client.data.model.User;
import com.rasmoo.client.data.model.UserType;

public class UserMapper {

    public static User fromDtoToEntity(UserDto dto, UserType userType, SubscriptionType subscriptionType) {
        return User.builder()
                .id(dto.id())
                .name(dto.name())
                .cpf(dto.cpf())
                .email(dto.email())
                .phone(dto.phone())
                .dtSubscription(dto.dtSubscription())
                .dtExpiration(dto.dtExpiration())
                .userType(userType)
                .subscriptionType(subscriptionType)
                .build();
    }
}
