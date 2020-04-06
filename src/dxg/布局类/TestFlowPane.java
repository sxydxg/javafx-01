package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestFlowPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");



        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(bt1,bt2,bt3,bt4);

        //设置外边距
        //FlowPane.setMargin();

        //设置内边距
        flowPane.setPadding(new Insets(10,10,10,10));

        //设置组件之间的距离(水平距离) 它没有setSpacing(10.0);方法，但是有替代的
        flowPane.setHgap(10);
        //设置组件之间的距离(垂直距离)
        flowPane.setVgap(10);
        flowPane.setStyle("-fx-background-color: yellow");

        //flowPane怎么没有设置某个组件的外边距

        //排列方式：
        //水平摆放
        flowPane.setOrientation(Orientation.HORIZONTAL);
        //垂直摆放
        flowPane.setOrientation(Orientation.VERTICAL);
        //设置所有组件居中对齐
        flowPane.setAlignment(Pos.CENTER);

        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("流式布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
