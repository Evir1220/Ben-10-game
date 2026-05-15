package ben10StoryModeGame;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Level1Battle {

	public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner (System.in);
		
		  System.out.println("\nYou are going to battle the thing now.....");
          Thread.sleep(2000);

          int playerHealth1 = 100;
          int Vilgax = 100;

          while (playerHealth1 > 0 && Vilgax > 0) { // Check if both player and opponent are alive

            System.out.println("\nYour health: " + playerHealth1);
            System.out.println("\nDrones health: " + Vilgax);
            Thread.sleep(1000);

            System.out.println("\nChoose your move: ");
            System.out.println("\n1. Attack\n2. Defend\n");

            String playerMove1;
            do { // Validate player's move
            	playerMove1 = scanner.nextLine();
              if (!playerMove1.equals("1") && !playerMove1.equals("2")) {
                System.out.println("\nInvalid choice. Please enter 1 or 2: ");
              }
            } while (!playerMove1.equals("1") && !playerMove1.equals("2"));

            int damage1 = 0;
            int vilgaxmove = (int) (Math.random() * 2) + 1;

            if (playerMove1.equals("1")) { // Player attacks
            	damage1 = (int) (Math.random() * 50) + 20; // Damage between 20 and 50
              if (vilgaxmove == 2) { // Opponent defends
            	  damage1 -= 20;
              }
              Vilgax -= damage1;
              System.out.println("You attacked the opponent for " + damage1 + " damage.");
            } else { // Player defends
              System.out.println("You chose to defend.");
            }

            if (vilgaxmove == 1 && Vilgax > 0) { // Opponent attacks
            	damage1 = (int) (Math.random() * 50) + 20; // Damage between 20 and 50
              if (playerMove1.equals("2")) { // Player defends
            	  damage1 -= 20;
              }
              playerHealth1 -= damage1;
              System.out.println("The opponent attacked you for " + damage1 + " damage.");
            } else if (Vilgax > 0) { // Opponent defends
              System.out.println("The opponent chose to defend.");
            }
          }

          // Game ends, check the result
          if (playerHealth1 <= 0) {
            System.out.println("You died. Try again.");
            return;
          } else {
            System.out.println("You won the battle! Congrats!!");
            // Add your logic here to proceed to the second level
            System.out.println("You won the fight by Heatblast and a new alien comes.(Dimondhead)");
          }
		
	    
	}
}




