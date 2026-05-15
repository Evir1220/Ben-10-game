package ben10StoryModeGame;

import java.util.Scanner;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Story {
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
	static JLabel counterLabel4;
	static Timer timer5;
	static int seconds5=60;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String level2="";
		String level3="";
			int tries=0;

			String a= "";

			do {

				tries++;

				//First option

				System.out.println("You are playing as Ben 10."

						+ "\nAlarm is ringin.."

						+ "\nYour options:"

						+ "\n1. Wake up"

						+ "\n2. Go back to sleep");

				a= scanner.nextLine();

				if (a.equals("1")) {

					System.out.println("You decided to wake up.");

					Thread.sleep(1000);

				}

				else if (a.equals("2")) {

					System.out.println("You decided to keep sleeping.");

					Thread.sleep(1000);

					System.out.println("\n\n*30 MINUTES LATER*"

							+ "\nYour mom wakes you up"

							+ "\n'Its time to wake up Ben.'");

					Thread.sleep(1000);

				}

				else {

					System.out.println("Invalid choice.");

				}

				int tries2=0;

				String b="";

				if (a.equals("1")||a.equals("2")) {

					tries2++;

					System.out.println("You brush your teeths, get ready and go downstairs."

							+ "\nYou get downstairs and say hello to your mom."

							+ "\n'Hi son, are you ready for the summer break?'");

					Thread.sleep(2000);

					System.out.println("'You are going with your grandpa for a trip. He is going to pick you up after 30 min, and eat your food.'");

					Thread.sleep(2000);

					System.out.println("\n\n*30 MINUTES LATER*"

							+ "\n'I am going mom byeee'");

					Thread.sleep(4000);

					System.out.println("'Hi Ben, we are going to camp in the woods and then from there we will decide where to go.'");

					Thread.sleep(2000);

					System.out.println("\n\n*AFTER 1 HOUR OF DRIVING*"

							+ "\nGrandpa: 'It is already night, let's setup our camp and then eat.'"

							+ "\nYou set up the camp and then eat."

							+ "\n'Let’s sleep now, we have to wake up early.'");

					Thread.sleep(2000);

					System.out.println("\n\n*3 AM*");

					Thread.sleep(2000);

					do {

						//second option

						System.out.println("you see a star come towards you, it changes direction and crashes close to you. You wake up your grandpa and you both go to see what is happening. You see a spaceship crashed."

								+ "\nYour options: "

								+ "\n1. Go and check it out"

								+ "\n2. Stay in the camp");

						b = scanner.nextLine();
						if (b.equals("1")) {
							
							
							System.out.println("You are going near the spaceship..");

							Thread.sleep(1500);

							System.out.println("A man comes out of it and says ‘you gotta take this watch and keep it safe.’⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣥⣬⣿⣶⣶⣶⣤⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣰⣾⣿⣿⣿⣿⠿⠿⠿⠿⠿⠿⣿⣿⣿⣿⣶⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣾⣿⣿⣿⡿⣫⡴⠖⠒⠒⠒⠒⠲⠤⣌⡉⠛⠿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⡤⠶⠖⠒⠒⠲⠶⣾⣿⣿⡿⠃⣿⣿⣿⣿⣼⣅⡀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⡦⣄⠙⠿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠶⠋⠥⠀⠀⢀⣀⣀⣠⣾⣿⣿⣿⠃⠀⢿⣿⣿⣿⡿⣿⣿⣷⣦⣄⣀⠀⠀⠀⢸⣿⣿⠃⠈⠳⢦⡈⠻⣿⣿⣿⣆⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⣧⠴⠶⠚⠛⠛⢿⣿⣿⣿⣿⣿⣿⣿⠀⣴⠞⠛⢿⣿⣷⠀⠉⠛⠻⢿⣿⣷⣦⠀⣾⣿⣿⠀⠀⠀⠈⠳⣄⠘⣿⣿⣿⡙⢦⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⢀⣠⠶⠾⠻⠿⢦⣄⣀⣤⣄⣀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣇⣿⣦⣤⡼⣸⣿⣧⡀⠀⠀⠀⠘⣿⣿⠀⠘⠿⣿⣷⣦⣄⠀⠀⠘⣆⠈⣿⣿⣷⣾⡇⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⢠⡾⠁⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀⠀⠉⢉⣿⠛⢿⣿⣿⣿⣿⣿⢿⣯⠶⠛⢿⣿⣿⣦⡀⠀⢰⣿⣿⠀⠀⠀⠈⠙⠿⣿⣿⣶⣤⣹⡄⢹⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⢠⠟⠀⢀⣤⣤⣄⡀⣼⠃⠀⠀⠀⠀⠀⢀⡾⠁⠀⠀⠻⣿⣿⣿⣿⣦⡀⠀⠀⠀⠙⢿⣿⣿⣶⣾⣿⡏⠀⠀⠀⠀⠀⠀⠀⠙⠻⣿⣿⠁⣼⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⡾⠀⣰⣿⣿⣿⣿⣿⣷⣶⣶⣶⣶⣶⣶⣾⡅⠀⠀⠀⢀⡿⣿⣿⣿⣿⣷⣆⠀⠀⠀⠀⠉⠻⢿⣿⣿⣷⣦⣄⣀⡀⠀⠀⠀⠀⣀⣴⣧⣾⣿⣿⣿⣿⣷⣀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⢀⡇⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⣰⡟⠁⠈⢿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠉⢻⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⢿⣿⣿⠟⢃⣿⣿⡛⠲⢦⣄⠀⠀\r\n"
									+ "⢸⡇⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡋⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣷⣤⣀⠀⠀⡟⠀⠀⠀⠉⠉⠛⠛⠛⣿⡇⣯⡀⢈⡏⠀⢀⣾⣿⣿⣧⠀⠀⠘⣷⠀\r\n"
									+ "⢸⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣧⣀⡀⠀⠀⠀⠀⠀⠀⠸⣿⣝⣿⡿⢃⣤⣿⣿⣿⣿⣿⡄⠀⠀⢹⡆\r\n"
									+ "⠘⡇⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡄⠀⣠⣾⡿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣤⣤⣤⣤⣾⣿⣿⣿⣿⣿⡟⠋⠻⣿⣇⠀⠀⠈⣧\r\n"
									+ "⠀⣧⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢡⡟⠁⠀⠘⣿⣿⣿⣿⡿⠛⢛⠿⣿⣿⣿⣿⣿⣿⣿⡿⠿⣿⣿⣿⣿⣿⣿⣿⣯⢠⡀⠀⠈⢿⣄⠀⠀⣿\r\n"
									+ "⠀⢸⡄⢹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⣰⠟⠀⠀⠀⠀⠘⣿⣿⡿⠁⠀⡜⠀⠈⣻⣿⣿⣿⣿⠋⣰⠋⣡⠴⠶⢬⡙⣿⣿⣿⡄⠙⢆⠀⠀⠻⣆⠀⣿\r\n"
									+ "⠀⠈⣷⠈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠁⣴⠟⠀⠀⠀⠀⠀⣰⢿⡟⠀⠀⡜⠁⠀⢠⣿⣿⣿⣿⡇⣠⡇⢸⠁⠈⠓⠤⢹⡜⣿⣿⣷⡀⠈⢣⠀⠀⠹⣦⣿\r\n"
									+ "⠀⠀⠸⣆⠘⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣯⡶⢿⡇⠀⠀⠀⠀⢀⡼⣫⠟⠀⢀⠞⠀⠀⢠⣿⣿⣿⣿⣿⣇⠙⣧⠘⣷⣤⣀⣠⣾⢃⣿⣿⣿⣿⡄⠀⢣⠀⠀⠹⡏\r\n"
									+ "⠀⠀⠀⢻⡄⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠁⠀⠸⣧⠀⠀⠀⣴⢏⡴⠋⠀⣠⠋⠀⠀⣠⣿⣿⣿⣿⣿⣿⣿⣆⠘⢷⣌⡙⠛⢋⣥⣾⣿⣿⣿⣿⣿⡆⠈⡆⠀⠀⡇\r\n"
									+ "⠀⠀⠀⠀⢳⡀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⣿⢀⣀⣼⢡⡟⠁⠀⡴⠁⠀⠀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣬⣉⣭⣽⣿⣿⣿⣿⣿⣿⣿⡇⠀⠁⠀⠀⡇\r\n"
									+ "⠀⠀⠀⠀⠀⢻⣤⠘⢿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⢀⡿⠉⠉⠁⣸⠇⠀⣸⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⣼⠁\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠙⣦⡀⠹⢿⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⣴⡇⠀⠀⢀⡿⠀⢀⡇⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠋⠀⠀⠀⣠⠞⠁⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠈⢻⣄⠀⠉⠛⠻⠿⠛⠁⠀⠀⠀⢠⡟⠀⠀⢀⡾⠁⠀⡸⠀⠀⢀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠟⠛⠛⠉⠉⠉⠙⠓⠦⠤⠤⠤⠖⠚⠉⠁⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⣤⣄⠀⠀⠀⠀⠀⢀⣴⣟⣀⣀⣴⠟⠁⠀⡰⠃⠀⢀⡾⠿⠿⠟⠛⠛⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠒⠒⠲⠛⠛⠙⢿⣍⠁⠀⠀⠀⠘⠁⠀⣠⠞⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
									+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠳⠤⠤⠤⠬⠤⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

							//Third option

							int tries3=0;

							String c="";

							do {

								tries++;

								System.out.println("Your options:"
										
										+ "\n1. Take the watch."

										+ "\n2. Leave the watch.");

								c =scanner.nextLine();

								if (c.equals("1")) {
									System.out.println("You take the watch and it attaches to your wrist,"
											+ " you freak out and accidentally tap the watch. "
											+ "\nYou suddenly get on fire, "
											+ "your grandpa screams and someone or something hurts your grandpa. "
											+ "You go there and battle the thing.\r\n");
								}

								else if (c.equals("2")) {
									System.out.println("You leave the watch but your grandpa screams and "
											+ "someone or something hurts your grandpa."
											+ "\nYour granpa tries to fight it but it kills yout granpa.");
									String n="";
									int tries4=0;
									do {
										
										tries4++;
										System.out.println("Your options:"
												+ "\n1. Go to the spaceship."
												+ "\n2. Run as fast as you can.");
										n=scanner.nextLine();
										if(n.equals("1")){
										do {
											System.out.println("Are you going to take the watch now?");
											System.out.println("1. Yes.");
											n=scanner.nextLine();
											if(n.equals("1")) {
												System.out.println("You take the watch and it attaches to your wrist,"
														+ " you freak out and accidentally tap the watch. "
														+ "\nYou suddenly get on fire, "
														+ "your grandpa screams and someone or something hurts your grandpa. "
														+ "You go there and battle the thing.\r\n");
											}
										}
										while (!n.equals("1")&&!n.equals("2")&&tries4<3);
										}
									

										else if (n.equals("2")) {
											System.out.println("You run as fast as you can and you find a rock to hide."
													+ "\nYou see a shadow on top of you and it looks like a drone."
													+ "\nIt slowly gets closer to you, you get scared and you try run but that thing kills you."
													+ "\n\nTry again bitch.");
											return;
										}
									}
									while (!n.equals("1")&&!n.equals("2")&&tries4<3);
								}

								else {

									System.out.println("Invalid choice.");

								}

							}

							while (!c.equals("1")&&!c.equals("2")&&tries3<3);
							
						}
						
						else if (b.equals("2")) {
							String reply="";
							int tries5=0;
							System.out.println("You stay in the camp but your grandpa screams and "
									+ "someone or something hurts your grandpa."
									+ "\nYour granpa tries to fight it but it kills yout grandpa.");
							do {
								
								tries5++;
								System.out.println("Your options:"
										+ "\n1. Go to the spaceship."
										+ "\n2. Run as fast as you can.");
								reply=scanner.nextLine();
								if(reply.equals("1")) {
								do {
									System.out.println("Are you going to take the watch now?");
									System.out.println("1. Yes.");
									reply=scanner.nextLine();
									if(reply.equals("1")) {
										System.out.println("You take the watch and it attaches to your wrist,"
												+ " you freak out and accidentally tap the watch. "
												+ "\nYou suddenly get on fire, "
												+ "your grandpa screams and someone or something hurts your grandpa. "
												+ "You go there and battle the thing.\r\n");
									}
								}
								while (!reply.equals("1")&&tries5<3);
								}
							

								else if (reply.equals("2")) {
									System.out.println("You run as fast as you can and you find a rock to hide."
											+ "\nYou see a shadow on top of you and it looks like a drone."
											+ "\nIt slowly gets closer to you, you get scared and you try run but that thing kills you."
											+ "\n\nTry again bitch.");
									return;
								}
						}while (!reply.equals("1")&&!reply.equals("2")&&tries<3);
							
						}
							else {
								System.out.println("Invalid choice.");
							}
					
					}

					while (!b.equals("1")&&!b.equals("2")&&tries2<3);
					

				}

			}

			while (!a.equals("1")&&!a.equals("2")&&tries<3);
			
				System.out.println("\nYou are going to battle the thing now.....");
			Thread.sleep(2000);
			
			 int playerHealth = 100;
		        int dronesHealth = 100;

		        while (playerHealth > 0 && dronesHealth > 0) { // Check if both player and opponent are alive

		            System.out.println("\nYour health: " + playerHealth);
		            System.out.println("\nDrones health: " + dronesHealth);
		            Thread.sleep(1000);

		            System.out.println("\nChoose your move: ");
		            System.out.println("\n1. Attack\n2. Defend\n");

		            String playerMove;
		            do { // Validate player's move
		                playerMove =scanner.nextLine();
		                if (!playerMove.equals("1") && !playerMove.equals("2")) {
		                    System.out.println("\nInvalid choice. Please enter 1 or 2: ");
		                }
		            } while (!playerMove.equals("1") && !playerMove.equals("2"));

		            int damage = 0;
		            int droneMove = (int) (Math.random() * 2) + 1;

		            if (playerMove.equals("1")) { // Player attacks
		                damage = (int) (Math.random() * 50) + 20; // Damage between 20 and 50
		                if (droneMove == 2) { // Opponent defends
		                    damage -= 20;
		                }
		                dronesHealth -= damage;
		                System.out.println("You attacked the opponent for " + damage + " damage.");
		            } else { // Player defends
		                System.out.println("You chose to defend.");
		            }

		            if (droneMove == 1 && dronesHealth > 0) { // Opponent attacks
		                damage = (int) (Math.random() * 50) + 20; // Damage between 20 and 50
		                if (playerMove.equals("2")) { // Player defends
		                    damage -= 20;
		                }
		                playerHealth -= damage;
		                System.out.println("The opponent attacked you for " + damage + " damage.");
		            } else if (dronesHealth > 0) { // Opponent defends
		                System.out.println("The opponent chose to defend.");
		            }
		        }

		        // Game ends, check the result
		        if (playerHealth <= 0) {
		            System.out.println("You died. Try again.");
		        } else {
		            System.out.println("You won the battle! Congrats!!");
		            // Add your logic here to proceed to the second level
		            System.out.println("You won the fight by Heatblast and a new alien comes.(Dimondhead)");
		        }
		        System.out.println("After the battle the drone speaks to you and it says \"My boss will take care of you\""
		        		+ "\nYou realize how big of a threat these drones are and you decide to go alone and fight them."
		        		+ "\nYou also decide to find the creater of the watch, so you can give the watch back and live your life peacefully.");
	        	
	        	System.out.println("\nYou see a big alien ship and you go to the spaceship but you need to do a challenge to go in the spaceship.");
	        	
		        do {
		        System.out.println("Continue to the second level(Q)?");
		        level2=scanner.nextLine();
		        if(level2.equalsIgnoreCase("Q")) {
		        	System.out.println("You turn into the new alein and you throw you projectiles to stop the timer at the right time.");
		        	System.out.println("You are going to the second level...");
		        	Thread.sleep(2000);
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
		             do {
		            	 System.out.println("1.Start the challenge??");
		            	 choice=scanner.nextLine();
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
		         		choice2=scanner.nextLine();
		         		if(choice2.equalsIgnoreCase("S")) {
		         			timer.stop();
		         			if(seconds==5) {
		         				do {
		         				System.out.println("This was a sample of the challenge. Now it is going to get more difficult.");
		         				System.out.println("Press 'N' to play the next challenge.");
		         				challenge2=scanner.nextLine();
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
		         					
		         						start=scanner.nextLine();
		         					if(start.equalsIgnoreCase("S")) {
		             					timer2.stop();
		             					if(seconds2==5) {
		             						do {
		             	     				System.out.println("You made it till here. Can you win 2 more times?? Now it is going to get more diffucutlt.");
		             	     				System.out.println("Press 'V' to play the next challenge.");
		             	     				start2=scanner.nextLine();
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
		             	     					
		             	     						start3=scanner.nextLine();
		             	     						if(start3.equalsIgnoreCase("S")) {
		             	     							timer3.stop();
		             	     							if (seconds3==5) {
		             	     								do {
		             	     								System.out.println("You are very close, just one more to go.");
		             	     								System.out.println("The last level('R')");
		             	     								start4=scanner.nextLine();
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
		             	            	     					
		             	            	     						start5=scanner.nextLine();
		             	            	     						if(start5.equalsIgnoreCase("S")) {
		             	            	     							timer4.stop();
		             	            	     							if(seconds4==5) {
		             	            	     								System.out.println("YOU COMPLETED THE CHALLENGE!!!!"
		             	            	     										+ "\nCONGRATS!!!"
		             	            	     										+ "\n1. Go to the level 3?");
		             	            	     								level3=scanner.nextLine();
		             	            	     								if(level3.equals("1")) {
		             	            	     									System.out.println("Ypu are entering level3....");
		             	            	     									Thread.sleep(2000);
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
		             	            	     									        		JFrame frame5= new JFrame();
		             	            	     									         		frame5.setTitle("Countdown");
		             	            	     									         		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		             	            	     									         		frame5.setResizable(true);
		             	            	     									         		frame5.setSize(420,200);
		             	            	     									         		counterLabel4=new JLabel("Timer");
		             	            	     									         		counterLabel4.setBounds(500, 300, 200, 100);
		             	            	     									         		frame5.add(counterLabel4);
		             	            	     									         		counterLabel4.setHorizontalAlignment(JLabel.CENTER);
		             	            	     									         		Font font5=new Font("Arial",Font.PLAIN,70);
		             	            	     									         		counterLabel4.setFont(font5);
		             	            	     									         		frame5.setVisible(true);
		             	            	     									         		simpleTimer5();
		             	            	     									         		timer5.start();
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
		             	            	     							}
		             	            	     						}
		             	            	     					}
		             	            	     					while (!start5.equalsIgnoreCase("S"));
		             	     								}
		             	     								}while (!start4.equalsIgnoreCase("R"));
		             	     							}
		             	     						}
		             	     					}
		             	     					while (!start3.equalsIgnoreCase("S"));
		             	     					
		             	     				}
		             						}while (!start2.equalsIgnoreCase("V"));
		             				}
		         					}
		             			}
		         					while (!start.equalsIgnoreCase("S"));
		         				}
		         			
		         		
		         			}
		         				while (!challenge2.equalsIgnoreCase("N"));
		         		}
		             }
		             }
		             while (!choice2.equalsIgnoreCase("S"));
		        	
		        	
		        }
		        }while (!level2.equalsIgnoreCase("Q"));
		        
			
	}
	public static void simpleTimer() {
		timer=new Timer(1000, new ActionListener() {
		

			public void actionPerformed(ActionEvent e) {
				seconds--;
				counterLabel.setText(""+ seconds);
				if (seconds==0) {
					System.out.println("You lose the level.");
					timer.stop();
					return;
				}

			}
		});}
		public static void simpleTimer2() {
			timer2=new Timer(500, new ActionListener() {
			

				public void actionPerformed(ActionEvent e) {
					seconds2--;
					counterLabel1.setText(""+ seconds2);
					if (seconds2==0) {
						System.out.println("You lose the level.");
						timer2.stop();
						return;
					}

				}
			});}
			public static void simpleTimer3() {
				timer3=new Timer(300, new ActionListener() {
				

					public void actionPerformed(ActionEvent e) {
						seconds3--;
						counterLabel2.setText(""+ seconds3);
						if (seconds3==0) {
							System.out.println("You lose the level.");
							timer3.stop();
							return;
						}

					}
				});}
				public static void simpleTimer4() {
					timer4=new Timer(200, new ActionListener() {
					

						public void actionPerformed(ActionEvent e) {
							seconds4--;
							counterLabel3.setText(""+ seconds4);
							if (seconds4==0) {
								System.out.println("You lose the level.");
								timer4.stop();
								return;
							}

						}
					});
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
