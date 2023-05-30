package cn.sincerity.sharebuy.account.application;

import cn.sincerity.sharebuy.account.domain.AccountRepository;
import cn.sincerity.sharebuy.domain.security.LoginAccount;
import cn.sincerity.sharebuy.domain.account.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserPasswordService
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Slf4j
@Service
public class UserUsernameService implements UserDetailsService {

    @Resource
    private AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Account account = accountRepository.findByUsername(username);

        if (account == null)
            throw new UsernameNotFoundException("用户不存在");

        return LoginAccount.builder()
                .account(account)
                .build();
    }


}
