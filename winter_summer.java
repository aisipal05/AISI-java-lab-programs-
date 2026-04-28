interface Mango {
    void showSeason();
}

class Winter implements Mango {
    public void showSeason() {
        System.out.println("Mangoes are not available in Winter.");
    }
}

class Summer implements Mango {
    public void showSeason() {
        System.out.println("Mangoes are available in Summer!");
    }
}

public class winter_summer {
    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        w.showSeason();
        s.showSeason();
    }
}