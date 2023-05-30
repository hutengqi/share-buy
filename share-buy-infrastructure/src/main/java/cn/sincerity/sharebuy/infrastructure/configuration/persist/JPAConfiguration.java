package cn.sincerity.sharebuy.infrastructure.configuration.persist;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Spring Data JPA 配置类
 *
 * @author Ht7_Sincerity
 * @date 2022/6/1
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "createAndUpdateAuditorAware")
@EntityScan(basePackages = {"cn.sincerity.sharebuy.domain"})
public class JPAConfiguration {

}
