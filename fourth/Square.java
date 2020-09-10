package fourth;

public class Square extends Rectangle{
    Square(){}
    Square(double side){
        this.length = side;
    }
    Square(double side, String color, boolean filled){
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    double getSide(){
        return length;
    }
    void setSide(double side){
        this.length = side;
    }

    void setWidth(double side){
        super.setWidth(side);
    }
    void setLength(double side){
        super.setLength(side);
    }
    public String toString(){
        return "Square with side of " + this.length;
    }
}
