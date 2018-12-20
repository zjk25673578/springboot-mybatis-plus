package com.himalayan.app;

import com.himalayan.model.Person;

import java.lang.reflect.Constructor;

public class TestDemo {

    public static void main(String[] args) {
        Class<?> clazz = Person.class;
        Constructor<?>[] cs = clazz.getConstructors();
        for (Constructor c : cs) {
            System.out.println(c.getParameterCount());
        }

        Person p = new Person();
        System.out.println(p);

        p.m("sfgsdfgesfef");
    }
}
