package com.company;

public class CompareSums {
    public static void main(String[] args) {
                int count = 0;
        for(int a = 1000; a < 10000; a++){
            int cem1 = 0;
            int cem2 = 0;
            int c = 0;
            int x = a;
            while(x>0){
                if(c == 0 || c == 1){
                    cem1 += x%10;
                    c++;
                }
                else{
                    cem2 += x%10;
                }
                x /= 10;
            }
            if(cem1 == cem2){
                count++;
            }
        }
        System.out.println(count);
    }
}
