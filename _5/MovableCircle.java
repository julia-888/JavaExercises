package _5;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed){
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString(){
        return "Circle with coordinates of the center: x:" + center.x + " and y:" + center.y;
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    public void moveRight(){
        center.moveRight();
    }
}
