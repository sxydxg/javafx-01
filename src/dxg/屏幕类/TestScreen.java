package dxg.屏幕类;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * @auther 丁溪贵
 * @date 2020/4/4
 */
public class TestScreen extends Application {

    public static void main(String[] args) {

       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Screen screen = Screen.getPrimary();
        //得到整个屏幕的边界
        Rectangle2D bounds = screen.getBounds();
        //得到可视化的边界（会去掉任务栏的高度）
        Rectangle2D visualBounds = screen.getVisualBounds();

        System.out.println(bounds.getMaxX());
        System.out.println(bounds.getMaxY());
        System.out.println(visualBounds.getMaxX());
        System.out.println(visualBounds.getMaxY());
    }
}
