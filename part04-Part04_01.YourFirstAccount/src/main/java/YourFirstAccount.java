
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account myAccount = new Account("LCH", 100.0);
        
        myAccount.deposit(20);
        
        System.out.println(myAccount.toString());
    }
}
