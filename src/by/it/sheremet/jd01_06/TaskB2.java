package by.it.sheremet.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
   public static void main(String[] args) {
       StringBuilder text = new StringBuilder(Poem.text);

       /*Pattern pattern = Pattern.compile("-:!");
       Matcher matcher= pattern.matcher(text);
       while (matcher.find()){
           String word = matcher.group();
           int pos = matcher.start();
           if (checkWord(word)){
               System.out.println(word);
           }
       }*/
       //String str="Asdsfd df dsv. Ssd gfn fdf fdfddf. Jsdf ler sdc";

       String[] words = Poem.text.split("\\.");
       for (int i = 0; i < words.length-1; i++) {
           for (int j = 0; j < words.length; j++) {

               if(words[i].length()>words[i+1].length()) {
                   String sort = words[i];
                   words[i] = words[i + 1];
                   words[i + 1] = sort;
               }

           }
       }
       for (int i = 0; i < words.length; i++) {
           System.out.println(words[i]);
       }
       // text.replace("!" " ")
       //System.out.println(text);
   }
}

