package edu.wpi.teamname.entity;

public class Mortgage {
    private double amount;
    private double rate;
    private int years;

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

    public double getAmount() {
        return amount;
    }

    public double getRate() {
        return rate;
    }

    public int getYears() {
        return years;
    }
}
