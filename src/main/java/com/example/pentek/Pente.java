package com.example.pentek;

import com.example.pentek.models.GameToken;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.File;

public class Pente {
    @FXML
    private static GridPane gPaneGameBoard;
    private static GameToken[][] gameBoard;

    @FXML
    protected void initialize() {
        // Will run on scene load
        setup();
    }

//    // Set one constraint at a time...
//    // Places the button at the first row and second column
//    Button button = new Button();
//     GridPane.setRowIndex(button, 0);
//     GridPane.setColumnIndex(button, 1);
//
//    // or convenience methods set more than one constraint at once...
//    Label label = new Label();
//     GridPane.setConstraints(label, 2, 0); // column=2 row=0
//
//    // don't forget to add children to gridpane
//     gridpane.getChildren().addAll(button, label);

//    File file = new File(cards.get(i).getFileName());
//            if (file.exists() && file.canRead()) {
//        switch (i) {
//            case 0 -> imgvPlayerCard1.setImage(new Image(file.toURI().toString()));

    private void mapTokenToImage(ImageView imageView, GameToken token) {
        String filePath = "src/main/resources/assets/Pente/";
        switch (token) {
            case BLACK -> filePath += "BlackPiece_lg";
            case WHITE -> filePath += "WhitePiece_lg";
            case RED -> filePath += "RedPiece_lg";
            case BLUE -> filePath += "BluePiece_lg";
            // custom asset will need to be used for default case
        }
        Image image = new Image(filePath);
        imageView.setImage(image);
    }

    protected void setup() {
        gameBoard = new GameToken[11][11];
        for (int iCol = 0; iCol < 11; iCol++) {
            for (int iRow = 0; iRow < 11; iRow++) {
                ImageView imageView = new ImageView();
                gPaneGameBoard.add(imageView, iCol, iRow);
            }
        }
    }

    private void checkCapture() {

    }

    private boolean checkFiveRow() {
        return false;
    }

}
