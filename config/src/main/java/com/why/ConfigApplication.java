package com.why;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
        // 读取启用配置文件中的属性
        while (true) {
            String userName = applicationContext.getEnvironment().getProperty("user.a");
            String userAge = applicationContext.getEnvironment().getProperty("user.b");
            System.err.println("user name :" +userName+"; age: "+userAge);
            TimeUnit.SECONDS.sleep(3);
        }

    }
}
