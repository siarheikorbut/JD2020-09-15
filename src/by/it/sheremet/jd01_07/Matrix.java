package by.it.sheremet.jd01_07;

import java.util.Arrays;

class  Matrix extends Var {
    private double [][] value;

        Matrix(double[ ][ ] value){
            this.value= Arrays.copyOf(value, value.length);

        }

    Matrix(Matrix matrix){
            double [][] mtr=matrix.value;
            this.value=Arrays.copyOf(mtr, mtr.length);
    }

    Matrix(String strMatrix){
        String [] str1 =strMatrix.split(",");
        this.value = new double[str1.length][str1.length-1];
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str1[i].length()-1; j++) {
                    value[i][j] = Double.parseDouble(str1[i]);
            }
        }

    }















    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");
        for (int i = 0; i < value.length; i++) {
            out.append(" {");
            out.append("{");
            String delimiter = "";
            for (int j = 0; j < value[0].length; j++) {
                out.append(delimiter).append(value[i][j]);
                delimiter = ", ";
            }
            out.append("}");
            if (i < (value.length - 1)) {
                out.append(delimiter);
            }
        }
        out.append(" }");
        out.append("}");
        return out.toString();
    }
}
