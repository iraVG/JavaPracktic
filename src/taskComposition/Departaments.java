package taskComposition;

public class Departaments {
    private String name;

    public Departaments() {
    }

    public Departaments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departaments{" +
                "name='" + name + '\'' +
                '}';
    }
}
