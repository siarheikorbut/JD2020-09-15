package by.it.moiseyenko.jd01_07;

import java.util.Arrays;

class Vector extends Var {
    private double[] value;
    public Vector(double[] value){
        this.value=Arrays.copyOf(value,value.length);
    }

    public Vector(Vector vector) {
        this.value=vector.value;
    }
    public void Vector(String str){
        String[] x=str.split(" ");
        double[] vector;
        vector = new double[x.length];
        for (int i = 0; i < x.length; i++) {
            vector[i]=Double.parseDouble(x[i]);
        }
    }



    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder("{");
        String delimiter="";
        for (double element:value){
            sb.append(delimiter).append(element);
            delimiter=", ";
        }
        sb.append("}");
        return sb.toString();
    }
}

