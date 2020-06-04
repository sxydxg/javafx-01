package dxg.折叠版和标题面板;/**
 *
 *
 * 虽然他是一个   Pane ，但是它不是一个布局类
 *     标题面板
 *
 *     官方文档说了 不要给这个可以打开或关闭标题面板设置大小（所以如果你想要达到你想要的想过，那么你的内容就要设计好大小）
 *
 * @author dingxigui
 * @date 2020/4/21
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestTilePane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        AnchorPane anchorPane = new AnchorPane();

        TitledPane titlePane = new TitledPane();
        Label label1 = new Label("第一个张标签aaaaaaaaaaaaaaaaaaaaaaaa\naaaaaaaaaaaaaaaaaaaaaaaaaaa\nsfsa\nsfsa\n");
        titlePane.setContent(label1);
        //设置图像
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("img/touxiang.jpeg")));
        imageView.setFitHeight(30);
        imageView.setFitWidth(30);
        titlePane.setGraphic(imageView);

        //设置为禁用状态
        //titlePane.setCollapsible();

        //设置为默认展开
        titlePane.setExpanded(true);

        AnchorPane.setLeftAnchor(titlePane,100.0);
        AnchorPane.setTopAnchor(titlePane,100.0);

        anchorPane.getChildren().add(titlePane);
        Scene scene = new Scene(anchorPane);
        scene.setFill(new Color(0.6,0.8,0.7,0.8));
        primaryStage.setScene(scene);
        primaryStage.setHeight(600);
        primaryStage.setWidth(800);
        primaryStage.show();
    }
}
