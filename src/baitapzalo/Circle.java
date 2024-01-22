package baitapzalo;
import java.util.Scanner;
public class Circle {
    private int id;
    private double radius;
    private static int numberOfObjects = 0;
    public static double  maxRadius = 0;
    public Circle(){

    }
    public Circle(double radius){
        this.id = ++numberOfObjects;
        this.radius = radius;

        if (radius > maxRadius){
            maxRadius = radius;
        }
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getAcreage(){
        return radius * radius * Math.PI;
    }
    public static double  getMaxRadius(){
        return maxRadius;
    }
    public static void displayTotalArea(){
        double totalArea = numberOfObjects * Math.PI * maxRadius * maxRadius;
        System.out.println("tổng diện tích các hình tròn là: " + totalArea);
    }
    public static void displayNumberOfObjects() {
        System.out.println("Number of Circle objects created: " + numberOfObjects);
    }


    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);
        Circle circle3 = new Circle(3.0);

        displayNumberOfObjects();

        System.out.println("Circle 1 - Radius: " + circle1.radius + ", Area: " + circle1.getAcreage());
        System.out.println("Circle 2 - Radius: " + circle2.radius + ", Area: " + circle2.getAcreage());
        System.out.println("Circle 3 - Radius: " + circle3.radius + ", Area: " + circle3.getAcreage());

        System.out.println("Max Radius among all circles: " + getMaxRadius());

        displayTotalArea();
    }
}
