package by.it.siarheikorbut.jd01_04;

import java.util.Arrays;
import java.util.Scanner;

import static by.it.siarheikorbut.jd01_04.TaskA.printMulTable;

public class TaskC {
    static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);
        double first = array[0];
        double last = array[array.length - 1];
        Helper.sort(array);
        InOut.printArray(array, "V", 4);

        int indexFirst = Arrays.binarySearch(array, first);
        System.out.printf("Index of first element=%d\n", indexFirst);

        for (int i = 0; i < array.length; i++) {
            if (last == array[i]) {
                System.out.printf("Index of last element=%d\n", i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        printMulTable();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        buildOneDimArray(s);
    }
}

