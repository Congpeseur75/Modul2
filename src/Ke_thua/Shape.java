package Ke_thua;

public class Shape {
    private String color;
    private Boolean filled;
    public Shape (){

    }
    public  Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return  color;
    }
    public void setColor(String color){
        this.color =color;
    }
    public Boolean isFilled(){
        return filled;
    }
    public void setFilled(Boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
