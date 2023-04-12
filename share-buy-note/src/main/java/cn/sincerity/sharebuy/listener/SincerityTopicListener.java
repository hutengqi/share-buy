package cn.sincerity.sharebuy.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * SincerityTopicListener
 *
 * @author Ht7_Sincerity
 * @since 2023/2/24
 */
@Slf4j
@Service
@RocketMQMessageListener(topic = "sincerity", consumerGroup = "sincerity_consumer")
public class SincerityTopicListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("[Share-buy-Note]receive message: {}", message);
    }
}
