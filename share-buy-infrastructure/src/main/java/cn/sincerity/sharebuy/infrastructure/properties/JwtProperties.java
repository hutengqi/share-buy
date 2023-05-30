package cn.sincerity.sharebuy.infrastructure.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * JwtProperties
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtProperties {

    /**
     * 请求头
     */
    private String header = "Authorization";

    /**
     * 密钥
     */
    private String secret = "JWT_SECRET_KEY";

    /**
     * 过期时间
     */
    private Long expiration = 1800L;

    /**
     * token前缀
     */
    private String tokenHead = "Bearer ";
}
