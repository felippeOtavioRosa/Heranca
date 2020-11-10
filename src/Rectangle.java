public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n %s: %s\n %s: %s\n %s: %s",
                "color='", super.getColor(),
                "filled=", super.isFilled(),
                "width=",width,
                "length=",length);
    }
}