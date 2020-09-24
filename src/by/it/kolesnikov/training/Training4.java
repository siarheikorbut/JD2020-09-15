package by.it.kolesnikov.training;

import java.util.Scanner;
/*ДВОИЧНЫЙ ПОИСК

 */
public class Training4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введите значение:");
        int k = sc.nextInt();
        int l = 0;
        int r = array.length-1;
        while (l <= r) {
            int avg = (r + l) / 2;
            if (array[avg] == k) {
                System.out.println("Индекс элемента: " + avg);
                break;
            }
            else if (k > array[avg]) {
                l = avg + 1;
            }
            else
                r = avg - 1;

            }
        }
    }
