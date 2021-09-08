package lessonFile;

import java.io.Serializable;

public class Lecture implements Serializable {
    transient private int id;
    private String subject;

    public Lecture() {
    }

    public Lecture(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                '}';
    }
}
