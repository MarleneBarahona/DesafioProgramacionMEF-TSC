package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        //ventana 1
        Label label1 = new Label("Primera mierda");
        Button button1 = new Button("Siguiente mierda");
        button1.setOnAction(event -> window.setScene(scene2));
        Image image1 = new Image(getClass().getResourceAsStream("idk.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(450);
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1,imageView1);
        scene1 = new Scene(layout1, 600, 300);

        //ventana 2
        Label label2 = new Label("Segunda mierda");
        Button button2 = new Button("Anterior mierda");
        button2.setOnAction(event -> window.setScene(scene1));
        Image image2 = new Image(getClass().getResourceAsStream("idk.png"));
        ImageView imageView2 = new ImageView(image1);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(450);
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2, button2,imageView2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("Mierda esta :)");
        window.show();

        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
