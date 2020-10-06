package by.it.yemialyanava.jd01_10;

public class Bean {
    double sum(int a, int b){
        return a+b;
    }
    @Param(a=5, b=10)
    static double sum(int a, int b){
        return a+b;
    }
    @Param(a=5, b=10)
    double sum(int a, int b){
        return a+b;
    }
    @Param(a=5, b=10)
    static double sum(int a, int b){
        return a+b;
    }
}
