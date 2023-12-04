import java.util.Scanner;
class operation{
    double add(double x, double y) {
        return x + y;
    }
    double subtract(double x, double y) {
        return x - y;
    }
    double multiply(double x, double y) {
        return x * y;
    }
    double divide(double x, double y) {
        return x/y;
    }
}
public class Calculator_program_1 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        operation op1= new operation();
        while(true){
            System.out.println("Menu");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice= sc.nextInt();

            if (choice ==  0) {
                System.out.println("Exit");
                break;
            }
                System.out.println("Enter the first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = sc.nextDouble();

            switch (choice) {
                case 1 -> System.out.println("The sum is: " + op1.add(num1, num2));
                case 2 -> System.out.println("The difference is: " + op1.subtract(num1, num2));
                case 3 -> System.out.println("The product is: " + op1.multiply(num1, num2));
                case 4 -> System.out.println("The quotient is: " + op1.divide(num1, num2));
                default -> System.out.println("Invalid choice. Please enter a number between 0 and 4.");
            }
            }
        }


    }

