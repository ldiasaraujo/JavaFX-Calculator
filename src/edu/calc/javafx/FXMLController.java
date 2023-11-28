package edu.calc.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLController implements Initializable {

    @FXML
    private TextField textField;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textField.setText("0");

    }
}
