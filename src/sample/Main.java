package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");

        // Adding a button.
        Button okButton = new Button("OK");
        Scene scene = new Scene(okButton, 200, 250);

        // Displaying the scene
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
