package stackONarray;

public class Main {
    public static void main(String[] args) {
        StackArray stack=new StackArray(5);
        stack.push(5);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();



    }
}
