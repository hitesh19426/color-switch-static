package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class PauseScreen
{
    @FXML private Button HomeButtonPauseScreen;
    @FXML private Button ResumePauseScreen;
    @FXML private ImageView ImageViewPauseScreen;
    @FXML private AnchorPane AnchorPanePauseScreen;

    public void HomeButton(MouseEvent event) throws IOException
    {
        System.out.println("Home Button on pause screen clicked");
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        AnchorPanePauseScreen.getChildren().setAll(root);
    }

    public void ResumeButton(MouseEvent event) throws IOException
    {
        System.out.println("Resume Button on pause screen clicked");
        Parent root=FXMLLoader.load(getClass().getResource("GameplayPage.fxml"));
        AnchorPanePauseScreen.getChildren().setAll(root);

    }

}
