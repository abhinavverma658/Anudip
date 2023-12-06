/*
Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.
*/
import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Using ternary operator to find the maximum
        double max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum between " + num1 + " and " + num2 + " is: " + max);

        scanner.close();
    }
}
