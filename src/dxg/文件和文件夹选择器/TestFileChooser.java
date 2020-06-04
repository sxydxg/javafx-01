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
 *   文件选择器
 *      选择文件
 *
 * @author dingxigui
 * @date 2020/4/21
 */
public class TestFileChooser extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();
        Button bt1 = new Button("选择文件");


        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // 不需要一个stage窗口类
                Stage stage = new Stage();
                FileChooser fileChooser = new FileChooser();
                //设置标题
                fileChooser.setTitle("请选择文件");
                //可以选择文件选择器的开始目录
                fileChooser.setInitialDirectory(new File("c://"));
                //fileChooser.setInitialFileName("aaa.txt");

                //设置文件过滤项
                fileChooser.getExtensionFilters().addAll(
                        new FileChooser.ExtensionFilter("显示所有","*.*")
                        ,
                        new FileChooser.ExtensionFilter("显示图片","*.jpg","*.png","*.gif")
                        ,
                        new FileChooser.ExtensionFilter("只显示文本","*.txt","*.pdf")
                        ,
                        new FileChooser.ExtensionFilter("显示word","*.doc","*.docx")
                );

                //这个只能单选
                //ownerWindow  设置窗口的拥有者，这个就是窗口级别的模态（所以建议你再拿来点的窗口，就把那个窗口传进来）
                //File file = fileChooser.showOpenDialog(primaryStage);
                //if (file!=null){
                   // System.out.println(file.getName());
                //}
                //可以使用  ctrl键+鼠标单击 选中多个文件 ，  也可以使用shif+xxxxxx你懂的
                List<File> files = fileChooser.showOpenMultipleDialog(primaryStage);
                if (files!=null){
                    files.forEach(c-> System.out.println(c.getName()));
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
