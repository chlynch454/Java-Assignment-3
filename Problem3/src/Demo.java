public class Demo {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle 1", 3.5);
        Ellipse ellipse1 = new Ellipse("Ellipse 1", 3.5, 7, 4);
        Triangle triangle1 = new Triangle("Triangle 1", 3, 4, 2);
        EquilateralTriangle triangle2 = new EquilateralTriangle("Triangle 2", 3, 3, 3);

        Scalable[] differentShapes = {circle1, ellipse1, triangle1, triangle2};

        testScaleMethod(differentShapes, 2.0);
    }

    public static void testScaleMethod(Scalable[] shapeObjects, double multiplier) {
        for (Scalable object : shapeObjects) {
            System.out.println(object.toString());
            System.out.print("Scaled: ");
            object.scale(multiplier);
        }
    }
}
