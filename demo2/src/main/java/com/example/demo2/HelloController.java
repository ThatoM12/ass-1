package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class HelloController {
    @FXML
    private Rectangle monday;
    @FXML
    private Rectangle tuesday;
    @FXML
    private Rectangle friday;

    @FXML
    private Rectangle parent;
    @FXML
    private Label label;


    @FXML
    private void lesotho(ActionEvent event)
    {
        monday.setFill(Color.BLUE);
        tuesday.setFill(Color.WHITE);
        friday.setFill(Color.GREEN);
        monday.setStroke(Color.WHITE);
        tuesday.setStroke(Color.WHITE);
        friday.setStroke(Color.WHITE);
        label.setText("Lesotho");
    }

    @FXML
    private void egypt()
    {
        monday.setFill(Color.RED);
        tuesday.setFill(Color.WHITE);
        friday.setFill(Color.BLACK);
        monday.setStroke(Color.WHITE);
        tuesday.setStroke(Color.WHITE);
        friday.setStroke(Color.WHITE);
        label.setText("Egypt");
    }

    @FXML
    private void reset(ActionEvent event)
    {
        Color color=Color.WHITE;
        monday.setFill(color);
        tuesday.setFill(color);
        friday.setFill(color);
        tuesday.setStroke(color);
        label.setText("you just resetted");
    }

    @FXML
    private void botswana(ActionEvent event)
    {
        monday.setFill(Color.LIGHTSKYBLUE);
        tuesday.setFill(Color.BLACK);
        friday.setFill(Color.LIGHTBLUE);
        monday.setStroke(Color.WHITE);
        tuesday.setStroke(Color.WHITE);
        friday.setStroke(Color.WHITE);
        tuesday.setStrokeWidth(3);
        label.setText("Botswana");
    }

    @FXML
    private void swaziland(ActionEvent event)
    {
        monday.setFill(Color.LIGHTSKYBLUE);
        tuesday.setFill(Color.RED);
        friday.setFill(Color.LIGHTBLUE);
        monday.setStroke(Color.WHITE);
        tuesday.setStroke(Color.YELLOW);
        friday.setStroke(Color.WHITE);
        tuesday.setStrokeWidth(3);
        label.setText("Swaziland");
    }

    @FXML
    private void india(ActionEvent event)
    {
        monday.setFill(Color.YELLOW);
        tuesday.setFill(Color.WHITE);
        friday.setFill(Color.GREEN);
        tuesday.setStroke(Color.WHITE);
        label.setText("India");
        parent.setStrokeWidth(2);
    }

    @FXML
    private void russia(ActionEvent event) {
        label.setText("Country flag complex");
        Color color=Color.WHITE;
        monday.setFill(color);
        tuesday.setFill(color);
        friday.setFill(color);
        tuesday.setStroke(color);
    }

    @FXML
    private void china(ActionEvent event) {
        label.setText("Country flag complex");
        Color color=Color.WHITE;
        monday.setFill(color);
        tuesday.setFill(color);
        friday.setFill(color);
        tuesday.setStroke(color);
    }

}