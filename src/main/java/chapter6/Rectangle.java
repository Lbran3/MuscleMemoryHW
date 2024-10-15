package chapter6;

public class Rectangle {

    double length;
    double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){ //default constructor that takes 2 arguments
        this.length = length; //can be set this way
        setWidth(width); //or set this way; two alternatives
    }
    double getLength(){
        return length;
    }
    void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    double getWidth(){
       return width;
    }
    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    double calculateArea(){
        return length * width;
    }
}
