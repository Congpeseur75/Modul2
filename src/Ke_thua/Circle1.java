package Ke_thua;

public class Circle1 {
    private double radius = 1.0;
    private String color = "green";

    public Circle1(){

    }

    protected Circle1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Double getRadius() {
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

    @Override
    public String toString() {
        return "Circle1{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

