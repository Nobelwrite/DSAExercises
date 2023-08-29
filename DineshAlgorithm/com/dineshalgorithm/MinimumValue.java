package com.dineshalgorithm;

public class MinimumValue {
    public static int findMinArray(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("invalid input");
        }
        int min = arr[0];
        //this will hold the minimum value of the array
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = {200, 500, 100, 15, 75};
        MinimumValue minimumValue = new MinimumValue();
        System.out.println(minimumValue.findMinArray((arr)));

    }
}
