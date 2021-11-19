package s04scanner;

import java.util.Scanner;

public class ScannerInTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = scan.nextLine();

        // Numerical input
        int age = scan.nextInt();
        double salary = scan.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
