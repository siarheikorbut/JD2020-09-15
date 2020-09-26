package by.it.yemialyanava.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern p = Pattern.compile("[ф-яА-ЯёЁ]+{4,}");
        Matcher matcher = p.matcher(text);
        while (matcher.find()){
            int position = matcher.start();
            //text.setCharAt(position + 3,"#");
            String word = matcher.group();
            //System.out.println(word "");

        }
    }

}
