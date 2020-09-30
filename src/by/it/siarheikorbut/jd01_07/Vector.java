package by.it.siarheikorbut.jd01_07;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1TJnuaS3yKKmJURuLfRdT_3q1cc7uf8oU/view?usp=sharing">Задание JD01_07 ( B )</a>
 */

//Создание дочернего от класса Var класса Vector
public class Vector extends Var {

    //Обьявление приватной финализированного массива value.
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
    //Vector(String strVector) {
        //this.value = ;
    //}

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
}