package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.orderservice.model.OrderEvent;
import com.orderservice.service.OrderEventProducer;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderEventProducer producer;

//    @PostMapping
//    public String placeOrder(@RequestBody OrderEvent orderEvent) {
//        // Generate order ID
//        orderEvent.setOrderId(UUID.randomUUID().toString());
//
//        // Send to Kafka
//        producer.sendOrderEvent(orderEvent);
//
//        return "Order placed successfully!";
//    }
    
    
    @GetMapping("/get")
    
    public String getResponse() {
    	
    	return "response got it ";
    }
}