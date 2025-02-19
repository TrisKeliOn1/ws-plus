package com.client.ws.wsplus.integration.impl;

import com.client.ws.wsplus.dto.pay.CustomerDto;
import com.client.ws.wsplus.dto.pay.OrderDto;
import com.client.ws.wsplus.dto.pay.PaymentDto;
import com.client.ws.wsplus.integration.PaymentIntegration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PaymentIntegrationImpl implements PaymentIntegration {

    private RestTemplate restTemplate;

    public PaymentIntegrationImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto dto) {
        return null;
    }

    @Override
    public OrderDto createOrder(OrderDto dto) {
        return null;
    }

    @Override
    public Boolean processPayment(PaymentDto dto) {
        return null;
    }
}
