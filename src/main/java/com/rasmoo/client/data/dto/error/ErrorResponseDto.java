package com.rasmoo.client.data.dto.error;

import org.springframework.http.HttpStatus;

public record ErrorResponseDto(
        String message,
        HttpStatus httpStatus,
        Integer statusCode
) {

}
