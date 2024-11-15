package Basics;

import java.util.Arrays;
import java.util.List;

public class CollectionsDemo {

    // This Should cover all types of collections implementation and uses !!

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jeevan", "Sai", "Naidu");
        names.stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
        String name = " <My Name is Jeevan Naidu   ".strip();
        System.out.println(name);
//        names.stream().filter(name -> name.replaceAll("A", "R")).
    }

}
