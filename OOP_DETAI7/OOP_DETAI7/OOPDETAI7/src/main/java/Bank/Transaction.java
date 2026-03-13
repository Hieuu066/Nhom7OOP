/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

import java.util.Date;

/**
 *
 * @author PhungDuyen
 */
public class Transaction {

    private static int counter = 1;
    private int id;
    private String type;
    private double amount;
    private Date date;

    public Transaction(String type, double amount) {
        this.id = counter++;
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public int getId() { return id; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public Date getDate() { return date; }
}
