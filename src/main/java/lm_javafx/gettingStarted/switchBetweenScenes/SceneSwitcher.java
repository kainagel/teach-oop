package lm_javafx.gettingStarted.switchBetweenScenes;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class SceneSwitcher extends Application {

	private Scene scene1, scene2;

	@Override
	public void start( Stage primaryStage )  {
		primaryStage.setTitle("Switching scenes");

		// Content of scene 1
		Label label1 = new Label("Welcome to scene 1");
		Button button1 = new Button("Go to scene 2");
		button1.setOnAction(e -> {
			for ( int ii=0 ; ii<1000_000_000; ii++ ) {
				Math.random() ;
			}
			primaryStage.setScene(scene2);
		} ) ;
		// Layout for scene 1
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);

//		// Content of scene 2
		Button button2 = new Button("Let's go back to scene 1");
		button2.setOnAction(e -> primaryStage.setScene(scene1));
		// Layout for scene 2
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);

		// Set first scene
		primaryStage.setScene(scene1);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
