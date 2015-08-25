package marathonteam2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.Event;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import profiles.Profile;

public class Menu extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {

        VBox root = new VBox(40);
        VBox title = new VBox();
        VBox buttons = new VBox(10);
        
        Scene scene = new Scene(root, 300, 250);
        
        try{
        AudioClip Crowd = new AudioClip("crowd.mp3");
        Crowd.play();
        }catch(NullPointerException ex){
            System.out.println("Not Found!");
        }

        
        title.setAlignment(Pos.CENTER);
        buttons.setAlignment(Pos.CENTER);

        Text Title = new Text("Marathon!");
        Title.setFont(Font.font("Verdana", 50));

        Button MarathonButton = new Button("Marathon!");
        MarathonButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                new Marathon();
            }
        });
        Button ProfileButton = new Button("Profiles");
        ProfileButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
               new Profile();
            }
        });

        Button ExitButton = new Button("Exit");
        ExitButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
               System.exit(0);
            }
        });
                
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
    

