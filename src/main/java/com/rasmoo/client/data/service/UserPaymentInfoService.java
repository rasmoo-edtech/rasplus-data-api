package com.rasmoo.client.data.service;

import com.rasmoo.client.data.dto.UserPaymentInfoDto;
import com.rasmoo.client.data.model.UserPaymentInfo;

public interface UserPaymentInfoService {

    UserPaymentInfo create(UserPaymentInfoDto dto);

}
