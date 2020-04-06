package dxg.窗口类;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TestStage2 extends Application {

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


        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("宽 ："+newValue);
            }
        });

        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("高 ："+newValue);
            }
        });

        //可改变窗口大小
        primaryStage.setResizable(true);
        //设置最小化
        //primaryStage.setIconified(true);
        primaryStage.show();
        //primaryStage.close();

    }
}
