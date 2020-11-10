public class Shape {
    private String color;
    private boolean filled;

   public  Shape(){
       color = "vermelho";
       filled = true;
   }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);

    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n %s: %b",
                "color='", color,
                ", filled=", filled);
    }
}
