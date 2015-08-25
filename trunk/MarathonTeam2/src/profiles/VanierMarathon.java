/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profiles;

import java.util.Random;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Lab4
 */
public class VanierMarathon extends Application implements athleteNameInterface {
    
    Group root = new Group();
    
    public void clear(Group root){
        root.getChildren().clear();
    }
    public void drawPerson(Group root, int playerNum){
        root.getChildren().add(playerName(playerNum));
        root.getChildren().add(makeBody());
        root.getChildren().add(makeHead());
        for(int i = startingPoint; i < numberOfPlayers; i ++){
        root.getChildren().add(makeEye()[i]);
        }
        
        root.getChildren().add(makeSmile());
        root.getChildren().add(makeHat());
    }
    public Label playerName(int numberOfPlayers){
        Label playerName = new Label();
        playerName.setText(playerNames[numberOfPlayers]);
        playerName.setFont(new Font("Dialog", 21));
        return playerName;
    }
    public Rectangle makeBody(){
        Rectangle body = new Rectangle(60, 120, 60,60);
        body.setArcHeight(20);
        body.setArcWidth(20);
        body.setFill(getRandomColor());
        return body;
    }
    public Circle[] makeEye(){
        Circle eye1[] = {new Circle(eyeXPosition,eyeYPosition,eyeSize), new Circle(eyeXPosition + 12,eyeYPosition,eyeSize), new Circle(eyeXPosition,eyeYPosition + 1,eyeSize -3), new Circle(eyeXPosition + 12,eyeYPosition + 1,eyeSize -3)};
        eye1[0].setFill(Color.WHITE);
        eye1[1].setFill(Color.WHITE);
        eye1[2].setFill(Color.BLACK);
        eye1[3].setFill(Color.BLACK);
        return eye1;
    }
    public Circle makeHead(){
        Circle head = new Circle(90,110,20);
        return head;
    }
    public Arc makeSmile(){
        Arc smile = new Arc();
        smile.setCenterX(90);
        smile.setCenterY(120);
        smile.setFill(Color.PINK);
        smile.setRadiusX(10);
        smile.setRadiusY(7);
        smile.setLength(180);
        smile.setStartAngle(180);
        smile.setType(ArcType.ROUND);
        return smile;
    }
    public Shape makeHat(){
        Arc smile = new Arc();
        smile.setCenterX(90);
        smile.setCenterY(102);
        smile.setFill(getRandomColor());
        smile.setRadiusX(19);
        smile.setRadiusY(17);
        smile.setLength(180);
        smile.setStartAngle(0);
        smile.setType(ArcType.ROUND);
        return smile;
    }
    public Color getRandomColor(){
        
        Random generator = new Random();
        Color randomColor = new Color(generator.nextDouble(),generator.nextDouble(),generator.nextDouble(), 1.0);
        return randomColor;
    }
    @Override
    public void start(final Stage primaryStage) /*throws Exception*/ {
    
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 180,170));

            Timeline fiveSecDelay = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {
               int playerNum = startingPoint;
               @Override 
                public void handle(ActionEvent event) {
                    
                    clear(root);
                    primaryStage.show();
                    drawPerson(root, playerNum);
                    playerNum++;
                }
    
            }
                    )
           );
            fiveSecDelay.setCycleCount(numberOfPlayers);
            fiveSecDelay.play();
    
    }
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}