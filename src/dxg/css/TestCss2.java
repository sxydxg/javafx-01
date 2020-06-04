package dxg.css;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * 类说明
 *
 * @author dingxigui
 * @date 2020/4/21
 */
public class TestCss2 extends Application{


    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(new Menu("菜单1"));
        borderPane.setTop(menuBar);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(600);
        primaryStage.setHeight(700);
        primaryStage.show();
    }
}
