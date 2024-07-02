import java.util.Scanner;

/*
7. Write a class OddExample to accept a number to find whether the number is Odd or Even
Input: Enter the no
4
Output: The given no is even
Input: Enter the no
3
Output: The given no is odd
 */
public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no: ");
        int num = sc.nextInt();
        OddExample.OddOrEven(num);
    }

}

class OddExample{
    public static void OddOrEven(int n) {
        System.out.println(n % 2 == 0 ? "The given no is Even" : "The given no is Odd");
    }
}
