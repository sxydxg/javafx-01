package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class TestGridPanne extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");

        GridPane root = new GridPane();



        //添加方式1
        //root.addRow(0,bt1,bt2);
        //root.addRow(1,bt3,bt4);
        //root.addColumn(0,bt1,bt2);
        //root.addColumn(1,bt3,bt4);

        //添加方式2
        //让bt1 占2列 一行
        root.add(bt1,0,0,2,1);
        root.add(bt2,0,1);
        root.add(bt3,1,1);

        //bt1.setPrefWidth(300);
        //bt1.setPrefWidth(400);


        //让button的格子在水命和垂直方向 占满剩余的空间
        //GridPane.setHgrow(bt2, Priority.ALWAYS);
        //GridPane.setVgrow(bt2,Priority.ALWAYS);

        //设置组件外边距
        //GridPane.setMargin();
        //还可以设置没一行的百分比



        //设置组件的水平和垂直距离
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        //表格线可见
        root.setGridLinesVisible(true);
        //居中对齐
        //root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: green");


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("表格布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
