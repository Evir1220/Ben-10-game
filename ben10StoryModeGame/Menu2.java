package ben10StoryModeGame;

import java.util.Scanner;

public class Menu2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
			String choice= "A";

		    int tries=0;

		    do {

	            tries++;

	            System.out.println("Press 'S' to start the Game"

	            		+"\nPress 'Q' to quit the Game"

	            		+"\nEnter your choice: ");



	            choice = scanner.next();

	            

	            if (choice.equalsIgnoreCase("S")) {

	            	System.out.println("Starting the game...");

	            }
		    }
		    while (!choice.equalsIgnoreCase("S")&&!choice.equalsIgnoreCase("Q")&&tries<=3);

		}
}


