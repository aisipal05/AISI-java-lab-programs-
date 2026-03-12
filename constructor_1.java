class Checking {
    public Checking(int x) {
        if(x > 0) {
            System.out.println("Number is positive");
        }
        else if(x < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}

public class constructor_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Checking obj = new Checking(-5);
    }
}
