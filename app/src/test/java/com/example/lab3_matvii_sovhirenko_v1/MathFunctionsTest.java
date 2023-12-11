package com.example.lab3_matvii_sovhirenko_v1;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathFunctionsTest {
    @Test
    public void testAdditionMethodPositiveNumbers(){
        final double firstInput = 1.92;
        final double secondInput = 10;
        final double expectedResult = 11.92;

        final double actualResult = MathActions.addition(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testAdditionMethodNegativeNumbers(){
        final double firstInput = -1;
        final double secondInput = -10.5;
        final double expectedResult = -11.5;

        final double actualResult = MathActions.addition(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testAdditionMethodZeroNumbers(){
        final double firstInput = 0;
        final double secondInput = -0.0000;
        final double expectedResult = 0;

        final double actualResult = MathActions.addition(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testSubtractionMethodPositiveNumbers(){
        final double firstInput = 1.92;
        final double secondInput = 10;
        final double expectedResult = -8.08;

        final double actualResult = MathActions.subtraction(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testSubtractionMethodNegativeNumbers(){
        final double firstInput = -1;
        final double secondInput = -10.5;
        final double expectedResult = 9.5;

        final double actualResult = MathActions.subtraction(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testSubtractionMethodZeroNumbers(){
        final double firstInput = 0;
        final double secondInput = -0.0000;
        final double expectedResult = 0;

        final double actualResult = MathActions.subtraction(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testDivisionMethodPositiveNumbers(){
        final double firstInput = 2;
        final double secondInput = 5;
        final double expectedResult = 0.4;

        final double actualResult = MathActions.division(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testDivisionMethodNegativeNumbers(){
        final double firstInput = -1;
        final double secondInput = -10;
        final double expectedResult = 0.1;

        final double actualResult = MathActions.division(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testDivisionMethodZeroNumbers(){
        final double firstInput = 0;
        final double secondInput = -0.0000;
        final double expectedResult = Double.NaN;

        final double actualResult = MathActions.division(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testMultiplicationMethodPositiveNumbers(){
        final double firstInput = 2;
        final double secondInput = 2.2;
        final double expectedResult = 4.4;

        final double actualResult = MathActions.multiplication(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testMultiplicationMethodNegativeNumbers(){
        final double firstInput = -1;
        final double secondInput = -10;
        final double expectedResult = 10;

        final double actualResult = MathActions.multiplication(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testMultiplicationMethodZeroNumbers(){
        final double firstInput = 0;
        final double secondInput = -0.0000;
        final double expectedResult = 0;

        final double actualResult = MathActions.multiplication(firstInput,secondInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testSquareRootMethodPositiveNumbers(){
        final double firstInput = 121;
        final double expectedResult = 11;

        final double actualResult = MathActions.squareRoot(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testSquareRootMethodNegativeNumbers(){
        final double firstInput = -100;
        final double expectedResult = Double.NaN;

        final double actualResult = MathActions.squareRoot(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testSquareRootMethodZeroNumbers(){
        final double firstInput = -0.00;
        final double expectedResult = 0;

        final double actualResult = MathActions.squareRoot(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }


    @Test
    public void testChangeSignMethodPositiveNumbers(){
        final double firstInput = 121;
        final double expectedResult = -121;

        final double actualResult = MathActions.changeSign(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

    @Test
    public void testChangeSignMethodNegativeNumbers(){
        final double firstInput = -10.2;
        final double expectedResult = 10.2;

        final double actualResult = MathActions.changeSign(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }
    @Test
    public void testChangeSignMethodZeroNumbers(){
        final double firstInput = -00.000;
        final double expectedResult = 0;

        final double actualResult = MathActions.changeSign(firstInput);

        assertEquals(expectedResult, actualResult,0.000000001);
    }

}