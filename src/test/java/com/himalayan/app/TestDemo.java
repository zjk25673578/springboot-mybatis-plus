package com.himalayan.app;

import java.util.Arrays;

public class TestDemo {

    public static void main(String[] args) {
/*        Class<?> clazz = Person.class;
        Constructor<?>[] cs = clazz.getConstructors();
        for (Constructor c : cs) {
            System.out.println(c.getParameterCount());
        }

        Person p = new Person();
        System.out.println(p);

        p.m("sfgsdfgesfef");*/
        byte[] arr1 = {1, 2, 3, 4};
        byte[] arr2 = {5, 6, 7, 8, 0, 0, 0, 0, 0, 0};
        System.arraycopy(arr1, 0, arr2, 5, 4);
        System.out.println(Arrays.toString(arr2));
        System.out.println(new String(arr2));
        System.out.println(Arrays.toString("你好".getBytes()));
    }
}
