package SistemaBancario2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients = new ArrayList<>();
    private List<Account> accounts = new ArrayList<>();

    public void transfer(Account source, Account destination, double amount) {
        source.withdraw(amount);
        destination.deposit(amount);
    }

    public void addClient(Client client) {
        if (client != null) {
            clients.add(client);
        }
    }

    public void addAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public Account findAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";

        for (Client client : clients) {
            result += client + "\n";
        }

        for (Account account : accounts) {
            result += account + "\n";
        }

        return result;
    }
}
