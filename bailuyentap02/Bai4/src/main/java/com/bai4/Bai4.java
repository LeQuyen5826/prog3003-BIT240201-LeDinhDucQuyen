package com.bai4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Bai4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chuyển đổi Nhiệt độ Celsius sang Fahrenheit");

        Label inputLabel = new Label("Nhập nhiệt độ Celsius:");
        TextField celsiusField = new TextField();
        celsiusField.setPromptText("Nhập số...");
        Button convertButton = new Button("Chuyển đổi");
        Label resultLabel = new Label("Kết quả: ");

        convertButton.setOnAction(event -> {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = celsius * 9 / 5 + 32;
                resultLabel.setText("Kết quả: " + fahrenheit + " °F");
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Lỗi");
                alert.setContentText("Vui lòng nhập số hợp lệ!");
                alert.showAndWait();
            }
        });

        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(inputLabel, celsiusField, convertButton, resultLabel);

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}