package com.kimtian.test;

import com.kimtian.test.springstudy.SpringTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTestTest {
    SpringTest springTest;
    @Test
    public void springTest() {
        springTest = new SpringTest();
        String flag = springTest.test();
        System.out.println(flag);
        assertEquals(flag, "test");
    }
}