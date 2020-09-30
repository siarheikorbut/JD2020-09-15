package by.it.siarheikorbut.jd01_07;


public class Runner {
    public static void main(String[] args) {
        Var v1 = new Scalar(3.1415);
        System.out.println(v1);
        Var v2 = new Scalar(new Scalar(3.1415));
        System.out.println(v2);
        Var v3 = new Scalar("3.1415");
        System.out.println(v3);

        Var v4 = new Vector(new double[]{1.0, 2.0, 4.0});
        System.out.println(v4);
        Var v5 = new Vector(new Vector(new double[]{1.0, 2.0, 4.0}));
        System.out.println(v5);
        //Var v6 = new Vector();
        //System.out.println(v6);
    }
}
