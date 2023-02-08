package cn.sincerity.sharebuy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * NoteApplication
 *
 * @author Ht7_Sincerity
 * @since 2022/12/27
 */
@EnableDubbo
@SpringBootApplication
public class NoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class, args);
    }
}
