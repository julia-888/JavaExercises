package _6;

class Rectangle {
    protected double width;
    protected double length;
    Rectangle(){}
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
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

}

public class MovableRectangle extends Rectangle implements Movable{
    protected MovablePoint upperLeft;
    protected MovablePoint lowerRight;

    MovableRectangle(MovablePoint u, MovablePoint l) throws Exception{
            if (u.xSpeed == l.xSpeed && u.ySpeed == l.ySpeed){
                upperLeft = u;
                lowerRight = l;
            }
            else{
                 throw new Exception("incorrect data");
            }
    }

    @Override
    public void moveUp() {
        upperLeft.moveUp();
        lowerRight.moveUp();
    }

    @Override
    public void moveDown() {
        upperLeft.moveDown();
        lowerRight.moveDown();

    }

    @Override
    public void moveLeft() {
        upperLeft.moveLeft();
        lowerRight.moveLeft();

    }

    @Override
    public void moveRight() {
        upperLeft.moveRight();
        lowerRight.moveRight();

    }

}
