/*
11. Write a class EmpConsOver a display name and number using display() and assign the values using constructors.
 Use objects to call the methods and pass the parameters to the constructors accordingly.
Output: Employee name:Akil
Employee no:101
Employee name:Arun
Employee no:102
Employee name:Rajesh
Employee no:103
Employee name:Vishal
Employee no:104
 */
public class Exercise11 {
    public static void main(String[] args) {

        EmpConsOver emp1 = new EmpConsOver("Akil", 101);
        EmpConsOver emp2 = new EmpConsOver("Arun", 102);
        EmpConsOver emp3 = new EmpConsOver("Rajesh", 103);
        EmpConsOver emp4 = new EmpConsOver("Vishal", 104);

        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
    }
}

class EmpConsOver{
    String name;
    int number;

    public EmpConsOver(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void display() {
        System.out.println("Employee no: " + number + "\nEmployee Name: " + name );
    }
}
