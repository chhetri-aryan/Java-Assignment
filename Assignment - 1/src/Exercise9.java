import java.util.Scanner;

/*
9. Write a class CallByObject to accept two integer variable values and swap it
Input: Enter the values of a and b

23
12

Output: after swapping  a = 12

               B = 23
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter value of b : ");
        int b = sc.nextInt();

        CallByObject.swap(a, b);

    }
}

class CallByObject{
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
