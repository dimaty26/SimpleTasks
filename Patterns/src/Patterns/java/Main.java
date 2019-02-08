package Patterns.java;

public class Main {

    public static void main(String[] args) throws InterruptedException{

        final int SIZE = 1000;

        Thread t[] = new Thread[SIZE];

        for (int i = 0; i < SIZE; i++) {
            t[i] = new Thread(new R());
            t[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            t[i].join();
        }
        System.out.println(Singleton.counter);
    }
}
class R implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}

class Singleton {
    public static int counter = 0;
    private static Singleton instance = new Singleton();
    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        return instance;
    }
}