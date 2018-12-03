package com.kimtian.test.enumpractice;

/**
 * 地域枚举
 *
 * @author kimtian
 **/
public enum Area {
    /**
     * 北京
     */
    BEIJING(0),
    /**
     * 上海
     */
    SHANGHAI(1),
    /**
     * 深圳
     */
    SHENZHEN(2);

    private final int code;

    Area(int code) {
        this.code = code;
    }

}
