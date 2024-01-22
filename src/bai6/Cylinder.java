package bai6;

public class Cylinder extends Circle1{
    private double height = 1.0;
    private double volume = 1.0;
    public Cylinder(){

    }
    public Cylinder(double height, double volume){
        this.height = height;
        this.volume = volume;
    }
    public Cylinder(double height, double volume, double radius, String color){
        super(radius, color);
        this.height = height;
        this.volume = volume;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    public double Area(){
        return (height + volume) * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
