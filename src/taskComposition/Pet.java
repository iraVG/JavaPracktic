package taskComposition;

public class Pet {
    public String name;
    public int age;
public void pispis(){
    System.out.println("pipi");
}
    public void voice(){
        System.out.println("gav-gav");
    }
    public Pet() {
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
