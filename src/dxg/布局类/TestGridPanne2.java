package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class TestGridPanne2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");


        //我这是copy javafx  api 文档的gridPane的例子
//        GridPane gridpane = new GridPane();
//        ColumnConstraints column1 = new ColumnConstraints(100,100,Double.MAX_VALUE);
//        //第一列会优先占满剩余空间
//        column1.setHgrow(Priority.ALWAYS);
//        ColumnConstraints column2 = new ColumnConstraints(100);
//        gridpane.getColumnConstraints().addAll(column1, column2); // first column gets any extra width


        //这一种是占据多少的百分比
        GridPane gridpane = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        gridpane.getColumnConstraints().addAll(column1, column2); // each get 50% of width

        gridpane.addColumn(0,bt1);
        gridpane.addColumn(1,bt2);



        //表格线可见
        gridpane.setGridLinesVisible(true);
        gridpane.setStyle("-fx-background-color: bisque");


        Scene scene = new Scene(gridpane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("表格布局2");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
