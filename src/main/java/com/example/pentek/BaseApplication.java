package com.example.pentek;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseApplication extends Application {
    private static SceneHandler sh;
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(BaseApplication.class.getResource("Pente.fxml"));
        Scene sceneMain = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("PenteK");
        stage.setScene(sceneMain);

        sh = new SceneHandler(sceneMain);
        sh.addScene("Pente", FXMLLoader.load(getClass().getResource( "PenteDemo.fxml" )));
        sh.addScene("PenteDemo", FXMLLoader.load(getClass().getResource( "PenteDemo.fxml" )));
        sh.addScene("Othello", FXMLLoader.load(getClass().getResource( "PenteDemo.fxml" )));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}