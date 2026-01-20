package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final Random random = new Random();

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }

    public Ball getRandomBall() {

        Color color = new ColorSupplier().getRandomColor();
        return new Ball(color, random.nextInt(1, 101));
    }
}
