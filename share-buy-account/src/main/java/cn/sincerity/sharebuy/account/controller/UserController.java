package cn.sincerity.sharebuy.account.controller;

import cn.sincerity.sharebuy.account.application.AccountApplicationService;
import cn.sincerity.sharebuy.account.application.AuthenticationService;
import cn.sincerity.sharebuy.domain.account.Account;
import cn.sincerity.sharebuy.infrastructure.http.CommonResponse;
import cn.sincerity.sharebuy.infrastructure.message.MQProducerService;
import org.springframework.web.bind.annotation.*;

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

    @Resource
    private AuthenticationService authenticationService;

    @Resource
    private AccountApplicationService accountApplicationService;

    @PostMapping("/send")
    public void sendMessage(@RequestParam("message") String message) {
        mqProducerService.syncSend("sincerity", message);
    }

    @PostMapping("/login")
    public CommonResponse<String> login(@RequestParam("username") String username,
                                        @RequestParam("password") String password) {
        return CommonResponse.success(authenticationService.login(username, password));
    }

    @PostMapping("/register")
    public CommonResponse<Account> register(@RequestParam("username") String username,
                                            @RequestParam("password") String password) {
        return CommonResponse.success(accountApplicationService.createAccount(username, password));
    }
}
