package org.example;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main() {
        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.println("The area is " + area + "cm²");

        scanner.close();
    }
}
