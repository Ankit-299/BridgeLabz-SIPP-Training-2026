// Design a simple BankAccount class that models real-world banking behavior. Each account should store basic details like account number, holder name, and balance.
// You will implement methods to deposit and withdraw money, ensuring that withdrawals don't exceed the available balance. The class should also keep track of how many accounts have been created using a static variable. Finally, create multiple accounts and simulate transactions to observe how the system behaves.
// Key Points
// Create a class with accountNumber, holder, and balance
// Implement deposit() and withdraw() with proper balance checks
// Add getStatement() to display account details
// Use a static variable to count total accounts created
// Create 3 accounts and perform 5 transactions on each
public class ScenariobasedBank {
    private String accountNumber;
    private String holderName;
    private double balance;
    private static int totalAccounts = 0;

    public ScenariobasedBank(String accountNumber, String holderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Check the amount and available balance.");
        }
    }

    public void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        ScenariobasedBank account1 = new ScenariobasedBank("123456", "Alice", 1000);
        ScenariobasedBank account2 = new ScenariobasedBank("654321", "Bob", 2000);
        ScenariobasedBank account3 = new ScenariobasedBank("112233", "Charlie", 1500);

        account1.deposit(500);
        account1.withdraw(200);
        account1.getStatement();

        account2.deposit(300);
        account2.withdraw(2500); // Should fail
        account2.getStatement();

        account3.deposit(700);
        account3.withdraw(1000);
        account3.getStatement();

        System.out.println("Total accounts created: " + ScenariobasedBank.getTotalAccounts());
    }

    
}
