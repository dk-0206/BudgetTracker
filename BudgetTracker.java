import java.util.Scanner; // Import the Scanner class for user input

public class BudgetTracker {
    private double balance; // Variable to store the current balance

    // Constructor to initialize the balance to 0.0
    public BudgetTracker() {
        balance = 0.0;
    }

    // Method to add income to the balance
    public void addIncome(double amount) {
        balance += amount;
    }

    // Method to subtract expense from the balance
    public void addExpense(double amount) {
        balance -= amount;
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        BudgetTracker tracker = new BudgetTracker(); // Create a BudgetTracker object

        while (true) { // Infinite loop to keep the program running until the user chooses to exit
            // Display menu options to the user
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt(); // Read the user's choice

            switch (choice) {
                case 1:
                    // If the user chooses to add income
                    System.out.print("Enter income amount: ");
                    double income = scanner.nextDouble(); // Read the income amount
                    tracker.addIncome(income); // Add the income to the balance
                    break;
                case 2:
                    // If the user chooses to add an expense
                    System.out.print("Enter expense amount: ");
                    double expense = scanner.nextDouble(); // Read the expense amount
                    tracker.addExpense(expense); // Subtract the expense from the balance
                    break;
                case 3:
                    // If the user chooses to view the current balance
                    System.out.println("Current Balance: Rs" + tracker.getBalance());
                    break;
                case 4:
                    // If the user chooses to exit
                    System.out.println("Exiting... Thank you!");
                    return; // Exit the program
                default:
                    // If the user enters an invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
