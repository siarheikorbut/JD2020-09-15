package by.it.fedorinhyk.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder(Poem.text);
        Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()){
            int pos=matcher.start();
            text.setCharAt(pos= Integer.parseInt("...?!"),' ');
        }
        String trimtext = text.toString().trim();
        System.out.println(trimtext);
        String sentences[]= pattern.split("\\.?!");
        for (int i = 0; i < sentences.length-1; i++) {
            for (int j = i+1; j < sentences.length ; j++) {
                if (sentences[j].compareToIgnoreCase(sentences[i])<0){
                    String temp=sentences[i];
                    sentences[i]=sentences[j];
                    sentences[j]=temp;
                }
            }
        }
        for (String arg: sentences){
            if (!arg.isEmpty()){
                System.out.println(arg);
            }

        }
    }
}
