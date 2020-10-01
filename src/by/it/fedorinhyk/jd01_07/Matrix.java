package by.it.fedorinhyk.jd01_07;

import java.util.Arrays;

class Matrix extends Var {
    private double [][] value;

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix (Matrix matrix){
        double[][] mat = matrix.value;
        this.value = Arrays.copyOf(mat, mat.length);
    }

    Matrix (String strMatrix){
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}
