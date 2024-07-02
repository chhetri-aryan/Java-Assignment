import java.util.Scanner;
/*
4. Write a class CountArray to accept the values and count the total number of negative and positive numbers and display it separately
Input: Enter the array size
            4
           23
           -3
           -2
           2

Output: 2
2
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0 ; i < n; i++) {
            System.out.println("Enter the element number " + (i + 1));
            arr[i] = sc.nextInt();
        }

        CountArray.count(arr);

    }
}

class CountArray {
    static void count(int[] arr) {
        int positive = 0;
        int negative = 0;
        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else {
                negative++;
            }
        }

        System.out.println("There are " + positive + " positive nos and " + negative + " numbers");
    }
}
