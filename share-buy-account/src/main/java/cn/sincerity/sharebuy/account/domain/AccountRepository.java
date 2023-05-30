package cn.sincerity.sharebuy.account.domain;

import cn.sincerity.sharebuy.domain.account.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * UserRepository
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByUsername(String username);
}
