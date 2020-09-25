package three;
 import java.lang.*;
class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        x = x;
        y = y;
        xSpeed = xSpeed;
        ySpeed = ySpeed;
    }
    public String toString(){
        return "x = " + x + " y = "+y ;
    }
    public void moveUp(){
        y = y + ySpeed;
    }
    public void moveDown(){
        y= y - ySpeed;
    }
    public void moveLeft(){
        x = x-xSpeed;
    }
    public void moveRight(){
        x= x + xSpeed;
    }
}
