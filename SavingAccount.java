package SistemaBancario2;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance,
                          Client owner, double interestRate) {
        super(accountNumber, balance, owner);
        this.interestRate = interestRate;
    }

    // Getter:
    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        modifyBalance(interestRate * getBalance() / 100);
    }
}
