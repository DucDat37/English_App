package com.example.englishapp_login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class MyController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton, registerButton;

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Xử lý đăng nhập
        System.out.println("Username: " + username + ", Password: " + password);
    }
    @FXML
    private void handleMouseEntered(MouseEvent event) {
        loginButton.setStyle("-fx-background-color: lightblue;");
    }

    @FXML
    private void handleMouseExited(MouseEvent event) {
        loginButton.setStyle("-fx-background-color: red");
    }

    @FXML
    protected void handleCreateAccount() {
        try {

            Parent root = FXMLLoader.load(getClass().getResource("sign_up.fxml"));


            Stage signUpStage = new Stage();
            signUpStage.setTitle("Đăng ký");


            Scene scene = new Scene(root);
            signUpStage.setScene(scene);


            signUpStage.initModality(Modality.APPLICATION_MODAL);


            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            double screenWidth = screenBounds.getWidth();
            double screenHeight = screenBounds.getHeight();


            signUpStage.setWidth(400);
            signUpStage.setHeight(500);


            signUpStage.setX((screenWidth - signUpStage.getWidth()) / 2);
            signUpStage.setY((screenHeight - signUpStage.getHeight()) / 2);

            signUpStage.setResizable(false);
            signUpStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void handleRegisterButton(javafx.event.ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}


