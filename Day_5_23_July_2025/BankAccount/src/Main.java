//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Disha Bardiya", 1000.0);

        account.checkBalance();         // ₹1000
        account.deposit(500.0);         // ₹1500
        account.withdraw(300.0);        // ₹1200
        account.checkBalance();

    }
}