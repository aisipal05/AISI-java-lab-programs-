public class Shape {
    void area(int a) {
        System.out.println("Area of square: " + (a * a));
    }

    void area(int l, int b) {
        System.out.println("Area of rectangle: " + (l * b));
    }

    public static void main(String[] args) {
        Shape obj = new Shape();
        obj.area(4);
        obj.area(2, 3);
    }
}
