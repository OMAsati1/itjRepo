package com.om;

import java.util.Arrays;
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
//        int[][] arr={{1, 2, 3,4},
//                    {1, 2, 3},
//                    {1, 2, 3,5,2}};
//        for (int[] row : arr) {
//            System.out.println(Arrays.toString(row));
//        }
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();//      }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
