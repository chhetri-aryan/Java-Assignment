/*
2. Write a class FactorialExample to accept the number and find the factorial of it.
Input: enter the number
6
Output: The sum of n number is=21
 */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("The sum of n number is = " + FactorialExample.factorial(n));
    }
}

class FactorialExample{
    static int factorial(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }
}