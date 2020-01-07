package lm_javafx.gettingStarted.helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public final class MyFirstJavaFxWindow extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Mein erstes Fenster");

		Button button = new Button("Klick mich");

		button.setOnAction( event ->  System.out.println( "Hello World!" ) );

		StackPane layout = new StackPane();
		layout.getChildren().add(button);

		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);

		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
