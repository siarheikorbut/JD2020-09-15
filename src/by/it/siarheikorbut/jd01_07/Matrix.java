package by.it.siarheikorbut.jd01_07;

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

    //Создание конструктора принимающего в себя экземпляр класса Matrix.
    Matrix(Matrix matrix) {
        this.value = matrix.value;
    }

    //Создание конструктора принимающего в себя строку и преобразующего её в двумерный массив чисел.
    Matrix(String strMatrix) {
        String[] s1 = strMatrix.replaceAll("\\{", "").replaceAll("}", "").split(",");
        this.value = new double[s1.length][];
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s1[i].length(); j++) {
                value[i][j] = Double.parseDouble(s1[i].trim());
            }
        }
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
}