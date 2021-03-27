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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author yoooo
 */
public class FXMLoginController implements Initializable {

    @FXML
    private JFXTextField txtFUserName;
    @FXML
    private JFXTextField txtFPassWord;
    @FXML
    private Text txtValidate;
    @FXML
    private JFXButton btnLogin;
    @FXML
    private JFXButton btnRegister;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnRegisterAction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLRegister.fxml"));

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void btnLoginAction(ActionEvent event) throws SQLException, IOException {
        Database db = new Database();
        boolean check;
        check = db.login(txtFUserName.getText(), txtFPassWord.getText());
        if (check) {
            Parent root = FXMLLoader.load(getClass().getResource("FrameFXML.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            txtValidate.setText("Wrong Username or Password");
        }
             
//        Parent root = FXMLLoader.load(getClass().getResource("FrameFXML.fxml"));
//
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
    }

}
