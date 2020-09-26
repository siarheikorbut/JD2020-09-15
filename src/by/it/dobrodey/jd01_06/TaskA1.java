package by.it.dobrodey.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA1 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        System.out.println(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]{4,}");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String word = matcher.group();
            System.out.println(word+" "+matcher.start());
            int pos = matcher.start();
            text.setCharAt(pos+3,'#');
            if(matcher.end()-matcher.start()>6)
            text.setCharAt(pos+6,'#');



        }
        System.out.println(text);
}}
