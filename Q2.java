class max {
    max(int x, int y, int z) {
        if(x > y) {
            System.out.println(x + " is biggest");
        }
        else if(y > z) {
            System.out.println(y + " is biggest");
        }
        else {
            System.out.println(z + " is biggest");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        max obj = new max(1, 2, 3);
    }
}