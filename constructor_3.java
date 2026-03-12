class Leap{
    public Leap(int x) {
        if(x % 4 ==0) {
            System.out.println(x + " is a leap year");
        }
        else {
            System.out.println(x + " is not a leap year");
        }
    }
}

public class constructor_3 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Leap obj = new Leap(2024);
    }
}