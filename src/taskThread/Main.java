package taskThread;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+": "+i);
            }
        };
        Thread thread = new Thread(runnable,"MyThread");
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }
}
