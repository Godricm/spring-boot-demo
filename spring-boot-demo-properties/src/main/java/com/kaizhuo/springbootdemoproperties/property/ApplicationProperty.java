package com.kaizhuo.springbootdemoproperties.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: spring-boot-demo
 * @author: miaochen
 * @create: 2020-02-12 12:26
 * @description: 项目配置
 **/
@Data
@Component
public class ApplicationProperty {
    @Value("${application.name}")
    private String name;
    @Value("${application.version}")
    private String version;
}
