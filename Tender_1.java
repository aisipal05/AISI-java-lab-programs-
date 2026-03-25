import java.util.*;

class Tender {
    double cost; String name;
    Tender(double c, String n){ cost=c; name=n; }
}

class Tender_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

        for(int i=0;i<5;i++){
            System.out.print("Enter cost and company: ");
            t[i]=new Tender(sc.nextDouble(), sc.next());
        }

        Tender min = t[0];
        for(int i=1;i<5;i++)
            if(t[i].cost < min.cost) min = t[i];

        System.out.println("Minimum cost company: " + min.name);
    }
}