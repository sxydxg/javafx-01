package dxg.登录窗口例子;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MyLogin2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label l_name = new Label("账号");
        Label l_password = new Label("密码");
        l_name.setStyle("-fx-background-color: aquamarine");
        l_password.setStyle("-fx-background-color: aquamarine");
        TextField t_name = new TextField();
        PasswordField p_password = new PasswordField();
        t_name.setTooltip(new Tooltip("请输入用户名"));
        p_password.setTooltip(new Tooltip("请输入密码"));
        t_name.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("img/c2.png"))));
        p_password.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("img/c2.png"))));

        Button login = new Button("登录");
        Button clear = new Button("清除");
        login.setStyle("-fx-background-color: aquamarine");
        clear.setStyle("-fx-background-color: aquamarine");
        //给某个组件添加用户数据，这个方法任何组件都有
        //login.setUserData();
        //设置用户名和密码
        login.getProperties().put("username","123");
        login.getProperties().put("password","123");
        login.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("img/c1.png"))));
        clear.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("img/c1.png"))));
        //这个图标 太不符合了
        //login.setGraphic(new ImageView(new Image(this.getClass().getResourceAsStream("img/1.jpg"))));



        GridPane gridPane = new GridPane();
        gridPane.add(l_name,0,0);
        gridPane.add(t_name,1,0);
        gridPane.add(l_password,0,1);
        gridPane.add(p_password,1,1);
        gridPane.add(clear,0,2);
        gridPane.add(login,1,2);

        gridPane.setCursor(new ImageCursor(new Image(this.getClass().getResourceAsStream("img/c3.png"))));
        //设置组件水平和垂直的间距
        gridPane.setHgap(5.0);
        gridPane.setVgap(10.0);
        GridPane.setMargin(login,new Insets(0,0,0,150));


        //gridPane.setGridLinesVisible(true);

        //居中显示
        gridPane.setAlignment(Pos.CENTER);


        

        //设置事件
        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                t_name.setText("");
                p_password.setText("");
            }
        });

        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                String username = (String)login.getProperties().get("username");
                String password = (String)login.getProperties().get("password");
                if (t_name.getText().equals(username)&&p_password.getText().equals(password)){
                    System.out.println("ok");
                    primaryStage.close();

                    MyWindow myWindow = new MyWindow();
                }else{
                    System.out.println("用户名或密码错误！");
                }
            }
        });


        gridPane.setStyle("-fx-background-color: transparent;");


        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(new ImageView(new Image(this.getClass().getResourceAsStream("img/bg.jpg"))));
        stackPane.getChildren().add(gridPane);
        Scene scene = new Scene(stackPane);

        primaryStage.setScene(scene);
        //设置窗口图标
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("img/touxiang.jpeg")));
        primaryStage.setWidth(550);
        primaryStage.setHeight(420);
        primaryStage.setTitle("登录");
        primaryStage.show();
    }


    static class MyWindow{


        public MyWindow(){

            BorderPane br = new BorderPane();
            Label label = new Label("恭喜你，登录成功！");
            label.setFont(new Font("华文中宋",40));
            //设置字体颜色
            label.setTextFill(Color.BLUE);
            br.setCenter(label);
            br.setStyle("-fx-background-color: chartreuse");
            Scene scene = new Scene(br);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setWidth(700);
            stage.setHeight(600);
            stage.show();
        }

    }



}
