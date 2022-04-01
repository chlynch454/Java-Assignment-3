public abstract class Shape implements Scalable {
    private String name;
    abstract double perimeter();
    abstract double area();

    Shape() {};

    Shape(String name) {
        this.name = name;
    }

    @Override
    public abstract void scale(double multiplier);

    public String toString() {
        return "Name: " + name + " Area: " + area() + " Perimeter: " + perimeter();
    }
}
