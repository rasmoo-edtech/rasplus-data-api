package com.rasmoo.client.data.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UserPaymentInfoDto(

        Long id,

        @Size(min = 16, max = 16, message = "deve conter 16 caracteres")
        String cardNumber,

        @Min(value = 1)
        @Max(value = 12)
        Long cardExpirationMonth,

        Long cardExpirationYear,

        @Size(min = 3, max = 3, message = "deve conter 3 caracteres")
        String cardSecurityCode,

        BigDecimal price,

        LocalDate dtPayment,

        Long installments,

        @NotNull(message = "deve ser informado")
        Long userId

) {
    public UserPaymentInfoDto {
        // Define valor padrão se null
        if (dtPayment == null) {
            dtPayment = LocalDate.now();
        }
    }
}
