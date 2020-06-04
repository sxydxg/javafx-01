package dxg.折叠版和标题面板;/**
 * 类说明
 *
 * @author dingxigui
 * @date 2020/4/21
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class TestAccording extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        BorderPane borderLayout = new BorderPane();
        TitledPane tp1 = new TitledPane("标题面板1", new Button("按钮1"));
        TitledPane tp2 = new TitledPane("标题面板2", new Button("按钮2"));
        TitledPane tp3 = new TitledPane("标题面板3", new Button("按钮3"));

        //这个与标题面板组合使用
        Accordion accordion = new Accordion();
        accordion.getPanes().addAll(tp1,tp2,tp3);
        borderLayout.setLeft(accordion);

        //设置那个标题面板是展开的
        accordion.setExpandedPane(tp2);

        //无效啊
        //tp1.setStyle("-fx-fill: #FFEBCD");
        //tp2.setStyle("-fx-background-color: #FFE4B5");
        //tp3.setStyle("-fx-background-color: #FFD700");

        accordion.setStyle("-fx-background-color: #FFBBFF");
        borderLayout.setStyle("-fx-background-color: #FFD39B");
        Scene scene = new Scene(borderLayout);
        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
