package by.it.kolesnikov.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }
    static void step1 (){
        double y = 0.0;
        double a = 0.0;
        while (a <= 2) {
            for (int i = 1; i <= 6; i++) {
                y = y+(pow(7, a) - cos(i));
            }
            a=a+0.2;
            System.out.println("При a=" + a + " y=" + y);
        }
    }
    static void step2 (){
        
    }
}
