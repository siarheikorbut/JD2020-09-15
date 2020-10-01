package by.it.arhipova.jd01_08;

class Scalar extends Var {

    private double value;

    public Scalar(double value) {
        this.value = value;
    }

    public Scalar(String strValue) {
        this.value=Double.parseDouble(strValue);
    }

    public Scalar(Scalar otherScalar) {
        this.value=otherScalar.value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
