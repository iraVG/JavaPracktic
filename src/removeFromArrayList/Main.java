package removeFromArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("h");
        list.add("second");
        list.add("second");
        list.add("third");
        list.add("g");
        list.add("fourth");
        list.add("k");
        list.add("fifth");

////        list.remove("h");
//        System.out.println(list);
//        System.out.println("*********************");

//        Iterator<String> iterator = list.iterator();
//        while(iterator.hasNext()){
//            String element=iterator.next();
//            if(element.length()==1||element.contains("ur")){
//                iterator.remove();
//            }
//        }

//        List<String>newList=list.stream()
//                .filter(li-> !(li.length() ==1))
//                .collect(Collectors.toList());
//        System.out.println("newList "+newList);
//        System.out.println("*********************");

//        list.stream()
//                .distinct()
//                .forEach(System.out::println);//без  повторів не створюється новий ліст
//        System.out.println(list);
//        System.out.println("*********************");
//
//
//        List<String> li = list.stream()
//                .distinct()
//                .collect(Collectors.toList());//створюється новий ліст
//
//        System.out.println(li);
//        System.out.println("*********************");


//        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 12, 18);
//        Integer lcm = listOfNumbers.stream()
//                .filter(i -> i % 2 == 0)
//                .filter(i -> i % 3 == 0)
//                .findFirst().get();
//        System.out.println(lcm);

        List<String> list1 = Arrays.asList("Mo", "Tu", "We", "Th", "Fr", "Thr", "Su");
        list1=list1.stream()
                .filter(s->!s.contains("h"))
                .collect(Collectors.toList());
        System.out.println(list1);

    }
}
