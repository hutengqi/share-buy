package cn.sincerity.sharebuy.domain.account;

import cn.sincerity.sharebuy.domain.BaseSnowflakeEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;


/**
 * 账户
 *
 * @author Ht7_Sincerity
 * @date 2022/1/14
 */
@Getter
@Setter
@Entity
public class Account extends BaseSnowflakeEntity {

    private String username;

    /**
     * 密码只写，不参与序列化。
     * 参与反序列化，但不参与对象编辑，修改密码需要通过单独接口处理。
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(updatable = false)
    private String password;
}
