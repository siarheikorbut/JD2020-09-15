package by.it.yemialyanava.jd01_05;

import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }

    private static void step1() {
        double sum = 0;
        for (double a = 0; a <= 2 ; a = a + 0.2){
            for (int x = 1; x <=6; x = x + 1)  {
                sum = sum + (pow(7,a)-cos(x));
            }
            System.out.printf("При a=%6.2f сумма=%g\n", a, sum);
        }
    }

    private static void step2() {

        for (double x = -5.5; x < 2; x = x+0.5) {
            double b = Double.MAX_VALUE;

            if (((x / 2) > -2) && ((x / 2) <= -1)){
                b = sin(pow(x, 2));
            }
            if (((x / 2) > -1) && ((x / 2) < 0.2)){
                b =cos(pow(x, 2));
            }
            if ((x / 2) == 0.2){
                b = 1.0/tan(pow(x,2));
            }
            if (b==Double.MAX_VALUE){
                System.out.printf("При x/2=%6.2f значения а не определено\n", x/2);
            } else {
                double a = log(abs(b + 2.74));
                System.out.printf("При  x/2=%6.2f a=%7.4f\n", x/2, a);
            }

        }

    }
}


