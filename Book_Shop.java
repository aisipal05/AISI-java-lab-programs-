class Book {
    String author, title, publisher;
    double price;

    Book(String a, String t, String p, double pr) {
        author = a; title = t; publisher = p; price = pr;
    }
}

public class Book_Shop {
    public static void main(String[] args) {

        Book[] b = {
            new Book("A1","Java","P1",500),
            new Book("A2","C++","P2",600),
            new Book("A3","Python","P3",750),
            new Book("A4","DS","P4",450),
            new Book("A5","DBMS","P5",800),
            new Book("A6","OS","P6",550),
            new Book("A7","CN","P7",900),
            new Book("A8","AI","P8",650),
            new Book("A9","ML","P9",700),
            new Book("A10","Web","P10",400)
        };

        double max = b[0].price;
        String best = b[0].title;

        for (int i = 1; i < b.length; i++) {
            if (b[i].price > max) {
                max = b[i].price;
                best = b[i].title;
            }
        }

        System.out.println("Highest priced book: " + best + " (" + max + ")");
    }
}