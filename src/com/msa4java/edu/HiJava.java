package com.msa4java.edu;

class Person {
    String name;
    int age;
}

public class HiJava {
    public static void main(String[] args){
        System.out.println(1);
        System.out.print(2);
        System.out.print(2);

        String str = "자바";
        int num = 54;

        System.out.printf("안녕 %s : %d",str,num);

        Person p = new Person();
        p.name = "kim";
        p.age = 20;
        System.out.println();
        System.out.println(p.name);
        System.out.println(p.age);
    }
}
