package edu.wpi.teamname.views;

import edu.wpi.teamname.entity.Mortgage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LabelController implements Initializable {

  Mortgage mortgage;

  @FXML private Label totalLabel;

  public LabelController(Mortgage m) {
    mortgage = m;
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    totalLabel.textProperty().bind(Bindings.format("$%.2f", mortgage.result));
  }
}
