class Swap {
    public Swap(int x, int y) {
        int a = x, b = y;
        System.out.println("Before swapping:\na = " + a + "\nb = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:\na = " + a + "\nb = " + b);
    }
}

public class constructor_2 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Swap obj = new Swap(10, 20);
    }
}