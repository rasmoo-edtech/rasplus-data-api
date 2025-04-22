package com.rasmoo.client.data.controller;


import com.rasmoo.client.data.dto.UserPaymentInfoDto;
import com.rasmoo.client.data.model.UserPaymentInfo;
import com.rasmoo.client.data.service.UserPaymentInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userPaymentInfo")
@RequiredArgsConstructor
public class UserPaymentInfoController {

    private final UserPaymentInfoService userPaymentInfoService;

    @PostMapping
    public ResponseEntity<UserPaymentInfo> create(@RequestBody UserPaymentInfoDto dto){
        return ResponseEntity.status(HttpStatus.OK).body(userPaymentInfoService.create(dto));
    }

}
