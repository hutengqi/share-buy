package cn.sincerity.sharebuy.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 主键自增基类
 *
 * @author Ht7_Sincerity
 * @date 2022/1/14
 */
@Getter
@Setter
@MappedSuperclass
public class BaseIdentityEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
