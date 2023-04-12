package cn.sincerity.sharebuy.account;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AccountApplication
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"cn.sincerity.sharebuy"})
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
