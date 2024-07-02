import java.util.Scanner;

/*
6. Write a class MultiplicationtTable to accept a number to find the table calculation of it till 10.
Input: Enter the no
3
Output:
1*3=3
2*3=6
3*3=9
4*3=12
5*3=15
6*3=18
7*3=21
8*3=24
9*3=27
10*3=30

 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        MultiplicationsTable.table(n);
    }
}

class MultiplicationsTable {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(1 + "*" + n + "=" + (n*i));
        }
    }
}
