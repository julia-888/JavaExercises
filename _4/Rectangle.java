package _4;

public class Rectangle extends Shape{
    double width;
    double length;
    Rectangle(){}
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    Rectangle(double length, double width, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    double getWidth(){
        return width;
    }
    double getLength(){
        return length;
    }
    void setWidth(double width){
        this.width = width;
    }
    void setLength(double length){
        this.length = length;
    }

    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return 2*(width+length);
    }
    public String toString(){
        return "Rectangle whith width of " + width + " and length of " + length;
    }
}
