package dxg.文件和文件夹选择器;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

/**
 *   文件保存
 *
 * @author dingxigui
 * @date 2020/4/21
 */
public class TestFileDirectoryChooser extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();
        Button bt1 = new Button("请选择目录");


        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                DirectoryChooser directoryChooser = new DirectoryChooser();
                //设置标题
                directoryChooser.setTitle("请选择目录");
                //可以选择文件选择器的开始目录
                directoryChooser.setInitialDirectory(new File("c://"));

                //只有这个一个显示窗口方法，像fileChooser都有三个，说明这个类很简单
                File file = directoryChooser.showDialog(primaryStage);
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
