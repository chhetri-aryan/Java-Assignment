import java.util.Scanner;
/*
1. Write a class CallByValue to accept two integers from user and swap the values – use call by value
Input : enter 2 numbers
11
3
    Output: Before calling method x=11y=3

          From method x=12 y =4

          After calling method x=11 y=3
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for x : ");
        int x = sc.nextInt();

        System.out.println("Enter value for y : ");
        int y = sc.nextInt();

        CallByValue obj1 = new CallByValue(x, y);

        System.out.println("Before calling method: x = "+ obj1.x + ", y = "+ obj1.y);

        obj1.swap(x, y);

        System.out.println("After calling method: x = "+ obj1.x + ", y = "+ obj1.y);

        sc.close();
    }
}
class CallByValue {
    int x,y;

    CallByValue(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void swap(int x, int y) {
        x++;
        y++;
        System.out.println("From method: x = "+ x + ", y = "+ y);
    }
}
