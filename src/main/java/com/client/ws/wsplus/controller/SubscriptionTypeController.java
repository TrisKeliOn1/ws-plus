package com.client.ws.wsplus.controller;

import com.client.ws.wsplus.model.SubscriptionType;

import com.client.ws.wsplus.service.SubscriptionTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    private SubscriptionTypeService subscriptionTypeService;

    SubscriptionTypeController(SubscriptionTypeService subscriptionTypeService) {
        this.subscriptionTypeService = subscriptionTypeService;
    }

    @GetMapping()
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findByAll(@PathVariable("id") Long id) {
        SubscriptionType subscriptionType = subscriptionTypeService.findById(id);
        if (Objects.nonNull(subscriptionType)) {
            return ResponseEntity.status(HttpStatus.OK).body(subscriptionType);
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
