/*
Create a Bank class and declare an instance variable named amount of type double.
Create parameterized constructor to initialize variable “amount” with value 10000.
Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
Calculate withdrawal based on some condition (using ternary operator)
like If amount is sufficient then “withdraw successful” message will be printed on the console and amount should be updated after withdraw.
Later on, deposit 5000 in the account.
*/

public class Bank {
    private double amount;

    // Parameterized constructor to initialize amount with the default value of 10000
    public Bank() {
        this.amount = 10000.0;
    }

    // Method to perform a withdrawal
    public void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= this.amount) ? "Withdraw successful" : "Insufficient funds";
        this.amount -= (withdrawalAmount <= this.amount) ? withdrawalAmount : 0;
        System.out.println(message);
    }

    // Method to perform a deposit
    public void deposit(double depositAmount) {
        this.amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // Method to display the total balance
    public void displayBalance() {
        System.out.println("Total balance:" + String.format("%.2f", this.amount));
    }

    public static void main(String[] args) {
        // Creating an instance of the Bank class with an initial amount of 10000
        Bank account = new Bank();

        // Withdrawing 2000 (assuming there is sufficient balance)
        account.withdraw(5000);

        // Displaying balance after withdrawal
        account.displayBalance();

        // Depositing 5000
        account.deposit(5000);

        // Displaying balance after deposit
        account.displayBalance();
    }
}
