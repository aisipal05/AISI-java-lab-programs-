class fibo {
    public fibo(int x) {
        int u = 0, v = 1, r;
        System.out.println("Fibonacci Series: ");
        System.out.print(u + "\t" + v);
        for(int i = 0; i < x-2; i++) {
            r = u + v;
            u = v;
            v = r;
            System.out.print("\t" + v);
        }
    }
}

public class fibo_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        fibo obj = new fibo(10);
    }
}