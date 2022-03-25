package edu.wpi.teamname.views;

import edu.wpi.teamname.entity.Mortgage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainController {
  @FXML private TextField amountField;
  @FXML private TextField rateField;
  @FXML private TextField yearField;
  @FXML private Button computeButton;
  private Mortgage value;

  public MainController() {
    /* Inject entity objects */
  }

  /** Set the properties of the mortgage model and calculate the monthly interest */
  @FXML
  private void calculateTotalClicked() {
      value = new Mortgage();
      try {
        value.setAmount(Double.parseDouble(amountField.getText()));
        value.setRate(Double.parseDouble(rateField.getText()));
        value.setYears(Integer.parseInt(yearField.getText()));
      } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Illegal argument type used to calculate");
      }
  }

  /**
   * Enables the calculate button if every text box is filled. Disables it if any text box is empty
   */
  @FXML
  private void validateButton() {
    if(amountField.getText().equals("") || rateField.getText().equals("") || yearField.getText().equals("")){
      computeButton.setDisable(true);
    } else {
      computeButton.setDisable(false);
    }
  }
}
