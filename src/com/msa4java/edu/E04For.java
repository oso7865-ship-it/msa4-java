package com.msa4java.edu;

public class E04For {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d 단",i);
            System.out.println();
            for (int z = 1; z <= 9; z++ ) {
                System.out.printf("%d X %d = %d", i, z, i * z);
                System.out.println();
            }
        }


        int dan = 2;
        for (int i = dan; i <= 9; i++) {
            String strDan = String.format("** %d단 **", i);
            System.out.println(strDan);
            for (int z = 1; z <= 9; z++) {
                String strMulti = String.format("%d X %d = %d",i,z,i*z);
                System.out.println(strMulti);
            }
        }
    }
}
