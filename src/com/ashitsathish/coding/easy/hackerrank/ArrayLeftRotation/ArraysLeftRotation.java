package com.ashitsathish.coding.easy.hackerrank.ArrayLeftRotation;

import java.util.Arrays;

public class ArraysLeftRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberOfRotations(new int[]{1,2,3,4,5}, 2)));
    }


    static int[] numberOfRotations(int[] a, int d){
        for(int i=1; i<=2; i++ ){
            rotLeft(a);
        }
        return a;
    }

    static int[] rotLeft(int[] a) {
        int zeroThElement = a[0];

        for(int i=0; i< a.length-1; i++){
            a[i]= a[i+1];
        }
        a[a.length-1]= zeroThElement;

        return a;
    }
}
