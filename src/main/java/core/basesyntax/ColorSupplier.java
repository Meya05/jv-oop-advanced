package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "purple", "white", "black"};
    private static final Random RANDOM = new Random();

    public static String getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}