import java.util.Scanner;

class Area {

    void area(double r) {
        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }

    void area(double l, double b) {
        double result = l * b;
        System.out.println("Area of Rectangle = " + result);
    }

    void area(int b, int h) {
        double result = 0.5 * b * h;
        System.out.println("Area of Triangle = " + result);
    }
}

public class ShapeArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area obj = new Area();

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        obj.area(r);

        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        obj.area(l, b);

        System.out.println("Enter base and height of triangle:");
        int base = sc.nextInt();
        int height = sc.nextInt();
        obj.area(base, height);

        sc.close();
    }
}