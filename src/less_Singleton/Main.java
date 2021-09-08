package less_Singleton;

public class Main {

    public static void main(String[] args) {

        President president = President.getInstance("Ze");
        President president2 = President.getInstance("Vova");

        System.out.println(president);
       System.out.println(president2);

    }
}

class President{
    private String name;
    private static President president=new President();
    private President(){}

    public static President getInstance(String name) {
        president.name=name;
        return president;
    }

    @Override
    public String toString() {
        return "President{" +
                "name='" + name + '\'' +
                '}';
    }
}
