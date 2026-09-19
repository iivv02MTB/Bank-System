package SistemaBancario2;

public class Account {
    private String accountNumber;
    private double balance;
    private Client owner;

    public Account(String accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    // Getters:
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    // Setter:
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nOwner: " + owner;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Invalid amount");
        }
    }

    protected void modifyBalance(double amount) {
        balance += amount;
    }
}
