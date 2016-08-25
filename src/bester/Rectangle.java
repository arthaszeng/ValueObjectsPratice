package bester;

public class Rectangle implements RulesOfComparing {
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    public Rectangle findBester(Rectangle rectangle) {
        return rectangle;
    }

    @Override
    public boolean betterThan(RulesOfComparing someObject) {
        return this.area() > ((Rectangle)someObject).area();
    }
}
