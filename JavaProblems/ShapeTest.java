class Shape {
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void displayShape() {
        System.out.println("This is a circle.");
    }
}

class Square extends Shape {
    @Override
    public void displayShape() {
        System.out.println("This is a square.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Square();

        shape1.displayShape();
        shape2.displayShape();
    }
}