public class PrintName {
    String name;
    void display() {
        System.out.println("My Nmae is :" + name);
    }
    public static void main(String[] args) {
        PrintName obj = new PrintName();
        obj.name = "Sneha Mandal";
        obj.display();
    }
}
