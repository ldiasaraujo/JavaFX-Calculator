package edu.calc.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class FXMLController implements Initializable {

    @FXML
    private Label textField, tf2;

    @FXML
    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, equals, sum, decrease, divide, multiply;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        textField.setText("0");
    }

    @FXML
    private void numberClicked (ActionEvent event){
        String prevalue = textField.getText();
        String number = ((Labeled)event.getSource()).getText();
        if(prevalue.equals("0")){
            textField.setText(number);
        }else {
            textField.setText(textField.getText() + number);
        }
    }

    @FXML
    private void operation (ActionEvent event){
        String opt = ((Labeled)event.getSource()).getText();
        textField.setText(textField.getText() + opt);
    }

    @FXML
    private void calculate (ActionEvent event){
        tf2.setText(textField.getText() + " =");
        if(textField.getText().contains("+")){

        }

    }

}
