/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tanutv123.mathutil.core.test;

import com.tanutv123.mathutil.core.MathUtility;
import static com.tanutv123.mathutil.core.MathUtility.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ASUS
 */
public class MathUtiityAdvancedTest {

    //Hàm chuẩn bị bộ test data.
    //Để sau đố fill vào hàm assertEquals() ở dưới.
    public static Object[][] initTestData() {
        Object testData[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {3, 6},
        {4, 24}};
        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected) {
        assertEquals(expected, getFactorial(n));
    }

    @Test
    public void testFactorialGivenWrongArgumentThrowsException() {
        Executable gF = () -> MathUtility.getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, gF);
    }

}
