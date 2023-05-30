package cn.sincerity.sharebuy.account.application;

import cn.sincerity.sharebuy.domain.security.AccessToken;
import cn.sincerity.sharebuy.infrastructure.security.TokenProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * AuthenticationService
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Slf4j
@Service
public class AuthenticationService {

    @Resource
    private AuthenticationManager authenticationManager;

    @Resource
    private TokenProvider tokenProvider;


    public String login(String username, String password) {

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(username, password);

        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        UserDetails userDetails = (UserDetails) authenticate.getPrincipal();

        AccessToken token = tokenProvider.createToken(userDetails);

        return token.getToken();
    }
}
