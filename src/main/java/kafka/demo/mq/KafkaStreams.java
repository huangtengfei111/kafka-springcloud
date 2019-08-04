package kafka.demo.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface KafkaStreams {

    String OUTPUT1 = "output1";

    String INPUT1 = "input1";



    @Output(OUTPUT1)
    MessageChannel output1();

    @Input(INPUT1)
    MessageChannel input1();


}
