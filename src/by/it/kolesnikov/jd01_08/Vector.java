package by.it.kolesnikov.jd01_08;

import java.util.Arrays;

class Vector extends Var {

    private double[] value;

    public Vector(double[] value) {

        this.value = Arrays.copyOf(value,value.length);
    }

    public Vector(Vector otherVector) {
        double[] tmp = otherVector.value;
        this.value = Arrays.copyOf(tmp,tmp.length);
    }

    public Vector(double strValue){
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Vector) {
            Vector otherVector = (Vector)other;
            double [] result = new double[this.value.length];
            for (int i=0; i<this.value.length; i++){
                result [i] = this.value[i]+otherVector.value[i];
            }
            return new Vector (result);
        }
        else return other.add(this);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Vector) {
            Vector otherVector = (Vector)other;
            double [] result = new double[this.value.length];
            for (int i=0; i<this.value.length; i++){
                result [i] = this.value[i]-otherVector.value[i];
            }
            return new Vector (result);
        }
        else return other.sub(this);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Vector) {
            Vector otherVector = (Vector)other;
            double result=0;
            double [] arr = new double [this.value.length];
            for (int i=0; i<this.value.length; i++){
                arr [i] = this.value[i]*otherVector.value[i];
                result=0+arr[i];
            }
            return new Vector(result);
        }
        else return other.mul(this);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append('{');
        String delimiter="";
        for (double element : value) {
            out.append(delimiter).append(element);
            delimiter=", ";
        }
        out.append('}');
        return out.toString();
    }
}
