package com.msa4java.edu.oop;

import java.awt.*;

public class MainOOP {
    public static void main(String[] args) {
        // Whale 클래스를 인스턴스 생성
        Whale w = new Whale();

        System.out.println(w.name);
        w.swimming();

        // static 멤버들에게 접근
        System.out.println(Whale.age);
        Whale.breath("테스트 ");

        // 접근 제어 지시자 확인용
        AccessModifier accessModifier = new AccessModifier();

        // 오버로딩 테스트
        Overloading overloading = new Overloading();
        overloading.print(1, 2);

        // 생성자
        ConJava conjava = new ConJava(20);
        ConJava conjava1 = new ConJava(30);
        ConJava conName = new ConJava("kim");
        System.out.println(conjava.age);
        System.out.println(conjava1.age);
        System.out.println(conName.name);

        Marine marine = new Marine(40,6,0);
        System.out.println(marine.getHp());
        marine.setHp(500);
        System.out.println(marine.getHp());

        Marine marine2 = new Marine();
        System.out.println(marine2.getHp());
    }
}
