package cn.sincerity.sharebuy.domain.security;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


/**
 * AccessToken
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Data
@Builder
public class AccessToken {

    private String loginAccount;
    private String token;
    private Date expirationTime;
}
