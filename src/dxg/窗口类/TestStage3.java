package dxg.窗口类;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TestStage3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        //获得图标集合
        ObservableList<Image> icons = primaryStage.getIcons();
        //icons.addAll(new Image(""),new Image(""));
        //设置图标
        icons.add(new Image(this.getClass().getResourceAsStream("1.png")));

        //0-1   值越小越透明
        primaryStage.setOpacity(0.7);
        //设置置顶
        primaryStage.setAlwaysOnTop(true);


        primaryStage.show();


    }
}
