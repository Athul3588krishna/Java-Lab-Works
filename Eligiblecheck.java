import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    void checkEligibility() {
        if (marks >= 40)
            System.out.println(name + " is Eligible for Exam");
        else
            System.out.println(name + " is NOT Eligible for Exam");
    }
}

public class Eligiblecheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

       
        System.out.println("Enter details of Student 1:");
         System.out.println("Enter name:");

        s1.name = sc.next();
	 System.out.println("Enter roll no:");

        s1.rollNo = sc.nextInt();
	 System.out.println("Enter mark:");

        s1.marks = sc.nextInt();

       
        System.out.println("Enter details of Student 2:");
        System.out.println("Enter name:");

        s2.name = sc.next();
	 System.out.println("Enter roll no:");

        s2.rollNo = sc.nextInt();
	 System.out.println("Enter marks:");

        s2.marks = sc.nextInt();

  
        System.out.println("Enter details of Student 3:");
	 System.out.println("Enter name:");

        s3.name = sc.next();
	 System.out.println("Enter roll no:");

        s3.rollNo = sc.nextInt();
	 System.out.println("Enter mark:");

        s3.marks = sc.nextInt();

    
        s1.checkEligibility();
        s2.checkEligibility();
        s3.checkEligibility();
    }
}

