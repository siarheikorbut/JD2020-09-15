package by.it.fedorinhyk.jd01_10;

import java.lang.reflect.Method;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> struct = Math.class;
        Method[] methods = struct.getDeclaredMethods();

    }
}
