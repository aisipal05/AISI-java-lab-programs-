abstract class Accounts {
    double balance;
    long accountNumber;
    String name, address;

    Accounts(double b, long acc, String n, String a) {
        balance = b; accountNumber = acc; name = n; address = a;
    }

    abstract void withdraw(double amt);
    abstract void deposit(double amt);

    void display() {
        System.out.println(accountNumber + " Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    double roi;

    SavingsAccount(double b, long acc, String n, String a, double r) {
        super(b, acc, n, a);
        roi = r;
    }

    void withdraw(double amt) {
        if (balance >= amt) balance -= amt;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void calculateAmount() {
        balance += balance * roi / 100;
    }
}

public class BankAccount {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(
            1000, 12345, "Amit", "Kolkata", 5
        );

        s.deposit(500);
        s.withdraw(200);
        s.calculateAmount();
        s.display();
    }
}