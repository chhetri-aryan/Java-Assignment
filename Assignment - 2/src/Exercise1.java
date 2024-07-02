import java.util.Scanner;

/*
1. Write a program FloydExample3 to display the output as below using control structures

* * * *
 * * *
 * *
 *

 */
public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        FloydExample2.pattern(n);
    }
}

class FloydExample2{
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i -  1; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
