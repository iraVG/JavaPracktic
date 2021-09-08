package taskComposition;

public class Persona {
    private String name;
    private String surname;
    private int age;
    Pet pet;
    Mail mail;

    public Persona() {
    }

    public Persona(String name, String surname, int age, Pet pet, Mail mail) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pet = pet;
        this.mail = mail;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                ", mail=" + mail +
                '}';
    }
}
