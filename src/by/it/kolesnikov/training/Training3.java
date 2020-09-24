package by.it.kolesnikov.training;

import java.util.Scanner;

public class Training3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.print(i + " ");
            if (i % 5 == 0) System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double dis = b * b - 4 * a * c;
        if (dis < 0) System.out.println("Корней нет");
        else if (dis == 0) {
            double x = -b / 2 / a;
            System.out.println("Корень х=" + x);
        }
            else{
                double x1 = (-b + Math.sqrt(dis) / 2 / a);
                double x2 = (-b - Math.sqrt(dis) / 2 / a);
                System.out.println("Корень х1=" + x1);
                System.out.println("Корень х2=" + x2);
            }
            int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                System.out.print(arr[i]+" ");
            }
        }
        }
    }
