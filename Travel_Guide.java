import java.util.*;

abstract class AbstractProduct {
    int id;
    AbstractProduct(int i){ id=i; }
    abstract void display();
}

class Book extends AbstractProduct {
    String name;
    Book(int i,String n){ super(i); name=n; }
    void display(){ System.out.println("BOOK: "+id+" "+name); }
}

class CD extends AbstractProduct {
    String name;
    CD(int i,String n){ super(i); name=n; }
    void display(){ System.out.println("CD: "+id+" "+name); }
}

public class Travel_Guide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b = new Book(sc.nextInt(), sc.next());
        CD c = new CD(sc.nextInt(), sc.next());

        b.display();
        c.display();
    }
}