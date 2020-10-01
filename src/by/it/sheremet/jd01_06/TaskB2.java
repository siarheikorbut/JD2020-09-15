package by.it.sheremet.jd01_06;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
   public static void main(String[] args) {
       StringBuilder text = new StringBuilder(Poem.text);
       Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+[\\.|.\\{3}|,|!]+");
       Matcher matcher = pattern.matcher(Poem.text);
       while (matcher.find()) {
           String word = matcher.group();
           word = word.replaceAll("[^а-яёА-ЯЁ]+", " ");
          /* word = word.trim();
          /* wordText
           //System.out.print(words[i]+"\n");


       private static wordText(String word){

       }*/
   }
}
}
