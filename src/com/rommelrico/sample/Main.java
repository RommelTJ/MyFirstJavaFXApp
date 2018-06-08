package com.rommelrico.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

/**
 * MyFirstJavaFXApp.
 *
 * Learning how to use JavaFX.
 *
 * JavaFX CSS Reference Guide:
 * - https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
 */
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

        // Third stage - with property binding.
        Pane pane1 = new Pane();
        Stage thirdStage = new Stage();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane1.widthProperty().divide(2));
        circle.centerYProperty().bind(pane1.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStyle("-fx-stroke: black; -fx-fill: red;");
        pane1.getChildren().add(circle);
        Scene thirdScene = new Scene(pane1, 200, 200);
        thirdStage.setTitle("Circle Demo");
        thirdStage.setScene(thirdScene);
        thirdStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
