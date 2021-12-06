package com.company;

import java.util.Scanner;

public class CountOfNumbers {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] numbs = numbers.split(" ");
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < numbs.length; i++){
            if(Integer.parseInt(numbs[i])>0){
                posCount++;
            }
            else if(Integer.parseInt(numbs[i])<0){
                negCount++;
            }
            else
            {
                zeroCount++;
            }
        }
        System.out.println(negCount);
        System.out.println(posCount);
        System.out.println(zeroCount);
    }
}
