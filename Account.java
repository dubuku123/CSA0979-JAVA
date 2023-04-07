public class Account
{
    private double balance;
    // Constructor to set initial balance
public void Account(double initialBalance) {
    this.balance = initialBalance;
}

// Default constructor with balance set to 0
public void Account() {
    this.balance = 0;
}

// Function to add money to account
public void addMoney(double amount) {
    this.balance += amount;
}

// Function to withdraw money from account
public void withdrawMoney(double amount) {
    if (amount > balance) {
        System.out.println("Insufficient funds. A $5 penalty will be charged.");
        this.balance -= 5;
    } else {
        this.balance -= amount;
    }
}

// Function to inquire the current balance
public double getCurrentBalance() {
    return balance;
}

// Function to compute interest on the current balance
public double computeInterest(double interestRate) {
    double interest = balance * interestRate / 100;
    this.balance += interest;
    return interest;
}

public static void main(String[] args) {
    // Creating an account with initial balance of $1000
    Account myAccount = new Account();

    // Adding $500 to the account
    myAccount.addMoney(500);

    // Withdrawing $200 from the account
    myAccount.withdrawMoney(200);

    // Inquiring the current balance
    double balance = myAccount.getCurrentBalance();
    System.out.println("Current balance: $" + balance);

    // Computing interest on the account with interest rate of 5%
    double interest = myAccount.computeInterest(5);
    System.out.println("Interest earned: $" + interest);
    System.out.println("Updated balance after interest: $" + myAccount.getCurrentBalance());
}
}