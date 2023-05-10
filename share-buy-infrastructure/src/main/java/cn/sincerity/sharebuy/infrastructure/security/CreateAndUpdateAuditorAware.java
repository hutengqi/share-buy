package cn.sincerity.sharebuy.infrastructure.security;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * CreateAndUpdateAuditorAware: 创建人，更新人的数据获取
 *
 * @author Ht7_Sincerity
 * @date 2023/5/10
 */
@Component
public class CreateAndUpdateAuditorAware implements AuditorAware<Long> {

    @Override
    public Optional<Long> getCurrentAuditor() {
        return Optional.empty();
    }
}
