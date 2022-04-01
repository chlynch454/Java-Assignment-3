class EquilateralTriangle extends Triangle implements Scalable {
    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
        if (side1 == side2 &&
                side1 == side3 &&
                side2 == side3) {
        } else {
            throw new IllegalArgumentException("All sides must be equal.");
        }
    }

    @Override
    public void scale(double multiplier) {
        System.out.println(side1 * multiplier + " " + side2 * multiplier + " " + side3 * multiplier);
    }

    public double area() {
        return super.area();
    }
    public double perimeter() {
        return super.perimeter();
    }
}

