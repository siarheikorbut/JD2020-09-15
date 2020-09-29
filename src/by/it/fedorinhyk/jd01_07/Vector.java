package by.it.fedorinhyk.jd01_07;

import java.util.Arrays;

class Vector extends Var{
    private double[] value;

    Vector (double[]value){
        this.value=value;
    }

    Vector (Vector vector){
        double[] tmp = vector.value;
        this.value = Arrays.copyOf(tmp,tmp.length);
    }
    Vector (String strVector){

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
