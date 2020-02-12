package com.kaizhuo.springbootdemoproperties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-demo
 * @package: com.kaizhuo.springbootdemoproperties.property
 * @description: 开发人员配置
 * @author: miaochen
 * @create: 2020-02-12 12:42
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
@Data
@ConfigurationProperties(prefix = "developer")
@Component
public class DeveloperProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
