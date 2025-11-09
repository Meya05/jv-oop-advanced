package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();

    public static Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }

    public static Figure getRandomFigure() {
        String randomColor = ColorSupplier.getRandomColor();
        int figureType = RANDOM.nextInt(5);

        double prop1 = 1.0 + (20.0 - 1.0) * RANDOM.nextDouble();
        double prop2 = 1.0 + (20.0 - 1.0) * RANDOM.nextDouble();
        double prop3 = 1.0 + (20.0 - 1.0) * RANDOM.nextDouble();

        switch (figureType) {
            case 0:
                return new Square(randomColor, prop1);
            case 1:
                return new Rectangle(randomColor, prop1, prop2);
            case 2:
                return new RightTriangle(randomColor, prop1, prop2);
            case 3:
                return new Circle(randomColor, prop1);
            case 4:
                return new IsoscelesTrapezoid(randomColor, prop1, prop2, prop3);
            default:
                return getDefaultFigure();
        }
    }
}