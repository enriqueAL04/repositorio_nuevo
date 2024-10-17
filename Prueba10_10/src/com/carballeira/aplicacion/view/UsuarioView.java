package com.carballeira.aplicacion.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class UsuarioView extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
        	
            GridPane root = new GridPane();
            root.setHgap(10);  
            root.setVgap(10);  
            
            Label txt = new Label("Bienvenido!! Haga Login");
            Label nombre = new Label("Usuario:");
            TextField txtNombre = new TextField();
            Label pass = new Label("Password:");
            PasswordField txtPass = new PasswordField();
            Button btn = new Button("ENTRAR");

           
            FileInputStream input = new FileInputStream("D:/DAM_DUAL_2/Clase/Desenvolvemento_de_Interfaces/COSAS_TRABAJO_3/entrar.png");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);
            imageView.setFitHeight(20);  
            imageView.setFitWidth(20);
            btn.setGraphic(imageView);

            Scene scene = new Scene(root, 350, 200);
            scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
            
            root.add(txt, 0, 0);
            root.add(nombre, 0, 1);
            root.add(txtNombre, 1, 1);
            root.add(pass, 0, 2);
            root.add(txtPass, 1, 2);
            root.add(btn, 1, 3);
            
            primaryStage.setTitle("LOGIN");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
