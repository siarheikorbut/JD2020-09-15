package by.it.lapkovskiy.jd01_08;

public class Scalar extends Var {
    Double value;
    @Override
    public String toString() {
        return value.toString();
    }
    Scalar(double value){
        this.value = value;
    }
    Scalar(Scalar scalar){
        value = scalar.value;
    }
    Scalar(String strScalar){
        value = Double.parseDouble(strScalar);
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
