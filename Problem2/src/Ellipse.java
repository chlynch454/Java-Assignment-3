import java.lang.Math;
class Ellipse extends Circle {
    private double a;
    private double b;

    public Ellipse(String name, double radius, double length1, double length2) {
        super(name, radius);

        if (length1 > length2) {
            this.a = length1;
            this.b = length2;
        } else {
            this.a = length2;
            this.b = length1;
        }
    }

        @Override
        public double area() {
            return 3.14 * a * b;
        };

        @Override
        public double perimeter() {
            return 3.14 * Math.sqrt( 2 * ((a * a) + (b * b)) - (((a - b) * (a - b)) / 2));
        };
}
