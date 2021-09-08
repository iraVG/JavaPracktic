package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<User> users=new ArrayList<>();
        users.add(new User(6,"mango",false));
        users.add(new User(6,"mango",false));
        users.add(new User(4,"ananas",true));
        users.add(new User(5,"banan",false));
        users.add(new User(2,"tomat",true));
        users.add(new User(1,"kokos",true));
        users.add(new User(3,"kivi",false));

        users.stream()
                .distinct()
                .sorted(((o1, o2) -> o2.getId()-o1.getId()))
                .filter(user -> !user.getName().startsWith("a"))
                .forEach(user -> System.out.println(user));






    }
}
