package edu.wpi.teamname;

import edu.wpi.teamname.entity.Mortgage;
import edu.wpi.teamname.views.LabelController;
import edu.wpi.teamname.views.MainController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("views/MainView.fxml"));
    Mortgage m = new Mortgage();
    loader.setControllerFactory(
        param -> {
          if (param.equals(LabelController.class)) {
            return new LabelController(m);
          } else {
            return new MainController(m);
          }
        });
    Parent root = loader.load();
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
}
