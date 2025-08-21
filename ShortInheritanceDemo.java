import java.util.Scanner;

// Base class
class Person {
    String name;
    void getName(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }
    void showName() {
        System.out.println("Name: " + name);
    }
}

// Child class (Single Inheritance)
class Student extends Person {
    int roll;
    void getRoll(Scanner sc) {
        getName(sc); // parent method
        System.out.print("Enter roll number: ");
        roll = sc.nextInt();
        sc.nextLine();
    }
    void showRoll() {
        showName();
        System.out.println("Roll No: " + roll);
    }
}

// Grandchild class (Multilevel Inheritance)
class CollegeStudent extends Student {
    String college;
    void getCollege(Scanner sc) {
        getRoll(sc); // parent method
        System.out.print("Enter college: ");
        college = sc.nextLine();
    }
    void showCollege() {
        showRoll();
        System.out.println("College: " + college);
    }
}

public class ShortInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single Inheritance
        System.out.println("--- Student Info ---");
        Student s = new Student();
        s.getRoll(sc);
        s.showRoll();

        System.out.println("-----");

        // Multilevel Inheritance
        System.out.println("--- College Student Info ---");
        CollegeStudent cs = new CollegeStudent();
        cs.getCollege(sc);
        cs.showCollege();

        sc.close();
    }
}
