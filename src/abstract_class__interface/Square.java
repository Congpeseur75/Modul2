package abstract_class__interface;

public class Square implements Resizeable, Colorable{
    private double weight;
    public Square(){}
    public Square(double weight){
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getArea(){
        return weight * weight;
    }

    @Override
    public void resize(){
    }
    @Override
    public void resize(double percent){
        weight *= (1 + percent / 100);
    }
    @Override
    public void howToColor()    {
        System.out.println("to mau ca hinh");
    }

    public static void main(String[] args) {
        Square square = new Square(5.6);
        System.out.println(square.getArea());
        square.howToColor();

        double percent = Math.random() * 100;
        square.resize(percent);
    }
}
