import java.util.Scanner;

/*
8. Write a class PassArray to accept an array size and get the array values and use function to display the next number of all array values.
Input: enter the number of elements
3
Enter the number
12
Enter the number
3
Enter the number
5
Output:
array elements from method
a[0]=13
a[1]=4
a[2]=6
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element no. " + (i + 1));
            arr[i] = sc.nextInt();
        }

        PassArray.display(arr);

    }
}

class PassArray{
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "]=" + arr[i]);
        }
    }

}
