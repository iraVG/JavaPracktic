package less_FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Greeting greeting=new GreetingFactoryMethod("eng").configure();
        greeting.doGreeting();
    }
}

abstract class Greeting{
    public abstract void doGreeting();
}

class EngGreeting extends Greeting{
    @Override
    public void doGreeting() {
        System.out.println("Hello!");
    }
}
 class FrnGreeting extends Greeting{
     @Override
     public void doGreeting() {
         System.out.println("Bonjour!");
     }
 }

 class GreetingFactoryMethod{
    private String lang;

     public GreetingFactoryMethod(String lang) {
         this.lang = lang;
     }

     public Greeting configure(){
         return this.lang.equals("eng")?new EngGreeting(): new FrnGreeting();
     }
 }
