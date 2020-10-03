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
        String str = strMatrix.substring(1, strMatrix.length() - 1);
        String[] str1 =str.split(",");
        String[][] str2 = new String[str1.length] [];
        for (int i = 0; i < str1.length; i++) {
            str2[i]=str1[i].split(",");

            this.value=new double[str1.length][str2[0].length];
            for (int j = 0; j < str2.length; j++) {
                for (int k = 0; k <str2[0].length ; k++) {
                    value[j][k]= Double.parseDouble(str2[j][k]);
                }

            }

                   // value[i]= Double.parseDouble(str1[i]);
         //   }
        }

    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("{");
        for (int i = 0; i < value.length; i++) {
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
        out.append("}");
        return out.toString();
    }
}
