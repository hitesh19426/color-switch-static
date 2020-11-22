package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class GameplayPage
{
    @FXML private AnchorPane AnchorPaneGameplay;
    @FXML private Button BacktoMainMenuButton;
    @FXML private Button PauseButtonGameplay;
    @FXML private Button SaveButtonGameplay;

    public void BackToMainMenu(MouseEvent event) throws IOException
    {
        System.out.println("Back to Main Menu Going");
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        AnchorPaneGameplay.getChildren().setAll(root);
    }

    public void PauseButtonClicked(MouseEvent event) throws IOException {
        System.out.println("Pause button on Gameplay screen clicked");
        Parent root=FXMLLoader.load(getClass().getResource("PauseScreen.fxml"));
        AnchorPaneGameplay.getChildren().setAll(root);
    }

    public void SaveButtonClicked(MouseEvent event) throws IOException {
        System.out.println("Save button on Gameplay screen clicked");
//        Parent root=FXMLLoader.load(getClass().getResource("SaveScreen.fxml"));
//        AnchorPaneGameplay.getChildren().setAll(root);
    }
}
