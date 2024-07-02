/*
8. Write a class ConsCallmeth and call add() method from the constructor of the class and display the addition of two values.
Input: a = 5 b = 6
Output:  11
 */

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a's value: ");
        int a = sc.nextInt();
        System.out.println("Enter b's value" );
        int b = sc.nextInt();
        ConsCallmeth ob1 = new ConsCallmeth(a, b);
    }
}

class ConsCallmeth{
    int a,b;
    ConsCallmeth(int a, int b) {
        this.a = a;
        this.b = b;
        add();
    }

    void add() {
        System.out.println("Sum:" + (a + b));
    }
}
