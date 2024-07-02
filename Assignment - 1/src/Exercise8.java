/*
8. Write a class MethodReturn which contains instance method displaySalary(double salary, double hra)
to calculate the salary of Vishal.
Input parameters : displaySalary(20000,2000)

Output: Vishal salary is 22000.0
 */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Enter the Hra: ");
        double hra = sc.nextDouble();

        MethodReturn.displaySalary(salary, hra);
    }
}

class MethodReturn{
    static void displaySalary(double salary, double hra) {
        System.out.println("Vishal salary is " + (salary + hra));
    }
}
