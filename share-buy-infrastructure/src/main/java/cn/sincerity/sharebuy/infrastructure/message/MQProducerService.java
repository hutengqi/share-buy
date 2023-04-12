package cn.sincerity.sharebuy.infrastructure.message;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * MQProducerService
 *
 * @author Ht7_Sincerity
 * @since 2023/2/24
 */
@Slf4j
@Component
public class MQProducerService {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    public void syncSend(String topic, Object message){
        SendResult result = rocketMQTemplate.syncSend(topic, message);
        log.info(result.toString());
    }
}
