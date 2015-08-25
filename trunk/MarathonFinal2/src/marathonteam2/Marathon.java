package marathonteam2;

import java.util.Random;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 *
 * @author Lab4
 */
public final class Marathon extends Application {

    public Marathon() {
        start(new Stage());
    }
    
    boolean finished = false;
    
    Random RR = new Random();
    PathTransition transition1 = new PathTransition();
    PathTransition transition2 = new PathTransition();
    PathTransition transition3 = new PathTransition();
    PathTransition transition4 = new PathTransition();

    @Override
    public void start(Stage primaryStage) {

        int length = 550;
        int sp_lim = 10;
        

        Line path1 = new Line();
        path1.setStartX(-475);
        path1.setEndX(100);
        path1.setStroke(Color.RED);

        Line path2 = new Line();
        path2.setStartX(-475f);
        path2.setEndX(100f);
        path2.setStroke(Color.PURPLE);

        Line path3 = new Line();
        path3.setStartX(-475f);
        path3.setEndX(100f);
        path3.setStroke(Color.TAN);

        Line path4 = new Line();
        path4.setStartX(-475f);
        path4.setEndX(100f);
        path4.setStroke(Color.GREEN);

        VBox runners = new VBox();
        VBox paths = new VBox(20);
        paths.setAlignment(Pos.CENTER);
        
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.TOP_RIGHT);


        Rectangle square = new Rectangle(-10, -70, 20, 20);
        square.setFill(Color.RED);

        Circle circ = new Circle(-10, -100, 10);
        circ.setFill(Color.PURPLE);

        Rectangle rect = new Rectangle(-10, -140, 30, 10);
        rect.setFill(Color.TAN);

        Ellipse ellip = new Ellipse(-10, -180, 7, 15);
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

        transition1.setDuration(Duration.seconds(getDurationByBinding(RR.nextInt(sp_lim), RR.nextDouble())));
        transition1.setPath(lane1);
        transition1.setNode(square);
        transition1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        ObjectProperty<EventHandler<ActionEvent>> onFinishedProperty = transition1.onFinishedProperty();
        onFinishedProperty.setValue(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(!finished){
                    JOptionPane.showMessageDialog(null, "RUNNER 1 WINS!");
                    finished = true;
                }
            }
        });
        
        transition2.setDuration(Duration.seconds(getDurationByBinding(RR.nextInt(sp_lim), RR.nextDouble())));
        transition2.setPath(lane2);
        transition2.setNode(circ);
        transition2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        ObjectProperty<EventHandler<ActionEvent>> run2finished = transition2.onFinishedProperty();
        run2finished.setValue(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(!finished){
                    JOptionPane.showMessageDialog(null, "RUNNER 2 WINS!");
                    finished = true;
                }
            }
        });

        transition3.setDuration(Duration.seconds(getDurationByBinding(RR.nextInt(sp_lim), RR.nextDouble())));
        transition3.setPath(lane4);
        transition3.setNode(rect);
        transition3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        ObjectProperty<EventHandler<ActionEvent>> run3finished = transition3.onFinishedProperty();
        run3finished.setValue(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(!finished){
                    JOptionPane.showMessageDialog(null, "RUNNER 3 WINS!");
                    finished = true;
                }
            }
        });

        transition4.setDuration(Duration.seconds(getDurationByBinding(RR.nextInt(sp_lim), RR.nextDouble())));
        transition4.setPath(lane4);
        transition4.setNode(ellip);
        transition4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        ObjectProperty<EventHandler<ActionEvent>> run4finished = transition4.onFinishedProperty();
        run4finished.setValue(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if(!finished){
                    JOptionPane.showMessageDialog(null, "RUNNER 4 WINS!");
                    finished = true;
                }
            }
        });

        StackPane root = new StackPane();
        Scene scene = new Scene(root, 600, 300);

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
        paths.getChildren().add(path1);
        paths.getChildren().add(new Text("1"));
        paths.getChildren().add(path2);
        paths.getChildren().add(new Text("2"));
        paths.getChildren().add(path3);
        paths.getChildren().add(new Text("3"));
        paths.getChildren().add(path4);
        paths.getChildren().add(new Text("4"));
        root.getChildren().add(paths);
        root.getChildren().add(runners);
        root.getChildren().add(buttons);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {

        launch(args);
    }

    public double getDurationByBinding(int num1, double num2) {
        IntegerProperty speed = new SimpleIntegerProperty(num1);
        SimpleDoubleProperty duration = new SimpleDoubleProperty(num2 + 2);
        NumberBinding sum = speed.add(duration);
        return (double) sum.getValue();

    }

    public void play() {
        transition1.play();
        transition2.play();
        transition3.play();
        transition4.play();

    }
    
}
