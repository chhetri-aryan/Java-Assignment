import java.util.Scanner;

/*
4. Write a class Overload contains add() which accepts different parameters to
         explain the overloading.
Input:
       Enter the 2 integers
       2
       1
       Enter 2 float values
       22.3
       11.1
       Enter 3 double values
       33.1
       12.3
       11.1
       Enter first name
       karthik
       Enter second name
       vishal
Output:
       Sum of 2 integers =3
       Sum of two float =33.4
       Sum of double =56.50000000000001
       Concatenated string =karthikvishal
 */
public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overload ob1 = new Overload();

        System.out.println("Enter 2 integers: ");
        ob1.add(sc.nextInt(), sc.nextInt());

        System.out.println("Enter 2 float values: ");
        ob1.add(sc.nextFloat(), sc.nextFloat());

        System.out.println("Enter 3 doubles: ");
        ob1.add(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter First name and Second name: ");
        ob1.add(sc.next(), sc.next());

    }


}

class Overload{
   void add(int a, int b) {
       System.out.println("Sum of 2 integers: " + (a + b));
   }

   void add(float a, float b) {
       System.out.println("Sum of 2 floats: " + (a + b));
   }

   void add(double a, double b, double c) {
       System.out.println("Sum of 3 doubles: " + (a + b + c));
   }

    void add(String a, String b) {
        System.out.println("Concatenated String: " + a + b);
    }

}
