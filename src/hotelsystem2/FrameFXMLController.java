/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelsystem2;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javax.swing.text.html.CSS;

/**
 * FXML Controller class
 *
 * @author yoooo
 */
public class FrameFXMLController implements Initializable {

    @FXML
    private JFXButton btnMenuReservation;
    @FXML
    private JFXButton btnMenuCheckIn;
    @FXML
    private JFXButton btnMenuCheckOut;
    @FXML
    private JFXButton btnMenuHotelPayment;
    @FXML
    private JFXButton btnMenuRoomService;
    @FXML
    private JFXButton btnMenuCustomerRecord;
    @FXML
    private JFXButton btnMenuAdministerRooms;
    @FXML
    private JFXButton btnMenuAdministerUser;
    @FXML
    private JFXButton btnMenuAdministerMeals;
    @FXML
    private JFXButton btnMenuReports;
    @FXML
    private BorderPane borderPanePrime;
    @FXML
    private VBox VBoxMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadUI("FXMLReservation");
        changeMenuColors(btnMenuReservation);
        // TODO
    }

    @FXML
    private void btnMenuReservationAction(ActionEvent event) {
        loadUI("FXMLReservation");
        changeMenuColors(btnMenuReservation);

    }

    @FXML
    private void btnMenuCheckInAction(ActionEvent event) {
        changeMenuColors(btnMenuCheckIn);
        loadUI("FXMLCheckIn");
    }

    @FXML
    private void btnMenuCheckOutAction(ActionEvent event) {
        changeMenuColors(btnMenuCheckOut);
        loadUI("FXMLCheckOut");
    }

    @FXML
    private void btnMenuHotelPaymentAction(ActionEvent event) {
        changeMenuColors(btnMenuHotelPayment);
        loadUI("FXMLHotelPayment");
    }

    @FXML
    private void btnMenuRoomServiceAction(ActionEvent event) {
        changeMenuColors(btnMenuRoomService);
        loadUI("FXMLRoomServiceRestaurant");
    }

    @FXML
    private void btnMenuCustomerRecordAction(ActionEvent event) {
        changeMenuColors(btnMenuCustomerRecord);
        loadUI("FXMLCustomerRecord");
    }

    @FXML
    private void btnMenuAdministerRoomsAction(ActionEvent event) {
        changeMenuColors(btnMenuAdministerRooms);
        loadUI("FXMLAdministerRooms");
    }

    @FXML
    private void btnMenuAdministerUserAction(ActionEvent event) {
        changeMenuColors(btnMenuAdministerUser);
        loadUI("FXMLAdministerUser");
    }

    @FXML
    private void btnMenuAdministerMealsAction(ActionEvent event) {
        changeMenuColors(btnMenuAdministerMeals);
        loadUI("FXMLAdministerMeals");
    }

    @FXML
    private void btnMenuReportsAction(ActionEvent event) {
        changeMenuColors(btnMenuReports);
        loadUI("FXMLReports");
    }

    private void loadUI(String ui) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(ui + ".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(FrameFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
        borderPanePrime.setCenter(root);
    }

    private void changeMenuColors(JFXButton button) {
        btnMenuAdministerMeals.getStyleClass().remove("current");
        btnMenuAdministerRooms.getStyleClass().remove("current");
        btnMenuAdministerUser.getStyleClass().remove("current");
        btnMenuCheckIn.getStyleClass().remove("current");
        btnMenuCheckOut.getStyleClass().remove("current");
        btnMenuCustomerRecord.getStyleClass().remove("current");
        btnMenuHotelPayment.getStyleClass().remove("current");
        btnMenuReports.getStyleClass().remove("current");
        btnMenuReservation.getStyleClass().remove("current");
        btnMenuRoomService.getStyleClass().remove("current");
        button.getStyleClass().add("current"); 
    }
}
