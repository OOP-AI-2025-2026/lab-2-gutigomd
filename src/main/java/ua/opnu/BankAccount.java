package ua.opnu;

public class BankAccount {
    double balance;
    double transactionFee;

    void deposit(double amount) {
        if (amount <= 0) return;
        balance = balance + amount;
    }


    boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (total > balance) return false;

        balance = balance - total;
        return true;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        if (!withdraw(amount)) return false;
        receiver.deposit(amount);
        return true;
    }
}