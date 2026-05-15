/*@Author: Ekrit,Vedant and Ali Ahmed. 8
 *@Date: April 15th, 2024
 *@ Version: 1.0.0
 *@ ProgramDescription: This code unlocks a game called Dungeon Beater. You have to try your best to beat this game. Good Luck!!!
 */
package ben10StoryModeGame;

import java.util.Random;//This is a random.util, I used it because it is easier than using Math.random.
import java.util.Scanner; 

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in); //This will let you type stuff in the console.
		    Random random = new Random(); //This will randomize numbers.
		    System.out.println("Enter your name:"); 
		    String name = scanner.nextLine(); //This is going to let you type in the console.
		    System.out.println("Hello " + name);
		    System.out.println("Enter the first number");
		    int num1 = scanner.nextInt(); //This is going to let you type in the console.
		    if (num1 % 8 == 0) { //This is the first condition.
		      System.out.println("Correct!");
		      System.out.println("Enter the second number");
		      int num2 = scanner.nextInt(); //This is going to let you type in the console.
		      if ((Math.sqrt(num2)) == 7 || (Math.sqrt(num2)) == 5) {  //This is the second condition.
		        System.out.println("Correct!");
		        System.out.println("Enter the third number");
		        int num3 = scanner.nextInt(); //This is going to let you type in the console.

		        if (num3 * 2 >= 44) {  //This is the third condition.
		          System.out.println("Correct! You cracked the code!");
		          System.out.println("Hello, welcome to the game.");
		          System.out.println("You are playing \r\n"
		          		+ "  __ \\                                                __ )                |               \r\n"
		          		+ "  |   |  |   |  __ \\    _` |   _ \\   _ \\   __ \\       __ \\    _ \\   _` |  __|   _ \\   __| \r\n"
		          		+ "  |   |  |   |  |   |  (   |   __/  (   |  |   |      |   |   __/  (   |  |     __/  |    \r\n"
		          		+ " ____/  \\__,_| _|  _| \\__, | \\___| \\___/  _|  _|     ____/  \\___| \\__,_| \\__| \\___| _|    \r\n"
		          		+ "                      |___/                                                               \r\n"
		          		+ "Press C to continue.");
		          String response = scanner.next(); //This will let you type your response.

		          if (response.equalsIgnoreCase("C")) { 
		        	  //This code will check if my response equals to c and if it does it is going to run the block of code in the curly brackets.
		        	    
		        	   
		            System.out.println("You are in the menu screen.");

		          } else { //If the statements above are not true it is going to run this block of code.
		            System.out.println("You quit the game.");
		            return; //This will end the code if this block of code is true.
		          } 

		          System.out.println("Press P to play the game or press E to exit the game.");
		          String answer = scanner.next(); //This will let you type your answer.

		          if (answer.equalsIgnoreCase("P")) {
		        	  //This code will check if my response equals to c and if it does it is going to run the block of code in the curly brackets.
		            System.out.println("You are entering the game...");
		          } else if (answer.equalsIgnoreCase("E")) { 
		        	  //If this block of code is true, it is going to do the code in the curly brackets.
		            System.out.println("You exit the game.");
		            return; //This will end the code if this block of code is true.
		          }

		          System.out.println("You will spawn in the game with a random weapon and a random mob will encounter you.");
		          System.out.println("You will have 2 options. One will be to attack and one will be to run.");
		          System.out.println("You will lose the fight if you attack the mob with the wrong weapon.");

		          int weapons = random.nextInt(3) + 1; //This is going to use the random.util to randomly pick numbers from 1 to 3.
		          if (weapons == 1) {  //I assigned numbers to each of the weapons, so you will get a random weapon.
		            System.out.println("Your weapon is: Bow ");
		          } 
		          else if (weapons == 2) {  //If this block of code is true, it is going to do the code in the curly brackets.
		            System.out.println("Your weapon is: Dagger");
		          } 
		          else if (weapons == 3) {  //If this block of code is true, it is going to do the code in the curly brackets.
		            System.out.println("Your weapon is: Sword");
		          }

		          System.out.println("Is that weapon ok?");
		          System.out.println("Type ok if it is okay.");
		          String reply = scanner.next(); //This will let you type your reply.
		          if (reply.equalsIgnoreCase("ok")) {  //If this block of code is true, it is going to do the code in the curly brackets.
		            int mobs = random.nextInt(3) + 1; //This is going to use the random.util to randomly pick numbers from 1 to 3.
		            if (mobs == 1) { //I assigned numbers to each of the mobs, so you will encounter a random mob.
		              System.out.println("Your encountered: Skeleton");
		            }
		            if (mobs == 2) {  //If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("Your encountered: Slime");
		            }
		            if (mobs == 3) {  //If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("Your ecountered: Zombie");
		            }

		          } 
		          else { //If the statements above are not true it is going to run this block of code.
		            System.out.println("You did not like the weapon.");
		            return; //This will end the code if this block of code is true.
		          }

		          System.out.println("Your options: Attack and Run");
		          String option = scanner.next(); //This will let you pick one of the options.

		          if (option.equalsIgnoreCase("Attack")) {  //If this block of code is true, it is going to do the code in the curly brackets.
		            System.out.println("Type your weapon: ");
		            System.out.println("Type your mob: ");
		            String response1 = scanner.next(); //This will let you type your response.
		            String response2 = scanner.next(); //This will let you type your response.

		            if (response1.equalsIgnoreCase("Bow") && (response2.equalsIgnoreCase("Skeleton"))) { 
		            	//If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("You win the game.");
		              return; //This will end the code if this block of code is true.

		            }
		            else if (response1.equalsIgnoreCase("Sword") && (response2.equalsIgnoreCase("Zombie"))) {
		            	 //If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("You win the game.");
		              return; //This will end the code if this block of code is true.

		            }
		            if (response1.equalsIgnoreCase("Dagger") && (response2.equalsIgnoreCase("Slime"))) {
		            	 //If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("You win the game.");
		              return; //This will end the code if this block of code is true.
		            } 
		            else { //If the statements above are not true it is going to run this block of code.
		              System.out.println("You have the wrong weapon, you lost the game.");

		            }
		          } else if (option.equalsIgnoreCase("Run")) {
		        	  //If this block of code is true, it is going to do the code in the curly brackets.
		            System.out.println("You try to run.");
		            int mobs = random.nextInt(4) + 1; //This is going to use the random.util to randomly pick numbers from 1 to 3.
		            if (mobs == 2) { //If this block of code is true, it is going to do the code in the curly brackets.
		              System.out.println("You ran from the mob and won the game.");
		            } else { //If the statements above are not true it is going to run this block of code.
		              System.out.println("You tried to run but the mob killed you before you could.");
		            }
		          } else { //If the statements above are not true it is going to run this block of code.
		            System.out.println("You did not pick an option.");
		          }
		        } else //If the statements above are not true it is going to run this block of code.
		          System.out.println("Incorrect");
		      } else //If the statements above are not true it is going to run this block of code.
		        System.out.println("Incorrect");
		    } else { //If the statements above are not true it is going to run this block of code.
		      System.out.println("Incorrect");
		    }
		  }

		}

