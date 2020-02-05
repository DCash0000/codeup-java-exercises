package shapes;

import org.w3c.dom.ls.LSOutput;

public class ShapeTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 5);
        Measurable myShape2 = new Square(2, 5);
        System.out.println("Area of rectangle is: " + myShape.getArea());
        System.out.println("Perimeter of rectangle is: " + myShape.getPerimeter());
        System.out.println("Area of Square is: " + myShape2.getArea());
        System.out.println("Perimeter of rectangle is: " + myShape2.getPerimeter());
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);
//
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
//
    }
}
