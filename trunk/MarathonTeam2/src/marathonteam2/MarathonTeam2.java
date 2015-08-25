package marathonteam2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MarathonTeam2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(40);
        VBox title = new VBox();
        VBox buttons = new VBox(10);
        
        Scene scene = new Scene(root, 300, 250);
        
        title.setAlignment(Pos.CENTER);
        buttons.setAlignment(Pos.CENTER);

        Text Title = new Text("Marathon!");
        Title.setFont(Font.font("Verdana", 50));

        Button MarathonButton = new Button("Marathon!");
        Button ProfileButton = new Button("Profiles");

        Button ExitButton = new Button("Exit");
                
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        title.getChildren().add(Title);
        buttons.getChildren().add(MarathonButton);
        buttons.getChildren().add(ProfileButton);
        buttons.getChildren().add(ExitButton);
        root.getChildren().add(title);
        root.getChildren().add(buttons);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    }
    

