package com.mycompany.mavenproject1;

import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    class Defender extends ImageView {

        double vx, vy;

        Defender(Image img) {
            super(img);
            //random number -3,3(including both)
            vx = Math.random() * 6 - 3;
            vy = Math.random() * 6 + 3;
        }

        void move() {
            // i am an image view so i ahve a getx and gety
            //i also have a setx and sety
            //i also vx,vy
            double newX = this.getX() + vx;
            double newY = this.getY() + vy;
            this.setX(newX);
            this.setY(newY);
            if(!inbounds)
        }
    }
    ImageView lebron;
    ArrayList<Defender> defenders = new ArrayList<>();
    Pane pane;
    Scene scene;
    Stage stage;

    @Override
    public void start(Stage stage) {
        //System.out.println(Paths.get("").toAbsolutePath().toString());
        Image img1 = new Image(Paths.get("Lebron.png").toUri().toString());
        // Image img2 = new Image(Paths.get("AOT.jpg").toUri().toString());
        ImageView lebron = new ImageView(img1);
        // ImageView tv = new ImageView(img2);
        lebron.setFitWidth(50);
        lebron.setFitHeight(50);
        for (int i = 0; i < 10; i++) {
            Defender d = new Defender(img1);
            d.setFitWidth(50);
            d.setFitHeight(50);
            d.setX(Math.random() * 500);
            d.setY(Math.random() * 500);
          //  defenders
        }

        // Label label = new Label("Hello, This is a javafx label");
        //Scene scene = new Scene(new StackPane(label), 640, 480);
        //Pane
        pane = new StackPane();
        pane.getChildren().add(lebron);
        //pane.getChildren().add(tv);

        //You will always make a scene
        Scene scene = new Scene(pane, 640, 480);

        scene.setOnKeyPressed(e -> move(e.getCode(), lebron));
        this.stage = stage;

        // Button b = new Button("Click Me");
        // b.setOnMouseClicked(e -> System.out.println("YOU CLICKED " + e));
        //  pane.getChildren().add(b);
        stage.setScene(scene);
        stage.show();
    }

    public void move(KeyCode k, ImageView lebron) {
        if (k == KeyCode.UP) {
            lebron.setRotate(0);
            lebron.setY(lebron.getY() - 5);
        } else if (k == KeyCode.RIGHT) {
            lebron.setRotate(90);
            lebron.setX(lebron.getX() + 5);
        } else if (k == KeyCode.LEFT) {
            lebron.setRotate(270);
            lebron.setX(lebron.getX() - 5);
        } else if (k == KeyCode.DOWN) {
            lebron.setRotate(180);
            lebron.setY(lebron.getY() + 5);
        }
        for (Defender d : defenders) {
            d.move();
        }
    }
    public boolean inbounds(double x, double y){
        if (x>= 0 && x<500 && y>= 0 && y<500) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
