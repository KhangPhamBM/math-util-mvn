/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.khangpbm.mathutil.core;

// we will clone class java.util.Math chứa các hàm huyền thoại: Math.sqrt(), Math.sin(), etc
public class MathUtility {
    public static final double PI = 3.1415;
    // we design this function: f(0) = 1, f(nev) throws exception
    //21! can't be handled with long => n>=21! throw exception
//    public static long getFactorial(int n){
//       if(n < 0 || n > 20) 
//           throw new IllegalArgumentException("Invalid n. n must be between 0 to 20. Please!");
//        long ans = 1;
//        for(int i = 2; i <= n; i++)
//            ans *= i;
//        return ans;
//    }
    
    public static long getFactorial(int n){
       if(n < 0 || n > 20) 
           throw new IllegalArgumentException("Invalid n. n must be between 0 to 20. Please!");
        if(n < 2) return 1;
        return getFactorial(n - 1) * n;
    }
}

//Tính