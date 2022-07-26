import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * The controller class for the menu scenes.
 *
 * @author Kieran Young
 */
public class MenuController {

    private final int WIDTH = 1280;
    private final int HEIGHT = 720;

    @FXML
    private Button exitButton, playButton, backButton, fullButton;
    @FXML
    private AnchorPane menuPane;

    /**
     * Default function, runs on launch
     */
    public void initialize() {

    }

    /**
     * Exits the game upon closing the window.
     */
    public void exitGame() {
        Stage stage = (Stage) menuPane.getScene().getWindow();
        System.out.println("You have closed the game");
        stage.close();
    }

    /**
     * Loads the game select screen upon clicking the play button.
     *
     * @throws IOException An exception that could be thrown by the FXMLLoader function.
     */
    public void playButtonClicked() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/play.fxml")));
        Stage window = (Stage) playButton.getScene().getWindow();
        window.setScene(new Scene(root, WIDTH, HEIGHT));
    }

    /**
     * Goes back to the menu upon clicking the back button.
     *
     * @throws IOException An exception that could be thrown by the FXMLLoader function.
     */
    public void backButtonClicked() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/menu.fxml")));
        Stage window = (Stage) backButton.getScene().getWindow();
        window.setScene(new Scene(root, WIDTH, HEIGHT));
    }

    /**
     * Loads the full version of the game upon clicking the full game button.
     *
     * @throws IOException An exception that could be thrown by the FXMLLoader function.
     */
    public void fullGameButtonClicked() throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("gui/game.fxml")));
        Stage window = (Stage) fullButton.getScene().getWindow();
        window.setScene(new Scene(root, WIDTH, HEIGHT));
    }

}
