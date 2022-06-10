package com.example.utilsbermarket;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    //Ссылка на поле ввода "Write google doc link..."
    public TextField docLink;
    //Ссылка значение из поля ввода "Write google doc link..."
    public String docLinkString;

    //Ссылка на поле ввода "Number of first stroke..."
    public TextField numberOfFirstStroke;
    //Ссылка значение из поля ввода "Number of first stroke"
    public String numberOfFirstStrokeJ;

    //Ссылка на поле ввода "Number of last stroke..."
    public TextField numberOfSecondStroke;
    //Ссылка значение из поля ввода "Number of last stroke"
    public String numberOfSecondStrokeJ;
    //Ссылка на лог
    public Label logLabel;


    public void startApp(ActionEvent actionEvent) {
        logLabel.setText("");
        docLinkString = docLink.getText();
        numberOfFirstStrokeJ = numberOfFirstStroke.getText();
        numberOfSecondStrokeJ = numberOfSecondStroke.getText();

        StringBuilder stringBuilder = new StringBuilder();
            if (docLinkString.isEmpty()) {
                stringBuilder.append("Поле значения ссылки на гугл документ пустое \n");
            } else {
                stringBuilder.append("Поле значения ссылки на гугл документ не пустое \n");
            }
            if (numberOfFirstStrokeJ.isEmpty()) {
                stringBuilder.append("Поле значения первой строки пустое \n");
            } else {
                stringBuilder.append("Поле значения первой строки не пустое \n");
            }
            if (numberOfSecondStrokeJ.isEmpty()) {
                stringBuilder.append("Поле значения второй строки пустое \n");
            } else {
                stringBuilder.append("Поле значения второй строки не пустое \n");
            }
            logLabel.setText(stringBuilder.toString());
    }
}