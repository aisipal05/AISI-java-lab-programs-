public class Sum {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.add(2, 4);
        obj.add(2, 4, 6);
    }
}
