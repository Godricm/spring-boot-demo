package com.kaizhuo.springbootdemoproperties.controller;

import cn.hutool.core.lang.Dict;
import com.kaizhuo.springbootdemoproperties.property.ApplicationProperty;
import com.kaizhuo.springbootdemoproperties.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-boot-demo
 * @package: com.kaizhuo.springbootdemoproperties.controller
 * @description: 测试Controller
 * @author: miaochen
 * @create: 2020-02-12 12:44
 * @copyright: CopyRight (c) 2020
 * @version: 1.0.0
 * @modified: miaochen
 **/
@RestController
public class PropertyController {
    @Autowired
    private  ApplicationProperty applicationProperty;
    @Autowired
    private DeveloperProperty developerProperty;



    @GetMapping("/property")
    public Dict index(){
        return Dict.create().set("applicationProperty",applicationProperty).set("developerProperty",developerProperty);
    }
}
