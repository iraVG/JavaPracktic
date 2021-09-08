package stream;

import java.util.Objects;

public class User {
    public int id;
    public String name;
    public boolean isMaried;

    public User(int id, String name, boolean isMaried) {
        this.id = id;
        this.name = name;
        this.isMaried = isMaried;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMaried() {
        return isMaried;
    }

    public void setMaried(boolean maried) {
        isMaried = maried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                isMaried == user.isMaried &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, isMaried);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isMaried=" + isMaried +
                '}';
    }
}
