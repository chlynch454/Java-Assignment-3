class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        super(name, side1, side2, side3);
        if (side1 == side2 &&
                side1 == side3 &&
                side2 == side3) {
        } else {
            throw new IllegalArgumentException("All sides must be equal.");
        }
    }

    public double area() {
        return super.area();
    }

    public double perimeter() {
        return super.perimeter();
    }
}

