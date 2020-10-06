package by.it.sheremet.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) {
        Class<Math> structMath = Math.class;
        Method[]methods=structMath.getDeclaredMethods();
        for (Method method:methods) {
            System.out.println(method);
            int modifiers=method.getModifiers();
            if(Modifier.isPublic(modifiers)){
                StringBuilder out=new StringBuilder();
                out.append("public ");
                if(Modifier.isStatic(modifiers))
                    out.append("satic ");
                System.out.println(method);
        }


        }
    }

}
