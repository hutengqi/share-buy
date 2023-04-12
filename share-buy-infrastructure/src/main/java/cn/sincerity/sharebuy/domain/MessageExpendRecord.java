package cn.sincerity.sharebuy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * MessageProduceRecord : 消息生产日志
 *
 * @author Ht7_Sincerity
 * @since 2023/3/8
 */
@Getter
@Setter
@Entity
public class MessageExpendRecord extends BaseIdentityEntity {

    /**
     * 消息类型
     */
    private Integer type;

    /**
     * 业务标识 Id
     */
    private Long businessId;

    /**
     * 消息内容
     */
    private String body;
}
