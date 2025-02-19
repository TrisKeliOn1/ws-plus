package com.client.ws.wsplus.integration;

import com.client.ws.wsplus.dto.pay.CustomerDto;
import com.client.ws.wsplus.dto.pay.OrderDto;
import com.client.ws.wsplus.dto.pay.PaymentDto;

public interface PaymentIntegration {

    CustomerDto createCustomer(CustomerDto dto);

    OrderDto createOrder(OrderDto dto);

    Boolean processPayment(PaymentDto dto);

}
