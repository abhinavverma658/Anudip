import java.util.Scanner;

class Account {
    int ac_no;
    String ac_holder_name;
    String address;
    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        ac_no = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Account Holder Name: ");
        ac_holder_name = scanner.nextLine();
        System.out.println("Enter Address: ");
        address = scanner.nextLine();
    }
    void displayDetails() {
        System.out.println("Account Number: " + ac_no);
        System.out.println("Account Holder Name: " + ac_holder_name);
        System.out.println("Address: " + address);
    }
}

class SavingAccount extends Account {
    double balance;
    String ac_type;
    void inputBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Balance: ");
        balance = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character
        System.out.println("Enter Account Type: ");
        ac_type = scanner.nextLine();
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void displayInfo() {
        displayDetails();
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + ac_type);
    }
}

public class Bank_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SavingAccount savingAccount = new SavingAccount();
        savingAccount.inputDetails();
        savingAccount.inputBalance();
        savingAccount.displayInfo();
        System.out.println("Enter withdrawal amount:- ");
        savingAccount.withdraw(scanner.nextDouble());
        System.out.println("Enter Deposit  amount:- ");
        savingAccount.deposit(scanner.nextDouble());
        savingAccount.displayBalance();
        savingAccount.displayInfo();
    }
}
