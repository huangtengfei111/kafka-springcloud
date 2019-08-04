package kafka.demo.Controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2019/7/7 18:48
 */

@RestController
public class RedisController {

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @PostMapping("redis")
    public  String testRedis(@RequestBody String message){
        redisTemplate.opsForValue().set("mess", message);
        System.out.println(redisTemplate.opsForValue().get("mess"));
        return "success";
    }
}
