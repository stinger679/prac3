package two;
import java.math.*;

public class Circle extends Shape {
    public double radius;
    public Circle(){};
    public Circle(double radius, String color, boolean filled){
        radius = radius;
        color = color;
        filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    @Override
    public String toString(){
        return "Area: "+ Math.PI*radius*radius + " Perimeter: " + 2*Math.PI*radius;
    }
}