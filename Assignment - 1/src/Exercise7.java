import java.util.Arrays;
import java.util.Scanner;
/*
7. Write a class AscendingArray to sort the array values using control structures
Input: Enter the array size
3
Enter the elements
12
7
34
Enter the no to perform function
1-->ascending
2-->descending
1
Ascending order is:7
Ascending order is:12
Ascending order is:34
Input: Enter the array size
3
Enter the elements
23
1
77
Enter the no to perform function
1-->ascending
2-->descending
2
Descending order is:77
Descending order is:23
Descending order is:1
 */

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element no. : " + (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no. to perform function :\n1-->ascending\n2-->descending");
        int option = sc.nextInt();

        AscendingArray.Sort(arr, option);

    }
}

class AscendingArray {

    static void Sort(int[] arr, int option) {
        Arrays.sort(arr);

        if (option == 1) {
            for (int j : arr) {
                System.out.println("Ascending order is : " + j);
            }
        } else {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println("Descending order is : " + arr[i]);
            }
        }
    }

}
