package ben10StoryModeGame;
import java.io.*;
import java.util.Scanner;

public class Menu {
	private static int level;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String reply=scanner.next();
		System.out.println("C");
		if(reply.equalsIgnoreCase("C")){
				String fileName="Save.txt";
				try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
				    writer.write("Level: " + level);
				    // Write other game state variables similarly
				    // Close the writer
				    writer.close();
				    System.out.println("Game saved successfully.");
				} catch (IOException e) {
				    System.err.println("Error saving game: " + e.getMessage());
				}
		}

}
}
