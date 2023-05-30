package cn.sincerity.sharebuy.infrastructure.configuration.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;

import static org.apache.dubbo.common.constants.CommonConstants.CONSUMER;

/**
 * ConsumerFilter
 *
 * @author Ht7_Sincerity
 * @since 2023/2/7
 */
@Slf4j
@Activate(group = CONSUMER)
public class ConsumerFilter implements Filter {

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        log.info("------------------------------[Dubbo Consumer Filter Log]------------------------------");
        return invoker.invoke(invocation);
    }
}
