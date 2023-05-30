package cn.sincerity.sharebuy.account.application;

import cn.sincerity.sharebuy.account.domain.AccountRepository;
import cn.sincerity.sharebuy.domain.account.Account;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * AccountApplicationService
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Service
public class AccountApplicationService {

    @Resource
    private AccountRepository accountRepository;

    @Resource
    private PasswordEncoder passwordEncoder;

    public Account createAccount(String username, String password) {
        String encodedPassword = passwordEncoder.encode(password);
        Account account = Account.builder()
                .username(username)
                .mobile(username)
                .password(encodedPassword)
                .build();
        accountRepository.save(account);
        return account;
    }
}
