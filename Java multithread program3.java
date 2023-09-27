package threadprojectpkg;
import java.util.Random;

class Square extends Thread {
    private int x;

    public Square(int n) {
        x = n;
    }

    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}

class Cube extends Thread {
    private int x;

    public Cube(int n) {
        x = n;
    }

    public void run() {
        int cub = x * x * x;
        System.out.println("Cube of " + x + " = " + cub);
    }
}

public class thread1 extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("Random Integer generated : " + randomInteger);
            Square s = new Square(randomInteger);
            s.start();
            Cube c = new Cube(randomInteger);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
      thread1 n = new thread1();
        n.start();
    }
}
