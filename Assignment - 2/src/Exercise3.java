import java.util.Scanner;

/*
3. Write a class LoopExample1 to display the output as below using control structures
Enter the no of terms
3
Output:
i=1
i=2
i=3
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of terms");
        int n = sc.nextInt();

        LoopExample1.loop(n);
    }
}

class LoopExample1{
    static void loop(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("i="+(i + 1));
        }
    }
}
