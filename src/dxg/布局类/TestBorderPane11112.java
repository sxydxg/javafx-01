package dxg.布局类;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TestBorderPane11112 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button bt1 = new Button("上");
        Button bt2 = new Button("下");
        Button bt3 = new Button("左");
        Button bt4 = new Button("右");
        Button bt5 = new Button("中");

        BorderPane root = new BorderPane();
        //不要使用这几个方法，如果使用会抛出异常
        //root.getChildren().addAll(bt1,bt2,bt3,bt4,bt5);

        VBox vBox = new VBox();
        vBox.setBackground(new Background(new BackgroundFill(Color.PINK,new CornerRadii(50),new Insets(0))));
        //
        HBox subhBox1 = new HBox();
        subhBox1.setPrefSize(200,200);
        vBox.getChildren().add(subhBox1);
        //创建一个button
        Button b = new Button("1");
        subhBox1.getChildren().add(b);
        subhBox1.setAlignment(Pos.CENTER);
        //给button设置外边距
        //HBox.setMargin(b,new Insets(50,0,50,0));
        subhBox1.setPadding(new Insets(10,0,10,0));
        b.setPadding(new Insets(50,0,50,0));
        //b.prefHeightProperty().bindBidirectional();

        root.setTop(vBox);
        root.setBottom(bt2);
        root.setLeft(bt3);
        root.setRight(bt4);
        root.setCenter(bt5);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("边界布局");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();

        HBox s = (HBox)b.getParent();
        Parent s2 = b.getParent();
        System.out.println(s2.getBoundsInLocal().getWidth());
        System.out.println(s2.getBoundsInLocal().getHeight());
    }
}
