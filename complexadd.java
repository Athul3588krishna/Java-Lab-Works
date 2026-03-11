import java.util.Scanner;

class Complex {
    int real, imag;

    
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class complexadd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first complex number (real imag):");
        Complex c1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.println("Enter second complex number (real imag):");
        Complex c2 = new Complex(sc.nextInt(), sc.nextInt());

       
        Complex sum = new Complex(
                c1.real + c2.real,
                c1.imag + c2.imag
        );

        System.out.print("Sum = ");
        sum.display();

        sc.close();
    }
}

