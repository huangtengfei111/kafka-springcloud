package kafka.demo.write.mq;

import kafka.demo.mq.KafkaStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/7/4 23:42
 */

@EnableBinding(KafkaStreams.class)
public class KafkaService {

    @StreamListener("input1")
    public void test(String message) {

        System.out.println(message);
    }
}
