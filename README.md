# Bank System

Practice project in Java to work with inheritance, polymorphism, and exception handling.

## Estructura

- `Cliente.java` — stores the account holder’s data.
- `Cuenta.java` — base class with balance, deposit/withdraw operations.
- `CuentaCorriente.java` — inherits from Cuenta, allows overdraft up to a limit.
- `CuentaAhorro.java` — inherits from Cuenta, allows applying interest.
- `Banco.java` — manages clients and accounts, supports transfers.
- `Main.java` — system tests.

## Applied Concepts

- Inheritance (extends, super)
- Polymorphism (retirar() overridden in CuentaCorriente)
- Exceptions (throw, try/catch, IllegalArgumentException)
- Encapsulation (protected for controlled access from subclasses)
- Collections (List, iteration with for-each)

## Next Steps

- Connect to a database (SQL/JDBC)
