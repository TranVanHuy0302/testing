package com.example.testing;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void add_twoPlusThree_returnsFive() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void divide_sixByTwo_returnsThree() {
        assertEquals(3, calc.divide(6, 2));
    }
}