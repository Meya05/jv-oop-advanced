package core.basesyntax;

public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        int halfSize = figures.length / 2;

        for (int i = 0; i < halfSize; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        for (int i = halfSize; i < figures.length; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
        }

        System.out.println("--- Array of Figures ---");
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}