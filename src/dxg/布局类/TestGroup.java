package dxg.布局类;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;




public class TestGroup extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //你可以观察到bt3把bt2给盖住了，这是因为group是一个没有样式的布局类

        Button bt1 = new Button("按钮1");
        Button bt2 = new Button("按钮2");
        Button bt3 = new Button("按钮3");

        bt1.setPrefWidth(100);
        bt1.setPrefHeight(100);
        bt1.setLayoutX(100);
        bt1.setLayoutY(100);
        //Group 会自动管理孩子节点大小（如果你不指定的话）
        Group root = new Group();
        root.getChildren().addAll(bt1,bt2,bt3);

        
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();

    }
}
