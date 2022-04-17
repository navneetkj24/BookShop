import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
   

    static Stage stage1 = new Stage();
    static Stage stage2 = new Stage();
    static Stage stage3 = new Stage();

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Parent root1 = FXMLLoader.load(getClass().getResource("BuyBook.fxml"));
            Parent root2 = FXMLLoader.load(getClass().getResource("myBooks.fxml"));
            Parent root3 = FXMLLoader.load(getClass().getResource("pay.fxml"));

            Scene scene1 = new Scene(root1);
            Scene scene2 = new Scene(root2);
            Scene scene3 = new Scene(root3);
            stage1.setScene(scene1);
            stage2.setScene(scene2);
            stage3.setScene(scene3);
            showStage1();


        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public static void showStage1() {
        stage1.show();
        stage2.hide();
        stage3.hide();
        stage1.setTitle("Buy Books");
    }

    public static void showStage2() {
        stage2.show();
        stage1.hide();
        stage3.hide();
        stage2.setTitle("My Books");
    }

    public static void showStage3() {
        stage3.show();
        stage2.hide();
        stage1.hide();
        stage3.setTitle("Payment");
    }
    public static void main(String[] args) {
        launch(args);
    }
}
