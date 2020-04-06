package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TestHBoxVBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");


        HBox hBox = new HBox();
        hBox.getChildren().addAll(bt1,bt2,bt3,bt4);

        //设置组件之间的间距
        hBox.setSpacing(10.0);
        //居中对齐
        hBox.setAlignment(Pos.CENTER);
        hBox.setStyle("-fx-background-color: darkorange");
        //hBox.setFillHeight(true);

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("盒子布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
