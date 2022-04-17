import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class myBooksController {

    @FXML
    private Button btnAddMoreBooks1;

    @FXML
    private Button btnMakePayment;

    @FXML
    private Button btnMyBooks;
    
    @FXML
    private ListView<?> listBooks;

    @FXML
    private Button btnRemoveBook;

    @FXML
    void addMoreBooks(ActionEvent event) {
    App.showStage1();
    }

    @FXML
    void myBooks(ActionEvent event) {

    }

    @FXML
    void payment(ActionEvent event) {
        App.showStage3();
    }

    @FXML
    void removeBook(ActionEvent event) {
        App.showStage1();
    }

}
