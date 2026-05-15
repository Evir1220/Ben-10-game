package ben10StoryModeGame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
	
    
	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		  File file1 = new File("45882_01.wav");
		  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
		  Clip clip = AudioSystem.getClip();
		  clip.open(audioStream);
		  int tries10=0;
		  String music2="";
	
			  
		  
		  do {
			  System.out.println("Press 'O' to start the story line.");
			  music2=scanner.next();
			  if(music2.equalsIgnoreCase("O")) {
				  clip.start();
				  
			  }
			  else if (music2.equalsIgnoreCase("n")) {
				  clip.stop();
			  }
			  else {
				  System.out.println("Pick an option.");
				  return;
			  }
		  } 
		  while(music2.equalsIgnoreCase("o")&&tries10<=3);
	
	
		
		  
				
	}

}
