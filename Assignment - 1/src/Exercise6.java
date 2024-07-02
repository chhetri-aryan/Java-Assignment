import java.util.Scanner;

/*
6. Write a class CountOdd -  to count the odd and even numbers using control structures and arrays
Input:  Enter the array size

3
12
14
17

Output: No of even number is : 2

   No of odd number is : 1
 */
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element no. : " + (i+1));
            arr[i] = sc.nextInt();
        }
        CountOdd.count(arr);
    }
}

class CountOdd{
    static void count(int[] arr) {
        int odd = 0;

        for (int i : arr) {
            if (i % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Number of Odd numbers is : " + odd);
        System.out.println("Number of Even numbers is : " + (arr.length - odd));

    }
}
