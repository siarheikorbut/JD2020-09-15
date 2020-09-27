package by.it.sheremet.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskC {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            String word = matcher.group();
            System.out.println(word);
        }


        System.out.println(text);
    }
}
