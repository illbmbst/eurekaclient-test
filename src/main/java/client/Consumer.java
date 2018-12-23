package client;

import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Profile("kafka-consumer")
@Component
public class Consumer {

    @KafkaListener(topics = "test")
    public void receive(String payload) {
        System.out.println(payload);
    }
}
