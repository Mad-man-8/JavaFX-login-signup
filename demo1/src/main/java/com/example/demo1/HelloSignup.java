package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloSignup extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));

        ScrollPane scrollPane = new ScrollPane(fxmlLoader.load());
        Scene scene = new Scene(scrollPane, 450,550 );

        stage.setTitle("Signup");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


 /*
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class HelloSignup extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load content from FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("signup.fxml"));
        ScrollPane scrollPane = new ScrollPane(fxmlLoader.load());

        // Set up ScrollPane properties
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);

        // Create a Scene with the ScrollPane
        Scene scene = new Scene(scrollPane, 350, 500);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scrollable JavaFX App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
*/

