import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int reversedNumber = reverseNumber(num);

        System.out.println("Reversed number: " + reversedNumber);
    }
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
