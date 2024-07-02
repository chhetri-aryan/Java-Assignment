/*
7. Write a class DefaultAccount to display the account details already assigned using default constructor
Input: Account number : 101111
            Name : Vimal
            Address: Panchkula
Output: Account number : 101111
               Name : Vimal
               Address: Panchkula
 */
public class Exercise7 {
    public static void main(String[] args) {
        DefaultAccount account = new DefaultAccount(101111, "Vimal", "Panchkula");
    }
}

class DefaultAccount{
    int account_number;
    String name;
    String addresses;

     DefaultAccount(int account_number, String name, String addresses) {
        this.account_number = account_number;
        this.name = name;
        this.addresses = addresses;
        display();
    }

    void display() {
        System.out.println("Account Number: " + account_number + "\n" + "Name: " + name + "\nAddress: " + addresses);
    }
}