package by.it.dobrodey.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA2 {
    private static String[] unicwords =  new String[0];
    private static int[] counts =  new int[0];
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        System.out.println(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            String word = matcher.group();
            processOneWord(word);
        }
}

    private static void processOneWord(String word) {
        for (int i = 0; i < unicwords.length; i++) {
            if(unicwords[i].equals(unicwords)){
                counts[i]++;
                return;
            }

        }


    }
}
