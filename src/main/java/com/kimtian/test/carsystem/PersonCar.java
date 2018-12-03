package com.kimtian.test.carsystem;

/**
 * 载人车
 *
 * @author kimtian
 **/
public class PersonCar extends Car {
    public PersonCar(int no, String name, int price, int personNum) {
        this.setNO(no);
        this.setName(name);
        this.setPrice(price);
        this.setPersonNum(personNum);
    }

    @Override
    public void take() {
        System.out.println(this.getNO() + "." + this.getName() + "可以载人" + this.getPersonNum() + "个。每天花费" + this.getPrice() + "元。");
    }
}
