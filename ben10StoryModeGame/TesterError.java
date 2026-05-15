/*
 * @author: Mahmood, P
 * @date: 6/13/2024
 * @version: 2.0.1
 * @programDiscription: This program asks the user some question them runs a gym app that includes workout plan, personalized cal Goal and workout tutorials.
 */
package ben10StoryModeGame;
//IMPORTS
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class TesterError {
	// GLOBAL VARIABLES
		static Scanner input = new Scanner (System.in);
		static String a= "";
		static String w= "";
		public static void main(String[] args) { //MAIN METHOD
			System.out.println("Enter your Name: ");
			input.nextLine();
			
			System.out.println("WELCOME TO GOOD-LIFE FITNESS APP"
					+ "\nBefore you enter the app, we need to ask you some important question in order to make your experience better!"
					+ "\nTo continue press enter");
			input.nextLine();
			
			do {
				System.out.println("- How old are you?"
						+ "\n1. 13 to 20"
						+ "\n2. 20 to 35"
						+ "\n3. 35 to 50"
						+ "\n4. More than 50");
				a= input.nextLine();
			}
			while (!a.equals("1")&&!a.equals("2")&&!a.equals("3")&&!a.equals("4"));
			
			String h= "";
			do {
				System.out.println("- What is your height?"
						+ "\n1. Less than 140cm"
						+ "\n2. 140cm to 180cm"
						+ "\n3. 180cm to 210cm"
						+ "\n4. More than 21"
						+ "0cm");
				h=input.nextLine();
			}
			while (!h.equals("1")&&!h.equals("2")&&!h.equals("3")&&!h.equals("4"));
			
			do {
				System.out.println("- What is your weight?"
						+ "\n1. Less than 50kg"
						+ "\n2. 50kg to 70kg"
						+ "\n3. 70kg to 100kg"
						+ "\n4. More than 100kg");
				w= input.nextLine();
			}
			while (!w.equals("1")&&!w.equals("2")&&!w.equals("3")&&!w.equals("4"));
			window();
		}
		
		public static JPanel button() { //METHOD FOR BUTTONS
			
			////////////////////////////////////////////////////////////////////////////////
			// PANEL FOR THE BUTTONS
			JPanel button_Panel = new JPanel();
			button_Panel.setLayout(new GridLayout(2,2));
			button_Panel.setBackground(Color.GRAY);
			
			
			JButton button_01 = new JButton();
			button_Panel.add(button_01);
			button_01.setBackground(new Color(0xB31717));
			button_01.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_01.setText("Workout Plan");
			button_01.setForeground(Color.WHITE);
			
			// ACTION LISTNER
			button_01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workoutPlan();
				}	
			});
			
			// BUTTON FOR NUTRITIONAL INFORMATION
			JButton button_02 = new JButton();
			button_Panel.add(button_02);
			button_02.setBackground(new Color(0xB31717));
			button_02.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_02.setText("Nutritional Information");
			button_02.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				nutritionalInformation();
				}	
			});
			
			
			// BUTTON FOR WORKOUT TUTORIALS
			JButton button_03 = new JButton();
			button_Panel.add(button_03);
			button_03.setBackground(new Color(0xB31717));
			button_03.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_03.setText("Workouts tutorials");
			button_03.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workouts();
				}	
			});
			
			
			// EXTRA BUTTON
			JButton button_04 = new JButton();
			button_Panel.add(button_04);
			button_04.setBackground(new Color(0xB31717));
			button_04.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_04.setText("Coming soon!!!");
			button_04.setForeground(Color.WHITE);
			
			return button_Panel;
		}
		
		public static void workouts() {
			
			////////////////////////////////////////////////////////////////////////////////
			// PANEL FOR THE BUTTONS
			JPanel button_Panel = new JPanel();
			button_Panel.setLayout(new GridLayout(3,2));
			button_Panel.setBackground(Color.GRAY);
			
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #1
			JButton button_01 = new JButton();
			button_Panel.add(button_01);
			button_01.setBackground(new Color(0xB31717));
			button_01.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_01.setText("Cardio");
			button_01.setForeground(Color.WHITE);
			
			// ACTION LISTNER
			button_01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout01();
				}	
			});
			
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #2
			JButton button_02 = new JButton();
			button_Panel.add(button_02);
			button_02.setBackground(new Color(0xB31717));
			button_02.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_02.setText("Cardio#2");
			button_02.setForeground(Color.WHITE);
			
			// ACTION LISTNER
			button_02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout02();
				}	
			});
					
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #3
			JButton button_03 = new JButton();
			button_Panel.add(button_03);
			button_03.setBackground(new Color(0xB31717));
			button_03.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_03.setText("Biceps");
			button_03.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_03.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout03();
				}	
			});
			
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #4
			JButton button_04 = new JButton();
			button_Panel.add(button_04);
			button_04.setBackground(new Color(0xB31717));
			button_04.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_04.setText("Back");
			button_04.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_04.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout04();
				}	
			});
			
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #5
			JButton button_05 = new JButton();
			button_Panel.add(button_05);
			button_05.setBackground(new Color(0xB31717));
			button_05.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_05.setText("Chest");
			button_05.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_05.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout05();
				}	
			});
			
			////////////////////////////////////////////////////////////////////////////////
			// BUTTON #6
			JButton button_06 = new JButton();
			button_Panel.add(button_06);
			button_06.setBackground(new Color(0xB31717));
			button_06.setFont(new Font("MV Boli", Font.PLAIN, 30));
			button_06.setText("Shoulders");
			button_06.setForeground(Color.WHITE);
			
			//ACTION LISTNER
			button_06.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				workout06();
				}	
			});
			
			////////////////////////////////////////////////////////////////////////////////
			// FRAME FOR BUTTONS
			JFrame workout = new JFrame();
			workout.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			workout.setResizable (false);
			workout.setTitle("Workouts");
			workout.setSize(1100, 700);
			workout.setLocationRelativeTo(null);
			workout.setForeground(new Color(0xF33030));
			workout.add(button_Panel);
			workout.setVisible(true);
			
			///////////////////////////////////////////////////////////////////////////////
		}
		
		public static void workout01() {
			
			ImageIcon w= new ImageIcon("cardio.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
		
		public static void workout02() {
			
			ImageIcon w= new ImageIcon("cardio#2.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
		
		public static void workout03() {
			
			ImageIcon w= new ImageIcon("biceps.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
		
		public static void workout04() {
			
			ImageIcon w= new ImageIcon("back.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
			
		}
		
		public static void workout05() {
			
			ImageIcon w= new ImageIcon("chest.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
		
		public static void workout06() {
			
			ImageIcon w= new ImageIcon("shoulders.png");
			JLabel image= new JLabel();
			image.setIcon(w);
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(image);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
		}
		
		public static void window() { //THIS METHOD IS ONLY USED FOR SCREENS
			
			////////////////////////////////////////////////////////////////////////////////
			// SCREEN FOR QUOTES
					
			JLabel quotes= new JLabel ();
			quotes.setText(motiveQuotes());
			quotes.setHorizontalAlignment(JLabel.CENTER);
			quotes.setVerticalAlignment(JLabel.TOP);
			quotes.setForeground(Color.WHITE);
			Font font03= new Font ("Oswald", Font.PLAIN, 12);
			quotes.setFont(font03);
			
			JPanel panel_01= new JPanel(); //Panel for the quotes
			panel_01.setBackground(new Color(0xF33030));
			panel_01.setOpaque(true);
			panel_01.add(quotes);
			
			////////////////////////////////////////////////////////////////////////////////
			// SCREEN FOR "WELCOME TO GOOD-LIFE FINTESS PROGRAM"
			
			JLabel wel= new JLabel (); 
			wel.setText("WELCOME TO GOOD-LIFE FITNESS");
			Font font02= new Font ("Oswald", Font.BOLD, 50);
			wel.setFont(font02);
			wel.setHorizontalAlignment(JLabel.CENTER);
			wel.setVerticalAlignment(JLabel.TOP);
			wel.setForeground(Color.WHITE);
			
			JPanel panel_02= new JPanel(); //Panel for the texts
			panel_02.setBackground(new Color(0xF33030));
			panel_02.setOpaque(true);
			
			
			panel_02.setLayout(new BorderLayout());
			panel_02.add(wel, BorderLayout.NORTH);
			panel_02.add(button(), BorderLayout.CENTER);
			
			////////////////////////////////////////////////////////////////////////////////
			// THE FRAME (WINDOW/SCREEN)
			
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Good-Life Fitness");
			window.setSize(1100, 700);
			window.setLocationRelativeTo(null);
			window.setForeground(new Color(0xF33030));
			window.add(panel_01, BorderLayout.NORTH);
			window.add(panel_02, BorderLayout.CENTER);
			window.setVisible(true);
			
			///////////////////////////////////////////////////////////////////////////////
		}
		
		public static void nutritionalInformation() { // THIS METHOD INCLUDES THE NUTRITION GOAL AND ALL THE NUTRITIONAL INFOMRATION
			
			JLabel nutritionGoal= new JLabel();
			nutritionGoal.setForeground(Color.WHITE);
			nutritionGoal.setBackground(new Color(0xF33030));
			nutritionGoal.setOpaque(true);
			nutritionGoal.setHorizontalAlignment(JLabel.CENTER);
			nutritionGoal.setVerticalAlignment(JLabel.CENTER);
			nutritionGoal.setFont(new Font ("Oswald", Font.BOLD, 25));
			
			///////////////////////////////////////////////////////////////////////
			// PUTS THE APPROPRIATE NUTRITION GOAL FOR THE USER
			
			int goal=0;
			if (groupOrganizer(a,w)==1||groupOrganizer(a,w)==5||groupOrganizer(a,w)==9||groupOrganizer(a,w)==13) 
				goal=10500;
			else if (groupOrganizer(a,w)==2||groupOrganizer(a,w)==6||groupOrganizer(a,w)==10||groupOrganizer(a,w)==14) 
				goal=12600;
			else if (groupOrganizer(a,w)==3||groupOrganizer(a,w)==7||groupOrganizer(a,w)==11||groupOrganizer(a,w)==15) 
				goal=14700;
			else 
				goal=17500;
			
			nutritionGoal.setText("Nutrition Goal: "+goal+"cal");
			
			///////////////////////////////////////////////////////////////////////////////
			// NUTRITION INFORMATION
			JLabel information = new JLabel("<html>Fruits are rich in vitamins and minerals that help you feel healthy and energized.<br>" +
	                "1. Apples are high in fiber and water — two qualities that make them filling and aid in weight loss.<br>" +
	                "2. Bananas are an excellent source of potassium, which can help maintain heart health and blood pressure.<br>" +
	                "3. Oranges are well known for their vitamin C content which boosts your immune system.<br>" +
	                "4. Mangoes contain high level of vitamin C, fibre and pectin making it a perfect fruit that helps in controlling high cholesterol level.<br>" +
	                "5. Strawberries are an excellent source of vitamins C and K as well as providing a good dose of fibre, folic acid, manganese and potassium.</html>");
			information.setForeground(Color.WHITE);
			information.setBackground(new Color(0xF33030));
			information.setOpaque(true);
			information.setHorizontalAlignment(JLabel.CENTER);
			information.setVerticalAlignment(JLabel.CENTER);
			information.setFont(new Font ("Oswald", Font.PLAIN, 16));
			
			
			///////////////////////////////////////////////////////////////////////////////
			// WINDOW
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(nutritionGoal, BorderLayout.NORTH);
			window.add(information, BorderLayout.CENTER);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
			////////////////////////////////////////////////////////////////////////////////
		}
		
		public static void workoutPlan() { // THIS METHOD IS FOR THE USERS WORKOUT-PLAN
			
			///////////////////////////////////////////////////////////////////////////////
			// TEXT SPOT FOR THE WORKOUT-PLAN
			JLabel plan= new JLabel();
			plan.setText("<html>Day 1: Chest and Triceps<br>"
					+ "Day 2: Cardio<br>"
					+ "Day 3: Back and Biceps<br>"
					+ "Day 4: Cardio<br>"
					+ "Day 5: Legs and Shoulders<br>"
					+ "Day 6: Cardio<br>"
					+ "Day 7: Rest");
			plan.setForeground(Color.WHITE);
			plan.setBackground(new Color(0xF33030));
			plan.setOpaque(true);
			plan.setHorizontalAlignment(JLabel.CENTER);
			plan.setVerticalAlignment(JLabel.CENTER);
			plan.setFont(new Font ("Oswald", Font.PLAIN, 15));
			
			///////////////////////////////////////////////////////////////////////////////
			// WINDOW
			JFrame window = new JFrame();
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setResizable (false);
			window.setTitle("Workout Plan");
			window.setSize(1100, 700);
			window.setForeground(new Color(0xF33030));
			window.add(plan, BorderLayout.CENTER);
			window.setLocationRelativeTo(null);
			window.setVisible(true);
			
			///////////////////////////////////////////////////////////////////////////////
		}
		
		public static int groupOrganizer(String a, String w) { // PUT THE USER IN THE APPROPTIATE GROUP BASED ON THEIR AGE AND WEIGHT
			
			//////////////////////////////////////////////////////////////////////////////
			int group =0;
			
			if (a.equals("1")&&w.equals("1"))  // weight less than 50kg and the age 13-35
				group=1;
			else if (a.equals("1")&&w.equals("2"))  // weight 50-70kg and the age 13-15
				group=2;
			else if (a.equals("1")&&w.equals("3"))  // weight 70-100kg and the age 13-15
				group=3;
			else if (a.equals("1")&&w.equals("4"))  // weight 100+kg and the age 13-15
				group=4;
			else if (a.equals("2")&&w.equals("1"))  // weight less than 50kg and the age 20-35
				group=5;
			else if (a.equals("2")&&w.equals("2"))  // weight 50-70kg and the age 20-35
				group=6;
			else if (a.equals("2")&&w.equals("3"))  // weight 70-100kg and the age 20-35
				group=7;
			else if (a.equals("2")&&w.equals("4"))  // weight 100+kg and the age 20-35
				group=8;
			else if (a.equals("3")&&w.equals("1"))  // weight less than 50kg and the age 35-50
				group=9;
			else if (a.equals("3")&&w.equals("2"))  // weight 50-70kg and the age 35-50
				group=10;
			else if (a.equals("3")&&w.equals("3"))  // weight 70-100kg and the age 35-50
				group=11;
			else if (a.equals("3")&&w.equals("4"))  // weight 100+kg and the age 35-50
				group=12;
			else if (a.equals("4")&&w.equals("1"))  // weight less than 50kg and the age 50+
				group=13;
			else if (a.equals("4")&&w.equals("2"))  // weight 50-70kg and the age 50+
				group=14;
			else if (a.equals("4")&&w.equals("3"))  // weight 70-100kg and the age 50+
				group=15;
			else if (a.equals("4")&&w.equals("4"))  // weight 100+kg and the age 50+
				group=16;
			
			System.out.println(group);
			return group;
			/////////////////////////////////////////////////////////////////////////////
		}
		
		public static String motiveQuotes() { //THIS METHOD CHOOSES A RANDOM QUOTE AND RETURNS IT
			String[] quotes= {"“I hated every minute of training, but I said, ‘Don’t quit. Suffer now and live the rest of your life as a champion.” – Muhammad Ali", 
					"“We are what we repeatedly do. Excellence then is not an act but a habit.” –Aristotele", 
					"“The body achieves what the mind believes.” – Napoleon Hill", 
					"“The hard days are the best because that’s when champions are made, so if you push through, you can push through anything.” – Dana Vollmer", 
					"“If you don’t find the time, if you don’t do the work, you don’t get the results.” – Arnold Schwarzenegger", 
					"“Dead last finish is greater than did not finish, which trumps did not start.” — Unknown", 
					"“Push harder than yesterday if you want a different tomorrow.” – Vincent Williams Sr.", 
					"“The real workout starts when you want to stop.” – Ronnie Coleman", 
					"“Take care of your body. It’s the only place you have to live.” — Jim Rohn", 
					"“I’ve failed over and over again in my life and that is why I succeed.” – Michael Jordan"};
			int randNumber = (int) ((Math.random() * 10) + 1);
			
			if (randNumber==1)
				return quotes[1];
			else if (randNumber==2)
				return quotes[2];
			else if (randNumber==3)
				return quotes[3];
			else if (randNumber==4)
				return quotes[4];
			else if (randNumber==5)
				return quotes[5];
			else if (randNumber==6)
				return quotes[6];
			else if (randNumber==7)
				return quotes[7];
			else if (randNumber==8)
				return quotes[8];
			else if (randNumber==9)
				return quotes[9];
			else
				return quotes[10];		
			
			// return quotes[randNumber];
			
		}
}