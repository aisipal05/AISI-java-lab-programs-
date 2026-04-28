interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {
    double saleAmount;
    String client;

    public void processSale(double amount) {
        saleAmount = amount;
        System.out.println("Sale processed: ₹" + amount);
    }

    public void generateInvoice(String clientName, double amount) {
        client = clientName;
        System.out.println("Invoice generated for " + clientName + " of ₹" + amount);
    }

    void showSummary() {
        System.out.println("\n--- Summary ---");
        System.out.println("Client: " + client);
        System.out.println("Total Sale: ₹" + saleAmount);
        System.out.println("Commercial operations completed successfully.");
    }
}

public class Sales {
    public static void main(String[] args) {
        CommercialExecutive obj = new CommercialExecutive();

        obj.processSale(50000);
        obj.generateInvoice("ABC Pvt Ltd", 50000);
        obj.showSummary();
    }
}