package edu.wpi.teamname.entity;

import javafx.beans.property.SimpleDoubleProperty;

public class Mortgage {
  public int amount;
  public float rate;
  public int years;
  public SimpleDoubleProperty sdp;

  public double calculatePayment() {
    return amount * (1 + Math.pow(rate, years)) / (years * 12);
  }
}
