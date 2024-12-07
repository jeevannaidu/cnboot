package Basics;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIDemo {

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Sumanth");
        listOfNames.add("Jeevan");
        listOfNames.add("Ezio");
        listOfNames.add("Dheeraj");

        Map<String, Integer> employees = new HashMap<>();
        employees.put("Sumanth", 100);
        employees.put("Ezio", 60);
        employees.put("Dheeraj", 70);
        employees.put("Jeevan", 80);
        employees.put("Shin Chan", 50);

        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        Map<String, List<Integer>> result = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(
                        num ->
                                Collections.frequency(new ArrayList<>(Arrays.stream(numbers).boxed().toList()), num) > 1
                                        ? "Repeated" : "Distinct", Collectors.toList()
                ));

        Arrays.asList(numbers);
        List<Integer> intList = new ArrayList<>();
        for(Integer i : numbers) {
            intList.add(i);
        };

        List<Integer> list2 = new ArrayList<>(Arrays.stream(numbers).boxed().toList());

        Optional<String> first = listOfNames.stream().findFirst();
        ArrayList<Map.Entry<String, Integer>> list =
                employees.entrySet().stream().filter(entry -> entry.getValue().equals(100)).collect(Collectors.toCollection(ArrayList::new));
    }
}
