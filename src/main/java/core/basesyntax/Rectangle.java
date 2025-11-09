package core.basesyntax;
public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("%s, długość: %.2f jednostek, szerokość: %.2f jednostek",
                super.toString(), length, width);
    }
}
