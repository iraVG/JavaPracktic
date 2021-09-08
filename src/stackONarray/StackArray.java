package stackONarray;

public class StackArray {
    private int size;
    private int top;
    private int[] array;

    public StackArray(int size) {
        this.size = size;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(int item) {
        array[++top] = item;
        System.out.println("Top is "+ top);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            System.out.println("Top is "+ top);
            return array[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            System.out.println("Top is "+ top);
            return array[top];
        }
    }

}
