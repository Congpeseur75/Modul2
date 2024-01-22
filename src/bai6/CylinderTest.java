package bai6;
import java.util.Scanner;
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(4.5,2.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(4.5,2.5,6.5,"red");
        System.out.println(cylinder);
    }
}
