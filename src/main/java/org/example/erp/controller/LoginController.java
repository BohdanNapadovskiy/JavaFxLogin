package org.example.erp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.example.erp.dao.UserDao;
import org.example.erp.service.UserService;


public class LoginController {
    private UserService userService;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField userNameTextField;

    @FXML
    private TextField passwordPasswordField;

    public LoginController() {
        this.userService = UserService.create(UserDao.create());
    }


    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) this.cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginButtonAction(ActionEvent event) {

        String userName = this.userNameTextField.getText();
        String password = this.passwordPasswordField.getText();
        if (userService.existByUserNameAndPassword(userName, password)) {
            int a=1;
        }


    }

}
