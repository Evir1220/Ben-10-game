package ben10StoryModeGame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music2 {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		  
		  File file = new File("45882_01.wav");
		  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		  Clip clip = AudioSystem.getClip();
		  clip.open(audioStream);
		  
		  String response1 = "";
		 
		  
		do {
		   System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
		   System.out.print("Enter your choice: ");
		   
		   response1 = scanner.next();
		   
		   if(response1.equalsIgnoreCase("P")) {
			   System.out.println("You play the music.");
			   clip.start();
		   }
		   else if(response1.equalsIgnoreCase("S")) {
			   System.out.println("You stop the music.");
			   clip.close();

		   }
		   else {
			   System.out.println("Invalid");
		   }
		  } 
		  while(!response1.equalsIgnoreCase("P")||!response1.equalsIgnoreCase("S")||!response1.equalsIgnoreCase("Q"));
		  System.out.println("Byeeee!"); 
		  int tries10=0;
		  String music2="";
		  do {
			  System.out.println("Press 'O' to start the story line.");
			  music2=scanner.next();
			  if(music2.equalsIgnoreCase("q")) {
				  
			  }
			  else {
				  System.out.println("Pick an option.");
			  }
		  } 
		  while(!music2.equals("Q"));
		  
		  
		 
	}
	}


