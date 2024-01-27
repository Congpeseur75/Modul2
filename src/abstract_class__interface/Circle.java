package abstract_class__interface;

public class Circle implements Resizeable{
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){}




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
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(){
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(4.5,"green");
        System.out.println(circle.getArea());
    }
}
