package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller
{
    @FXML private GridPane GridPaneMain;
    @FXML private Button PlayButton;
    @FXML private Button SettingsButton;
    @FXML private Button HelpButton;
    @FXML private Button ExitButton;
    @FXML private ImageView ImageViewMain;
    @FXML private AnchorPane AnchorPaneMain;

    public void PlayButtonCLicked(MouseEvent event) throws IOException
    {
        System.out.println("Play button clicked");
        Parent root= FXMLLoader.load(getClass().getResource("GameplayPage.fxml"));
        AnchorPaneMain.getChildren().setAll(root);
    }

    public  void SavedGamesButtonClicked(MouseEvent event) throws IOException{
        System.out.println("Saved Games button on main page clicked");
        Parent root=FXMLLoader.load(getClass().getResource("SavedGamePage.fxml"));
        AnchorPaneMain.getChildren().setAll(root);
    }

    public void SettingsButtonClicked(MouseEvent event) throws IOException
    {
        System.out.println("Settings Button clicked");
    }

    public void HelpButtonClicked(MouseEvent event) throws IOException
    {
        System.out.println("Help Button CLicked");
    }

    public void ExitButtonClicked(MouseEvent event)
    {
        System.out.println("Exit Button CLicked");
        Stage stagemain = (Stage) AnchorPaneMain.getScene().getWindow();
        stagemain.close();
    }

    public  void TranslationTry(MouseEvent event) throws IOException {
        System.out.println("Translational page open kar rha hu");
        Parent root=FXMLLoader.load(getClass().getResource("TranslationalTry.fxml"));
        AnchorPaneMain.getChildren().setAll(root);
    }


}
