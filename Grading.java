import java.util.*;

class Grader {
    int score;

    // Constructor
    Grader(int s) {
        score = s;
    }

    // Method to return letter grade
    char letterGrade() {
        if (score >= 90) return 'O';
        else if (score >= 80) return 'E';
        else if (score >= 70) return 'A';
        else if (score >= 60) return 'B';
        else if (score >= 50) return 'C';
        else return 'F';
    }
}

public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;

        // Input with validation
        do {
            System.out.print("Enter score (0-100): ");
            score = sc.nextInt();
        } while (score < 0 || score > 100);

        // Create object and display grade
        Grader g = new Grader(score);
        System.out.println("Grade: " + g.letterGrade());

        sc.close();
    }
}