package com.company;

public class MinMax {

    public static void main(String[] args) {
        int[] arr = {1, 3, -7, 9, 0, -12, 5};
        int min = arr[0];
        int max = arr[0];
        int[]  x = new int[2];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>=max){
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        x[0] = min;
        x[1] = max;

        System.out.println(x[0]);
        System.out.println(x[1]);

    }
}
