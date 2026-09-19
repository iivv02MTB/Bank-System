package SistemaBancario2;

public class Client {
    private String name;
    private String idNumber;
    private String email;

    public Client(String name, String idNumber, String email) {
        this.name = name;
        this.idNumber = idNumber;
        this.email = email;
    }

    // Getters:
    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nID Number: " + idNumber +
                "\nEmail: " + email;
    }
}
