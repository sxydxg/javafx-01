package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TestBorderPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("上");
        Button bt2 = new Button("下");
        Button bt3 = new Button("左");
        Button bt4 = new Button("右");
        Button bt5 = new Button("中");

        BorderPane root = new BorderPane();
        //不要使用这几个方法，如果使用会抛出异常
        //root.getChildren().addAll(bt1,bt2,bt3,bt4,bt5);

        root.setTop(bt1);
        root.setBottom(bt2);
        root.setLeft(bt3);
        root.setRight(bt4);
        root.setCenter(bt5);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("边界布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
