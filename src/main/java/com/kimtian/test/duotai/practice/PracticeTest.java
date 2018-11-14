package com.kimtian.test.duotai.practice;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * 交通多态练习
 * @author kimtian
 **/
public class PracticeTest {
    public static void main(String[] args) {
        //向上类型转换（隐式，自动类型转换），是小类型到大类型的转换（无风险）
        Transportation transportation1 = new Bus();
        transportation1.transport("公共汽车",40);
        LandTransportation landTransportation = new Bus();
        landTransportation.transport("公共汽车",50);

        Transportation transportation2 = new Car();
        transportation2.transport("",5);

        Transportation transportation = new LandTransportation();
        transportation.transport("陆地上的一种交通方式",10);

        Transportation transportation3 = new Ship();
        transportation3.transport("轮船",500);

        Transportation transportation4 = new AirPlane();
        transportation4.transport("飞机",200);
        //向下类型转换（强制类型转换），是大类型到小类型的转换（有风险）
        Transportation busOne = new Bus();
        Bus bus = (Bus) busOne;

//           String s = "\\u79fb\\u52a8\\u4e92\\u8054\\u7f51\\u5e94\\u7528";
            String s = "反\t弹";
            String s2 = StringEscapeUtils.unescapeJava(s);
            System.out.println("s:"+s);
            System.out.println("s2:"+s2);

    }
}
