abstract class Account {
    private String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

// SavingsAccount.java
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
    
    public void deposit(double amount) {
        balance += amount + (amount * interestRate / 100);
        System.out.println("Deposit of $" + amount + " successful.");
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}


class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        // Creating instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000, 1000);

        // Depositing and withdrawing from SavingsAccount
        System.out.println("Savings Account Details:");
        System.out.println("Initial Balance: $" + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        System.out.println("Final Balance: $" + savingsAccount.getBalance());

        System.out.println();

        System.out.println("Current Account Details:");
        System.out.println("Initial Balance: $" + currentAccount.getBalance());
        currentAccount.deposit(1000);
        currentAccount.withdraw(3000);
        System.out.println("Final Balance: $" + currentAccount.getBalance());
    }
}
