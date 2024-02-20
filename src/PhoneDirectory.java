/*
* Q1 A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name.

 [Hint:use a HashMap to store names as keys and phone numbers as values.
 *  The user can choose to find a number by providing a name or add a new name with a phone number.
 * The program runs in a loop until the user chooses to exit.]*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDirectory {

    public static void main(String[] args) {
        Map<String, String> phoneDirectory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Phone Directory!");

        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Find a phone number");
            System.out.println("2. Add a new name and phone number");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name to find the phone number: ");
                    String nameToFind = scanner.nextLine();
                    findPhoneNumber(phoneDirectory, nameToFind);
                    break;
                case 2:
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter phone number for " + newName + ": ");
                    String newPhoneNumber = scanner.nextLine();
                    addPhoneNumber(phoneDirectory, newName, newPhoneNumber);
                    break;
                case 3:
                    System.out.println("Exiting the Phone Directory. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 3);

        scanner.close();
    }

    private static void findPhoneNumber(Map<String, String> phoneDirectory, String name) {
        if (phoneDirectory.containsKey(name)) {
            String phoneNumber = phoneDirectory.get(name);
            System.out.println(name + "'s phone number is: " + phoneNumber);
        } else {
            System.out.println("Phone number not found for " + name);
        }
    }

    private static void addPhoneNumber(Map<String, String> phoneDirectory, String name, String phoneNumber) {
        phoneDirectory.put(name, phoneNumber);
        System.out.println("Added " + name + "'s phone number: " + phoneNumber);
    }
}
