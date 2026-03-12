class rev {
    rev(int x) {
        int num = x, r, s = 0;
        while(num > 0) {
            r = num % 10;
            s = s * 10 + r;
            num/=10;
        }
        System.out.println("Before reversing " + x);
        System.out.println("After reversing " + s);
    }
}

public class constructor_5 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        rev obj = new rev(123);
    }
}