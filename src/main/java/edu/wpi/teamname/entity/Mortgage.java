package edu.wpi.teamname.entity;

public class Mortgage {
  public int amount;
  public float rate;
  public int years;
  public double result;

  public void calculatePayment() {
    double monthlyRate = rate / 12;
    int n = years * 12;
    double compound = Math.pow(1 + monthlyRate, n);

    result = (amount * (monthlyRate * compound) / (compound - 1));
  }
}
