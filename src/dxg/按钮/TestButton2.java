package dxg.按钮;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.List;

public class TestButton2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Button button = new Button();
        button.setText("这是一个按钮");

        //设置背景颜色，设置圆角，设置字体颜色
        button.setStyle("-fx-background-color:#FFEC8B;-fx-background-radius:20;-fx-text-fill: chartreuse");


        button.setOnAction(new EventHandler<ActionEvent>() {
            int i = 0 ;
            @Override
            public void handle(ActionEvent event) {
                Button source = (Button)event.getSource();
                if(i%2==0){
                    source.setStyle("-fx-background-color: darkorange;-fx-background-radius: 20;-fx-text-fill: chartreuse");
                }else{
                    source.setStyle("-fx-background-color: #FFEC8B;-fx-background-radius: 20;-fx-text-fill: chartreuse");
                }
                i++ ;

            }
        });



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
