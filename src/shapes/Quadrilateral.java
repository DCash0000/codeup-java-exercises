package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
//    public static double length;
    protected double length;
    protected double width;
    abstract protected double setLength(double length);
    abstract protected double setWidth (double width);

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;

    }

        public double getLength(){
            return length;
        }

        public double getWidth(){
        return width;
        }



    }



