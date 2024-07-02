import java.util.Scanner;

/*
9. Write a class ConsParamPass and create the constructors to accept the parameters to
find addition and subtraction of any two numbers and display it.
Input  4
            5
Output:
9
-1
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a's value: ");
        int a = sc.nextInt();
        System.out.println("Enter b's value" );
        int b = sc.nextInt();

        ConsParamPass ob1 = new ConsParamPass(a, b);
    }
}

class ConsParamPass {
    int a,b;

    public ConsParamPass(int a, int b) {
        this.a = a;
        this.b = b;

        add();
        sub();

    }

    void add() {
        System.out.println("Addition: " + (a + b));
    }
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
}
