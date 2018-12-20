package com.himalayan.model;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private Integer age;

    public void m(@NonNull String arg) {
        System.out.println("Person类中的一个方法");
        System.out.println("传入的参数: " + arg);
    }
}
