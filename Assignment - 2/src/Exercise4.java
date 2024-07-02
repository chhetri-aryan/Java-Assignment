import java.util.Scanner;

/*
4. Write a class LoopExample2 to display the output as below using control structures
Input: Enter the no of terms
3
Output:
sum of first 3 numbers=6
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n = sc.nextInt();

        LoopExample2.loop(n);
    }
}

class LoopExample2{
    static void loop(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i + 1;
        }

        System.out.println("Sum of first " + n + " number = " + sum);
    }
}
