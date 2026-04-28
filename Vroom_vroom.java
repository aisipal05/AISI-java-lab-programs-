abstract class MotorVehicle {
    String modelName;
    int modelNumber;
    double modelPrice;

    MotorVehicle(String n, int num, double p) {
        modelName = n;
        modelNumber = num;
        modelPrice = p;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate;

    Car(String n, int num, double p, double d) {
        super(n, num, p);
        discountRate = d;
    }

    double discount() {
        return modelPrice * discountRate / 100;
    }

    void display() {
        System.out.println(modelName + " " + modelNumber +
                " Price: " + modelPrice +
                " Discount: " + discountRate +
                " Final: " + (modelPrice - discount()));
    }
}

public class Vroom_vroom {
    public static void main(String[] args) {
        Car c = new Car("BMW", 101, 500000, 10);
        c.display();
    }
}