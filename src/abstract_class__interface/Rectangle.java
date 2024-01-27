package abstract_class__interface;

public class Rectangle implements Resizeable{
    private double weight;
    private double length;
    public Rectangle(){}

    public Rectangle(double weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return weight * length;
    }


    @Override
    public void resize(){
    }

    @Override
    public void resize(double percent){
        length *= (1 + percent / 100);
        weight *= (1 + percent / 100);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5,5.5);
        System.out.println(rectangle.getArea());

        double percent = Math.random() * 100;
        rectangle.resize(percent);
    }
}
