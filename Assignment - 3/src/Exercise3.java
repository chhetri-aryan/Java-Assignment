import java.util.Scanner;

/*
3. Write a  class TwoArray to accept the number of rows and columns and array values,
 and display it all using control structures and array objects.
Input: Enter the no of rows and cols
2
3
Enter the no
33
Enter the no
55
Enter the no
22
Enter the no
33
Enter the no
44
Enter the no
55
Output: The given matrix
33 55 22
33 44 55
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter value for arr["+ i + "][" + j + "] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        TwoArray.displayArray(arr);
    }
}

class TwoArray {
    static void displayArray(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}


