package less_LambdaS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "olga"));
        users.add(new User(3, "viktor"));
        users.add(new User(5, "oleg"));
        users.add(new User(2, "igor"));
        users.add(new User(4, "matviy"));
        users.add(new User(6, "max"));

        //users.forEach();
        //users.replaceAll();
        //users.removeIf();
        //users.sort();

        // Test test = x -> x+100;
//        users.replaceAll(user -> {
//           if(user.getId()%2==0){
//               user.setName("EVEN");
//           }
//
//            return user;
//        });

        // users.removeIf(user -> user.getId()%2==0);

//        users.sort((o1, o2) -> o2.getId() - o1.getId());
//        users.forEach(user -> System.out.println(user));

//        Function<String, Integer> stringIntegerFunction = s ->  Integer.parseInt(s);
//
//        System.out.println(stringIntegerFunction.apply("234"));

//        BiFunction<String, Integer, Integer> biFunction = (s, integer) -> Integer.parseInt(s)+integer;
//        System.out.println(biFunction.apply("123", 30));
        users.forEach(System.out::println);

    }


}




