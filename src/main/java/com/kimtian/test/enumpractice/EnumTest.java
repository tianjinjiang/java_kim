package com.kimtian.test.enumpractice;

import java.util.Arrays;
import java.util.List;

public class EnumTest {
    public static void main(String[] args) {
//        Gender(1);
        System.out.println(Gender.MALE.getCode() != 0);
        System.out.println(Gender.valueOf(5));
        List<Gender> sdd = Arrays.asList(Gender.values());
        System.out.println(sdd.size());
    }
}
