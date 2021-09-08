package taskComposition;

public class Worker {
    private String name;
    private String surname;
    private int stage;
    private String position;

    public Worker() {
    }

    public Worker(String name, String surname, int stage, String position) {
        this.name = name;
        this.surname = surname;
        this.stage = stage;
        this.position = position;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", stage=" + stage +
                ", position='" + position + '\'' +
                '}';
    }
}
