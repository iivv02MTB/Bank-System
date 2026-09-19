package SistemaBancario2;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance,
                           Client owner, double overdraftLimit) {
        super(accountNumber, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter:
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            modifyBalance(-amount);
        } else {
            throw new IllegalArgumentException("The operation cannot be completed");
        }
    }
}
