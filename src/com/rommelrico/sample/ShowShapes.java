package com.rommelrico.sample;

import com.sun.javafx.css.FontFace;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowShapes extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5));
        Text myText = new Text(20, 20, "Programming is fun");
        myText.setFont(Font.font("Courier", FontWeight.BOLD, FontPosture.ITALIC, 15));
        pane.getChildren().add(myText);

        Text myText2 = new Text(60, 60, "Programming is fun\n Display Text");
        pane.getChildren().add(myText2);

        Text myText3 = new Text(10, 100, "Programming is fun\n Display Text");
        myText3.setFill(Color.RED);
        myText3.setUnderline(true);
        myText3.setStrikethrough(true);
        pane.getChildren().add(myText3);

        // Displaying the scene
        Scene myScene = new Scene(pane);
        primaryStage.setTitle("Show Shapes");
        primaryStage.setScene(myScene);
        primaryStage.show();

        // Working with the Line class
        Stage stage2 = new Stage();
        Scene scene2 = new Scene(new LinePane(), 200, 200);
        stage2.setTitle("Show Line");
        stage2.setScene(scene2);
        stage2.show();

        // New Pane for rectangles.
        Pane pane2 = new Pane();

        // Black and white Rectangle
        Rectangle r1 = new Rectangle(25, 50, 60, 30);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.WHITE);
        pane.getChildren().add(new Text(10, 27, "r1"));
        pane.getChildren().add(r1);
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
