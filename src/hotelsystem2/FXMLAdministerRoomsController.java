/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem2;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author yoooo
 */
public class FXMLAdministerRoomsController implements Initializable {

    @FXML
    private JFXTextField txtFRoomNumber;
    @FXML
    private JFXTextField txtFRoomRate;
    @FXML
    private JFXButton btnCreateNewRoom;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnCreateNewRoomAction(ActionEvent event) throws SQLException {
        Database db = new Database();
        
        String roomNumber = txtFRoomNumber.getText();
        double roomRate = Double.parseDouble(txtFRoomRate.getText());
        
        db.createRoom(roomNumber, roomRate);
    }
    
}
