package com.client.ws.wsplus.controller;

import com.client.ws.wsplus.dto.SubscriptionTypeDto;
import com.client.ws.wsplus.model.SubscriptionType;

import com.client.ws.wsplus.service.SubscriptionTypeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
public class SubscriptionTypeController {

    private SubscriptionTypeService subscriptionTypeService;

    SubscriptionTypeController(SubscriptionTypeService subscriptionTypeService) {
        this.subscriptionTypeService = subscriptionTypeService;
    }

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable("id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }

    @PostMapping
    public ResponseEntity<SubscriptionType> create(@Valid @RequestBody SubscriptionTypeDto dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(subscriptionTypeService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubscriptionType> update(@PathVariable("id") Long id, @RequestBody SubscriptionTypeDto dto) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        subscriptionTypeService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }


}
