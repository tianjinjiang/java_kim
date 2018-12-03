package com.kimtian.test.carsystem;

import com.NormalValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 系统操作
 *
 * @author kimtian
 **/
public class SystemOperator {
    static Car personCar1 = new PersonCar(1, "小汽车", 500, 5);
    static Car personCar2 = new PersonCar(2, "大客车", 2000, 20);
    static Car cargoCar1 = new CargoCar(3, "蹦蹦车", 700, 5);
    static Car cargoCar2 = new CargoCar(4, "大卡车", 1400, 20);
    static Car personAndCargorCar1 = new PersonAndCargoCar(5, "皮卡", 900, 3, 5);
    static List<Car> carList = new ArrayList<Car>();
    static {
        carList.add(personCar1);
        carList.add(personCar2);
        carList.add(cargoCar1);
        carList.add(cargoCar2);
        carList.add(personAndCargorCar1);
    }

    public static void main(String[] args) {
        SystemOperator systemOperator = new SystemOperator();
        System.out.println("是否要租车？1.租车 2.退出");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == NormalValue.oprator1) {
            System.out.println("您需要载客还是载货？1.载客 2.载货 3.即载客又载货");
            int num2 = scanner.nextInt();
            if (num2 == NormalValue.oprator1) {
                personCar1.take();
                personCar2.take();
                systemOperator.cal();
            } else if (num2 == NormalValue.oprator2) {
                cargoCar1.take();
                cargoCar2.take();
                systemOperator.cal();
            } else if (num2 == NormalValue.oprator3) {
                personAndCargorCar1.take();
                systemOperator.cal();
            } else if (num == NormalValue.oprator2) {
                System.out.println("欢迎下次光临～");
            } else {
                System.out.println("输入错误");
            }
        }
    }

    public void cal() {
        System.out.println("输入车编号：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Car car = (Car) carList.get(num-1);
        System.out.println("您选择的是" + car.getName());
        System.out.println("请输入要租车的天数");
        int days = scanner.nextInt();
        System.out.println("您要租" + car.getName() + ":" + days + "天。共花费" + days * car.getPrice() + "元");
    }
}