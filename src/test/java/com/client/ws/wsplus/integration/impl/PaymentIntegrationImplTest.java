package com.client.ws.wsplus.integration.impl;

import com.client.ws.wsplus.dto.pay.CreditCardDto;
import com.client.ws.wsplus.dto.pay.CustomerDto;
import com.client.ws.wsplus.dto.pay.OrderDto;
import com.client.ws.wsplus.dto.pay.PaymentDto;
import com.client.ws.wsplus.integration.PaymentIntegration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class PaymentIntegrationImplTest {

    private PaymentIntegration paymentIntegration;

    @Autowired
    public PaymentIntegrationImplTest(PaymentIntegration paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
    }

    @Test
    void createCustomerWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "64428575068", "pedro@test", "Pedro", "Almeida");
        paymentIntegration.createCustomer(dto);
    }

    @Test
    void createOrderWhenDtoOK() {
        OrderDto dto =  new OrderDto(null, "67b76a2788e9360b609b23c6", BigDecimal.ZERO, "PERPETUAL22");
        paymentIntegration.createOrder(dto);
    }

    @Test
    void processPaymentWhenDtoOK() {
        CreditCardDto creditCardDto = new CreditCardDto(123L, "64428575068", 0L, 06L, "1234123412341234", 2025L);
        PaymentDto paymentDto = new PaymentDto(creditCardDto, "67b76a2788e9360b609b23c6", "67b782c988e9360b609b23c8");
        paymentIntegration.processPayment(paymentDto);
    }
}