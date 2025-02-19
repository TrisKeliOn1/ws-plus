package com.client.ws.wsplus.integration.impl;

import com.client.ws.wsplus.dto.pay.CustomerDto;
import com.client.ws.wsplus.integration.PaymentIntegration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentIntegrationImplTest {

    private PaymentIntegration paymentIntegration;

    public PaymentIntegrationImplTest(PaymentIntegration paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
    }

    @Test
    void createCustomerWhenDtoOK() {
        CustomerDto dto = new CustomerDto(null, "64428575068", "pedro@test", "Pedro", "Almeida");
        paymentIntegration.createCustomer(dto);
    }
}