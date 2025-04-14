package com.rasmoo.client.data.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record UserDto(
        Long id,

        @NotBlank(message = "valor não pode ser nulo ou vazio")
        @Size(min = 6, message = "valor mínimo igual a 6 caracteres")
        String name,

        @Email(message = "inválido")
        String email,

        @Size(min = 11, message = "valor mínimo igual a 11 dígitos")
        String phone,

        @CPF(message = "inválido")
        String cpf,

        LocalDate dtSubscription,

        LocalDate dtExpiration,

        @NotNull
        Long userTypeId,

        Long subscriptionTypeId
) {
        public UserDto {
                if (dtSubscription == null) {
                        dtSubscription = LocalDate.now();
                }

                if (dtExpiration == null) {
                        dtExpiration = LocalDate.now();
                }
        }
}
