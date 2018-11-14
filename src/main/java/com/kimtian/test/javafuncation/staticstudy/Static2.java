package com.kimtian.test.javafuncation.staticstudy;

import java.util.ArrayList;
import java.util.List;
/**
 * Static学习类
 * @author kimtian
 **/
public class Static2 {
    public static void main(String[] args) {
//        Static2 s = new Static2();
//        List<String> aa = new ArrayList<>();
//        aa.add("11");
//        aa.add("acd");
//        System.out.println(splitList(aa,3));
    }
    public static <T> List<List<T>> splitList(List<T> list, int pageSize) {
        List<List<T>> listArray = new ArrayList<List<T>>();
        List<T> subList = null;
        for (int i = 0; i < list.size(); i++) {
            //每次到达页大小的边界就重新申请一个subList
            if (i % pageSize == 0) {
                subList = new ArrayList<T>();
                listArray.add(subList);
            }
            subList.add(list.get(i));
        }
        return listArray;
    }
}
