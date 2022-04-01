class Circle extends Shape implements Scalable {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void scale(double multiplier) {
        System.out.println(radius * multiplier);
    }

    public double area() {
        return 3.14 * (radius * radius);
    }
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
}

