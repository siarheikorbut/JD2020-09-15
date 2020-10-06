package by.it.fedorinhyk.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> struct = Math.class;
        Method[] methods = struct.getDeclaredMethods();
        for (Method method : methods) {

            int mod = method.getModifiers();
            if (Modifier.isPublic(mod)) {
                StringBuilder out = new StringBuilder();
                out.append("public ");
                if (Modifier.isStatic(mod))
                    out.append("static ");
                Class<?> returnType = method.getReturnType();
                out.append(returnType.getSimpleName()).append(" ");
                out.append(method.getName()).append("(");
                Class<?>[] types = method.getParameterTypes();
                String delimiter = "";
                for (Class<?> type : types) {
                    out.append(delimiter).append(type.getSimpleName());
                    delimiter = ",";
                }
                out.append(')');
                System.out.println(out);
            }
        }
        Class<Math> structclass = Math.class;
        Method[] methodsfin = structclass.getDeclaredMethods();
        for (Method method : methodsfin) {
            if ((method.getModifiers() & Modifier.FINAL) == Modifier.FINAL)
            System.out.println(methodsfin);
        }
    }
}
