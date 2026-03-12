class Demo {
    Demo() {
        System.out.println("Default Constructor");
    }
    
    Demo(int a) {
        System.out.println("Parameterized Constructor:n " + a);
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
    }
}