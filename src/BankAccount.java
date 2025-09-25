public class BankAccount {
    private String owner;
    private String iban;
    private double balance;
    private static double interestRate = 0.03; // 3% годовых для всех счетов

    public BankAccount(String owner, String iban) {
        this(owner, iban, 0.0);
    }
    public BankAccount(String owner, String iban, double initial) {
        this.owner = owner;
        this.iban = iban;
        deposit(initial);
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) return false;
        balance -= amount;
        return true;
    }

    public double getBalance() { return balance; }
    public String getOwner() { return owner; }
    public String getIban()  { return iban; }

    public static void setInterestRate(double rate) {
        if (rate < 0 || rate > 0.2) throw new IllegalArgumentException("0..0.2");
        interestRate = rate;
    }
    public static double getInterestRate() { return interestRate; }

    @Override
    public String toString() {
        return "BankAccount{owner='%s', iban='%s', balance=%.2f}"
                .formatted(owner, iban, balance);
    }
}