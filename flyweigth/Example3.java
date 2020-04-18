package flyweigth;

import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class Example3 extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  enum BorderFactory {
    INSTANCE;

    private Border shareableRedBorder = new Border(
        new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT));

    public Border getBorder() {
      return shareableRedBorder;
    }
  }

  public void start(Stage primaryStage) {
    try {

      FlowPane pane = new FlowPane();
      pane.setBorder(BorderFactory.INSTANCE.getBorder());

      pane.setVgap(6);
      pane.setHgap(5);
      pane.setPrefWrapLength(2);
      pane.getChildren().add(new Button("Start"));
      pane.getChildren().add(new Button("Stop"));
      Button reset = new Button("Reset");
      reset.setBorder(BorderFactory.INSTANCE.getBorder());
      pane.getChildren().add(reset);

      pane.getChildren().add(new TextField("Samat kehykset = " + (pane.getBorder() == reset.getBorder())));

      Scene scene = new Scene(pane, 400, 400);
      primaryStage.setScene(scene);

      primaryStage.show();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
