import java.util.Scanner;

/*
5. Write a program to find the Armstrong number using control structures.
e.g (1*1*1)+(5*5*5*)+(3*3*3)   = 153
Input : 153
Output: It is a Armstrong number
Input: 210

Output: It is not a Armstrong number
 */
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isArmstrong(n) ? "It is a Armstrong number" : "It is not a Armstrong number");
    }

    public static boolean isArmstrong(int n) {

        int sum = 0;
        int power = String.valueOf(n).length();
        for (char i : String.valueOf(n).toCharArray()) {
            sum += (int) Math.pow(Integer.parseInt(String.valueOf(i)), power);
        }

        return sum == n;
    }
}
