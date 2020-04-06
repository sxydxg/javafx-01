package dxg.布局类;

import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestHBoxVBox2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");


        HBox h1 = new HBox();
        HBox h2  = new HBox();
        h1.getChildren().addAll(bt1,bt2,bt3);
        h1.setPadding(new Insets(10,10,10,10));
        h1.setStyle("-fx-background-color: brown");
        //设置组件之间的距离
        h1.setSpacing(10.0);

        h2.getChildren().add(bt4);
        h2.setStyle("-fx-background-color: chartreuse");


        // Hbox和Vbox 一般和GridPane组合，这里我只是随便测试一下
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(h1,h2);
        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("盒子布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
