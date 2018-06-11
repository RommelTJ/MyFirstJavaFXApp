package com.rommelrico.sample;

import com.sun.javafx.css.FontFace;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
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
        pane2.getChildren().add(new Text(10, 27, "r1"));
        pane2.getChildren().add(r1);

        // Rectangle 2
        Rectangle r2 = new Rectangle(25, 50, 60, 30);
        pane2.getChildren().add(new Text(10, 67, "r2"));
        pane2.getChildren().add(r2);

        // Rounded Rectangle
        Rectangle r3 = new Rectangle(25, 90, 60, 30);
        r3.setArcWidth(15);
        r3.setArcHeight(25);
        pane2.getChildren().add(new Text(10, 107, "r3"));
        pane2.getChildren().add(r3);

        // Overlapping Rectangles.
        for (int i = 0; i < 4; i++) {
            Rectangle rect = new Rectangle(100, 50, 100, 30);
            rect.setRotate(i * 360 / 8);
            rect.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            rect.setFill(Color.WHITE);
            pane2.getChildren().add(rect);
        }

        // Displaying the rectangles.
        Stage stage3 = new Stage();
        Scene scene3 = new Scene(pane2, 250, 150);
        stage3.setTitle("Show Rectangles");
        stage3.setScene(scene3);
        stage3.show();

        // New Pane for Circle and Ellipse
        Pane pane3 = new Pane();
        for (int i = 0; i< 16; i++) {
            Ellipse e1 = new Ellipse(150, 100, 100, 50);
            e1.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e1.setFill(Color.WHITE);
            e1.setRotate(i * 180 / 16);
            pane3.getChildren().add(e1);
        }

        // Display the circles
        Stage stage4 = new Stage();
        Scene scene4 = new Scene(pane3, 300, 200);
        stage4.setTitle("Show Ellipse");
        stage4.setScene(scene4);
        stage4.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
