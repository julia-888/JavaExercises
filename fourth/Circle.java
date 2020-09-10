package fourth;

public class Circle extends Shape{
    double radius;
    Circle(){}
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public String toString(){
        return "Circle whith radius of " + radius;
    }
}
