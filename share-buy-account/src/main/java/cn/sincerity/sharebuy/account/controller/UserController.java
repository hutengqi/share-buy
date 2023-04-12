package cn.sincerity.sharebuy.account.controller;

import cn.sincerity.sharebuy.infrastructure.message.MQProducerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * UserController
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private MQProducerService mqProducerService;

    @PostMapping("/send")
    private void sendMessage(@RequestParam("message") String message) {
        mqProducerService.syncSend("sincerity", message);
    }
}
