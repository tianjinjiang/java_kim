package com.kimtian.test.carsystem;

/**
 * 载货车
 *
 * @author kimtian
 **/
public class CargoCar extends Car {
    public CargoCar(int no, String name, int price, int cargoNum) {
        this.setNO(no);
        this.setName(name);
        this.setPrice(price);
        this.setCargoNum(cargoNum);
    }
    @Override
    public void take() {
        System.out.println(this.getNO() + "." + this.getName() + "可以载货" + this.getCargoNum() + "吨。每天花费"+this.getPrice()+"元。");
    }
}
