package edu.calc.javafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Calculadora extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../../../Resources/calc1.fxml"))));
        stage.setTitle("Calculator");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("../../../Resources/images/icon.png")));
        stage.show();

    }
}
