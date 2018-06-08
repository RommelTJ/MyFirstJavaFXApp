package com.rommelrico.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
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

        // Third stage
        Stage thirdStage = new Stage();
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.LAVENDER);
        circle.setFill(Color.RED);
        Pane pane1 = new Pane();
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
