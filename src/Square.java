public class Square extends Rectangle{
    public Square(){};

    public Square(String color, boolean filled, double side){
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

   public void setWidth(double side){
        setSide(side);
   }

    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n %s: %s\n %s: %s\n %s: %s",
                "color='", super.getColor(),
                "filled=", super.isFilled(),
                "width=",getSide(),
                "length=",getSide());
    }
}
