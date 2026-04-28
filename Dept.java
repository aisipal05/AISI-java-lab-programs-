import java.util.*;

interface Department {
    void getDeptData(String n, String h);
    void printDeptData();
}

class Hostel {
    String hName, hLoc;
    int rooms;

    void getHostelData(String n, String l, int r) {
        hName = n; hLoc = l; rooms = r;
    }

    void printHostelData() {
        System.out.println("Hostel: " + hName + ", " + hLoc + ", Rooms: " + rooms);
    }
}

class Student extends Hostel implements Department {
    String name, regd, sub, deptName, deptHead;
    double marks;

    void getData(String n, String r, String s, double m) {
        name = n; regd = r; sub = s; marks = m;
    }

    public void getDeptData(String n, String h) {
        deptName = n; deptHead = h;
    }

    public void printDeptData() {
        System.out.println("Dept: " + deptName + ", Head: " + deptHead);
    }

    void printData() {
        System.out.println("\n" + name + " | " + regd + " | " + sub + " | " + marks);
        printDeptData();
        printHostelData();
    }
}

public class Dept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        int ch;

        do {
            System.out.println("\n1.Admit 2.Migrate 3.Display 4.Exit");
            ch = sc.nextInt(); sc.nextLine();

            if (ch == 1) {
                Student s = new Student();

                System.out.print("Name, Regd, Subject, Marks: ");
                s.getData(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
                sc.nextLine();

                System.out.print("Dept & Head: ");
                s.getDeptData(sc.nextLine(), sc.nextLine());

                System.out.print("Hostel, Location, Rooms: ");
                s.getHostelData(sc.nextLine(), sc.nextLine(), sc.nextInt());
                sc.nextLine();

                list.add(s);
            }

            else if (ch == 2) {
                System.out.print("Enter Regd No: ");
                String r = sc.nextLine();
                for (Student s : list) {
                    if (s.regd.equals(r)) {
                        System.out.print("New Hostel, Location, Rooms: ");
                        s.getHostelData(sc.nextLine(), sc.nextLine(), sc.nextInt());
                        sc.nextLine();
                        break;
                    }
                }
            }

            else if (ch == 3) {
                for (Student s : list) s.printData();
            }

        } while (ch != 4);

        sc.close();
    }
}