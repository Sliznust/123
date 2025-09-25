//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ivan", "FI00 1234", 1000);
        acc.deposit(250);
        boolean ok = acc.withdraw(500);
        System.out.println(acc);
        BankAccount.setInterestRate(0.04);
        System.out.println("Rate: " + BankAccount.getInterestRate());        }
    }
