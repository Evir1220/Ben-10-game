package ben10StoryModeGame;

import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Battle2 {
	static JLabel counterLabel;
	static JLabel counterLabel1;
	static Timer timer;
	static Timer timer2;
	static int seconds=30;
	static int seconds2=30;
	static Timer timer3;
	static JLabel counterLabel2;
	static int seconds3=30;
	static Timer timer4;
	static JLabel counterLabel3;
	static int seconds4=30;
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 File file = new File("02.wav");
		  AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		  Clip clip = AudioSystem.getClip();
		  clip.open(audioStream);
		  
		  String response2 = "";
				do {
				   System.out.println("P = play, Do not play the music'S'(You cannot stop the music till the level finishes.)");
				   System.out.print("Enter your choice: ");
				   
				   response2 = scanner.next();
				   if(response2.equalsIgnoreCase("P")) {
					   System.out.println("You play the music.");
					   clip.start();
					   clip.loop(Clip.LOOP_CONTINUOUSLY);
				   }
				   else if(response2.equalsIgnoreCase("S")) {
					   System.out.println("You stop the music.");
					   clip.close();
				   }
				}  
				while(!response2.equalsIgnoreCase("P")&&!response2.equalsIgnoreCase("S"));
		  
		  
		 
		
		
        System.out.println("INSTRUCTIONS!!! Please make sure eclipse is not full screen for this."
        		+ "\n There will be a timer and you have to stop the time at the right time to attack..");
        		int tries13=0;
        		int tries14=0;
        		int tries15=0;
        		int tries16=0;
         int tries12=0;
         String choice="";
         String choice2="";
         String challenge2="";
         String start="";
         String start2="";
         String start3="";
         String start4="";
         String start5="";
         String level3="";
         do {
        	 do {
        		 System.out.println("1.Start the challenge??");
            	 choice=scanner.next();
         		if(choice.equals("1")) {
         		JFrame frame= new JFrame();
         		frame.setTitle("Countdown");
         		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         		frame.setResizable(true);
         		frame.setSize(420,200);
         		counterLabel=new JLabel("Timer");
         		counterLabel.setBounds(500, 300, 200, 100);
         		frame.add(counterLabel);
         		counterLabel.setHorizontalAlignment(JLabel.CENTER);
         		Font font=new Font("Arial",Font.PLAIN,70);
         		counterLabel.setFont(font);
         		frame.setVisible(true);
         		simpleTimer();
         		timer.start();
         		}
             }
             while (!choice.equals("1")&&tries12<5);
             do {
            	 
         		System.out.println("INSTRUCTIONS!!!!! Press 'S' to stop the timer."
         				+ "\nYour task is to stop the timer at 5sec."
         				+ "\nPlease DO NOT put eclipse in full screen, and put the eclipse to the right side."
         				+ "\nThank you. ");
         		choice2=scanner.next();
         		if(choice2.equalsIgnoreCase("S")) {
         			timer.stop();
         		
         			if(seconds==5) {
         				do {
         				System.out.println("This was a sample of the challenge. Now it is going to get more difficult.");
         				System.out.println("Press 'N' to play the next challenge.");
         				challenge2=scanner.next();
         				if(challenge2.equalsIgnoreCase("N")) {
         					JFrame frame1= new JFrame();
         		     		frame1.setTitle("Countdown1");
         		     		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         		     		frame1.setResizable(true);
         		     		frame1.setSize(420,200);
         		     		counterLabel1=new JLabel("Timer2");
         		     		counterLabel1.setBounds(500, 300, 200, 100);
         		     		frame1.add(counterLabel1);
         		     		counterLabel1.setHorizontalAlignment(JLabel.CENTER);
         		     		Font font=new Font("Arial",Font.PLAIN,70);
         		     		counterLabel1.setFont(font);
         		     		frame1.setVisible(true);
         					simpleTimer2();
         					timer2.start();
         					do {
         					System.out.println("Press 'S' to stop the timer.");
         					
         						start=scanner.next();
         					if(start.equalsIgnoreCase("S")) {
             					timer2.stop();
             					if(seconds2==5) {
             						do {
             	     				System.out.println("You made it till here. Can you win 2 more times?? Now it is going to get more diffucutlt.");
             	     				System.out.println("Press 'V' to play the next challenge.");
             	     				start2=scanner.next();
             	     				if(start2.equalsIgnoreCase("V")) {
             	     					JFrame frame2= new JFrame();
             	     		     		frame2.setTitle("Countdown2");
             	     		     		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             	     		     		frame2.setResizable(true);
             	     		     		frame2.setSize(420,200);
             	     		     		counterLabel2=new JLabel("Timer1");
             	     		     		counterLabel2.setBounds(500, 300, 200, 100);
             	     		     		frame2.add(counterLabel2);
             	     		     		counterLabel2.setHorizontalAlignment(JLabel.CENTER);
             	     		     		Font font2=new Font("Arial",Font.PLAIN,70);
             	     		     		counterLabel2.setFont(font2);
             	     		     		frame2.setVisible(true);
             	     					simpleTimer3();
             	     					timer3.start();
             	     					do {
             	     					System.out.println("Press 'S' to stop the timer.");
             	     					
             	     						start3=scanner.next();
             	     						if(start3.equalsIgnoreCase("S")) {
             	     							timer3.stop();
             	     							if (seconds3==5) {
             	     								do {
             	     								System.out.println("You are very close, just one more to go.");
             	     								System.out.println("The last level('R')");
             	     								start4=scanner.next();
             	     								if(start4.equalsIgnoreCase("R")) {
             	     									JFrame frame3= new JFrame();
             	            	     		     		frame3.setTitle("Countdown2");
             	            	     		     		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             	            	     		     		frame3.setResizable(true);
             	            	     		     		frame3.setSize(420,200);
             	            	     		     		counterLabel3=new JLabel("Timer3");
             	            	     		     		counterLabel3.setBounds(500, 300, 200, 100);
             	            	     		     		frame3.add(counterLabel3);
             	            	     		     		counterLabel3.setHorizontalAlignment(JLabel.CENTER);
             	            	     		     		Font font3=new Font("Arial",Font.PLAIN,70);
             	            	     		     		counterLabel3.setFont(font3);
             	            	     		     		frame3.setVisible(true);
             	            	     					simpleTimer4();
             	            	     					timer4.start();
             	            	     					do {
             	            	     					System.out.println("Press 'S' to stop the timer.");
             	            	     					
             	            	     						start5=scanner.next();
             	            	     						if(start5.equalsIgnoreCase("S")) {
             	            	     							timer4.stop();
             	            	     							if(seconds4==5) {
             	            	     								System.out.println("YOU COMPLETED THE CHALLENGE!!!!"
             	            	     										+ "\nCONGRATS!!!"
             	            	     										+ "\n1. Go to the level 3?");
             	            	     							}
             	            	     							else {
             	            	     								System.out.println("You lose the game.");
             	            	     								return;
             	            	     							}
             	            	     						}
             	            	     					}
             	            	     					while (!start5.equalsIgnoreCase("S"));
             	     								}
             	     								}while (!start4.equalsIgnoreCase("R"));
             	     							}
             	     							else {
             	     								System.out.println("You lose the game.");
             	     								return;
             	     							}
             	     						}
             	     					}
             	     					while (!start3.equalsIgnoreCase("S"));
             	     					
             	     				}
             						}while (!start2.equalsIgnoreCase("V"));
             				}
             					else {
             						System.out.println("You lose the game.");
             						return;
             					}
         					}
         					else {
         						System.out.println("You lose the game.");
         						return;
         					}
             			}
         					while (!start.equalsIgnoreCase("S"));
         				}
         			
         		
         			}
         				while (!challenge2.equalsIgnoreCase("N"));
         		}
         			else  {
         				System.out.println("You lose the game.");
         				return;
         			}
             }
             }
             while (!choice2.equalsIgnoreCase("S"));
        	 }while(seconds!=5);
        	
	}
	
	public static void simpleTimer() {
		timer=new Timer(1000, new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				seconds--;
				counterLabel.setText(""+ seconds);
				if (seconds==0) {
					timer.stop();
				}
			

			}
		});}
		public static void simpleTimer2() {
			timer2=new Timer(500, new ActionListener() {
			

				public void actionPerformed(ActionEvent e) {
					seconds2--;
					counterLabel1.setText(""+ seconds2);
					if (seconds2==0) {
						timer2.stop();
					}

				}
			});}
		
			public static void simpleTimer3() {
				timer3=new Timer(300, new ActionListener() {
				

					public void actionPerformed(ActionEvent e) {
						seconds3--;
						counterLabel2.setText(""+ seconds3);
						if (seconds3==0) {
							timer3.stop();
						}

					}
				});}
				public static void simpleTimer4() {
					timer4=new Timer(200, new ActionListener() {
					

						public void actionPerformed(ActionEvent e) {
							seconds4--;
							counterLabel3.setText(""+ seconds4);
							if (seconds4==0) {
								timer4.stop();
							}

						}
					});
}

}
