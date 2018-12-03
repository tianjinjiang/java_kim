package com.kimtian.test.enumpractice;
/**
 * 性别枚举
 *
 * @author kimtian
 **/
public enum Gender {
    /**
     * 男的
     */
    MALE(0),
    /**
     * 女的
     */
    FEMALE(1),
    /**
     * 保密
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
