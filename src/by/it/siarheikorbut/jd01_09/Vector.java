package by.it.siarheikorbut.jd01_09;

import java.util.Arrays;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1C-wHpUcHtxb-Qq0lfyExNQsYeKr3yIPh/view?usp=sharing">Задание JD01_09 ( B )</a>
 */

//Создание дочернего от класса Var класса Vector
public class Vector extends Var {

    //Обьявление приватного финализированного одномерного массива value.
    private final double[] value;

    //Создание конструктора принимающего в себя массив value.
    Vector(double[] value) {
        this.value = value;
    }

    //Создание конструктора принимающего в себя экземпляр класса Vector.
    Vector(Vector vector) {
        this.value = vector.value;
    }

    //Создание конструктора принимающего в себя строку и преобразующего её в массив чисел.
    Vector(String strVector) {
        String[] s1 = strVector.replaceAll("\\{", "").replaceAll("}", "").split(",");
        this.value = new double[s1.length];
        for (int i = 0; i < s1.length; i++) {
            value[i] = Double.parseDouble(s1[i].trim());
        }
    }

    //Переопределение метода toString для вывода одномерного массива.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        String delimiter = "";
        for (double element : value) {
            sb.append(delimiter).append(element);
            delimiter = ", ";
        }
        sb.append("}");
        return sb.toString();
    }

    //Метод сложения скаляра и вектора, вектора и вектора.
    @Override
    public Var add(Var other) {
        //Сложение скаляра и вектора.
        if (other instanceof Scalar) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Scalar) other).getValue();
            }
            return new Vector(res);
            //Сложение вектора и вектора.
        } else if (other instanceof Vector) {
            double[] res = Arrays.copyOf(value, value.length);
            for (int i = 0; i < res.length; i++) {
                res[i] = res[i] + ((Vector) other).value[i];
            }
            return new Vector(res);
        } else
            //Сложение вектора и матрицы является ошибкой.
            return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        return null;
    }

    @Override
    public Var mul(Var other) {
        return null;
    }

    @Override
    public Var div(Var other) {
        return null;
    }
}