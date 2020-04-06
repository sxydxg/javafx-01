package dxg.窗口类;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestStage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Scene scene = new Scene(new Group());


        primaryStage.setScene(scene);
        //全屏 一定设置scene，不然不生效
        primaryStage.setFullScreen(true);
        //设置全屏显示时弹出来的文字，你可以将设成空字符串
        primaryStage.setFullScreenExitHint("你好！dxg");
        //设置全屏关闭的快捷键，默认是ESC
        //primaryStage.setFullScreenExitKeyCombination();

        primaryStage.setTitle("stage!");
        primaryStage.show();
    }
}
