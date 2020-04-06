package dxg.窗口类;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TestStage4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

          //默认
//        Stage s1 = new Stage();
//        s1.setTitle("s1");
//        s1.initStyle(StageStyle.DECORATED);
//        s1.show();

        //（不装饰，但感觉就是透明了）透明了
//        Stage s2 = new Stage();
//        s2.setTitle("s2");
//        s2.initStyle(StageStyle.UNDECORATED);
//        s2.show();

        //透明了
//        Stage s3 = new Stage();
//        s3.setTitle("s3");
//        s3.initStyle(StageStyle.TRANSPARENT);
//        s3.show();

        //这个是没有窗口上方的任务栏，但是我这个电脑不生效
        Stage s4 = new Stage();
        s4.setTitle("s4");
        s4.initStyle(StageStyle.UNIFIED);
        s4.show();


        //只有关闭按钮 （相当于一个对话框）
//        Stage s5 = new Stage();
//        s5.initStyle(StageStyle.UTILITY);
//        s5.show();


    }
}
