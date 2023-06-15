/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.tanutv123.mathutil.main;

import com.tanutv123.mathutil.core.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Test hàm getF() với các test case đã chuẩn bị
        //Test case #1, check getF() with n = 0.
        int n = 0;
        long expected = 1;
        long actual;
        //sau đó so sánh ổn ko
        actual = MathUtility.getFactorial(0);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        
        //Test 2: check getF(n=1)
        n=1;
        actual = MathUtility.getFactorial(1);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        //Test 3: check getF(n=2)
        n=2;
        expected = 2;
        actual = MathUtility.getFactorial(2);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        //Test 4: check getF(n=3)
        n=3;
        expected = 6;
        actual = MathUtility.getFactorial(3);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        //Test 5: check getF(n=4)
        n=4;
        expected = 24;
        actual = MathUtility.getFactorial(4);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        //Test 6: check getF(n=5)
        n=5;
        expected = 120;
        actual = MathUtility.getFactorial(5);
        System.out.println(n + "! | expected: " + expected + " | actual: " + actual);
        //Test 7: check getF(n = -1)
        n=-1;
        System.out.println(n + "! | expected: EXCEPTION | actual: " );
        MathUtility.getFactorial(-1);
    }
    
}

//TEST CASE VÀ TEST DRIVEN DEVELOPMENT - TDD
//việc viết code và test code được tiến hành song song, đan xen luôn
//1 hàm đc viết ra thì ngay trong quá trình viết đã chuẩn bị luôn
//bộ test cases, nhiều test cases để test hàm đúng hay sai luôn
//ta liên tục sửa code/thêm code và chạy test case, run test.
//giống QC là làm test case, run test case
//khác QC: phải viết code cho app.


//CÁC TEST CASE ĐC VIÊT THEO FORMAT SAU:

//TEST CASE 1: Check getF(n = 0)
//Steps/Procedures - cách để test hàm
//                      1. given n = 0;
//                      2. call getF(n=0)
//Expected result - kì vọng gì, hy vọng gì khi thực thi cái steps ở trên
