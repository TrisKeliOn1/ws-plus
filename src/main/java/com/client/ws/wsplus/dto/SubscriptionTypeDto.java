package com.client.ws.wsplus.dto;



import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriptionTypeDto {

    private Long id;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 30, message = "deve ter tamanho entre 5 e 30")
    private String name;

    @Max(value = 12, message = "não pode ser maior que 12")
    private Long accessMonths;

    @NotNull(message = "não pode ser nulo")
    @Positive
    private BigDecimal price;

    @NotBlank(message = "não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = "deve ter tamanho entre 5 e 15")
    private String productKey;


}

