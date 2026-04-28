class TollBooth {
    int totalCars = 0, noPay = 0;
    int cash = 0;

    void carPass(boolean paid) {
        totalCars++;
        if (paid) cash += 50;
        else noPay++;
    }

    void show() {
        System.out.println("Total cars passed: " + totalCars);
        System.out.println("Cars not paid: " + noPay);
        System.out.println("Cash collected: Rs. " + cash);
    }
}

public class Toll {
    public static void main(String[] args) {

        TollBooth t = new TollBooth();

        t.carPass(true);
        t.carPass(false);
        t.carPass(true);
        t.carPass(true);
        t.carPass(false);

        t.show();
    }
}