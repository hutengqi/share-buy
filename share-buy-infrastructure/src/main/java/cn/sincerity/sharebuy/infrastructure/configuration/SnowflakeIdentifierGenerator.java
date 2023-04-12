package cn.sincerity.sharebuy.infrastructure.configuration;

import cn.hutool.core.util.IdUtil;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

/**
 * SnowflakeIdentifierGenerator
 *
 * @author Ht7_Sincerity
 * @since 2023/3/9
 */
public class SnowflakeIdentifierGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return IdUtil.getSnowflakeNextId();
    }
}
