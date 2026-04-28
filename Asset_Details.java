abstract class Asset {
    abstract void displayDetails();
}

class Stock extends Asset {
    void displayDetails() {
        System.out.println("Stock details displayed");
    }
}

class Bond extends Asset {
    void displayDetails() {
        System.out.println("Bond details displayed");
    }
}

class Savings extends Asset {
    void displayDetails() {
        System.out.println("Savings details displayed");
    }
}

public class Asset_Details {
    public static void main(String[] args) {

        Asset a;

        a = new Stock();   a.displayDetails();
        a = new Bond();    a.displayDetails();
        a = new Savings(); a.displayDetails();
    }
}