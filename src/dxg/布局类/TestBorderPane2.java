package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestBorderPane2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        HBox h1 = new HBox();
        //h1.setPrefWidth(200);
        // top  设置高度有效
        h1.setPrefHeight(50);
        h1.setStyle("-fx-background-color: yellow");

        HBox h2 = new HBox();
        //h2.setPrefWidth(700);
        // top  设置高度有效
        h2.setPrefHeight(100);
        h2.setStyle("-fx-background-color: indigo");

        HBox h3 = new HBox();
        //设置宽度有效
        h3.setPrefWidth(200);
        //h3.setPrefHeight(100);
        h3.setStyle("-fx-background-color: red");

        HBox h4 = new HBox();
        h4.setPrefWidth(200);
        h4.setPrefHeight(100);
        h4.setStyle("-fx-background-color: green");

        HBox h5 = new HBox();
//        h5.setPrefWidth(700);
//        h5.setPrefHeight(100);
        h5.setStyle("-fx-background-color: brown");

        BorderPane root = new BorderPane();
        //不要使用这几个方法，如果使用会抛出异常
        //root.getChildren().addAll(bt1,bt2,bt3,bt4,bt5);

        root.setStyle("-fx-background-color: darkblue");
        root.setPadding(new Insets(10));

        root.setTop(h1);
        root.setBottom(h2);
        root.setLeft(h3);
        root.setRight(h4);
        root.setCenter(h5);


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("边界布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
