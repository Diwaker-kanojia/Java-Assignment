package BankAccount;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        System.out.println("The amount of " + amount + " is credited to your Account.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.print("Insufficient Balance !!!");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}
