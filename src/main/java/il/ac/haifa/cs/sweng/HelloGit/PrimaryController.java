package il.ac.haifa.cs.sweng.HelloGit;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class PrimaryController {

    @FXML
    void showAboutDialog(ActionEvent event) throws IOException {
    	Stage dialogStage = new Stage();
    	Parent parent = App.loadFXML("about_dialog");
    	if (parent == null) {
    		Alert alert = new Alert(AlertType.ERROR, "FXML loading error.");
    		alert.show();
    	}
    	Scene scene = new Scene(parent);
    	dialogStage.setScene(scene);
    	dialogStage.show();
    }
	@FXML
	private Label namesLB;
	@FXML
	private Label namesLB1;

	private  int x=4;

	@FXML
	private Button visibleBtn;

	@FXML
	void visibleNames(ActionEvent event) {
     namesLB.setVisible(true);
	 namesLB1.setVisible(true);
	}
    // Pay attention to this example - You don't have to specify parameters on event handlers.
    @FXML
    void closeApp() {
    	System.exit(0);
    }

}
