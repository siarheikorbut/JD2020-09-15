package by.it.fedorinhyk.jd01_07;

import java.util.Arrays;

class Vector extends Var{
    Object strVector;
    private double[] value;

    Vector (double[]value){
        this.value=value;
    }

    Vector (Vector vector){
        double[] tmp = vector.value;
        this.value = Arrays.copyOf(tmp,tmp.length);
    }
    Vector (String strVector) {
        double[] str = new double[value.length];
        for (int i = 0; i < value.length; i++) {
            str[i] = Double.parseDouble(strVector);
        }
        this.value[Integer.parseInt(strVector)] = Double.parseDouble(strVector);
    }

    @Override
    public String toString() {
        StringBuilder sbv=new StringBuilder("{");
        String delimiter="";
        for (double element : value){
            sbv.append(delimiter).append(element);
            delimiter=", ";
        }
        sbv.append("}");
        return sbv.toString();
    }
}
