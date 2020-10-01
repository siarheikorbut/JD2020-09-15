package by.it.lapkovskiy.jd01_08;

import java.util.Arrays;

public class Matrix extends Var {
    double[][] value;
    Matrix(double[][] value){
        this.value = value;
    }
    Matrix(Matrix matrix){
        this.value = matrix.value;
    }
    Matrix(String strMatrix){
        strMatrix = strMatrix.replace("{{","");
        strMatrix = strMatrix.replace("}}","");
        String[] str = strMatrix.split("},\\{");
        String[] arr1 = str[0].split(",");
        String[] arr2 = str[1].split(",");

        double[][] arrDouble = new double[arr1.length][arr2.length];
        for (int i = 0; i < arr1.length; i++) {
                arrDouble[0][i] = Double.parseDouble(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            arrDouble[1][i] = Double.parseDouble(arr2[i]);
        }
        this.value = Arrays.copyOf(arrDouble,arrDouble.length);
    }
    @Override
    public String toString() {
        String st ="{";
        for (int i = 0; i < value.length; i++) {
            st=st.concat("{");
            for (int j = 0; j < value[i].length-1; j++) {
                st=st.concat(value[i][j]+", ");
            }
            st+=value[i][value[i].length-1]+"}";
            if(i ==value.length-1) break;
            st=st.concat(",");
        }
        st+="}";
        return st;
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
