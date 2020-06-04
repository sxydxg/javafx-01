package dxg.菜单条菜单项;

import com.sun.javafx.scene.control.skin.MenuBarSkin;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *   菜单条，菜单项目
 *
 * @author dingxigui
 * @date 2020/4/15
 */
public class TestMenuBar extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //菜单条
        MenuBar menuBar = new MenuBar();
        //菜单
        Menu menu = new Menu("菜单1");
        menuBar.getMenus().add(menu);
        Group group = new Group();
        group.getChildren().add(menuBar);
        //菜单项
        MenuItem item1 = new MenuItem("选项a");
        MenuItem item2 = new MenuItem("选项b");
        menu.getItems().addAll(item1,item2);
        menu.setStyle("-fx-background-color:yellow");

        //菜单2
        Menu menu2 = new Menu("菜单2");
        menuBar.getMenus().add(menu2);
        //菜单项2
        MenuItem item3 = new MenuItem("选项c");
        MenuItem item4 = new MenuItem("选项d");
        menu2.getItems().addAll(item3,item4);
        menu2.setStyle("-fx-background-color:red");


        menuBar.setPadding(new Insets(10,10,10,10));
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        menuBar.setStyle("-fx-background-color: #A8FF24");
        scene.setFill(Color.BEIGE);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        //使用菜单条充满整个宽度
        menuBar.setPrefWidth(primaryStage.getWidth());
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();
    }
}
