package com.aem.productservice.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate <String , String> template;

    public void sendMessage(String message){
        template.send("test-topic" , message);
    }

}
