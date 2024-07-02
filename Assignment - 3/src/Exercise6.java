/*
6. Write  a AccountTest  and Account classes. 
Two Constructors of Account  class  accepts integer  accountNumber 1 parameter) and integer account number  and string
customerName parameters.  Call those constructors from AccountTest class and display the values.
Note: create display() to display values.
Input: Account (101)
            Account(101, “Vishal”);
Output:
       101
       101
    Vishal
 */

public class Exercise6 {
    public static void main(String[] args) {
        AccountTest.CallingAccount();
    }
}

class AccountTest{
    static void CallingAccount() {
        Account ac1 = new Account(101);
        Account ac2 = new Account(101, "Vishal");

        ac1.display();
        ac2.display();
    }
}

class Account{
    int accountNumber;
    String customerName = "";
    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    Account(int accountNumber, String customerName){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
    }

    void display() {
        if (customerName.isEmpty()) {
            System.out.println(accountNumber);
        } else {
            System.out.println(accountNumber + "\n" + customerName);
        }
    }
}
