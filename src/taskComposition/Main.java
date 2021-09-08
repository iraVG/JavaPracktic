package taskComposition;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("Mars", 3);
        Mail mail = new Mail("1111", "0000", "owu.com.ua");
        Persona vasja = new Persona("Vasja", "Pupkin", 30, dog, mail);
        vasja.getMail().logIn();
        vasja.getPet().voice();


    }
}
