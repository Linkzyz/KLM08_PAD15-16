/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectagiledevelopment;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Admin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    private Stage primaryStage;
    private BorderPane mainLayout;
    
    @FXML private Text actiontarget;
    
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        actiontarget.setText("Sign in button pressed");
     Parent home_page_parent = FXMLLoader.load(getClass().getResource("MedewerkerMain.FXML"));
     Scene home_page_scene = new Scene(home_page_parent);
     Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
     app_stage.hide();
     app_stage.setScene(home_page_scene);
     app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
