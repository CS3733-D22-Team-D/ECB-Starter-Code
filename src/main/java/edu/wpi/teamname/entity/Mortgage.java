package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
    private double amount;
    private double rate;
    private int years;

    public SimpleDoubleProperty monthly_payment = new SimpleDoubleProperty();

    public Mortgage(double amount, double rate, int years){
        this.amount = amount;
        this.rate = rate;
        this.years = years;
    }
    public Mortgage(){
        this.amount = 0;
        this.rate = 0;
        this.years = 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setYears(int years) {
        this.years = years;
    }
    public void calculateMortgage() {
        monthly_payment.set(amount * (rate * years) / (years - 1));
    }



}
