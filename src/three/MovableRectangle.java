package three;
import java.lang.*;
public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    MovableRectangle ( int x1, int x2 , int y1 , int y2, int xSpeed,int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public String toString(){
        return " ";
    }
    public void moveUp(){
      topLeft.y += topLeft.ySpeed;
      bottomRight.y += bottomRight.ySpeed;
    }
    public void moveDown(){
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }
    public void moveLeft(){
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }
    public void moveRight(){
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
