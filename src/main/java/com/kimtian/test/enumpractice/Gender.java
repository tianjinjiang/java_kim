package com.kimtian.test.enumpractice;

public enum Gender {
    /**
     * 保价保量
     */
    MALE(0),
    /**
     * 提量下单
     */
    FEMALE(1),
    /**
     * 保价不保量
     */
    UNKNOW(2);


    private final int code;

    Gender(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Gender valueOf(int code) {
        for (Gender type : Gender.values()) {
            if (type.code == code) {
                return type;
            }
        }
        return null;
    }
}
