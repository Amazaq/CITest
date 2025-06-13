package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberCalculatorTest {
    @Test
    void testCalculateSquare_bigger_0() {
        int number = 5;
        int expected = 25;
        int actual = NumberCalculator.CalculateSquare(number);

        assertEquals(expected, actual);
        System.out.println("测试1 成功！");
    }
    @Test
    void testCalculateSquare_eqaul_0() {
        int number = 0;
        int expected = 0;
        int actual = NumberCalculator.CalculateSquare(number);

        assertEquals(expected, actual);
        System.out.println("测试2 成功！");
    }
//    @Test
//    void testCalculateSquare_smaller_0() {
//        int number = -4;
//        int expected = 16;
//        int actual = NumberCalculator.CalculateSquare(number);
//
//        assertEquals(expected, actual);
//        System.out.println("测试3 成功！");
//    }

}
