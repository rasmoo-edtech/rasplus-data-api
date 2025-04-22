package com.rasmoo.client.data.service.impl;

import com.rasmoo.client.data.dto.UserPaymentInfoDto;
import com.rasmoo.client.data.model.User;
import com.rasmoo.client.data.model.UserPaymentInfo;
import com.rasmoo.client.data.repository.UserPaymentInfoRepository;
import com.rasmoo.client.data.service.UserPaymentInfoService;
import com.rasmoo.client.data.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.rasmoo.client.data.mapper.UserPaymentInfoMapper.fromDtoToEntity;


@Service
@RequiredArgsConstructor
public class UserPaymentInfoServiceImpl implements UserPaymentInfoService {

    private final UserPaymentInfoRepository userPaymentInfoRepository;
    private final UserService userService;

    @Override
    public UserPaymentInfo create(UserPaymentInfoDto dto) {
        User user = userService.findById(dto.userId());
        return userPaymentInfoRepository.save(fromDtoToEntity(dto, user));
    }

}
