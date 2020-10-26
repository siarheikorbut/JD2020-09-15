package by.it.siarheikorbut.jd01_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Siarhei Korbut
 * @see <a href="https://drive.google.com/file/d/1NWv3k35f7iqw1vwxeZLH85PcjVS1L_6X/view?usp=sharing">Задание JD01_10 ( B )</a>
 */

public class PrintMath {
    public static void main(String[] args) {
        Class<?> mathClass = Math.class;
        Field[] declaredFields = mathClass.getDeclaredFields();
        Method[] declaredMethods = mathClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            int modifiers = declaredMethod.getModifiers();
            StringBuilder outPut = new StringBuilder();
            if (Modifier.isPublic(modifiers)) {
                outPut.append("public ");
                if (Modifier.isStatic(modifiers)) {
                    outPut.append("static ");
                }
                outPut.append(declaredMethod.getReturnType()).append(" ");
                outPut.append(declaredMethod.getName()).append("(");
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; j++) {
                    outPut.append(parameterTypes[j].getSimpleName());
                    if (j != parameterTypes.length - 1) {
                        outPut.append(",");
                    }
                }
                outPut.append(")");

                System.out.println(outPut);
                System.out.println(declaredMethod);
            }

        }
        for (Field declaredField : declaredFields) {
            int modifiers = declaredField.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                String outPut = declaredField.getGenericType() + " " +
                        declaredField.getName();
                System.out.println(outPut);
            }
        }
    }
}