package com.rommelrico.sample;

import com.sun.javafx.css.FontFace;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
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
        
    }

    public static void main(String[] args) {
        launch(args);
    }

}
