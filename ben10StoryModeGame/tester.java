package ben10StoryModeGame;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class tester {
	
	public static void main(String[] args) { 
	JLabel wallpaper=new JLabel();;
		wallpaper.setText("INSTRUCTIONS!!!!! YOU CAN CHANGE THE WALLPAPER!!!! Steps: \n"
				+ "1.Download an Image(it should be a png!!!).\n"
				+ "2.Drag the image to this code and drag it to the package."
				+ "3.Now just go to the line 12 and put the name of the image and add \".png\"."
				+ "4.Make sure there is \".png\" after the name."
				+ "5.If you want to move your image in the frame then go to the line 21 and play around with the first 2 whole numbers,"
				+ "and see where you want the image inside the phone."
				+ "6.ENJOYYYY!!!");
	}
}
