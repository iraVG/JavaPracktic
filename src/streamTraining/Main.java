package streamTraining;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "uuuuuuu", "bcd", "", "defg", "jk");
//        long count = strList.stream()
//                .filter(x -> x.isEmpty())
//                .count();
//        System.out.println(count);
//        System.out.println("*************************************");

//        long num = strList.stream()
//                .filter(x -> x.length() > 3)
//                .count();
//
//        System.out.println(num);
//        System.out.println("*************************************");
//
//        List<String> filtered = strList.stream()
//                .filter(x -> !x.isEmpty())
//                .collect(Collectors.toList());
//
//        System.out.println(filtered);
//        System.out.println("*************************************");
//
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String G7Countries = G7.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(G7);
        System.out.println(G7Countries);
        System.out.println("*************************************");

//        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//        List<Integer> distinct = numbers.stream()
//                .map( i -> i*i)
//                .distinct()
//                .collect(Collectors.toList());
//
//
//        System.out.println(numbers);
//        System.out.println(distinct);
//        System.out.println("*************************************");
//
//        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        IntSummaryStatistics stats = primes.stream()
//                .mapToInt((x) -> x)
//                .summaryStatistics();
//        System.out.println("Highest prime number in List : " + stats.getMax());
//        System.out.println("Lowest prime number in List : " + stats.getMin());
//        System.out.println("Sum of all prime numbers : " + stats.getSum());
//        System.out.println("Average of all prime numbers : " + stats.getAverage());
//
//        System.out.println("*************************************");
        List<String> result = Stream.of("EURO/INR", "USD/AUD", "USD/GBP", "USD/EURO")
                .filter(e -> e.length() > 7)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toLowerCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println("*************************************");
//
        List<String> versions = new ArrayList<>();
        versions.add("Lollipop");
        versions.add("KitKat");
        versions.add("Jelly Bean");
        versions.add("Ice Cream Sandwidch");
        versions.add("Honeycomb");
        versions.add("Gingerbread");
        Set<String> stringSet = versions.stream()
                .filter(s -> s.length()> 7)
                .peek(e -> System.out.println("After the first filter: " + e))
                .filter(s -> s.startsWith("H"))
                .peek(e -> System.out.println("After the second filter: " + e))
                .collect(Collectors.toSet());
        System.out.println(stringSet);
//
//
////        System.out.println();
        System.out.println("*************************************");
        String[] arrStr={"ira","vira","kokos","banan","mango"};
        List<String> collect = Arrays.stream(arrStr).sorted().collect(Collectors.toList());


       System.out.println(collect);
//        System.out.println("*************************************");






    }
}
