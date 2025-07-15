package com.orderservice.service;

import org.springframework.stereotype.Service;


@Service
public class OrderEventProducer {
//
//    @Autowired
//    private KafkaTemplate<String, OrderEvent> kafkaTemplate;
//
//    private static final String TOPIC = "order-topic";
//
//    public void sendOrderEvent(OrderEvent orderEvent) {
//        kafkaTemplate.send(TOPIC, orderEvent);
//        System.out.println("Order event sent to Kafka: " + orderEvent.getOrderId());
//    }
}