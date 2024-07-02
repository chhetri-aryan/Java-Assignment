/*
9.  Write a class PrimeFinder to accept the number and find it is a prime number or not? Using control structures
Input: enter the number
4
Output: The given no is not a prime
Input: enter the number
17
Output: The given no is prime
 */

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(PrimeFinder.isPrime(num) ? "The number is prime" : "The number is not prime");
    }
}

class PrimeFinder {
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
