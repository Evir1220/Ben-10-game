package ben10StoryModeGame;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Battle3 {
	static JLabel counterLabel4;
	static Timer timer5;
	static int seconds5=60;
	static JLabel counterLabel6;
	static Timer timer7;
	static int seconds7=30;
	public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
	
Scanner scanner=new Scanner(System.in);
System.out.println("After you unlock the spaceship, you go inside and find a lot of mazes."
		+ "\nA new alien comes and you use that alien to solve the mazes(Xlr8)"
		+ "\nYou use the speed of the new alein to complete the mazes fast.");
        System.out.println("   ████████████████████████████\r\n"
        		+ "      █     █     █           █\r\n"
        		+ "████  █  ████  ████  ████  █  █\r\n"
        		+ "█  █     █              █  █  █\r\n"
        		+ "█  █  ████  █████████████  █  █\r\n"
        		+ "█     █        █     █     █  █\r\n"
        		+ "█  █  ████  ███████  █  ████  █\r\n"
        		+ "█  █  █  █        █     █     █\r\n"
        		+ "█  ████  █  ████  █  ████  █  █\r\n"
        		+ "█  █        █  █  █  █  █  █  █\r\n"
        		+ "█  █  ███████  █  ████  █  ████\r\n"
        		+ "█     █     █           █  █  █\r\n"
        		+ "█  █  █  █  ███████  ███████  █\r\n"
        		+ "█  █     █        █           █\r\n"
        		+ "█  █████████████  ███████  ████\r\n"
        		+ "█  █           █  █  █  █  █  █\r\n"
        		+ "█  ████  ██████████  █  █  █  █\r\n"
        		+ "█     █  █  █                 █\r\n"
        		+ "████  █  █  ███████  ███████  █\r\n"
        		+ "█              █        █     \r\n"
        		+ "████████████████████████████  \r\n"
        		+ "\r\n"
        		+ "");
        System.out.println("INSTRUCTIONS!!!!You need to complete the maze in a certain amount of time to win and if the time runs out, you will lose the level."
        		+ "\n Please make sure eclipse is not full screen for the timer, so you can see how much time left."
        		+ "\nYou will have 4 options UP, DOWN, LEFT, RIGHT, and you must pick the right option to complete the maze."
        		+ "\nRemember!!!: 1 is for up, 2 is for down, 3 is for right and 4 is for left."
        		+ "\nGoodluck!!!");
        System.out.println("\n1. Press 'C' to start the challenge.");
        
        String maze="";
        String move="";
        String move2="";
        String move3="";
        String move4="";
        String move5="";
        String move6="";
        String move7="";
        String move8="";
        String move9="";
        String move10="";
        String move11="";
        String move12="";
        String move13="";
        String move14="";
        String move15="";
        String move16="";

        do {
        	maze=scanner.nextLine();
        	if(maze.equalsIgnoreCase("C")) {
        		JFrame frame7= new JFrame();
         		frame7.setTitle("Countdown");
         		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         		frame7.setResizable(true);
         		frame7.setSize(420,200);
         		counterLabel6=new JLabel("Timer");
         		counterLabel6.setBounds(500, 300, 200, 100);
         		frame7.add(counterLabel6);
         		counterLabel6.setHorizontalAlignment(JLabel.CENTER);
         		Font font7=new Font("Arial",Font.PLAIN,70);
         		counterLabel6.setFont(font7);
         		frame7.setVisible(true);
         		simpleTimer5();
         		timer7.start();
         		        		do {
        			
        		System.out.println("\n1. Up."
        				+ "\n2. Down."
        				+ "\n3. Right."
        				+ "\n4. Left");
        		move=scanner.nextLine();
        		if(move.equals("1")) {
        			System.out.println("That was not the correct option.");
        			return;
        		}
        		else if(move.equals("2")) {
        			System.out.println("That was not the correct option");
        			return;
        		}
        		else if(move.equals("3")) {
        			
        				System.out.println("That was the correct option.");
        				do {
                		System.out.println("\n1. Up."
                				+ "\n2. Down."
                				+ "\n3. Right."
                				+ "\n4. Left");
                		move2=scanner.nextLine();
                		if(move2.equals("1")) {
                			System.out.println("That was not the correct option.");
                			return;
                		}
                		else if(move2.equals("2")) {
                			
                				System.out.println("That was the correct option.");
                				do {
                        		System.out.println("\n1. Up."
                        				+ "\n2. Down."
                        				+ "\n3. Right."
                        				+ "\n4. Left");
                        		move3=scanner.nextLine();
                        		if(move3.equals("1")) {
                        			System.out.println("That was not the correct option.");
                        			return;
                        		}
                        		else if(move3.equals("2")) {
                        			System.out.println("That ws not the correct option.");
                        			return;
                        		}
                        		else if(move3.equals("3")) {
                        			System.out.println("That was not the correct option.");
                        			return;
                        		}
                        		else if(move3.equals("4")) {
                        			
                        				System.out.println("That was the correct option.");
                        				do {
                                		System.out.println("\n1. Up."
                                				+ "\n2. Down."
                                				+ "\n3. Right."
                                				+ "\n4. Left");
                                		move4=scanner.nextLine();
                                		if(move4.equals("1")) {
                                			System.out.println("That was not the correct option.");
                                			return;
                                		}
                                		else if(move4.equals("2")) {
                                			
                                				System.out.println("That was not the correct option.");
                                				do {
                                        		System.out.println("\n1. Up."
                                        				+ "\n2. Down."
                                        				+ "\n3. Right."
                                        				+ "\n4. Left");
                                        		move5=scanner.nextLine();
                                        		if(move5.equals("1")) {
                                        			System.out.println("That was not the correct option.");
                                        			return;
                                        		}
                                        		else if(move5.equals("2")) {
                                        			System.out.println("That was not the correct option.");
                                        			return;
                                        		}
                                        		else if(move5.equals("3")) {
                                    				System.out.println("That was not the correct option.");
                                    				do {
                                            		System.out.println("\n1. Up."
                                            				+ "\n2. Down."
                                            				+ "\n3. Right."
                                            				+ "\n4. Left");
                                            		move6=scanner.nextLine();
                                            		if(move6.equals("1")) {
                                        				System.out.println("That was not the correct option.");
                                        				do {
                                                		System.out.println("\n1. Up."
                                                				+ "\n2. Down."
                                                				+ "\n3. Right."
                                                				+ "\n4. Left");
                                                		move7=scanner.nextLine();
                                                		if(move7.equals("1")) {
                                                			System.out.println("That was not the correct option.");
                                                			return;
                                                		}
                                                		else if(move7.equals("2")) {
                                                			System.out.println("That was not the right option.");
                                                			return;
                                                		}
                                                		else if(move7.equals("3")) {
                                            				System.out.println("That was not the correct option.");
                                            				do {
                                                    		System.out.println("\n1. Up."
                                                    				+ "\n2. Down."
                                                    				+ "\n3. Right."
                                                    				+ "\n4. Left");
                                                    		move8=scanner.nextLine();
                                                    		if(move8.equals("1")) {
                                                				System.out.println("That was not the correct option.");
                                                				do {
                                                        		System.out.println("\n1. Up."
                                                        				+ "\n2. Down."
                                                        				+ "\n3. Right."
                                                        				+ "\n4. Left");
                                                        		move9=scanner.nextLine();
                                                        		if(move9.equals("1")) {
                                                        			System.out.println("That was not the correct option.");
                                                        			return;
                                                        		}
                                                        		else if(move9.equals("2")) {
                                                        			System.out.println("That was not the right option.");
                                                        			return;
                                                        		}
                                                        		else if(move9.equals("3")) {
                                                    				System.out.println("That was not the correct option.");
                                                    				do {
                                                            		System.out.println("\n1. Up."
                                                            				+ "\n2. Down."
                                                            				+ "\n3. Right."
                                                            				+ "\n4. Left");
                                                            		move10=scanner.nextLine();
                                                            		if(move10.equals("1")) {
                                                            			System.out.println("That was not the correct option.");
                                                            			return;
                                                            		}
                                                            		else if(move10.equals("2")) {
                                                            			System.out.println("That was not the right option.");
                                                            			return;
                                                            		}
                                                            		else if(move10.equals("3")) {
                                                            			System.out.println("That was not the right answer.");
                                                            			return;
                                                            		}
                                                            		else if(move10.equals("4")) {
                                                        				System.out.println("That was not the correct option.");
                                                        				do {
                                                                		System.out.println("\n1. Up."
                                                                				+ "\n2. Down."
                                                                				+ "\n3. Right."
                                                                				+ "\n4. Left");
                                                                		move11=scanner.nextLine();
                                                                		if(move11.equals("1")) {
                                                                			System.out.println("That was not the correct option.");
                                                                			return;
                                                                		}
                                                                		else if(move11.equals("2")) {
                                                                			System.out.println("That was not the right option.");
                                                                			return;
                                                                		}
                                                                		else if(move11.equals("3")) {
                                                            				System.out.println("That was not the correct option.");
                                                            				do {
                                                                    		System.out.println("\n1. Up."
                                                                    				+ "\n2. Down."
                                                                    				+ "\n3. Right."
                                                                    				+ "\n4. Left");
                                                                    		move12=scanner.nextLine();
                                                                    		if(move5.equals("1")) {
                                                                    			System.out.println("That was not the correct option.");
                                                                    			return;
                                                                    		}
                                                                    		else if(move12.equals("2")) {
                                                                				System.out.println("That was not the correct option.");
                                                                				do {
                                                                        		System.out.println("\n1. Up."
                                                                        				+ "\n2. Down."
                                                                        				+ "\n3. Right."
                                                                        				+ "\n4. Left");
                                                                        		move13=scanner.nextLine();
                                                                        		if(move13.equals("1")) {
                                                                        			System.out.println("That was not the correct option.");
                                                                        			return;
                                                                        		}
                                                                        		else if(move13.equals("2")) {
                                                                        			System.out.println("That was not the right option.");
                                                                        			return;
                                                                        		}
                                                                        		else if(move13.equals("3")) {
                                                                    				System.out.println("That was not the correct option.");
                                                                    				do {
                                                                            		System.out.println("\n1. Up."
                                                                            				+ "\n2. Down."
                                                                            				+ "\n3. Right."
                                                                            				+ "\n4. Left");
                                                                            		move14=scanner.nextLine();
                                                                            		if(move14.equals("1")) {
                                                                            			System.out.println("That was not the correct option.");
                                                                            			return;
                                                                            		}
                                                                            		else if(move14.equals("2")) {
                                                                        				System.out.println("That was not the correct option.");
                                                                        				do {
                                                                                		System.out.println("\n1. Up."
                                                                                				+ "\n2. Down."
                                                                                				+ "\n3. Right."
                                                                                				+ "\n4. Left");
                                                                                		move15=scanner.nextLine();
                                                                                		if(move5.equals("1")) {
                                                                                			System.out.println("That was not the correct option.");
                                                                                			return;
                                                                                		}
                                                                                		else if(move15.equals("2")) {
                                                                                			System.out.println("That was not the right option.");
                                                                                			return;
                                                                                		}
                                                                                		else if(move15.equals("3")) {
                                                                            				System.out.println("That was not the correct option.");
                                                                            				do {
                                                                                    		System.out.println("\n1. Up."
                                                                                    				+ "\n2. Down."
                                                                                    				+ "\n3. Right."
                                                                                    				+ "\n4. Left");
                                                                                    		move16=scanner.nextLine();
                                                                                    		if(move16.equals("1")) {
                                                                                    			System.out.println("That was not the correct option.");
                                                                                    			return;
                                                                                    		}
                                                                                    		else if(move16.equals("2")) {
                                                                                    			System.out
																										.println("You won the level 3!!!!!"
																												+ "\nCONGRATS!!!!!");
                                                                                    		}
                                                                                    		else if(move16.equals("3")) {
                                                                                    			System.out
																										.println("That was not the right answer.");
                                                                                    		}
                                                                                    		else if(move16.equals("4")) {
                                                                                    			System.out.println("That was not the right option.");
                                                                                    			return;
                                                                                    		}
                                                                                    		else
                                                                                    			System.out.println("Pick an option");
                                                                                    		} while (!move16.equals("1")&&!move16.equals("2")&&!move16.equals("3")&&!move16.equals("4"));
                                                                                		}
                                                                                		else if(move15.equals("4")) {
                                                                                			System.out.println("That was not the right option.");
                                                                                			return;
                                                                                		}
                                                                                		else
                                                                                			System.out.println("Pick an option");
                                                                                		} while (!move15.equals("1")&&!move15.equals("2")&&!move15.equals("3")&&!move15.equals("4"));
                                                                            		}
                                                                            		else if(move14.equals("3")) {
                                                                            			System.out
																								.println("That was not the right option");
                                                                            			return;
                                                                            		}
                                                                            		else if(move14.equals("4")) {
                                                                            			System.out.println("That was not the right option.");
                                                                            			return;
                                                                            		}
                                                                            		else
                                                                            			System.out.println("Pick an option");
                                                                            		} while (!move14.equals("1")&&!move14.equals("2")&&!move14.equals("3")&&!move14.equals("4"));
                                                                        		}
                                                                        		else if(move13.equals("4")) {
                                                                        			System.out.println("That was not the right option.");
                                                                        			return;
                                                                        		}
                                                                        		else
                                                                        			System.out.println("Pick an option");
                                                                        		} while (!move13.equals("1")&&!move13.equals("2")&&!move13.equals("3")&&!move13.equals("4"));
                                                                    		}
                                                                    		else if(move12.equals("3")) {
                                                                    			System.out.println("That was not the option.");
                                                                    		}
                                                                    		else if(move12.equals("4")) {
                                                                    			System.out.println("That was not the right option.");
                                                                    			return;
                                                                    		}
                                                                    		else
                                                                    			System.out.println("Pick an option");
                                                                    		} while (!move5.equals("1")&&!move5.equals("2")&&!move5.equals("3")&&!move5.equals("4"));
                                                                		}
                                                                		else if(move11.equals("4")) {
                                                                			System.out.println("That was not the right option.");
                                                                			return;
                                                                		}
                                                                		else
                                                                			System.out.println("Pick an option");
                                                                		} while (!move11.equals("1")&&!move11.equals("2")&&!move11.equals("3")&&!move11.equals("4"));
                                                            		}
                                                            		else
                                                            			System.out.println("Pick an option");
                                                            		} while (!move5.equals("1")&&!move5.equals("2")&&!move5.equals("3")&&!move5.equals("4"));
                                                        		}
                                                        		else if(move9.equals("4")) {
                                                        			System.out.println("That was not the right option.");
                                                        			return;
                                                        		}
                                                        		else
                                                        			System.out.println("Pick an option");
                                                        		} while (!move9.equals("1")&&!move9.equals("2")&&!move9.equals("3")&&!move9.equals("4"));
                                                    		}
                                                    		else if(move8.equals("2")) {
                                                    			System.out.println("That was not the right option.");
                                                    			return;
                                                    		}
                                                    		else if(move8.equals("3")) {
                                                    			System.out.println("That was not the rifht option.");
                                                    			return;
                                                    		}
                                                    		else if(move8.equals("4")) {
                                                    			System.out.println("That was not the right option.");
                                                    			return;
                                                    		}
                                                    		else
                                                    			System.out.println("Pick an option");
                                                    		} while (!move8.equals("1")&&!move8.equals("2")&&!move8.equals("3")&&!move8.equals("4"));
                                                		}
                                                		else if(move7.equals("4")) {
                                                			System.out.println("That was not the right option.");
                                                			return;
                                                		}
                                                		else
                                                			System.out.println("Pick an option");
                                                		} while (!move7.equals("1")&&!move7.equals("2")&&!move7.equals("3")&&!move7.equals("4"));
                                            		}
                                            		else if(move6.equals("2")) {
                                            			System.out.println("That was not the correct option.");
                                            			return;
                                            		}
                                            		else if(move6.equals("3")) {
                                            			System.out.println("That was not the correct option.");
                                            		}
                                            		else if(move6.equals("4")) {
                                            			System.out.println("That was not the correct option.");
                                            			return;
                                            		}
                                            		else
                                            			System.out.println("Pick an option");
                                            		} while (!move6.equals("1")&&!move6.equals("2")&&!move6.equals("3")&&!move6.equals("4"));
                                        		}
                                        		else if(move.equals("4")) {
                                        			System.out.println("That was not the correct option.");
                                        			return;
                                        		}
                                        		else
                                        			System.out.println("Pick an option");
                                        		} while (!move5.equals("1")&&!move5.equals("2")&&!move5.equals("3")&&!move5.equals("4"));
                                		}
                                		else if(move4.equals("3")) {
                                			System.out.println("That was not the correct option.");
                                			return;
                                		}
                                		else if(move4.equals("4")) {
                                			System.out.println("That was not the correct option.");
                                			return;
                                		}
                                		else
                                			System.out.println("Pick an option");
                                		} while (!move4.equals("1")&&!move4.equals("2")&&!move4.equals("3")&&!move4.equals("4"));
                        		}
                        		else
                        			System.out.println("Pick an option");
                        		} while (!move3.equals("1")&&!move3.equals("2")&&!move3.equals("3")&&!move3.equals("4"));
                		}
                		else if(move2.equals("3")) {
                			System.out.println("That was not the correct option.");
                			return;
                		}
                		else if(move2.equals("4")) {
                			System.out.println("That was not the correct option.");
                			return;
                		}
                		else
                			System.out.println("Pick an option");
                		} while (!move2.equals("1")&&!move2.equals("2")&&!move2.equals("3")&&!move2.equals("4"));
        		}
        		else if(move.equals("4")) {
        			System.out.println("That was not the correct option.");
        			return;
        		}
        		else
        			System.out.println("Pick an option");
        		} while (!move.equals("1")&&!move.equals("2")&&!move.equals("3")&&!move.equals("4"));
        	}
        	else
        		System.out.println("Pick an option.");
        }
        while (!maze.equalsIgnoreCase("C"));
	}
	public static void simpleTimer5() {
		timer5=new Timer(1000, new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				seconds5--;
				counterLabel4.setText(""+ seconds5);
				if (seconds5==0) {
					System.out.println("You lose the level.");
					timer5.stop();
					return;
				}

			}
		});}

}
