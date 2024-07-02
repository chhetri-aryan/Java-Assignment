/*
1. Write a class ReverseNumber to accept the number and find the reverse of it.
Input: Enter the number
456
Output:
654
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(ReverseNumber.reverse(num));


    }
}

class ReverseNumber{
    static int reverse(int n) {
        int num = 0;

        while (n > 0) {
            num *= 10;
            num += n % 10;
            n /= 10;
        }

        return num;
    }
}
