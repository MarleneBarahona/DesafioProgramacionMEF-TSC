package sample;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;
import javafx.util.Duration;

public class Main extends Application {

    Stage window, windowMenu, windowPlayer;
    Scene sceneInicio, sceneMenu, scene1, scene2, scene3, scene4, scene5;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        //Menu
        Stage menuStage = new Stage();
        windowMenu = menuStage;
        Button buttonInicio = new Button("Bienvenida");
        buttonInicio.setPrefSize(150,5);
        buttonInicio.setOnAction(event -> window.setScene(sceneInicio));
        Button buttonIniciar = new Button("Iniciar");
        buttonIniciar.setPrefSize(150,5);
        buttonIniciar.setOnAction(event -> window.setScene(scene1));
        Button button1 = new Button("Dominio");
        button1.setPrefSize(150,5);
        button1.setOnAction(event -> window.setScene(scene1));
        Button button2 = new Button("Mallado");
        button2.setPrefSize(150,5);
        button2.setOnAction(event -> window.setScene(scene2));
        Button button3 = new Button("Modelo");
        button3.setPrefSize(150,5);
        button3.setOnAction(event -> window.setScene(scene3));
        Button button4 = new Button("MEF");
        button4.setPrefSize(150,5);
        button4.setOnAction(event -> window.setScene(scene4));
        Button button5 = new Button("Ensamblaje");
        button5.setPrefSize(150,5);
        button5.setOnAction(event -> window.setScene(scene3));
        Button button6 = new Button("Condiciones de contorno");
        button6.setPrefSize(150,5);
        button6.setOnAction(event -> window.setScene(scene3));
        VBox layoutMenu = new VBox(8);
        Image imageMenu = new Image(getClass().getResourceAsStream("images/menu3.png"));
        // new BackgroundSize(width, height, widthAsPercentage, heightAsPercentage, contain, cover)
        BackgroundSize backgroundSize = new BackgroundSize(400, 400, true, true, true, false);
        // new BackgroundImage(image, repeatX, repeatY, position, size)
        BackgroundImage backgroundImage = new BackgroundImage(imageMenu, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        // new Background(images...)
        Background background = new Background(backgroundImage);

        layoutMenu.getChildren().addAll(buttonInicio, buttonIniciar,button1,button2,button3,button4,button5,button6);
        layoutMenu.setPadding(new Insets(25,20,0,20));
        layoutMenu.setAlignment(Pos.CENTER);
        layoutMenu.setBackground(new Background(backgroundImage));
        sceneMenu = new Scene(layoutMenu,200,310);
        windowMenu.setTitle("Menu");
        windowMenu.setX(70);
        windowMenu.setY(85);
        windowMenu.setScene(sceneMenu);

        //Principal
        Image imageInicio = new Image(getClass().getResourceAsStream("images/Diapositiva1.png"));
        ImageView imageViewInicio = new ImageView(imageInicio);
        imageViewInicio.setFitHeight(400);
        imageViewInicio.setFitWidth(800);
        /*VBox layoutInicio = new VBox(imageViewInicio);
        //layoutInicio.getChildren().addAll(imageViewInicio);
        sceneInicio = new Scene(layoutInicio, 800, 500);*/

        //Button btn = new Button("ClickMe");
        //Group group = new Group(btn);
        //Scene scene = new Scene(group, 600, 600);
        VBox layoutInicio = new VBox(imageViewInicio);
        //layoutInicio.getChildren().addAll(imageViewInicio);
        sceneInicio = new Scene(layoutInicio, 800, 500);
        //Duration = 2.5 seconds
        Duration duration = Duration.millis(2500);
        //Create new translate transition
        TranslateTransition transition = new TranslateTransition(duration, imageViewInicio);
        //Move in X axis by +200
        //transition.setByX(0);
        //Move in Y axis by +100
        transition.setByY(100);
        //Go back to previous position after 2.5 seconds
        transition.setAutoReverse(true);
        //Repeat animation twice
        transition.setCycleCount(2);
        transition.play();

        //ventana 1 - Dominio
        Button buttonAnt1 = new Button("Anterior");
        buttonAnt1.setOnAction(event -> window.setScene(sceneInicio));
        Button buttonSig1 = new Button("Siguiente");
        buttonSig1.setOnAction(event -> window.setScene(scene2));
        Image image1 = new Image(getClass().getResourceAsStream("images/Diapositiva2.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitHeight(400);
        imageView1.setFitWidth(800);
        HBox h1 = new HBox(670);
        h1.getChildren().addAll(buttonAnt1,buttonSig1);
        VBox layout1 = new VBox(imageView1,h1);
        scene1 = new Scene(layout1, 800, 500);

        //ventana 2 - Mallado
        Button buttonAnt2 = new Button("Anterior");
        buttonAnt2.setOnAction(event -> window.setScene(scene1));
        Button buttonSig2 = new Button("Siguiente");
        buttonSig2.setOnAction(event -> window.setScene(scene3));
        Image image2 = new Image(getClass().getResourceAsStream("images/Diapositiva3.png"));
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitHeight(400);
        imageView2.setFitWidth(800);
        HBox h2 = new HBox(670);
        h2.getChildren().addAll(buttonAnt2,buttonSig2);
        VBox layout2 = new VBox(imageView2,h2);
        scene2 = new Scene(layout2, 800, 500);

        //ventana 3 - Modelo
        Button buttonAnt3 = new Button("Anterior");
        buttonAnt3.setOnAction(event -> window.setScene(scene2));
        Button buttonSig3 = new Button("Siguiente");
        buttonSig3.setOnAction(event -> window.setScene(scene4));
        Image image3 = new Image(getClass().getResourceAsStream("images/Diapositiva4.png"));
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(400);
        imageView3.setFitWidth(800);
        HBox h3 = new HBox(670);
        h3.getChildren().addAll(buttonAnt3,buttonSig3);
        VBox layout3 = new VBox(imageView3,h3);
        scene3 = new Scene(layout3, 800, 500);

        //ventana 4 - MEF
        Button buttonAnt4 = new Button("Anterior");
        buttonAnt4.setOnAction(event -> window.setScene(scene3));
        Button buttonSig4 = new Button("Siguiente");
        Button buttonPaso1 = new Button("1");
        Button buttonPaso2 = new Button("2");
        Button buttonPaso3 = new Button("3");
        Button buttonPaso4 = new Button("4");
        Button buttonPaso5 = new Button("5");
        Button buttonPaso6 = new Button("6");
        //Cambiar entre los pasos
        Image imagePaso1 = new Image(getClass().getResourceAsStream("images/Diapositiva5.png"));
        Image imagePaso2 = new Image(getClass().getResourceAsStream("images/Diapositiva6.png"));
        Image imagePaso3 = new Image(getClass().getResourceAsStream("images/Diapositiva7.png"));
        Image imagePaso4 = new Image(getClass().getResourceAsStream("images/Diapositiva8.png"));
        Image imagePaso5 = new Image(getClass().getResourceAsStream("images/Diapositiva9.png"));
        Image imagePaso6 = new Image(getClass().getResourceAsStream("images/Diapositiva10.png"));
        ImageView imageView4 = new ImageView(imagePaso1);
        imageView4.setFitHeight(400);
        imageView4.setFitWidth(800);
        HBox h4 = new HBox(76);
        h4.getChildren().addAll(buttonAnt4,buttonPaso1,buttonPaso2,buttonPaso3,buttonPaso4,buttonPaso5,buttonPaso6, buttonSig4);
        buttonPaso2.setOnAction(event -> imageView4.setImage(imagePaso2));
        buttonPaso3.setOnAction(event -> imageView4.setImage(imagePaso3));
        buttonPaso4.setOnAction(event -> imageView4.setImage(imagePaso4));
        buttonPaso5.setOnAction(event -> imageView4.setImage(imagePaso5));
        buttonPaso6.setOnAction(event -> imageView4.setImage(imagePaso6));
        VBox layout4 = new VBox(imageView4,h4);
        scene4 = new Scene(layout4, 800, 500);

        window.setScene(sceneInicio);
        window.setTitle("Mierda esta :)");
        window.setY(85);
        window.setX(275);
        window.show();
        windowMenu.show();
        //player.play();
        /*Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
