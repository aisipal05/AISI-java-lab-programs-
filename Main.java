public class Main {
    static long fact(int x) {
        long s = 1;
        for(int i = 1; i <= x; i++) {
            s *= i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Factorial is: " + fact(5));
    }
}