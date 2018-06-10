package com.rommelrico.sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
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

        // Working with HBox and VBox Setup
        Stage fourthStage = new Stage();
        BorderPane borderPane = new BorderPane();

        // Configuring the BorderPane.
        borderPane.setTop(getHBox());
        borderPane.setLeft(getVBox());

        // Displaying the Hbox and VBox.
        Scene fourthScene = new Scene(borderPane);
        fourthStage.setTitle("Show HBox and VBox");
        fourthStage.setScene(fourthScene);
        fourthStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15));
        hBox.setStyle("-fx-background-color: gold;");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Image americanFlag = new Image("https://upload.wikimedia.org/wikipedia/en/thumb/a/a4/Flag_of_the_United_States.svg/1235px-Flag_of_the_United_States.svg.png");
        ImageView imageView = new ImageView(americanFlag);
        hBox.getChildren().add(imageView);
        return hBox;
    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses: "));
        Label[] courses = { new Label("CS 151"), new Label("CS 152"), new Label("CS 155"), new Label("CS 250") };
        for (Label course: courses) {
            vBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }

}
