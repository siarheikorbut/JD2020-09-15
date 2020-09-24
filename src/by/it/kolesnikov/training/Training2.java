package by.it.kolesnikov.training;

import java.util.Scanner;

public class Training2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int [10];
        for (int j = 0; j < marks.length; j++) {
            marks[j] = sc.nextInt();
        }
            int m = marks[0];
            for (int i = 0; i < marks.length; i++) {
                if (m < marks[i])
                    m = marks[i];
            }
            System.out.println("максимальная оценка =" + m);
        double a=0;
        for (int c=0; c<marks.length; c++) {
            a=a+marks[c];
        }
        double avg=a/marks.length;
        for(int l=0; l<marks.length; l++){
            if(marks[l]<avg)
                System.out.println(marks[l]);
            }
        int o = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (o > marks[i])
                o = marks[i];
        }
        for(int i = 0; i < marks.length; i++){
            if(o==marks[i])
                System.out.print(i+" ");
        }

        }
    }

