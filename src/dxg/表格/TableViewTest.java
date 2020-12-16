package dxg.表格;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TableViewTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // 数据源
    private final ObservableList<Person> data =
            FXCollections.observableArrayList(
                    new Person("Jacob", "Smith", "jacob.smith@example.com"),
                    new Person("Isabella", "Johnson", "isabella.johnson@example.com"),
                    new Person("Ethan", "Williams", "ethan.williams@example.com"),
                    new Person("Emma", "Jones", "emma.jones@example.com"),
                    new Person("Michael", "Brown", "michael.brown@example.com")
            );

    @Override
    public void start(Stage primaryStage) throws Exception {


        TableView<Person> tableView = new TableView<>();
        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
        Button addBtn = new Button("添加");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label,tableView,addBtn);
        //vBox.setStyle("-fx-background-color: red");
        //设置可编辑
        tableView.setEditable(true);
        //创建一列
        TableColumn firstNameCol = new TableColumn("firstName");
        firstNameCol.setMinWidth(100);
        // 设置分箱的类下面的属性名
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        //创建一列
        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        //创建一列
        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(200);
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        tableView.setRowFactory(new Callback<TableView<Person>, TableRow<Person>>() {
            @Override
            public TableRow<Person> call(TableView<Person> param) {
                TableRow<Person> tableRow = new TableRow<>();
                tableRow.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        if (! tableRow.isEmpty() && event.getButton()== MouseButton.PRIMARY
                                && event.getClickCount() == 2) {

                            Person p = tableRow.getItem();
                            System.out.println(p);
                        }
                    }
                });
                return tableRow;
            }
        });
        //设置数据源
        tableView.setItems(data);
        // 一次添加列进TableView
        tableView.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("表格测试");
        primaryStage.setWidth(700);
        primaryStage.setHeight(600);
        primaryStage.show();
        //添加添加时间
        addBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            int a = 1 ;
            @Override
            public void handle(MouseEvent event) {
                data.add(new Person(""+a,""+a,""+a));
                a++;
            }
        });


    }
}
