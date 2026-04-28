class Counter {
    static int cnt = 0;

    // Constructor increments count whenever object is created
    Counter() {
        cnt++;
    }

    void showCount() {
        System.out.println("Number of objects created: " + cnt);
    }
}

public class CNT {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter(); // creating multiple objects

        c1.showCount(); // can use any object to display count
    }
}