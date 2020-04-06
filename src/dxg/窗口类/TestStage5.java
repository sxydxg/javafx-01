package dxg.窗口类;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class TestStage5 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //模态（就是一个遮罩效果）
        Stage parent = new Stage();
        parent.setTitle("拥有者");
        parent.show();

        //窗口级别的模态，就是你这个窗口不关闭，那么无法点击你的拥有者窗口
        Stage son = new Stage();
        son.setTitle("被拥有者");
        son.initModality(Modality.WINDOW_MODAL);
        son.initOwner(parent);
        son.show();

        //没有模态
        Stage s = new Stage();
        s.initModality(Modality.NONE);
        s.setTitle("没有模态");
        s.show();

        //你这个窗口不关闭其他窗口无法执行
        Stage s2 = new Stage();
        s2.initModality(Modality.APPLICATION_MODAL);
        s2.setTitle("应用程序级别的模态");
        s2.show();
    }
}
