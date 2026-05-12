import java.util.Scanner;

// Student class
class Student {

    int rollNo;
    String name;
    int academicMark;

    // Method to read student details
    void getStudentData(Scanner sc) {

        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Academic Mark:");
        academicMark = sc.nextInt();
    }
}

// Sports class
class Sports {

    int sportsMark;

    // Method to read sports mark
    void getSportsData(Scanner sc) {

        System.out.println("Enter Sports Mark:");
        sportsMark = sc.nextInt();
    }
}

// Result class
class Result extends Student {

    Sports s = new Sports();

    // Method to display result
    void display() {

        int total = academicMark + s.sportsMark;

        System.out.println("\n----- RESULT -----");
        System.out.println("Roll Number   : " + rollNo);
        System.out.println("Student Name  : " + name);
        System.out.println("Academic Mark : " + academicMark);
        System.out.println("Sports Mark   : " + s.sportsMark);
        System.out.println("Total Mark    : " + total);
    }
}

// Main class
public class marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        r.getStudentData(sc);

        r.s.getSportsData(sc);

        r.display();

        sc.close();
    }
}