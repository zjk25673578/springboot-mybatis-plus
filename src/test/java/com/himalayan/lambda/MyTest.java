package com.himalayan.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * lambda 表达式笔记
 * 语法: (Type... obj) -> { ... }
 */

public class MyTest {

    @Test
    public void test1() {
        // 匿名内部类
        Animals animals = new Animals() {
            @Override
            public void eat() {
                System.out.println("吃饭 !");
            }
        };
        animals.eat();
        Animals a = () -> {
            System.out.println("动物正在吃饭 !");
        };
        // lambda表达式的实现中只有一行代码的时候, {}可以省略
        Animals a2 = () -> System.out.println("动物正在吃饭 !");

        a.eat();
        a2.eat();
    }

    public void test2() {
        // 集合
        String[] names = {
                "小明",
                "小红",
                "小绿"
        };
        for (String name : names) {
            System.out.println(name);
        }
        /*
          ::
          表示静态方法的引用, 而且该静态方法参数只有一个的时候
         */
        Arrays.asList(names).forEach(Person::m);
    }

    public void test3() {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i + "================");
            }
        });
        t.start();
        for (int i = 97; i < 118; i++) {
            System.out.println((char) i + "****************");
        }
    }

    public void test4() {
        // 逻辑计算
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        listNum.stream().map((x) -> x * x).forEach(System.out::println);
    }

    public void test5() {
        List<String> list = new ArrayList<String>() { // 双括号初始化, 成员变量和方法的调用依然遵循权限修饰符的控制
            {
                add("山东省");
                add("山东省");
                add("广西省");
                add("山西省");
                add("山西省");
                add("陕西省");
                add("辽宁省");
            }
        };
        list.forEach(System.out::println);
        // distinct去除重复, 根据是否equals进行判断
        list.stream().distinct().forEach(System.out::println);

        Person p = new Person() {
            {
                setFirstName("abc");
            }
        };
        System.out.println(p.getFirstName());
    }

    public void test6() {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
            }
        };
        // 显示所有的类信息
        javaProgrammers.forEach((programmer) -> {
            System.out.printf("%s %s; ", programmer.getFirstName(), programmer.getLastName());
            System.out.println("工资: " + programmer.getSalary());
        });
        // 修改集合中的信息
        Consumer<Person> consumer = (person) -> {
            person.setSalary(person.getSalary() * 2);
        };
        javaProgrammers.forEach(consumer);
        // 显示所有的类信息
        javaProgrammers.forEach((programmer) -> {
            System.out.printf("%s %s; ", programmer.getFirstName(), programmer.getLastName());
            System.out.println("工资: " + programmer.getSalary());
        });
        /*
         * 只获取年龄大于30的
         * 下面filter方法中的代码可以简写成
         * filter((pp) -> pp.getAge() > 30)
         **/
        javaProgrammers.stream().filter((pp) -> {
            return pp.getAge() > 30;
        }).forEach(
                (programmers) -> System.out.println(programmers.getFirstName() + " " + programmers.getLastName() + "年龄超过了30岁")
        );
    }
}
