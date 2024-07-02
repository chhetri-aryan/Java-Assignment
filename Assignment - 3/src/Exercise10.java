/*
10. Write a class ConstThisOver and its default constructor to call the parameterized constructor to display the employee number.
Use: this keyword to call parameterized constructor.
Input: 10011
Output: 10011
 */
public class Exercise10 {
    public static void main(String[] args) {

        ConstThisOver ob = new ConstThisOver();
    }
}

class ConstThisOver{
    int employee_id;
    ConstThisOver() {
        this(10011);
    }

    public ConstThisOver(int employee_id) {
        this.employee_id = employee_id;
        System.out.println(this.employee_id);
    }
}
