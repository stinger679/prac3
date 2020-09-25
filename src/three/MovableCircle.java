package three;
import java.lang.*;
public class MovableCircle implements Movable {
    int radius;
    MovablePoint centre;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        centre.x = x;
        centre.y = y;
        centre.xSpeed = xSpeed;
        centre.ySpeed = ySpeed;
        this.radius = radius;

    }
    public String toString(){
        return "radius:"+ radius;
    }

    public void moveUp(){
    centre.y += centre.ySpeed;
    }
    public void moveDown(){
        centre.y -= centre.ySpeed;
    }
    public void moveLeft(){
        centre.x -= centre.xSpeed;
    }
    public void moveRight(){
        centre.x += centre.xSpeed;
    }
}
