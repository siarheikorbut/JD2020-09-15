package by.it.fedorinhyk.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static  String[] words=new String[0];
    private static  String[] counters=new String[0];
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String word= matcher.group();
            OneWord(word);
        }
    }

    private static void OneWord(String word) {
        for (int i = 0; i < words.length; i++) {
            if (word.equals(words[i])){
                return;
            }
        }
    }
}
