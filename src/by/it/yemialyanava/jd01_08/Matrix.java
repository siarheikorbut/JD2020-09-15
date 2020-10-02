package by.it.yemialyanava.jd01_08;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matrix extends Var {
    double[][] value;

    public double[][] getValue() {
        return value;
    }

    Matrix(double[][] value) {
        this.value = value;
    }

    Matrix(Matrix matrix) {
        this.value = new double[matrix.value.length][matrix.value[0].length];
        for (int i = 0; i < matrix.value.length; i++) {
            for (int j = 0; j < matrix.value[i].length; j++) {
                this.value[i][j] = matrix.value[i][j];
            }
        }
    }

    Matrix(String strMatrix) {
        String cuttedString = strMatrix.substring(1, strMatrix.length() - 1);
        Pattern patternSings = Pattern.compile("\\{([0-9]|[.]|,| )+\\}");
        Matcher matchSings = patternSings.matcher(cuttedString);
        double[][] tempValue = new double[0][];
        int rowcount = 0;
        while (matchSings.find()) {
            String line = matchSings.group();
            String cuttedLine = line.substring(1, line.length() - 1);
            String[] arrayString = cuttedLine.split(", ?");
            double[] arrayFromLine = new double[arrayString.length];
            for (int i = 0; i < arrayString.length; i++) {
                arrayFromLine[i] = Double.parseDouble(arrayString[i]);
            }
            tempValue = Arrays.copyOf(tempValue, tempValue.length + 1);
            tempValue[rowcount] = arrayFromLine;
            rowcount++;
        }
        this.value = tempValue;
    }

    @Override
    public Var add(Var other) {
        if (other instanceof Scalar) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = result[i][j] + ((Scalar) other).getValue();
                }
            }
            return new Matrix(result);
        } else if (other instanceof Matrix) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = result[i][j] + ((Matrix) other).value[i][j];
                }
            }
            return new Matrix(result);
        } else {
        }
        return super.add(other);
    }

    @Override
    public Var sub(Var other) {
        if (other instanceof Scalar) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = result[i][j] - ((Scalar) other).getValue();
                }
            }
            return new Matrix(result);
        } else if (other instanceof Matrix) {
                double[][] result = new double[value.length][value[0].length];
                for (int i = 0; i < value.length; i++) {
                    for (int j = 0; j < value[i].length; j++) {
                        result[i][j] = value[i][j];
                    }
                }
                for (int i = 0; i < result.length; i++) {
                    for (int j = 0; j < result[i].length; j++) {
                        result[i][j] = result[i][j] - ((Matrix) other).value[i][j];
                    }
                }
                return new Matrix(result);
        } else {
        }
        return super.sub(other);
    }

    @Override
    public Var mul(Var other) {
        if (other instanceof Scalar) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = result[i][j] * ((Scalar) other).getValue();
                }
            }
            return new Matrix(result);
        } else if (other instanceof Vector) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            double[] resVect = new double[result.length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < ((Vector) other).getValue().length; j++) {
                    resVect[i] = resVect[i] + result[i][j] * ((Vector) other).getValue()[j];
                }
            }
            return new Vector(resVect);
        } else if (other instanceof Matrix) {
            double[][] result = new double[value.length][value[0].length];
            for (int i = 0; i < value.length; i++) {
                for (int j = 0; j < value[i].length; j++) {
                    result[i][j] = value[i][j];
                }
            }
            double[][] mul = new double[result.length][((Matrix) other).value[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < ((Matrix) other).value[0].length; j++) {
                    for (int k = 0; k < ((Matrix) other).value.length; k++) {
                        mul[i][j] = mul[i][j] + result[i][k] * ((Matrix) other).value[k][j];
                    }
                }
            }
            return new Matrix(mul);
        } else{
        }
        return super.mul(other);
    }



    @Override
    public Var div(Var other) {
        return super.div(other);
    }

    @Override
    public String toString() {
        StringBuilder writterStrMatrix = new StringBuilder("{");
        for (int i = 0; i < value.length; i++) {
            writterStrMatrix.append("{");
            for (int j = 0; j < value[0].length; j++) {
                writterStrMatrix.append(value[i][j]);
                if (j != value[0].length - 1) {
                    writterStrMatrix.append(", ");
                }
            }
            writterStrMatrix.append("}");
            if (i != value.length - 1) {
                writterStrMatrix.append(", ");
            }
        }
        writterStrMatrix.append("}");
        return writterStrMatrix.toString();
    }
}
