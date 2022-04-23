package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.err.println("Depositing amount cannot be zero or negative");
            return;
        }
        balance += amount;
    }
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount <= 0){
            System.err.println("Withdrawing amount cannot be negative or zero");
            return;
        }
        balance -= amount;
    }



}
