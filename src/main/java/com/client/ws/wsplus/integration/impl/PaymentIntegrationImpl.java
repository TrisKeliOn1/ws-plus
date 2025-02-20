package com.client.ws.wsplus.integration.impl;

import com.client.ws.wsplus.dto.pay.CustomerDto;
import com.client.ws.wsplus.dto.pay.OrderDto;
import com.client.ws.wsplus.dto.pay.PaymentDto;
import com.client.ws.wsplus.integration.PaymentIntegration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Base64;

@Component
public class PaymentIntegrationImpl implements PaymentIntegration {

    private RestTemplate restTemplate;

    public PaymentIntegrationImpl() {
        restTemplate = new RestTemplate();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto dto) {
        try {
            HttpHeaders headers = new HttpHeaders();
            String credential = "root:Dba@123456";
            String base64 = new String(Base64.getEncoder().encodeToString(credential.getBytes()));
            headers.add("Authorization", "Basic " +base64);
            HttpEntity<CustomerDto> request = new HttpEntity<>(dto, headers);
            ResponseEntity<CustomerDto> response =
                    restTemplate.exchange("http://localhost:8081/ws-pluspay/v1/customer", HttpMethod.POST, request, CustomerDto.class);
            return response.getBody();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public OrderDto createOrder(OrderDto dto) {
        return null;
    }

    @Override
    public Boolean processPayment(PaymentDto dto) {
        return null;
    }

    private static HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        String credential = "root:Dba@123456";
        String base64 = new String(Base64.getEncoder().encodeToString(credential.getBytes()));
        headers.add("Authorization", "Basic " +base64);
        return headers;
    }
}
