package Access_modifier;

public class TestCircle {
    public static void main(String[] args) {

        // Creating a Circle object using the no-argument constructor
        Circle circle1 = new Circle();

        // Accessing methods with private access modifiers
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        // Creating a Circle object using the constructor with a parameter
        Circle circle2 = new Circle(2.5);

        // Accessing methods with private access modifiers
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
