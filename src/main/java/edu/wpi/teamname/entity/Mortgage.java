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
}
