package com.sample.app.arithmetic;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void add_10And20_30() {
        Calculator calculator = new Calculator();

        int result = calculator.add(10, 20);

        assertEquals(result, 30);
    }

}
