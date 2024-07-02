import java.util.Scanner;

/*
2. Write a class FloydExample3 to display the output as below using control structures
enter the value of Floyd triangle
4
Output:

0
01
010
0101

 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        FloydExample3.pattern(n);

    }
}

class FloydExample3{
    static void pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
