

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class payController {

    @FXML
    private Button btnPay;

    @FXML
    private Button btnRemoveBook;
    @FXML
    private Label label;
    
    @FXML
    private ListView<?> listArea;

    @FXML
    void pay(ActionEvent event) {
        label.setText("Payment Successfull");
    }

    @FXML
    void removeBook(ActionEvent event) {
        App.showStage2();
    }

}
