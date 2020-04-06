package dxg.输入框密码框标签;

import com.sun.xml.internal.txw2.TXW;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TestTextField extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

        //设置阴影提示符文本
        textField.setPromptText("请输入你的名字！");
        textField.setFocusTraversable(false);

        //textField.setText("hhhhh");
        ImageCursor imageCursor = new ImageCursor(new Image(this.getClass().getResourceAsStream("1.png")));
        //textField.setCursor(Cursor.HAND);
        textField.setCursor(imageCursor);
        //设置提示
        Tooltip tooltip = new Tooltip("这是一个提示");
        textField.setTooltip(tooltip);
        //将输入框设置为禁用状态
        textField.setDisable(false);

        //这个好像也没有改变
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("有值被输入了");
            }
        });

        //选择所有
        //textField.selectAll();

        //当文本的内容被鼠标选中时触发
        textField.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        //设置对齐方式
        //textField.setAlignment(Pos.CENTER_RIGHT);
        textField.setLayoutX(100);
        textField.setLayoutY(100);
        passwordField.setLayoutX(400);
        passwordField.setLayoutY(100);
        Pane pane = new Pane();

        pane.getChildren().add(textField);
        pane.getChildren().add(passwordField);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
    }
}
