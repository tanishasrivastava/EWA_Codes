package threadprojectpkg;
import java.util.Random;

class NumberGenerator extends Thread {
    @Override
    public void run() {
        Random rand = new Random();
        while (true) {
            int randomNumber = rand.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated Number: " + randomNumber);

            if (randomNumber % 2 == 0) {
                SquareCalculator squareThread = new SquareCalculator(randomNumber);
                squareThread.start();
            } else {
                System.out.println("Odd Number: " + randomNumber);
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class SquareCalculator extends Thread {
    private int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    }
}

public class numbergen {
    public static void main(String[] args) {
        NumberGenerator numberGeneratorThread = new NumberGenerator();
        numberGeneratorThread.start();
    }
}
