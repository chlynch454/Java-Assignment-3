import java.lang.Math;
    public class Triangle extends Shape implements Scalable {
        public double side1;
        public double side2;
        public double side3;

        public Triangle(){};

        public Triangle(String name, double side1, double side2, double side3) {
            super(name);
            if ( side1 + side2 > side3 &&
                    side2 + side3 > side1 &&
                    side3 + side1 > side2 )
            {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }
            else {
                throw new IllegalArgumentException("Invalid arguments provided.");
            }
        }

        @Override
        public void scale(double multiplier) {
            System.out.println(side1 * multiplier + " " + side2 * multiplier + " " + side3 * multiplier);
        }

        public double area() {
            double s = perimeter() / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        public double perimeter() {
            return side1 + side2 + side3;
        }
}
