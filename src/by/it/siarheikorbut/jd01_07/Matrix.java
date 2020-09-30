package by.it.siarheikorbut.jd01_07;

import java.util.Arrays;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1TJnuaS3yKKmJURuLfRdT_3q1cc7uf8oU/view?usp=sharing">Задание JD01_07 ( C )</a>
 */

//Создание дочернего от класса Var класса Vector
public class Matrix extends Var {

    //Обьявление приватного финализированного двумерного массива value.
    private final double[][] value;

    //Создание конструктора принимающего в себя массив value.
    Matrix(double[][] value) {
        this.value = value;
    }

    //Переопределение метода toString.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double[] element : value) {
            sb.append(delimiter).append(Arrays.toString(element));
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }
}