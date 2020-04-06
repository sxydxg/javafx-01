package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *     中间会挤占其他所有区域，如果中间区域没有则会空出来
 *
 *
 */
public class TestBorderPane3 extends Application {

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



        HBox h3 = new HBox();
        //设置宽度有效
        h3.setPrefWidth(200);
        //h3.setPrefHeight(100);
        h3.setStyle("-fx-background-color: red");

        HBox h4 = new HBox();
        h4.setPrefWidth(200);
        h4.setPrefHeight(100);
        h4.setStyle("-fx-background-color: green");


        BorderPane root = new BorderPane();
        //不要使用这几个方法，如果使用会抛出异常
        //root.getChildren().addAll(bt1,bt2,bt3,bt4,bt5);

        root.setStyle("-fx-background-color: darkblue");
        root.setPadding(new Insets(10));

        //center 再加一个Border
        BorderPane b2 = new BorderPane();

        root.setTop(h1);
        //不设置底部
        root.setLeft(h3);
        root.setRight(h4);
        root.setCenter(b2);

        b2.setStyle("-fx-background-color: bisque");
        HBox cent_bottom = new HBox();
        cent_bottom.setStyle("-fx-background-color: chartreuse");

        HBox cent_cent = new HBox();
        cent_cent.setStyle("-fx-background-color: deeppink");
        b2.setBottom(cent_bottom);
        b2.setCenter(cent_cent);
        cent_bottom.setPrefHeight(100);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("边界布局3");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
