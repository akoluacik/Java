import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 0, 0);
    }

    public Account(int id, double balance, double annualyInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualyInterestRate;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100.0) / 12.0;
    }

    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    public void deposit( double amount ) {
        this.balance += amount;
    }

    public void withdraw( double amount ) {
        this.balance -= balance;
    }

    public static void main(String[] args) {
        Account acc = new Account(1122, 20000, 4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("Balance: " + acc.getBalance() +
                            "\nCreated Date: " + acc.getDateCreated() + 
                            "\nMonthly Interest: " + acc.getMonthlyInterest());
    }

}
