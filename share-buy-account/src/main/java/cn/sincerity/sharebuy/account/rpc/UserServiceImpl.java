package cn.sincerity.sharebuy.account.rpc;

import cn.sincerity.sharebuy.rpc.account.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * UserServiceImpl
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@Slf4j
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello() {
        log.info("------------------------------[Dubbo UserService.sayHello]------------------------------");
        return "Hello, Share-Buy base on Dubbo!";
    }
}
