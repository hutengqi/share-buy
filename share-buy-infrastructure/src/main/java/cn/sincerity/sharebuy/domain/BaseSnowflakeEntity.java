package cn.sincerity.sharebuy.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 雪花主键基类
 *
 * @author Ht7_Sincerity
 * @date 2022/1/14
 */
@Getter
@Setter
@MappedSuperclass
public class BaseSnowflakeEntity extends BaseEntity {

    @Id
    @GeneratedValue(
            generator = "snowflakeIdentifierGenerator",
            strategy = GenerationType.SEQUENCE)
    @GenericGenerator(
            name = "snowflakeIdentifierGenerator",
            strategy = "cn.sincerity.sharebuy.infrastructure.configuration.SnowflakeIdentifierGenerator")
    private String id;
}

