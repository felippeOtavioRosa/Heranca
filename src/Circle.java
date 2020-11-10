public class Circle extends Shape {
    private double radious;

    public  Circle(){
        radious = 1;
    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        setRadious(radious);
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getArea(){
        return (radious*radious)*3.14159;
    }

    public double getPerimeter(){
        return radious*2*3.14159;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n %s: %b\n %s: %.2f\"",
                "color='", super.getColor(),
                "filled=", super.isFilled(),
                "radius=",radious);
    }
}
