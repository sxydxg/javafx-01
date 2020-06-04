package dxg.选项卡面板;/**
 *
 *  选项卡面板
 * @author dingxigui
 * @date 2020/4/21
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class TestTabPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        AnchorPane anchorPane = new AnchorPane();
        TabPane tabPane = new TabPane();
        //创建多个选项卡
        Tab tab1 = new Tab("选项卡1");
        Tab tab2 = new Tab("选项卡2",new Button("bt2"));
        Tab tab3 = new Tab("选项卡3",new Button("bt3"));


        tabPane.getTabs().addAll(tab1,tab2,tab3);
        tab1.setContent(new Rectangle(200,200, Color.LIGHTSTEELBLUE));

        //把选项卡1设置为不可关闭
        tab1.setClosable(false);
        //设置关闭选项卡的事件
        //tab1.setOnClosed(null);
        tab1.setTooltip(new Tooltip("一个提示！"));

        tabPane.setPrefHeight(400);
        tabPane.setPrefWidth(600);
        tabPane.setStyle("-fx-background-color: white");

        AnchorPane.setLeftAnchor(tabPane,100.0);
        AnchorPane.setTopAnchor(tabPane,100.0);

        anchorPane.getChildren().add(tabPane);
        Scene scene = new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
