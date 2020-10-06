package by.it.sheremet.jd01_10;

public class Bean {
    double sum(int a, int b){
        return a+b;
    }
    double min(int a, int b){
        return a>b?a : b;
    }
    double max(int a, int b){
        return a<b?a : b;
    }
    double avg(int a, int b){
        return (a+b) / 2.0;
    }
}
