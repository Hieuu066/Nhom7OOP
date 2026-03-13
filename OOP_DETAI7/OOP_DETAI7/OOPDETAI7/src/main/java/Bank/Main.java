/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Scanner;

/**
 *
 * @author PhungDuyen
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== CREATE ACCOUNT =====");

        System.out.print("Enter account number: ");
        String accNumber = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        System.out.println("Choose account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");
        int type = sc.nextInt();

        Account account;

        if(type == 1){
            System.out.print("Enter interest rate: ");
            double rate = sc.nextDouble();
            account = new SavingsAccount(accNumber, balance, rate);
        }
        else{
            System.out.print("Enter transaction fee: ");
            double fee = sc.nextDouble();
            account = new CheckingAccount(accNumber, balance, fee);
        }

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("\nCurrent balance: " + account.getBalance());

        if(account instanceof SavingsAccount){
            System.out.println("Interest: " + account.calculateInterest());
        }

        account.showTransactions();
    }
}
