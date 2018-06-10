package com.rommelrico.sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowPanes extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // FlowPane setup
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setVgap(5);
        pane.setHgap(5);

        // Adding labels and Text fields to the FlowPane.
        Label myLabel = new Label("First Name");
        TextField blankTF = new TextField();
        Label miLabel = new Label("MI: ");
        pane.getChildren().addAll(myLabel, blankTF, miLabel);
        TextField tfMi = new TextField();
        tfMi.setPrefColumnCount(1);
        pane.getChildren().addAll(tfMi, new Label("Last Name: "), new TextField());

        // Displaying the FlowPane.
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("Show FlowPane");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Grid Pane Setup
        GridPane pane1 = new GridPane();
        Stage secondaryStage = new Stage();
        pane1.setAlignment(Pos.CENTER);
        pane1.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane1.setHgap(5.5);
        pane1.setVgap(5.5);

        // Adding labels and textfields to the GridPane.
        pane1.add(new Label("First Name: "), 0, 0);
        pane1.add(new TextField(), 1, 0);
        pane1.add(new Label("MI: "), 0, 1);
        pane1.add(new TextField(), 1, 1);
        pane1.add(new Label("Last Name: "), 0, 2);
        pane1.add(new TextField(), 1, 2);
        Button buttonAdd = new Button("Add Name");
        pane1.add(buttonAdd, 1,3);
        GridPane.setHalignment(buttonAdd, HPos.RIGHT);

        // Displaying the GridPane.
        Scene secondaryScene = new Scene(pane1);
        secondaryStage.setTitle("Show GridPane");
        secondaryStage.setScene(secondaryScene);
        secondaryStage.show();

        // BorderPane Setup
        Stage thirdStage = new Stage();
        BorderPane pane2 = new BorderPane();
        pane2.setTop(new CustomPane("Top"));
        pane2.setRight(new CustomPane("Right"));
        pane2.setBottom(new CustomPane("Bottom"));
        pane2.setLeft(new CustomPane("Left"));
        pane2.setCenter(new CustomPane("Center"));

        // Displaying the BorderPane.
        Scene thirdScene = new Scene(pane2);
        thirdStage.setTitle("Show BorderPane");
        thirdStage.setScene(thirdScene);
        thirdStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
