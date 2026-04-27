
interface Bank {

    void deposit(double a);

    void withdraw(double a);
}

class Customer {

    String name;

    Customer(String n) {
        name = n;
    }
}

class Account extends Customer implements Bank {

    double bal;

    Account(String n, double b) {
        super(n);
        bal = b;
    }

    public void deposit(double a) {
        bal += a;
    }

    public void withdraw(double a) {
        if (a <= bal) {
            bal -= a;

        }
    }

    void show() {
        System.out.println(name + " Balance: " + bal);
    }
}

public class Bank_Account {

    public static void main(String[] args) {
        Account a = new Account("Annie", 10000);
        a.deposit(5000);
        a.withdraw(200);
        a.show();
    }
}
