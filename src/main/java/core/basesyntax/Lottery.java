package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int INT = 3;
    private static final int MIN = 1;
    private static final int MAX = 100;
    private final Random RANDOM = new Random();
    private final ColorSupplier SUPPLIER = new ColorSupplier();

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < INT; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }

    public Ball getRandomBall() {

        return new Ball(SUPPLIER.getRandomColor(), RANDOM.nextInt(MIN, MAX + 1));
    }
}
