package profiles;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Lab4
 */
public interface athleteNameInterface {
    String[] playerNames = {"Zolani ","Ashish", "Piccolo","YogiBear"};
    int numberOfPlayers = 4;
    int startingPoint = 0;
    int delay = 5000;
    int eyeSize = 5;
    int eyeYPosition = 110;
    int eyeXPosition = 84;
    IntegerProperty eyeSizes = new SimpleIntegerProperty(5);
    IntegerProperty eyeYPos = new SimpleIntegerProperty(110);
    IntegerProperty eyeXPos = new SimpleIntegerProperty(84);
}
