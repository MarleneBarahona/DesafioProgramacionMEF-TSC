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
    Scene sceneInicio, scene1, scene2, scene3;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        //principal
        Button buttonIniciar = new Button("Iniciar mierda");
        buttonIniciar.setOnAction(event -> window.setScene(scene1));
        Image imageInicio = new Image(getClass().getResourceAsStream("images/Imagen1.png"));
        ImageView imageViewInicio = new ImageView(imageInicio);
        imageViewInicio.setFitHeight(400);
        imageViewInicio.setFitWidth(800);
        VBox layoutInicio = new VBox(20);
        layoutInicio.getChildren().addAll(imageViewInicio,buttonIniciar);
        sceneInicio = new Scene(layoutInicio, 800, 450);

        //ventana 1
        Label label1 = new Label("Primera mierda");
        Button buttonAnt1 = new Button("Anterior mierda");
        buttonAnt1.setOnAction(event -> window.setScene(sceneInicio));
        Button buttonSig1 = new Button("Siguiente mierda");
        buttonSig1.setOnAction(event -> window.setScene(scene2));
        Image image1 = new Image(getClass().getResourceAsStream("images/idk.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(450);
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,imageView1,buttonAnt1,buttonSig1);
        scene1 = new Scene(layout1, 800, 450);

        //ventana 2
        Label label2 = new Label("Segunda mierda");
        Button buttonAnt2 = new Button("Anterior mierda");
        buttonAnt2.setOnAction(event -> window.setScene(scene1));
        Button buttonSig2 = new Button("Siguiente mierda");
        buttonSig2.setOnAction(event -> window.setScene(scene3));
        Image image2 = new Image(getClass().getResourceAsStream("images/idk.png"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(450);
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label2,imageView2,buttonAnt2,buttonSig2);
        scene2 = new Scene(layout2, 800, 450);

        //ventana 3
        Label label3 = new Label("Tercer mierda");
        Button buttonAnt3 = new Button("Anterior mierda");
        buttonAnt3.setOnAction(event -> window.setScene(scene1));
        Button volverInicio = new Button("Volver a Inicio mierda");
        volverInicio.setOnAction(event -> window.setScene(sceneInicio));
        //Button buttonSig3 = new Button("Siguiente mierda");
        //buttonSig3.setOnAction(event -> window.setScene(scene3));
        Image image3 = new Image(getClass().getResourceAsStream("images/idk.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(200);
        imageView3.setFitWidth(450);
        VBox layout3 = new VBox(20);
        layout3.getChildren().addAll(label3,imageView3,buttonAnt3,volverInicio);
        scene3 = new Scene(layout3, 800, 450);

        window.setScene(sceneInicio);
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
