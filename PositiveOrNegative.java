import java.util.Scanner;

public class PositiveOrNegative {
    private int number; 
    public PositiveOrNegative(int number) {
        this.number = number;
    }

    public void checkNumber() {
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        PositiveOrNegative obj = new PositiveOrNegative(num);
        obj.checkNumber();
        scanner.close();
    }
}