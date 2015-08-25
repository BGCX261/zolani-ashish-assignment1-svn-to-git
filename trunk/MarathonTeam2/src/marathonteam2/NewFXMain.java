/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marathonteam2;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author Lab4
 */
public class NewFXMain extends Application {

    Random RR = new Random();
    PathTransition transition1 = new PathTransition();
    PathTransition transition2 = new PathTransition();
    PathTransition transition3 = new PathTransition();
    PathTransition transition4 = new PathTransition();

    @Override
    public void start(Stage primaryStage) {

        int length = 550;
        int sp_lim = 10;

        VBox runners = new VBox();
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.TOP_RIGHT);


        Rectangle square = new Rectangle(-10, -50, 20, 20);
        square.setFill(Color.RED);

        Circle circ = new Circle(-10, -90, 10);
        circ.setFill(Color.PURPLE);

        Rectangle rect = new Rectangle(-10, -150, 30, 10);
        rect.setFill(Color.TAN);

        Ellipse ellip = new Ellipse(-10, -205, 7, 15);
        ellip.setFill(Color.GREEN);


        HLineTo Line1 = new HLineTo();
        HLineTo Line2 = new HLineTo();
        HLineTo Line3 = new HLineTo();
        HLineTo Line4 = new HLineTo();

        Line1.setX(length);
        Line2.setX(length);
        Line3.setX(length);
        Line4.setX(length);



        Path lane1 = new Path();
        lane1.getElements().add(new MoveTo(0, 0));
        lane1.getElements().add(Line1);

        Path lane2 = new Path();
        lane2.getElements().add(new MoveTo(0, 0));
        lane2.getElements().add(Line2);

        Path lane3 = new Path();
        lane3.getElements().add(new MoveTo(0, 0));
        lane3.getElements().add(Line3);

        Path lane4 = new Path();
        lane4.getElements().add(new MoveTo(0, 0));
        lane4.getElements().add(Line4);

        transition1.setDuration(Duration.seconds(RR.nextInt(sp_lim) + 2 +  RR.nextFloat()));
        transition1.setPath(lane1);
        transition1.setNode(square);
        transition1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        transition2.setDuration(Duration.seconds(RR.nextInt(sp_lim) + 2 + RR.nextFloat()));
        transition2.setPath(lane2);
        transition2.setNode(circ);
        transition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        transition3.setDuration(Duration.seconds(RR.nextInt(sp_lim) + 2 + RR.nextFloat()));
        transition3.setPath(lane4);
        transition3.setNode(rect);
        transition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

        transition4.setDuration(Duration.seconds(RR.nextInt(sp_lim) + 2 + RR.nextFloat()));
        transition4.setPath(lane4);
        transition4.setNode(ellip);
        transition4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 300);
        
        Text Results = new Text();
        Button Start = new Button("RUN");
        Start.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                play();
            }
        });

        runners.getChildren().add(square);
        runners.getChildren().add(circ);
        runners.getChildren().add(rect);
        runners.getChildren().add(ellip);
        buttons.getChildren().add(Start);
        root.getChildren().add(runners);
        root.getChildren().add(buttons);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

    public void play() {
        transition1.play();
        transition2.play();
        transition3.play();
        transition4.play();
        
    }
}
