import java.util.Scanner;

// Interface
interface Calculate {

    double calculate(double quantity, double unitPrice);
}

// Product class implementing interface
class Product implements Calculate {

    int productId;
    String name;
    double quantity;
    double unitPrice;
    double total;

    // Method to input product details
    void getData(Scanner sc) {

        System.out.println("Enter Product ID:");
        productId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Product Name:");
        name = sc.nextLine();

        System.out.println("Enter Quantity:");
        quantity = sc.nextDouble();

        System.out.println("Enter Unit Price:");
        unitPrice = sc.nextDouble();

        total = calculate(quantity, unitPrice);
    }

    // Interface method
    public double calculate(double quantity, double unitPrice) {

        return quantity * unitPrice;
    }

    // Display product details
    void display() {

        System.out.println(productId + "\t" + name + "\t" + quantity +
                "\t" + unitPrice + "\t" + total);
    }
}

// Main class
public class Bill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        Product p2 = new Product();

        double netAmount;

        System.out.println("Enter Details of Product 1");
        p1.getData(sc);

        System.out.println("\nEnter Details of Product 2");
        p2.getData(sc);

        netAmount = p1.total + p2.total;

        // Bill Format
        System.out.println("\n---------------------------------------------");
        System.out.println("\t\tBILL");
        System.out.println("---------------------------------------------");

        System.out.println("Order No : 101");
        System.out.println("Date     : 12/05/2026");

        System.out.println("\nProductID\tName\tQty\tPrice\tTotal");

        p1.display();
        p2.display();

        System.out.println("---------------------------------------------");
        System.out.println("\t\tNet Amount : " + netAmount);
        System.out.println("---------------------------------------------");

        sc.close();
    }
}