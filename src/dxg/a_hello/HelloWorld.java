package dxg.a_hello;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @auther 丁溪贵
 * @date 2020/4/1
 */
public class HelloWorld extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button();
        button.setText("javaFx你好！");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("javaFx你好啊");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);
        //创建一个场景
        Scene scene = new Scene(root, 500, 600);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        //显示
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
