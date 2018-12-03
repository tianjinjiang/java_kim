package com.kimtian.test.carsystem;

/**
 * 汽车父类
 *
 * @author kimtian
 **/
public abstract class Car {
    /**
     * 汽车编号
     **/
    private int NO;
    /**
     * 汽车名称
     **/
    private String name;
    /**
     * 租车价格
     **/
    private int price;
    /**
     * 货物数量
     **/
    private int cargoNum;
    /**
     * 人的数量
     **/
    private int personNum;

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public int getPersonNum() {
        return personNum;
    }

    public void setPersonNum(int personNum) {
        this.personNum = personNum;
    }

    public int getCargoNum() {
        return cargoNum;
    }

    public void setCargoNum(int cargoNum) {
        this.cargoNum = cargoNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract void take();
}
