class ExactlyDivisible {
    public ExactlyDivisible(int x) {
        if(x % 5 == 0) {
            System.out.println(x + " is exactly divisible by 5");
        }
        else {
            System.out.println(x + " is not divisible by 5");
        }
    }
}

public class constructor_4 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        ExactlyDivisible obj = new ExactlyDivisible(15);
    }
}