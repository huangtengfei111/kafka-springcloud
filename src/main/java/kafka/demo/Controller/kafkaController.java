package kafka.demo.Controller;

import kafka.demo.mq.KafkaStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/7/4 23:30
 */

@RestController
@EnableBinding(KafkaStreams.class)

public class kafkaController {

    @Autowired
    private KafkaStreams kafkaStreams;

@PostMapping("/kafka")
    public  void input(@RequestBody String in){
        kafkaStreams.output1().send(MessageBuilder.withPayload(in).build());
    }
}
