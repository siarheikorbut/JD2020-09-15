package by.it.siarheikorbut.jd01_08;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1jYVzPAxyV5XrFvrWvf-DEkSx9feVHEDz/view?usp=sharing">Задание JD01_08 ( C )</a>
 */

//Создание дочернего от класса Var класса Vector
public class Matrix extends Var {

    //Обьявление приватного финализированного двумерного массива value.
    private double[][] value;

    //Создание конструктора принимающего в себя массив value.
    Matrix(double[][] value) {
        this.value = value;
    }

    //Создание конструктора принимающего в себя экземпляр класса Matrix.
    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    //Создание конструктора принимающего в себя строку и преобразующего её в двумерный массив чисел.
    Matrix(String strMatrix) {
        }

    //Переопределение метода toString для вывода двумерного массива.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < value.length; i++) {
            double[] row = value[i];
            if (i > 0) sb.append(", ");
            sb.append("{");
            for (int j = 0; j < row.length; j++) {
                if (j > 0)
                    sb.append(", ");
                sb.append(row[j]);
            }
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Var add(Var other) {
        return null;
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