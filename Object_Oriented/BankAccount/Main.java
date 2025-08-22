package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(500);
        System.out.println(account1.getBalance());
    }
}
