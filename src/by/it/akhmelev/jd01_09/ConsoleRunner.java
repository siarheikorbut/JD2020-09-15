package by.it.akhmelev.jd01_09;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {

        int [][] arr={{1,2,3},{4,5,6}};
        int[][] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=Arrays.copyOf(arr[i], arr[i].length);
        }
        arr[0][0]=999;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr2));
        System.exit(0);

        Scanner sc=new Scanner(System.in);
        Parser parser = new Parser();
        Printer printer = new Printer();
        for(;;){
            String expression = sc.nextLine();
            if (expression.equals("end")) break;
            Var result = parser.calc(expression);
            printer.print(result);
        }

    }
}
