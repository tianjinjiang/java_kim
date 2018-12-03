package com.kimtian.test.carsystem;

/**
 * 载人和货车
 *
 * @author kimtian
 **/
public class PersonAndCargoCar extends Car {
    public PersonAndCargoCar(int no, String name, int price, int personNum, int cargoNum) {
        this.setNO(no);
        this.setName(name);
        this.setPrice(price);
        this.setPersonNum(personNum);
        this.setCargoNum(cargoNum);
    }

    @Override
    public void take() {
        System.out.println(this.getNO() + "." + this.getName() + "可以载客" + this.getPersonNum() + "个，载货" + this.getCargoNum() + "吨。");
    }
}
