/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.ArrayList;

/**
 *
 * @author PhungDuyen
 */
public class Account {

    protected String accountNumber;
    protected double balance;
    protected ArrayList<Transaction> transactions;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            transactions.add(new Transaction("Deposit", amount));
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add(new Transaction("Withdraw", amount));
        } else {
            System.out.println("Số dư trong tài khoản không đủ!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double calculateInterest(){
        return 0;
    }

    public void showTransactions(){

        System.out.println("\n----- Transaction History -----");
        System.out.printf("%-5s %-12s %-10s %-20s\n","ID","Type","Amount","Date");

        for(Transaction t : transactions){
            System.out.printf("%-5d %-12s %-10.2f %-20s\n",
                    t.getId(),
                    t.getType(),
                    t.getAmount(),
                    t.getDate());
        }
    }
}
