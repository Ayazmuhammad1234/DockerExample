package com.orderservice.config;


import com.orderservice.model.OrderEvent;

import java.util.*;

//@Configuration
public class KafkaProducerConfig {
//
//    @Bean
//    public ProducerFactory<String, OrderEvent> producerFactory() {
//        Map<String, Object> config = new HashMap<>();
//        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//        return new DefaultKafkaProducerFactory<>(config);
//    }
//
//    @Bean
//    public KafkaTemplate<String, OrderEvent> kafkaTemplate() {
//        return new KafkaTemplate<>(producerFactory());
//    }
}