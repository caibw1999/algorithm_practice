package com.caibw.array;

import java.util.Arrays;

/**
 * @ClassName ThirdLargestNumber
 * @Package com.caibw.array
 * @Author CaiBW
 * @Create 24/07/30 下午 11:04
 * @Description
 */
public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        thirdMax(arr);
    }
    
    private static void thirdMax(int[] arr) {
        System.out.println("arr.length = " + arr.length);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
