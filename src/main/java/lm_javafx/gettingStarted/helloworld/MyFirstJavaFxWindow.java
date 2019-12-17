package lm_javafx.gettingStarted.helloworld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFirstJavaFxWindow extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Mein erstes Fenster");

		Button button = new Button("Klick mich");

//		button.setOnAction( new MyButtonEventHandler() );

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

	private static class MyButtonEventHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent event) {
			System.out.println("Hello World!");
		}
	}
}
