package by.it.siarheikorbut.jd01_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //double[] array = InOut.getArray("1.234 2 3 4 60000");
        //System.out.println(Arrays.toString(array));
        //InOut.printArray(array);
        //InOut.printArray(array, "A", 3);
        double[] arr = {8.5, 43.0, 54.0, 76.0, 21.0, 43.0};
        Helper.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
