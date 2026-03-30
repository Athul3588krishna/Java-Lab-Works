import java.util.Scanner;

class Publisher{
    String pname;
}

class Book extends Publisher{
    String bname;
    double price;
}

class Literature extends Book{

    void display(){
        System.out.println("Category: Literature");
        System.out.println("Book Name: " + bname);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }

}

class Fiction extends Book{

    void display(){
        System.out.println("Category: Fiction");
        System.out.println("Book Name: " + bname);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }

}

public class Main{
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    Literature l = new Literature();
    Fiction f = new Fiction();

    System.out.println("Enter Literature Book Name:");
    l.bname = sc.nextLine();

    System.out.println("Enter Publisher:");
    l.pname = sc.nextLine();

    System.out.println("Enter Price:");
    l.price = sc.nextDouble();

    sc.nextLine();

    System.out.println("Enter Fiction Book Name:");
    f.bname = sc.nextLine();

    System.out.println("Enter Publisher:");
    f.pname = sc.nextLine();

    System.out.println("Enter Price:");
    f.price = sc.nextDouble();

    System.out.println("\nBook Details");

    l.display();
    f.display();

}
}