package cn.sincerity.sharebuy.application;

import cn.sincerity.sharebuy.rpc.account.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * NoteApplicationService: 笔记应用服务
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@Service
public class NoteApplicationService {

    @DubboReference
    private UserService userService;

    public String one() {
        return userService.sayHello();
    }
}
