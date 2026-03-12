class grade {
    grade(int perc) {
        if(perc >= 90) {
            System.out.println("Grade A");
        }
        else if(perc >= 80) {
            System.out.println("Grade B");
        }
        else if(perc >= 70) {
            System.out.println("Grade C");
        }
        else if(perc >= 60) {
            System.out.println("Grade D");
        }
        else if(perc >= 40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        grade obj = new grade(87);
    }
}