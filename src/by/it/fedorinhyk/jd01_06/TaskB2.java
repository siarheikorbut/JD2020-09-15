package by.it.fedorinhyk.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    private static String sentences[]= new String[0];
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ :,\"-]+");
        Matcher matcher= pattern.matcher(text);
        while (matcher.find()){
            String sentence=matcher.group();
            if(CheckSentence(sentence)){
                System.out.println(sentence);
            }
        }
    }
    private static final String votes="\\.!?";
    private static String vote="ЦУКЕНГШЩЗХФВАПРОЛДЖЭЯЧСМИТБЮ";

    private static boolean CheckSentence(String sentence) {
        char first=sentence.charAt(0);
        char last=sentence.charAt(sentence.length()-1);
        boolean firstok=vote.indexOf(first)<0;
        boolean lastok=votes.indexOf(last)>=0;
        return firstok && lastok;
    }
}
