/*
3. Create overridecheck1 and  overridecheck2 and use display() in both the
classes to display number and name
overridecheck1 extends overridecheck2  and use super and this keywords
to access and assign values
output:
4
karthik
 */
public class Exercise3 {
    public static void main(String[] args) {
        overridecheck1 ob1 = new overridecheck1("Kartik", 4);
        ob1.display();

    }
}

class overridecheck2{
    String name;

    public overridecheck2(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}

class overridecheck1 extends overridecheck2{
    int number;

    public overridecheck1(String name, int number) {
        super(name);
        this.number = number;
    }

    void display() {
        System.out.println(number);
        super.display();

    }
}

