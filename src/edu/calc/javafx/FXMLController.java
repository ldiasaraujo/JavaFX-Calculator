package edu.calc.javafx;

import edu.calc.javafx.enginecalc.CalcEngine;
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
    private void zerar (ActionEvent event){
        textField.setText("0");
    }

    @FXML
    private void btnEqual() {
        double result;
        String expression = textField.getText();
        String[] parts = expression.split("[\\+-/x]");
        String num1 = parts[0];
        String num2 = parts[1];
        double d1 = Double.parseDouble(num1);
        double d2 = Double.parseDouble(num2);
        if (expression.contains("+")) {
            result = d1 + d2;
            textField.setText("" + result);
        } else if (expression.contains("-")) {
            result = d1 - d2;
            textField.setText("" + result);
        } else if (expression.contains("x")) {
            result = d1 * d2;
            textField.setText("" + result);
        } else if (expression.contains("/")) {
            result = d1 / d2;
            textField.setText("" + result);
        }
        for (String part : parts){
            System.out.println(part);
        }
    }

}
