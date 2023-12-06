import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the bit position (n): ");
        int n = scanner.nextInt();
        int mask = 1 << (n - 1);
        int result = num & mask;
        boolean isNthBitSet = (result != 0);
        System.out.println("The " + n + "th bit of " + num + " is set to " + (isNthBitSet ? 1 : 0));

    }
}
