package bai2;

import java.util.Scanner;
public class pictureMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 4);

        scanner.close();
    }

    private static void printRectangle() {
        int width = 5;
        int height = 3;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void printSquareTriangle() {
        int size = 5;

        System.out.println("Top-left square triangle:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Top-right square triangle:");
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Similarly, you can implement bottom-left and bottom-right square triangles.
    }

    private static void printIsoscelesTriangle() {
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
