package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("Stack Pane"));
        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Stack Pane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Second Stage
        Stage newStage = new Stage();
        newStage.setTitle("My Second Stage");
        Button secondButton = new Button("2nd Button");
        Scene secondScene = new Scene(secondButton, 200, 250);
        newStage.setScene(secondScene);
        newStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
