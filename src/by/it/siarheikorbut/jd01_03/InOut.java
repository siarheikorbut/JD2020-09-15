package by.it.siarheikorbut.jd01_03;

/**
 * @author Сергей Корбут
 * @see
 */

public class InOut {
    /**
     * Метод приобразования строки в массив
     * @param line Входная строка (с числами)
     * @return Возвращаемый массив действительных чисел
     */
    static double[] getArray(String line) {
        line = line.trim();
        String[] strArray = line.split(" ");
        double[] array = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]);
        }
        return array;
    }

    /**
     *  Вывод метода на консоль
     * @param arr входной массив
     */

    static void printArray(double[] arr) {
        for (double element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-8.3f   ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || i == arr.length - 1) {
                System.out.println();
            }
        }
    }
}