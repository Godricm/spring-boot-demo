package com.kaizhuo.springbootdemohelloworld;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.core.util.StrUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringBoot启动类
 *
 * @author miaochen
 */
@SpringBootApplication
@RestController
public class SpringBootDemoHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoHelloworldApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "who") String who){
        if(StrUtil.isBlank(who)){
            who="wolrd";
        }
        return StrFormatter.format("Hello, {}!",who);
    }

}
