package fourth;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return length;
    }
    public void setSide(double side){
        this.length = side;
    }

    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Square with side of " + this.length;
    }
}
