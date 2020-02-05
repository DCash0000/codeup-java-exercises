package shapes;
public class Square extends Quadrilateral {
    protected double side;

    public Square(double length, double width) {
        super(length, width);
    }


    @Override
    protected double setLength(double length) {

        return length;
    }

    @Override
    protected double setWidth(double width) {

        return width;
    }

    @Override
    public double getPerimeter() {

        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {

        return length * width;
    }

//    Square squares = new Square();
//    public Square(double side){
//        super(side, side);
//    }
//
//    public double getArea(double side){
//        return side * side;
//
//    }
//
//    public double getPerimeter(double side){
//        return 4 * side;
//
//    }

}
