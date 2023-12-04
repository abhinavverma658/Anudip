import java.util.Scanner;

public class calculator_program{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
           int choice= scanner.nextInt();

            if (choice ==  0) {
                System.out.println("Exit");
                break;
            }

                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("The sum is: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("The difference is: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("The product is: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("The quotient is: " + divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 0 and 4.");
                        break;
                }
        }

        scanner.close();
    }
    private static double add(double x, double y) {
        return x + y;
    }
    private static double subtract(double x, double y) {
        return x - y;
    }
    private static double multiply(double x, double y) {
        return x * y;
    }
    private static double divide(double x, double y) {
        return x/y;
    }
}
