package com.rommelrico.sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ShowPanes extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setVgap(5);
        pane.setHgap(5);

        Label myLabel = new Label("First Name");
        TextField blankTF = new TextField();
        Label miLabel = new Label("MI: ");
        pane.getChildren().addAll(myLabel, blankTF, miLabel);
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name: "), new TextField());

        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Show FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
