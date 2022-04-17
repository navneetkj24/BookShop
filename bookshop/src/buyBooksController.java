import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class buyBooksController {

    @FXML
    private Button btnNext;

    @FXML
    private Button btnSearchBook;

    @FXML
    private Button btnSelectBook;

    @FXML
    private TextField txtBookAuthor;

    @FXML
    private TextField txtBookID;

    @FXML
    private TextField txtBookName;

    @FXML
    private TextField txtBookPrice;

    @FXML
    void next(ActionEvent event) {
        App.showStage2();
    }

    @FXML
    void searchBook(ActionEvent event) {

    }

    @FXML
    void selectBook(ActionEvent event) {

    }

}

