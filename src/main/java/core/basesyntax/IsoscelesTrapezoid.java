package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final String color;
    private final double a;
    private final double b;
    private final double h;

    public IsoscelesTrapezoid(String color, double a, double b, double h) {
        this.color = color;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return 0.5 * (a + b) * h;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.2f", getArea()) + " sq. units, a: "
                + String.format("%.2f", a) + ", b: " + String.format("%.2f", b) + ", h: "
                + String.format("%.2f", h) + " units, color: " + color;
    }
}