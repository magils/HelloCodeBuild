package com.mgil.learning.aws;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicMathTest {

    private BasicMath math = new BasicMath();

    @Test
    public void testAdditionIsCorrect(){
        double r = math.add(1,1);
        assertEquals(2.0, r, 0);
    }

    @Test
    public void testSubstractIsCorrect(){
        double r = math.substract(2.0, 1.0);
        assertEquals(1.0, r, 0);
    }

    @Test
    public void testMultiplicationIsCorrect(){
        double r = math.multiply(2.0, 1.0);
        assertEquals(2.0, r,0);

    }

    @Test
    public void testDivisionIsCorrect(){
        double r = math.divide(4.0, 2.0);
        assertEquals(r, 2.0, 0);
    }

}
