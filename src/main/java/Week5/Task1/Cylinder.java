package Week5.Task1;

public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder() {}
    public Cylinder(double radius) {

    }
    public Cylinder(double radius, double height) {}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume () {
        return this.height;
    }

    @Override
    public String toString() {
        return ("Circle[radius="+ this.radius + "," + "color=" + this.color + "," +"height=" + this.height +  "]");
    }

    @Override
    public double getArea() {
        double radius = this.radius;
        return 2*radius*radius*PI;
    }
}
