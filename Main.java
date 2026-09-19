package SistemaBancario2;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // Create the clients:
        Client john = new Client("John", "30203020H", "john@example.com");
        Client lua = new Client("Lua", "40203020G", "lua@example.com");

        // Create a checking account and a savings account:
        CheckingAccount johnCheckingAccount =
                new CheckingAccount("1000040404040", 2500, john, 1000);

        SavingsAccount luaSavingsAccount =
                new SavingsAccount("1010101020", 3000, lua, 5);

        // Add clients and accounts to the bank:
        bank.addClient(john);
        bank.addClient(lua);
        bank.addAccount(johnCheckingAccount);
        bank.addAccount(luaSavingsAccount);
        System.out.println();

        // Test searching for an existing account:
        System.out.println("--------Searching for an existing account:----------");
        Account foundAccount = bank.findAccountByNumber("1000040404040");
        System.out.println(foundAccount);

        // Test depositing and withdrawing:
        System.out.println("--------Depositing and withdrawing:----------");
        johnCheckingAccount.withdraw(200);
        luaSavingsAccount.deposit(800);
        System.out.println(luaSavingsAccount);
        System.out.println(johnCheckingAccount);

        // Test depositing and withdrawing an invalid amount:
        System.out.println("---------Invalid amount:--------");
        try {
            johnCheckingAccount.withdraw(10000);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            luaSavingsAccount.deposit(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test transferring money between the two accounts:
        bank.transfer(johnCheckingAccount, luaSavingsAccount, 250);
        System.out.println(bank);

        // Test applying interest:
        luaSavingsAccount.applyInterest();
        System.out.println(luaSavingsAccount);
    }
}
