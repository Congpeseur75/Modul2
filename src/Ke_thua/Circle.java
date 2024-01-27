package Ke_thua;

public class Circle extends Shape{
    private Double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public Double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius =radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius *Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
