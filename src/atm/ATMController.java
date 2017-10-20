/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Ditya RA
 */
public class ATMController implements Initializable {
    String pin = "";
    String PIN ="1234";
    int kesempatan=3;
    int tmp;

    @FXML
    private JFXPasswordField editPin;
    @FXML
    private JFXButton nomer2;
    @FXML
    private JFXButton nomer3;
    @FXML
    private JFXButton nomer4;
    @FXML
    private JFXButton nomer7;
    @FXML
    private JFXButton nomer9;
    @FXML
    private JFXButton c;
    @FXML
    private JFXButton nomer0;
    @FXML
    private JFXButton ok;
    @FXML
    private JFXButton nomer1;
    @FXML
    private JFXButton nomer5;
    @FXML
    private JFXButton nomer8;
    @FXML
    private JFXButton nomer6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void tekan2(ActionEvent event) {
        pin +="2";
        editPin.setText(pin);
    }

    @FXML
    private void tekan3(ActionEvent event) {
        pin +="3";
        editPin.setText(pin);
    }

    @FXML
    private void tekan4(ActionEvent event) {
        pin +="4";
        editPin.setText(pin);
    }

    @FXML
    private void tekan7(ActionEvent event) {
        pin +="7";
        editPin.setText(pin);
    }

    @FXML
    private void tekan9(ActionEvent event) {
        pin +="9";
        editPin.setText(pin);
    }

    @FXML
    private void action(ActionEvent event) {
        if(pin.equals(PIN)){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
                Scene scene = new Scene (fxmlLoader.load(),830,450);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.setTitle("MenuAwal");
                stage.show();
            }
            catch (IOException e){
                System.out.println("Failed to create new Window."+e);
            }
        }
        else {
            kesempatan -=1;
            JOptionPane.showMessageDialog(null,"PIN Salah \n Tersisa "+kesempatan+" kesempatan Lagi !");
            editPin.setText("");
            pin="";
            if(kesempatan ==0){
                System.exit(0);
            }
        }
    }

    @FXML
    private void tekan0(ActionEvent event) {
        pin +="0";
        editPin.setText(pin);
    }

    @FXML
    private void action2(ActionEvent event) {
        pin +="";
        editPin.setText(pin);
    }

    @FXML
    private void tekan1(ActionEvent event) {
        pin +="1";
        editPin.setText(pin);
    }

    @FXML
    private void tekan5(ActionEvent event) {
        pin +="5";
        editPin.setText(pin);
    }

    @FXML
    private void tekan8(ActionEvent event) {
        pin +="8";
        editPin.setText(pin);
    }

    @FXML
    private void tekan6(ActionEvent event) {
        pin +="6";
        editPin.setText(pin);
    }
    
}
