/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author PhungDuyen
 */
public class CheckingAccount extends Account{
    private double fee;
    public CheckingAccount(String accountNumber, double balance, double fee){
        super(accountNumber, balance);
        this.fee = fee;
    }
    @Override
    public void withdraw(double amount){
        double total = amount + fee;
        if(total <= balance){
            balance -= total;
            transactions.add(new Transaction("Withdrw(fee)", total));
        }else{
            System.out.println("Tài khoản không đủ tiền (bao gồm phí)");
        }
    }
}
