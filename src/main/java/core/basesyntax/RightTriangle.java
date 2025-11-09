package core.basesyntax;

public class RightTriangle implements Figure {
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, area: " + String.format("%.2f", getArea()) + " sq. units, firstLeg: "
                + String.format("%.2f", firstLeg) + ", secondLeg: " + String.format("%.2f", secondLeg) + " units, color: " + color;
    }
}