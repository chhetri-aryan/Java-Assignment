import java.util.Scanner;

/*
4. Write a class SwitchCaseExample to display the color using switch .case.
Read the character from the user.

Input:  R--> Red

G--> Green

B--> Blue

Select a letter G
              Output: your favorite color is green
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character like R | G | B : ");
        char ch = sc.next().charAt(0);
        SwitchCaseExample.display(ch);
    }
}

class SwitchCaseExample{
    static void display(char c) {
        System.out.println(
                switch (c) {
                    case 'R' -> "Red";
                    case 'G' -> "Green";
                    case 'B' -> "Blue";
                    default -> "Not RGB";

                }
        );
    }
}
