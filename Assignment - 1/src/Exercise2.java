/*
2. Write a class StaticDemo consists of ‘ a’ and ‘b’ static integer variables  (a= 42 and b = 32) and
static method  find() - which displays ‘b’ value. Create a class StaticByName to call the method and
access the static variable ‘a’ to display the values of a and b
Input : static int a  = 42;

             static int b = 32;

output:  a= 42 b = 32
 */

public class Exercise2 {
    public static void main(String[] args) {
        StaticbyName obj1 = new StaticbyName();

        obj1.printA();
        obj1.PrintB();
    }
}

class StaticDemo {
    static int a = 42, b = 32;

    static void find() {
        System.out.println("b = " +b);
    }

}

class StaticbyName {

    void PrintB() {
        StaticDemo.find();
    }

    void printA() {
        System.out.println("a = " + StaticDemo.a);
    }
}