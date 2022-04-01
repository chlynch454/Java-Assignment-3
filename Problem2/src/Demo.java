public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle 1", 3.5);
        Ellipse ellipse1 = new Ellipse("Ellipse 1", 3.5, 7, 4);
        Triangle triangle1 = new Triangle("Triangle 1", 3, 4, 2);
        EquilateralTriangle triangle2 = new EquilateralTriangle("Triangle 2", 3, 3, 3);

        Shape[] shapes = {circle1, ellipse1, triangle1, triangle2};

        for(Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
