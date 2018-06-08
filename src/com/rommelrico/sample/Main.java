package com.rommelrico.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.control.Label;

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
        pane.setRotate(80);
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
        // setStyle takes prescedence over the below setFill.
        // circle.setStyle("-fx-stroke: black; -fx-fill: red;");
        
        // Color class is immutable / Value types.
        Color color = new Color(0.25, 0.14, 0.333, 0.51);
        Color color2 = color.brighter();
        Color color3 = color2.darker();
        Color color4 = color3.color(0.33, 0.55, 0.879); // Overloading twice.
        Color color5 = Color.color(0.33, 0.55, 0.879, 0.654); // Correct way of doing this.
        Color color6 = Color.rgb(56, 177, 57, 0.9);
        circle.setFill(color5);
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
