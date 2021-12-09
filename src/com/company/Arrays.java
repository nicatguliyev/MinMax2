package com.company;

public class Arrays {
    public static void main(String[] args) {
//       int[] arr  = {1, 3 , -1, 4, 0, -5, 2};
//       for(int i = 0; i<arr.length; i++){
//           int min = arr[i];
//           for(int j = i; j < arr.length; j++){
//               if(arr[j]<=min){
//                   min = arr[j];
//                   arr[j] = arr[i];
//                   arr[i] = min;
//               }
//           }
//       }
//       for (int k = 0; k<arr.length; k++){
//           System.out.println(arr[k]);
//       }

//        int[][] x = {{2, -4}, {3, 5 -9}, {-12, 1, 4, 0}};
//         for(int i = 0; i <x.length; i ++){
//             int[] arr = x[i];
//             for(int j = 0; j < arr.length; j++){
//                 int min = arr[j];
//                 for(int k = j; k < arr.length; k++){
//                     if(arr[k] <= min){
//                         min = arr[k];
//                         arr[k] = arr[j];
//                         arr[j] = min;
//                     }
//
//                 }
//             }
//             x[i] = arr;
//         }
//
//         for(int i = 0; i < x.length; i++){
//             String z = "{";
//             for(int j = 0; j< x[i].length; j++){
//                 z += x[i][j] + " ";
//             }
//             z+= "}";
//             System.out.println(z);
//         }
//    }
//}

        int[][] x = {{2,4}, {3,5,7}, {1,5,7}};
        int max = 0;

        for(int i = 1; i<x.length; i++){
            if(x[i].length>=x[i-1].length){
               // for(int k = 0; k < x);
                max = i;
               // for(int k = 0; k<)
            }
        }
        for(int k = 0; k<x[max].length; k++){
            System.out.print(x[max][k] + " ");
        }
    }
}
