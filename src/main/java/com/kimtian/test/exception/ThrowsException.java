package com.kimtian.test.exception;
/**
 * 异常学习测试类
 * @author kimtian
 **/
public class ThrowsException {
    public static void main(String[] args) {
        try {
            ThrowsException t = new ThrowsException();
            t.test(1);
        } catch (Exception e) {
            try {
                ThrowsException t = new ThrowsException();
                t.test(3);
            } catch (Exception qe) {
            }
        }
    }

    public void test(int a) throws Exception {
        if (a == 1) {
            throw new RuntimeException("1111");
        } else {
            System.out.println("9999999");
        }
        System.out.println("2222222222");
    }
}
