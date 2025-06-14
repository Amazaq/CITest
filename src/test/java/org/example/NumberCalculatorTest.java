package org.example;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("SX2416157wjn-CITest")
@Feature("CITest")
public class NumberCalculatorTest {
    @Test
    @Story("test1")
    public void testCalculateSquare_bigger_0() {
        int number = 5;
        int expected = 25;
        int actual = NumberCalculator.CalculateSquare(number);

        assertEquals(expected, actual);
        System.out.println("测试1 成功！");
    }
    @Test
    @Story("test2")
    public void testCalculateSquare_eqaul_0() {
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
