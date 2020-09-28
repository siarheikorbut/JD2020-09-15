package by.it.sheremet.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
   public static void main(String[] args) {
       StringBuilder text = new StringBuilder(Poem.text);
       Pattern pattern = Pattern.compile("[а-яёА-ЯЁ]+");
       Matcher matcher = pattern.matcher(Poem.text);
       while (matcher.find()) {
           String word = matcher.group();
           word=word.replace('о','J' );
           //System.out.println(word);

      }
      // System.out.println(text);

       //System.out.println(text);
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

       String[] words = Poem.text.split("\\.|\\.{3}|,|!|-|:");
       String[] trimledArray = new String[words.length];
       int j=0;
       for (int i = 0; i < words.length-1; i++) {
          // for (int j = 0; j < words.length; j++) {
                String str=words[i].trim().replaceAll(" +"," ");
                if(!(str.equals(""))){
                    trimledArray[i] = str;
                    j++;
                    System.out.println(str);{

                    }

              if(trimledArray[i].length()>trimledArray[i+1].length()) {
                   String sort = trimledArray[i];
                   trimledArray[i] = trimledArray[i + 1];
                   trimledArray[i + 1] = sort;
               }

           }
       }


       for (int z = 0; z < trimledArray.length; z++) {
           System.out.println(trimledArray[z]+"\n");
       }
       // text.replace("!" " ")
       //System.out.println(text);*/
   }

}

