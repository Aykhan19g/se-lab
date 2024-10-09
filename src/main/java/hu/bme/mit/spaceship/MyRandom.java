package hu.bme.mit.spaceship;
import java.util.Random;

public class MyRandom {
    private Random random = new Random();  // Correct

    public double getNextDouble() {
        return this.random.nextDouble();
    }
}
