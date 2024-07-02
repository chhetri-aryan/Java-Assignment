/*
5. Write a class VowelCount to accept a character and display it vowel or not.
Input: Enter a character
             b
 Output: It is not a vowel
Input: Enter a character
             e
 Output: It is  a vowel
 */

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = sc.next().charAt(0);

        System.out.println(VowelCount.isVowel(c) ? "It is a vowel" : "It is a consonant");

    }
}

class VowelCount{
    static boolean isVowel(char c) {
        c = String.valueOf(c).toLowerCase().charAt(0);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}


