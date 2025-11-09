package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double a;
    private double b;
    private double h;

    public IsoscelesTrapezoid(String color, double a, double b, double h) {
        super(color);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * (a + b) * h;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea()) + " sq. units, a: "
                + String.format("%.2f", a) + ", b: " + String.format("%.2f", b) + ", h: "
                + String.format("%.2f", h) + " units, color: " + getColor();
    }
}
