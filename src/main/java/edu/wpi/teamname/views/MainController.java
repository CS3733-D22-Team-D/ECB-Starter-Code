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
  Mortgage mortgage;

  public MainController(Mortgage m) {
    /* Inject entity objects */
    mortgage = m;
  }

  /** Set the properties of the mortgage model and calculate the montly interest */
  @FXML
  private void calculateTotalClicked() {
    mortgage.amount = Integer.parseInt(amountField.getText());
    mortgage.rate = Float.parseFloat(rateField.getText());
    mortgage.years = Integer.parseInt(yearField.getText());
    mortgage.calculatePayment();
  }

  /**
   * Enables the calculate button if every text box is filled. Disables it if any text box is empty
   */
  @FXML
  private void validateButton() {
    if (!amountField.getText().isBlank()
        & !yearField.getText().isBlank()
        & !rateField.getText().isBlank()) {
      computeButton.setDisable(false);
    }
  }
}
