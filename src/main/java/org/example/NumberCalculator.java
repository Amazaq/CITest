package org.example;

import org.springframework.stereotype.Component;

@Component
public class NumberCalculator {
    public static int CalculateSquare(int num) {
        int res = 0;
        for(int i = 0; i < num; i++) {
            res += num;
        }
        return res;
    }
}
