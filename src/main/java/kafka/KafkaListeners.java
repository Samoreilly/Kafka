package kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "orders", groupId= "orderGroup")
    void listener(String data){
        System.out.println("Received data" + data);

    }
}
