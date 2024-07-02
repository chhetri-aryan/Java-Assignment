/*
2. Create a class EmpOverriding and Employee and create a displayName()
    Create a displayName() in both the classes (overriding methods)
Make employee class is a super class of empoverriding class.
 Display the empNames of the both classes using super keyword and call the methods accordingly.
Output: Vishal
Varun
 */

public class Exercise2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vishal");
        EmpOverriding e2 = new EmpOverriding("Varun");

        e1.displayName();
        e2.displayName();
    }

}

class Employee{
    String emp_name;
    Employee(String emp_name) {
        this.emp_name = emp_name;
    }

    void displayName(){
        System.out.println("Employee: " + emp_name);
    }
}

class EmpOverriding extends Employee{
    EmpOverriding(String emp_name) {
        super(emp_name);
    }

    void displayName(){
        System.out.println("EmpOverriding: " + emp_name);
    }
}
