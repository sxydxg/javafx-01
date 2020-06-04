package dxg.css;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 类说明
 *
 * @author dingxigui
 * @date 2020/4/21
 */
public class TestCss1  extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = (BorderPane)FXMLLoader.load(getClass().getResource("hello.fxml"));
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
