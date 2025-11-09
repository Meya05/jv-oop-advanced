package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(this.toString());
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }
}
