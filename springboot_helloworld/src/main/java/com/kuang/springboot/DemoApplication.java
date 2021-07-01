package com.kuang.springboot;

import com.kuang.springboot.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Auther:ljt
 * @Date: 2021/6/24 - 06 -24 - 10:19
 * @version: 1.0
 */
@SpringBootApplication  //代表是springboot的应用
public class DemoApplication {
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        String[] beanNamesForType = run.getBeanNamesForType(Student.class);
        for(String ss:beanNamesForType){
            System.out.println(ss);
        }
        int count = run.getBeanDefinitionCount();
        System.out.println(count);
    }
}
