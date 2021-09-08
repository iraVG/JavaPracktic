package taskComposition;

import java.util.Arrays;

public class Company {
    private String name;
    private Departaments [] departaments;
    private  Worker [] workers;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departaments[] getDepartaments() {
        return departaments;
    }

    public void setDepartaments(Departaments[] departaments) {
        this.departaments = departaments;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", departaments=" + Arrays.toString(departaments) +
                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
