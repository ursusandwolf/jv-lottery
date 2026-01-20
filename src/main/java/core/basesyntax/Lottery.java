package core.basesyntax;

import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color color = Color.valueOf(new ColorSupplier().getRandomColor());
        int number = new Random().nextInt(101);
        return new Ball(color, number);
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < 3; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
