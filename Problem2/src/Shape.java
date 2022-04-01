public abstract class Shape {
    private String name;
    abstract double perimeter();
    abstract double area();

    Shape() {}

    Shape(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + " Area: " + area() + " Perimeter: " + perimeter();
    }
}
