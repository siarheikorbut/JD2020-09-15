package by.it.dobrodey.jd01_11;


import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        List<String> list = new ListA<>();
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        System.out.println(list);
//        System.out.println(list.get(2));
//        list.remove(2);
//        System.out.println(list);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);
//        list.add(2,"nine");
//        System.out.println(list);
////
//        list.addAll(list);
//        System.out.println(list);

        List<String> list1 = new ListB<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        System.out.println(list1);
        System.out.println(list1.get(2));
        String element = list1.set(1, "seven");
        System.out.println("Set element " + element + "\n New list:" + list1);
        list1.remove(2);
        System.out.println(list1);
        list1.add(2, "nine");
        System.out.println(list1);
        List<String> list2 = new ListB<>();
        list2.add("olga");
        list2.add("volga");
        System.out.println("list2= "+list2);
        System.out.println("list="+list);
        list2.addAll(list);

       System.out.println("C=" + list2);
    }
}
