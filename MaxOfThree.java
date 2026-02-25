import java.util.Scanner;

public class MaxOfThree {
    private int a, b, c ; 
    public MaxOfThree(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    
    public void findMax() {
        int max = a; 
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
    }

}