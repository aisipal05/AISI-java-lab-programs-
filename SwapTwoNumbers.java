import java.util.Scanner;

class Number {
    int value; 
    public Number(int value) {
        this.value = value;
    }

    
    public void swap(Number other) {
        int temp = this.value;
        this.value = other.value;
        other.value = temp;
    }
}

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        Number n1 = new Number(num1);
        Number n2 = new Number(num2);

        System.out.println("Before swapping: ");
        System.out.println("First number = " + n1.value);
        System.out.println("Second number = " + n2.value);

    
        n1.swap(n2);

        System.out.println("After swapping: ");
        System.out.println("First number = " + n1.value);
        System.out.println("Second number = " + n2.value);

        scanner.close();
    }
}
