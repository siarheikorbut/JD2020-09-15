package by.it.siarheikorbut.jd01_04;

import java.util.Scanner;

/**
 * @author Сергей Корбут
 * @see <a href="https://drive.google.com/file/d/1KNBofHHOxyARzccIFNqRvxU8ks8NY0n4/view?usp=sharing"></a>
 */

public class TaskB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = 0;
        //for (int i = 0; i < n; i++) {
            // n = sc.nextInt();
       // }



        String[] surname = new String[4];
        for (int i = 0; i < surname.length; i++) {
            surname[i] = sc.nextLine();
        }
        System.out.println("Введите зарплату для " + surname[1]);
        int[][] salary = new int[4][5];
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary[i].length; j++) {
                salary[0][i] = sc.nextInt();
                break;
            }
        }
        System.out.println("Введите зарплату для " + surname[2]);
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary[i].length; j++) {
                salary[1][i] = sc.nextInt();
                break;
            }
        }
        System.out.println("Введите зарплату для " + surname[3]);
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary[i].length; j++) {
                salary[2][i] = sc.nextInt();
                break;
            }
        }
        /**
         * Общая сумма всех выплат
         */
        int x = salary.length;
        int sum = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                sum += salary[i][j];
            }
        }
        /**
         * Среднеарифметическая квартальная зарплата
         */
        double averSalary = sum / 12.0;

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s%-12s%-12s%-12s%-12s%-12s\n", "Фамилия", "Квартал 1", "Квартал 2", "Квартал 3", "Квартал 4", "Итого");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%7s:  %-12d%-12d%-12d%-12d%-12d\n", surname[1], salary[0][0], salary[0][1], salary[0][2], salary[0][3], (salary[0][0] + salary[0][1] + salary[0][2] + salary[0][3]));
        System.out.printf("%7s:  %-12d%-12d%-12d%-12d%-12d\n", surname[2], salary[1][0], salary[1][1], salary[1][2], salary[1][3], (salary[1][0] + salary[1][1] + salary[1][2] + salary[1][3]));
        System.out.printf("%7s:  %-12d%-12d%-12d%-12d%-12d\n", surname[3], salary[2][0], salary[2][1], salary[2][2], salary[2][3], (salary[2][0] + salary[2][1] + salary[2][2] + salary[2][3]));
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s%-12d\n", "Итого", sum);
        System.out.printf("%-10s%-12.6f\n", "Средняя", averSalary);
    }
}