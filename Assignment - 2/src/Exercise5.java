import java.util.Scanner;

/*
5. Write a class MaxThree to accept three numbers and find the maximum in it
Input: Enter the value of ‘a’
3
Enter the value of ‘b’
5
Enter the value of ‘c’
1
Output:
b is maximum
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of 'a': ");
        int a = sc.nextInt();
        System.out.println("Enter the value of 'b': ");
        int b = sc.nextInt();
        System.out.println("Enter the value of 'c': ");
        int c = sc.nextInt();

        String s = MaxThree.maxOfThree(a,b,c);

        System.out.println(s.equals("None") ? "Two or more is same!" : s + " is Maximum");

    }
}

class MaxThree{
    static String maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return "a";
        } else if(b > a && b > c) {
            return "b";
        } else if(c > a && c > b) {
            return "c";
        }
        else return "None";
    }
}
