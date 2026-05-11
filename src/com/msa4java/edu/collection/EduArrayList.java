package com.msa4java.edu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EduArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);

        list.add(42);
        list.add(366);
        list.add(63);
        list.add(7);
        list.add(634);
        list.add(12);
        list.add(63);
        list.add(21);
        list.add(25);
        list.add(91);
        System.out.println(list);

        // 정렬
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.size());

        //향상된 for문
        for(int i : list){
            System.out.println(i);
        }

        list.forEach((i) -> {
            System.out.println(i);
        });

    }
}
