package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Font;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 Label message = new Label("My First FX Application!");
			 message.setFont( new Font(40) );
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,450,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			 Button helloButton = new Button("Say Hello");
			 helloButton.setOnAction( e-> message.setText("Hello World!") );
			 Button goodbyeButton = new Button("Say Goodbye");
			 goodbyeButton.setOnAction( e-> message.setText("Goodbye!!") );
			 Button quitButton = new Button("Quit");
			 quitButton.setOnAction( e-> Platform.exit() );
			 HBox buttonBar = new HBox( 20, helloButton, goodbyeButton, quitButton );
			 buttonBar.setAlignment(Pos.CENTER);
			 root.setCenter(message);
			 root.setBottom(buttonBar);
			 primaryStage.setTitle("JavaFX Test");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
