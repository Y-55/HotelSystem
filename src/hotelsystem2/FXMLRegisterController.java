/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem2;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yoooo
 */
public class FXMLRegisterController implements Initializable {

    @FXML
    private Text txtUserNameErr;
    @FXML
    private JFXTextField txtFUserName;
    @FXML
    private Text txtPassWordErr;
    @FXML
    private JFXTextField txtFPassWord;
    @FXML
    private Text txtPhoneNumberErr;
    @FXML
    private JFXTextField txtFPhoneNumber;
    @FXML
    private Text txtEmailErr;
    @FXML
    private JFXTextField txtFEmail;
    @FXML
    private Text txtAddressErr;
    @FXML
    private JFXTextField txtFAddress;
    @FXML
    private JFXButton btnRegister;
    @FXML
    private JFXButton btnLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnRegisterAction(ActionEvent event) throws IOException, SQLException {
        Database db = new Database();       

        String name = txtFUserName.getText();
        String pass = txtFPassWord.getText();
        String email = txtFEmail.getText();
        String phone = txtFPhoneNumber.getText();
        String address = txtFAddress.getText();
        
        db.insertUser(name, pass, email, phone, address);
    }

    @FXML
    private void btnLoginAction(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("FXMLogin.fxml"));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
