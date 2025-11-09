package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String toString() {
        return "Figure: right triangle, area: " + String.format("%.2f", getArea()) + " sq. units, firstLeg: "
                + String.format("%.2f", firstLeg) + ", secondLeg: " + String.format("%.2f", secondLeg) + " units, color: " + getColor();
    }
}