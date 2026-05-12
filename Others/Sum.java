import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}

