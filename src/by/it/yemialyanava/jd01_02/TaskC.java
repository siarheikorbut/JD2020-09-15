package by.it.yemialyanava.jd01_02;

import java.util.Scanner;

public class TaskC {
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int[][] arr = new int[n][n];


        //step1(n);
                //step2(arr);
        //step3(arr);
    }

    /**private static int [][] step1(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * (n + n)) - n);
                System.out.print(arr [i][j] + " ");
                System.out.print("\n");
            }
            return arr [i][j];
        }

    }

    /**private static int step2(int [][] arr) {
      int x1 = 0;
      int x2 = 0;
      for (int i =0; i < arr.length; i++){
          for (int j =0; j<arr[i].length; j++){
              if (arr[i][j]> 0) {
                  x1 = arr[i][j];
                  countpositive++;
              }


              }
          }
    }



    private static int [ ][ ] step3(int[][] arr){
        //int i =0;
        //int j = 0;
        int max = arr [0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr [i][j]){
                    max = arr [i][j];
                }
            }
        }


    }*/

}
