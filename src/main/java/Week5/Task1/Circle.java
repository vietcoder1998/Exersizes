package Week5.Task1;

public class Circle {
    protected double radius = 1.0;
    protected String color = "red";
    protected static final double PI = 3.14;

    public Circle(){}

    public Circle(double radius){
        this.radius =  radius;
    }

    public Circle(double radius, String color){
        this.radius =  radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString () {
        return ("Circle[radius="+ this.radius + "," + "color="+ this.color + "]");
    }

    public double getArea () {
        double radius = this.radius;
        return  PI*radius*radius;
    }
}
