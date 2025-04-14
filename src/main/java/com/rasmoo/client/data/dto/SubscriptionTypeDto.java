package com.rasmoo.client.data.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record SubscriptionTypeDto(
        Long id,

        @Size(min = 5, max = 30, message = "deve ter tamanho entre 5 e 30")
        String name,

        @Max(value = 12, message = "não pode ser maior que 12")
        Long accessMonths,

        @NotNull(message = "não pode ser nulo")
        BigDecimal price,

        @Size(min = 5, max = 15, message = "deve ter tamanho entre 5 e 15")
        String productKey

) {

        public static SubscriptionTypeDto empty() {
                return new SubscriptionTypeDto(null, null, null, null, null);
        }

}
