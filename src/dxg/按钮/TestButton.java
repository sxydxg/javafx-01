package dxg.按钮;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.List;

public class TestButton extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Button button = new Button();
        button.setText("这是一个按钮");

        //打印所有可用的字体
        List<String> fontNames = Font.getFontNames();
        fontNames.forEach(c->{
            System.out.println(c);
        });

        //设置字体
        Font font = new Font("方正姚体",16);
        button.setFont(font);
        button.setTextFill(Color.YELLOW);



        //颜色，圆角的度数，内边距
        BackgroundFill backgroundFill = new BackgroundFill(Color.RED,new CornerRadii(20),new Insets(10,10,0,0));
        Background background = new Background(backgroundFill);
       //设置按钮的背景
        button.setBackground(background);


        //设置按钮的边框
        BorderStroke borderStroke = new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID,new CornerRadii(20),new BorderWidths(10),new Insets(10,10,20,10));
        Border border = new Border(borderStroke);
        button.setBorder(border);


        Group root = new Group();
        root.getChildren().add(button);

        //设置按钮 x/y  宽和高
        button.setLayoutX(100);
        button.setLayoutY(100);
        button.setPrefWidth(200);
        button.setPrefHeight(100);


        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();


    }
}
