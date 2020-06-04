package dxg.文件和文件夹选择器;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;

/**
 *   文件保存
 *
 * @author dingxigui
 * @date 2020/4/21
 */
public class TestFileChooser2 extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();
        Button bt1 = new Button("保存");


        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                FileChooser fileChooser = new FileChooser();
                //设置标题
                fileChooser.setTitle("请选择保存的路径");
                //可以选择文件选择器的开始目录
                fileChooser.setInitialDirectory(new File("c://"));

                //这个就是你保存时默认的文件名字
                fileChooser.setInitialFileName("aaa.txt");
                File file = fileChooser.showSaveDialog(primaryStage);
                if (file!=null){
                    System.out.println(file.getName());
                    System.out.println(file.getAbsolutePath());
                }


            }
        });







        borderPane.setCenter(bt1);
        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
