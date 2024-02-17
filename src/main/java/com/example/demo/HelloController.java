package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Spinner spin1;

    @FXML
    private TextArea jTextArea1;

    @FXML
    private Button button1;

    public void clickedButton(ActionEvent actionEvent) {
        jTextArea1.appendText("Click!");
    }

    public void clickedSpinner(MouseEvent mouseEvent) {
        jTextArea1.setText(String.valueOf(spin1.valueProperty().getValue()));
    }
}