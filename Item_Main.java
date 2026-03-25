import java.util.*;

class Item {
    int code;
    double price;

    Item(int c, double p) {
        code = c;
        price = p;
    }
}

public class Item_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter code and price: ");
            items[i] = new Item(sc.nextInt(), sc.nextDouble());
            total += items[i].price;
        }

        System.out.println("\nCode\tPrice");
        for (Item i : items)
            System.out.println(i.code + "\t" + i.price);

        System.out.println("Total\t" + total);
        sc.close();
    }
}