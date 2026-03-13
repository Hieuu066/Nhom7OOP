/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TRUONG GIOI
 */
public class Transaction {
    String account;
    String type;
    double money;
    String time;

    public Transaction(String account, String type, double money, String time) {
        this.account = account;
        this.type = type;
        this.money = money;
        this.time = time;
    }
}
