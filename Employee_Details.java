import java.util.*;

class Employee {
    int no;
    String name, dept;
    double basic, gross;

    Employee(int n, String nm, String d, double b) {
        no = n; name = nm; dept = d; basic = b;
        gross = basic + 0.5 * basic + 0.2 * basic;
    }

    void show() {
        System.out.println(no + " " + name + " " + dept + " " + gross);
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++)
            e[i] = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());

        Employee max = e[0];

        for (int i = 1; i < n; i++)
            if (e[i].gross > max.gross) max = e[i];

        System.out.println("Highest Gross Salary:");
        max.show();

        sc.close();
    }
}