class Book {
    String author, title, publisher;
    double price;

    Book(String a, String t, String p, double pr) {
        author = a; title = t; publisher = p; price = pr;
    }
}

public class Book_Details {
    public static void main(String[] args) {

        Book[] b = {
            new Book("A1","Java","P1",500),
            new Book("A2","C++","P2",700),
            new Book("A3","Python","P3",650),
            new Book("A4","DBMS","P4",800)
        };

        double max = b[0].price;
        String best = b[0].title;

        for (int i = 1; i < b.length; i++) {
            if (b[i].price > max) {
                max = b[i].price;
                best = b[i].title;
            }
        }

        System.out.println("Highest priced book: " + best);
    }
}