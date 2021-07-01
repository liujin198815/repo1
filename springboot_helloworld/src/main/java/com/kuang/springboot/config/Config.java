package com.kuang.springboot.config;

import com.kuang.springboot.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 代表是一个配置类，这个类，在运行主函数时候，就会也被加载（默认扫描的是和主函数类在一个包下的所有的类）
 */
@Configuration
public class Config {
    @Bean
    public Student student(){
        return new Student();
    }
}
