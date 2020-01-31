package shapes;

public class Circle {
    private double radius;

    public static void main(String[] args) {

    }


    public Circle(double radius){
        this.radius = radius;
    }


    public double getArea(){
        return Math.PI * this.radius * this.radius;

    }


    public double getCircumference(){
        return 2 * this.radius * Math.PI;

    }

}
