package dxg.布局类;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TestAnchorPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("bt1");
        Button bt2 = new Button("bt2");
        Button bt3 = new Button("bt3");
        Button bt4 = new Button("bt4");

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(bt1,bt2);


        //设置内边距
        root.setPadding(new Insets(10,10,10,10));

        AnchorPane.setLeftAnchor(bt1,100.0);
        AnchorPane.setTopAnchor(bt1,100.0);
        AnchorPane.setRightAnchor(bt1,100.0);

        AnchorPane.setLeftAnchor(bt2,200.0);
        AnchorPane.setTopAnchor(bt2,100.0);


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("锚点布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
