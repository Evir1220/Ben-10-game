package ben10StoryModeGame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
public class Timer1 {
	static JLabel counterLabel;
	static Timer timer;
	static int seconds=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		String choice7="";
		String stop1="";
		do {
		System.out.println("1.Play the timer.");
		choice7=scanner.next();
		if(choice7.equals("1")) {
		JFrame frame6= new JFrame();
		frame6.setTitle("Countdown");
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.setResizable(false);
		frame6.setSize(420,200);
		counterLabel=new JLabel("Timer");
		counterLabel.setBounds(500, 300, 200, 100);
		frame6.add(counterLabel);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		Font font=new Font("Arial",Font.PLAIN,70);
		counterLabel.setFont(font);
		frame6.setVisible(true);
		
		simpleTimer();
		timer.start();
		}
		}while(seconds !=5);
		
	}
	public static void simpleTimer() {
		timer=new Timer(1000, new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				seconds--;
				counterLabel.setText(""+ seconds);
				if (seconds==0) {
					timer.stop();
					System.out.println("You lose the game.");
					return;
				}
			}
		});
}
}