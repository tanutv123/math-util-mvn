/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tanutv123.mathutil.core;

/**
 *
 * @author ASUS
 */

//class này clone lại 100% cái class java.util.Math của JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20. Plz");
        }
        if(n==0 || n ==1) {
            return 1;
        }
        long product = 1;
        for(int i = 2; i <= n ; i++) {
            product *= i;
        }
        return product;
    }
}
