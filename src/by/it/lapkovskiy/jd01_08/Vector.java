package by.it.lapkovskiy.jd01_08;

import java.util.Arrays;

public class Vector extends Var {
    double[] value;
    Vector(double[] value){
        this.value = value;
    }
    Vector(Vector vector){
        this.value = vector.value;
    }
    Vector(String strVector){
        strVector = strVector.replace("{","");
        strVector = strVector.replace("}","");
        String[] arr = strVector.split(",");
        double[] arrDouble = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDouble[i] = Double.parseDouble(arr[i]);
        }
        this.value = Arrays.copyOf(arrDouble,arrDouble.length);
    }

    @Override
    public String toString() {
        String st = "{";
        for (int i = 0; i < value.length-1; i++) {
            st+= value[i]+", ";
        }
        st+=value[value.length-1]+"}";
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
