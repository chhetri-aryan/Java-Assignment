import java.util.Scanner;

/*
10. Write a class FibonacciExample to accept a number and find its Fibonacci series value using do .. while
Input: Enter the no n
4
Output : 0
1
1
2
3
 */
public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. n: ");
        int num = sc.nextInt();
        FibonacciExample.findFibonacci(num);

    }
}

class FibonacciExample {
    static void findFibonacci(int num) {
        int a = 0;
        int b = 1;

       do{
           System.out.println(a);
           int c = a + b;
           a = b;
           b = c;

       } while(num-- > 0);
    }
}
