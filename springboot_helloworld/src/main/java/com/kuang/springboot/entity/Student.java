package com.kuang.springboot.entity;

import lombok.*;

/**
 * 使用lombok简化Javabean的开发（Javabean是可重组的模块）
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Student {
    private Integer id;
    private String name;
    private Integer age;


}
