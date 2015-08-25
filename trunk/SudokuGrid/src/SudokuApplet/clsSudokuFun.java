/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SudokuApplet;

/**
 *
 * @author Ashish
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class clsSudokuFun {
    AudioClip victory = null;
    AudioClip failure = null;
    
    public static void PlayFailure(){
        try {
   
            File victory = new File("failure.wav");
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(victory);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();

        }catch (Exception e) {
    System.out.println("Can't find file");
        }
    }
    public void PlayVictory(){
        try {
   
            File victory = new File("victory.wav");
            AudioInputStream stream;
            AudioFormat format;
            DataLine.Info info;
            Clip clip;

            stream = AudioSystem.getAudioInputStream(victory);
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();

        }catch (Exception e) {
    System.out.println("Can't find file");
        }
    }
}
