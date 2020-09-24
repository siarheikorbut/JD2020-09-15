package by.it.kolesnikov.training;

public class Training1 {
    public static int sum(int a, int b){
          int res=a+b;
          return res;
    }
    public static void main(String[] args) {
        int j=10;
        int k=0;
        for(int i=0; i<4; i++){
            int c=2;
            k=k+c;

        }
        int s=sum(j, k);   //j и k переходят в функцию sum и становятся на места a и b
        System.out.println(s);
        System.out.println(s+p);

    }
    public static int p=5;
    public int in=6;
}
