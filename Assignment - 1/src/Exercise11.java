import java.util.Scanner;

/*
11. Write a class FloydExample1 to display the output as below using control structures
Enter the value of Floyd triangle
3
Output:
 1 1
 2 2 2
 3 3 3 3
 */
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n = sc.nextInt();
        FloydExample1.floydTriangle(n);

    }
}

class FloydExample1 {
    static void floydTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i + 1; j++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}

