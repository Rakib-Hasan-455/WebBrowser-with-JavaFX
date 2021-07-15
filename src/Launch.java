import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Launch extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource("WebUI.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.setTitle("My Web Browser");
        stage.show();

    }


}