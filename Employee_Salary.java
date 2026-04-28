class Employee {
    private String name, department;
    private double salary;
    static String companyName = "ABC Company"; // static member

    // Constructor
    Employee(String n, String d, double s) {
        name = n;
        department = d;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name +
                ", Dept: " + department +
                ", Salary: " + salary +
                ", Company: " + companyName);
    }
}

public class Employee_Salary {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit", "HR", 30000);
        Employee e2 = new Employee("Riya", "IT", 40000);
        Employee e3 = new Employee("John", "Finance", 35000);
        Employee e4 = new Employee("Sara", "Marketing", 32000);
        Employee e5 = new Employee("Raj", "Sales", 28000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
    }
}