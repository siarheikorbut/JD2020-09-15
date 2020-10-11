package by.it.fedorinhyk.jd01_12;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(200);
        for (;;) {
            String word=sc.next();
            if (word.equals("end")){
                break;
            }
        }
        Map<Integer,String> cross=getcross(list);
        System.out.println(cross);
    }

    private static Map<Integer, String> getcross(ArrayList<String> list){
        StringBuilder words = new StringBuilder(String.valueOf(list));
        Pattern pattern=Pattern.compile("[a-zA-Z]+");
        Matcher matcher=pattern.matcher((CharSequence) list);
        while (matcher.find()){
            String word=matcher.group();
        }
        return (Map<Integer, String>) list;
    }
}
