/*
 * @author: Parth Patel
 * @date: January 16, 2024
 * @programDescription: User accesses a Phone with a friendly GUI with numerous apps ranging from games to personal uses
 */


package ben10StoryModeGame;
import java.awt.BorderLayout;
import java.awt.Color; // import everything necessary for GUI and more 
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.GridLayout;
import javax.swing.JOptionPane;


public class Phone implements ActionListener { // implements action listener, actions (buttons) are being listened to and then sent to act
	JFrame frame = new JFrame(); // declare frame
	JPanel panel = new JPanel(); // declare panel
	JPanel panel2 = new JPanel(); // declare another panel
	JButton[] app = new JButton[6]; // declare array to store all apps
	JButton settings, jaggaSim, showsMain, calculator, clock, contacts; // all the buttons used in homepage 
	
	JButton darkMode; // declare all buttons/labels/frames/variables in main class so they're accessible anywhere in constructor
	JButton screenTime;
	double timeStart = System.currentTimeMillis(); // start counting milliseconds as soon as code starts
	
	JButton feed, jaggaPlay; 
	JLabel jaggaSimHunger;
	int hunger = 60; // hunger at 60; starts at 50 because timer task activates as soon as play is pressed

	JButton[] shows = new JButton [4]; // set array of 4 for all buttons
	JButton failWithHaseeb, jamalSkip, santaSentence, theHeist; // declare all buttons
	JLabel showPreviewLabel; // declared in main class so its available in multiple if statements in constructor
	JPanel showPreviewPanel;
	JFrame showPreviewFrame;
	
	Calendar calendar; // calendar 
	SimpleDateFormat clockFormat; // used to format calendar properly
	SimpleDateFormat dayFormat; // used to format calendar properly
	String time; // stores time in a string variable - used to set text in JLabel that prints the time
	String day; // stores year, month, day in a string variable - used to set text in JLabel that prints this
	JLabel stopwatchLabel;
	JButton start;
	JButton stop;
	boolean watchRunning = false; // will be used to determine if stopwatch is started
	Timer watchTimer = new Timer();
	
	JButton [] message = new JButton [8];
	JButton dilraj, jagga, haseeb, hashir, parth, ben, jamal, deep;
	JLabel contactAppLabel;
	JPanel contactAppPanel;
	JFrame contactAppFrame;
	
	Phone(){ // constructor method - shows the first frame
		
		ImageIcon settingsIcon = new ImageIcon("src/settings.png"); // import file path, package, and file name of image
		settingsIcon = new ImageIcon(settingsIcon.getImage().getScaledInstance(75, 75, 0)); // get a scaled instance of image, edit width, length, scaling method and image is scaled accordingly
		ImageIcon calcIcon = new ImageIcon("src/calc.png");		
		calcIcon = new ImageIcon(calcIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon jaggaIcon = new ImageIcon("src/jagga.png");
		jaggaIcon = new ImageIcon(jaggaIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon showIcon = new ImageIcon("src/show.png");
		showIcon = new ImageIcon(showIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon clockIcon = new ImageIcon("src/clock.png");
		clockIcon = new ImageIcon(clockIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon contactsIcon = new ImageIcon("src/contacts.png");
		contactsIcon = new ImageIcon(contactsIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon phoneIcon = new ImageIcon("src/phone.png");
		phoneIcon = new ImageIcon(phoneIcon.getImage().getScaledInstance(75, 75, 0)); 
		
		settings = new JButton("Settings", settingsIcon); //apply label and picture to a button	
		jaggaSim = new JButton("Jagga Simulator", jaggaIcon);
		showsMain = new JButton("Shows", showIcon);	
		calculator = new JButton("Calculator", calcIcon);	
		clock = new JButton("Clock", clockIcon);	
		contacts = new JButton("Contacts", contactsIcon);
		
		
		app [0] = settings; // set an array value to each app
		app [1] = jaggaSim;
		app [2] = showsMain;
		app [3] = calculator;
		app [4] = clock;
		app [5] = contacts;
		
		
		int borderSize = 10; // adds empty border, which visually reduces size of button
		panel.setBorder(new EmptyBorder(borderSize, borderSize, borderSize, borderSize)); // applies to all grid components
		
		for (int i = 0; i < app.length; i++) { // i = 0; start loop for action listener to be implemented to all apps
			app[i].addActionListener(this); // action listener to send events to action performer method
			app[i].setFocusable(false); // removes border around text
			app[i].setBorder(BorderFactory.createCompoundBorder()); // adds border to button
			app[i].setHorizontalTextPosition(JButton.CENTER); // position of text horizontally
			app[i].setVerticalTextPosition(JButton.BOTTOM); // position of text vertically
		}		

		panel.setBackground(Color.blue); // color of panel
		panel.setBounds(20, 20, 395, 600); // x, y, width, length of panel
		panel2.setBackground(Color.black); // set color of panel2 (black bar at the top)
		panel2.setBounds(100, 5, 225, 10); // set bounds (size) of panel
		panel.setLayout(new GridLayout(4, 3, 20, 20)); // row, column, x diff, y diff - grid layout places components left to right, then down, separarte cells
		for (int i = 0; i<app.length; i++)  // i = 0, ends loop when all apps are placed in grid layout 
			panel.add(app[i]); // add all the apps to the panel
		
		frame.setSize(450, 700); // set size of frame
		frame.setLayout(null); // set layout for panels to appear
		frame.add(panel); // add panel to frame
		frame.add(panel2); // add panel2 to frame
		frame.setTitle("Phone"); // set title of the JFrame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit application by clicking x
		frame.getContentPane().setBackground(Color.gray); // set color of background	
		frame.setVisible(true); // set frame to being visible
		frame.setIconImage(phoneIcon.getImage()); // sets icon to frame
		frame.setResizable(false); // make it so frame isn't resizalbe
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { // listens for event, this will catch and start running event it listens to
		ImageIcon settingsIcon = new ImageIcon("src/settings.png"); 
		settingsIcon = new ImageIcon(settingsIcon.getImage().getScaledInstance(75, 75, 0));
		ImageIcon jaggaIcon = new ImageIcon("src/jagga.png");
		jaggaIcon = new ImageIcon(jaggaIcon.getImage().getScaledInstance(115, 115, 0)); 
		ImageIcon playIcon = new ImageIcon("src/play.png");
		playIcon = new ImageIcon(playIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon showIcon = new ImageIcon("src/show.png");
		showIcon = new ImageIcon(showIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon userIcon = new ImageIcon("src/user.png");
		userIcon = new ImageIcon(userIcon.getImage().getScaledInstance(25, 25, 0));
		ImageIcon contactsIcon = new ImageIcon("src/contacts.png");
		contactsIcon = new ImageIcon(contactsIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon screenTimeIcon = new ImageIcon("src/screenTimer.png");
		screenTimeIcon = new ImageIcon(screenTimeIcon.getImage().getScaledInstance(100, 100, 0));
		ImageIcon clockIcon = new ImageIcon("src/clock.png");
		clockIcon = new ImageIcon(clockIcon.getImage().getScaledInstance(75, 75, 0)); 
		ImageIcon haseebShowIcon = new ImageIcon("src/compSci.jpg");
		haseebShowIcon = new ImageIcon(haseebShowIcon.getImage().getScaledInstance(150, 100, 0));
		ImageIcon jamalShowIcon = new ImageIcon("src/jamalSkip.jpg");
		jamalShowIcon = new ImageIcon(jamalShowIcon.getImage().getScaledInstance (150, 100, 0));
		ImageIcon santaShowIcon = new ImageIcon("src/santa.jpg");
		santaShowIcon = new ImageIcon(santaShowIcon.getImage().getScaledInstance(150, 100, 0));
		ImageIcon heistIcon = new ImageIcon("src/heist.jpg");
		heistIcon = new ImageIcon(heistIcon.getImage().getScaledInstance(150, 100, 0));
		ImageIcon starIcon = new ImageIcon("src/5stars.png");
		starIcon = new ImageIcon(starIcon.getImage().getScaledInstance(250, 50, 0));
		
		if (e.getSource() == settings) { // when button is pressed
			
			JButton[] settingControl = new JButton[2]; // declare array to store all apps
			darkMode = new JButton("Dark Mode"); // make buttons within settings 
			screenTime = new JButton("Screen Time"); // make buttons within settings
			settingControl[0] = darkMode; // declare buttons to array
			settingControl[1] = screenTime;
			
						
			for (int i = 0; i < settingControl.length; i++) { // i = 0; start loop for code to be added to all buttons
				settingControl[i].addActionListener(this); // action listener to send events to action performer method
				settingControl[i].setFocusable(false); // removes border around text
				settingControl[i].setBorder(BorderFactory.createCompoundBorder()); // adds border to button
				settingControl[i].setHorizontalTextPosition(JButton.CENTER);
				settingControl[i].setVerticalTextPosition(JButton.BOTTOM);
			}
			

			JPanel settingPanel = new JPanel();
			settingPanel.setBackground(Color.black);
			settingPanel.setBounds(0,0, 250, 150);
			settingPanel.setLayout(new GridLayout(2, 1, 20, 20)); // row, column, x diff, y diff
			for (int i = 0; i<settingControl.length; i++)  // i = 0, ends loop when all apps are placed in grid layout 
				settingPanel.add(settingControl[i]);
			int borderSize = 10; // adds empty border, which visually reduces size of button
			settingPanel.setBorder(new EmptyBorder(borderSize, borderSize, borderSize, borderSize)); // applies to all grid components
			
			JFrame settingFrame = new JFrame();
			settingFrame.setTitle("Settings");
			settingFrame.setSize(450, 700);
			settingFrame.setVisible(true);
			settingFrame.setIconImage(settingsIcon.getImage());
			settingFrame.add(settingPanel);
			settingFrame.setResizable(false);
			
		}
		if(e.getSource() == darkMode) {
			panel.setBackground(Color.black);
		}
		if (e.getSource() == screenTime) {
			JLabel screenTimeLabel = new JLabel();
			screenTimeLabel.setBackground(Color.magenta);
			screenTimeLabel.setOpaque(true);
			screenTimeLabel.setForeground(Color.white);
			screenTimeLabel.setFont(new Font("Calibri", Font.BOLD, 40));
			screenTimeLabel.setIcon(screenTimeIcon);
			screenTimeLabel.setVerticalAlignment(JLabel.CENTER);
			screenTimeLabel.setHorizontalAlignment(JLabel.CENTER);
			
			Timer screenTimer = new Timer(); // allows tasks to be scheduled
			TimerTask screenTimerUpd = new TimerTask() { // the task itself
				@Override
				public void run() { // part of the code that runs when the task is activated
					double timeEnd = System.currentTimeMillis(); // gets current time in milliseconds
					double totalTime = (timeEnd - timeStart)/1000; // subtracts current time by time since starting code - then dividing by 1000 for ms to s
					double hour = totalTime/3600; // 3600 seconds in an hour, converts seconds to hours
					double min = (totalTime%3600)/60; // MOD3600 gives remaining seconds after dividing by how many complete hours there are, divide hours after %3600 by 60 for mins
					double sec = totalTime%60; // remainder after dividing time by 60 is the seconds
					String timeFormat = String.format("%02.0f:%02.0f:%02.0f", hour, min, sec); // %02.0f = format to 2 digits without decimal points, hours:min:sec timer
					screenTimeLabel.setText("Time: " + timeFormat); // display formatted time
				}
			};
			screenTimer.scheduleAtFixedRate(screenTimerUpd, 0, 500); // timer task activates task every 0.5 seconds, updates timer every 0.5 seconds
			
			JFrame screenTimeFrame = new JFrame();
			screenTimeFrame.setTitle("Screen Time");
			screenTimeFrame.setSize(450, 700);
			screenTimeFrame.add(screenTimeLabel);
			screenTimeFrame.setIconImage(screenTimeIcon.getImage());
			screenTimeFrame.setResizable(false);
			screenTimeFrame.setVisible(true);				
		}
		
		if (e.getSource() == jaggaSim) {
			JLabel jaggaLabel = new JLabel();
			jaggaLabel.setText("<html>Welcome to Jagga Simulator.<br>Feed him.<br>Don't let him starve.<br>Don't overfeed him.<html>"); // puts into HTML format, breaks line and creates new lines
			jaggaLabel.setIcon(jaggaIcon);
			jaggaLabel.setHorizontalAlignment(JLabel.CENTER);
			jaggaLabel.setVerticalAlignment(JLabel.CENTER);
			jaggaLabel.setIconTextGap(25);
			jaggaLabel.setFont(new Font("Arial", Font.PLAIN, 20)); // font, font type, font size
			jaggaLabel.setBounds(100, -150, 400, 400);
			jaggaLabel.setForeground(Color.black);
			
			jaggaPlay = new JButton("Play", playIcon);
			jaggaPlay.addActionListener(this); 
			jaggaPlay.setFocusable(false);
			jaggaPlay.setIconTextGap(25);
			jaggaPlay.setFont(new Font("Arial", Font.PLAIN, 60));
						
			JPanel jaggaPanel = new JPanel();
			jaggaPanel.setBackground(Color.red);
			jaggaPanel.setLayout(new GridLayout(2, 1, 20, 20));
			jaggaPanel.add(jaggaLabel);
			jaggaPanel.add(jaggaPlay);
			int borderSize = 10; // adds empty border, which visually reduces size of button
			jaggaPanel.setBorder(new EmptyBorder(borderSize, borderSize, borderSize, borderSize)); // applies to all grid components
			
			JFrame jaggaFrame = new JFrame();
			jaggaFrame.setTitle("Jagga Simulator");
			jaggaFrame.setResizable(false);
			jaggaFrame.setSize(450,700);
			jaggaFrame.setVisible(true);
			jaggaFrame.setIconImage(jaggaIcon.getImage());
			jaggaFrame.add(jaggaPanel);
			
			
		}
		if (e.getSource() == jaggaPlay) {
			feed = new JButton();
			feed.addActionListener(this);
			feed.setFocusable(false);
			feed.setFont(new Font("Arial", Font.BOLD, 60));
			feed.setText("Feed");
			
			jaggaSimHunger = new JLabel();
			jaggaSimHunger.setBackground(Color.black);
			jaggaSimHunger.setForeground(Color.white);
			jaggaSimHunger.setHorizontalAlignment(JLabel.CENTER);
			jaggaSimHunger.setVerticalAlignment(JLabel.CENTER);
			jaggaSimHunger.setFont(new Font("Georgia", Font.BOLD, 55));
			jaggaSimHunger.setOpaque(true);
			
			Border rulesBorder = BorderFactory.createLineBorder(Color.red, 45);
			JLabel jaggaSimRules = new JLabel();
			jaggaSimRules.setHorizontalAlignment(JLabel.CENTER);
			jaggaSimRules.setVerticalAlignment(JLabel.CENTER);
			jaggaSimRules.setForeground(Color.black);
			jaggaSimRules.setBounds(0, 0, 450, 250);
			jaggaSimRules.setFont(new Font("Georgia", Font.PLAIN, 20));
			jaggaSimRules.setBorder(rulesBorder);
			jaggaSimRules.setText("<html>Jagga loses 10 hunger every 15 seconds, even outside of the app. <br>The feed button gives him 10 hunger. "
					+ "<br>Don't let his hunger go over 100. <br>Don't let his hunger go to or under 0. <html>");
			
			JPanel jaggaPlayPanel = new JPanel();
			jaggaPlayPanel.setBackground(Color.red);
			jaggaPlayPanel.setLayout(new GridLayout(3, 1, 20, 20)); // row, column, x diff, y diff
			jaggaPlayPanel.add(jaggaSimHunger);
			jaggaPlayPanel.add(jaggaSimRules);
			jaggaPlayPanel.add(feed);
			
			JFrame jaggaPlayFrame = new JFrame();
			jaggaPlayFrame.setTitle("Jagga Simulator");
			jaggaPlayFrame.setResizable(false);
			jaggaPlayFrame.add(jaggaPlayPanel);
			jaggaPlayFrame.setSize(450, 700);
			jaggaPlayFrame.setIconImage(jaggaIcon.getImage());
			jaggaPlayFrame.getContentPane().setBackground(Color.black);
			jaggaPlayFrame.setVisible(true);
			
			Timer hungerTimer = new Timer(); // tracks time 
			TimerTask hungerLoss = new TimerTask() { // does a task based on time passed
				@Override
				public void run() { // run method (code executes) accordingly to scheduleAtFixedRate method
					if (hunger > 0 && hunger <= 100) {
						hunger-=10; // remove hunger if jagga is alive 
						jaggaSimHunger.setText("<html>Hunger: <html>" + hunger);
					}

					else if (hunger <= 0){
						jaggaSimHunger.setText("<html>He starved to death... RIP<html>");
						hungerTimer.cancel(); // stop the timer
						feed.setEnabled(false); // disable clicking feed button
					}		
					else {
						jaggaSimHunger.setText("<html>You overfed him... RIP<html>");
						hungerTimer.cancel(); // stop the timer
						feed.setEnabled(false); // disable clicking feed button
					}
				}
			};
			hungerTimer.scheduleAtFixedRate(hungerLoss, 0, 15000); // method to declare time it takes to run a task at a fixed rate (15 seconds)
		}
		if (e.getSource() == feed) { 
			hunger+=10; // add 10 to hunger every time feed is clicked
			if (hunger > 0 && hunger <= 100) // if condition is met - jagga is alive *Decision statements are used to update hunger status every time feed is clicked rather than every 30 seconds (timer task)
				jaggaSimHunger.setText("<html>Hunger: <html>" + hunger); // display hunger 
			
			else if (hunger <= 0) { // if hunger less than or 0, jagga starved 
				jaggaSimHunger.setText("<html>He starved to death... RIP<html>");
				feed.setEnabled(false); // disable feed button
			}
			else { // else - hunger greater than 100, jagga is overfed
				jaggaSimHunger.setText("<html>You overfed him... RIP<html>");
				feed.setEnabled(false);
			}
		}
		if (e.getSource() == showsMain) { // if button is pressed
			
			failWithHaseeb = new JButton("Failing Comp. Sci. with Haseeb", haseebShowIcon);
			jamalSkip = new JButton("Jamal Caught Skipping Class", jamalShowIcon);
			santaSentence = new JButton("Santa's Death Sentence", santaShowIcon);
			theHeist = new JButton("The Heist", heistIcon);
			
			shows [0] = failWithHaseeb;
			shows [1] = jamalSkip;
			shows [2] = santaSentence;
			shows [3] = theHeist;
			
			for (int i = 0; i < shows.length; i++) { // loop that ends when all shows are applied with the following components
				shows[i].addActionListener(this);
				shows[i].setFocusable(false);
				shows[i].setVerticalTextPosition(JButton.BOTTOM);
				shows[i].setHorizontalTextPosition(JButton.CENTER);
			}
			
			JPanel showPanel = new JPanel();
			showPanel.setLayout(new GridLayout(2, 2, 20, 20)); // grid layout - fills in grid pattern; left to right, then down, then repeat
			for (int i = 0; i < shows.length; i++) { // i = 0, loop starts
				showPanel.add(shows[i]); // add all shows accordingly to grid layout
			} // loop ends when all shows are added (when i is = to shows.length)
			
			JFrame showFrame = new JFrame();
			showFrame.setTitle("Shows");
			showFrame.setSize(450, 700);
			showFrame.add(showPanel);
			showFrame.setIconImage(showIcon.getImage());
			showFrame.setResizable(false);
			showFrame.setVisible(true);
		}
		for (int i = 0; i < shows.length; i++) { // enter loop that ends when all shows are met with the conditions below
			if (e.getSource() == shows[i]) { // if any of the shows are pressed, the following labels, panels, and frames are applied to all of them (default)
				showPreviewLabel = new JLabel();
				showPreviewLabel.setVerticalTextPosition(JLabel.BOTTOM);
				showPreviewLabel.setHorizontalTextPosition(JLabel.CENTER);
				showPreviewLabel.setHorizontalAlignment(JLabel.CENTER);
				showPreviewLabel.setVerticalAlignment(JLabel.TOP);
				showPreviewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
				showPreviewLabel.setIconTextGap(100);
				showPreviewLabel.setBounds(0, 0, 450, 450);
				int borderSize = 20; // adds empty border, which visually reduces size of button
				showPreviewLabel.setBorder(new EmptyBorder(borderSize, borderSize, borderSize, borderSize)); // applies to all grid components
				
				JLabel starLabel = new JLabel();
				starLabel.setText("5.0 Stars");
				starLabel.setHorizontalTextPosition(JLabel.RIGHT);
				starLabel.setFont(new Font("Arial", Font.BOLD, 30));
				starLabel.setIcon(starIcon);
				starLabel.setIconTextGap(30);
				starLabel.setBounds(0, 0, 450, 50);
				
				JPanel previewStars = new JPanel();
				previewStars.setBounds(0, 180, 450, 50);
				previewStars.add(starLabel);
				previewStars.setBackground(Color.gray);
				previewStars.setLayout(null); // set layout to null to add panel to frame
				
				showPreviewFrame = new JFrame();
				showPreviewFrame.setLayout(null);
				showPreviewFrame.setSize(450,700);
				showPreviewFrame.setResizable(false);
				showPreviewFrame.add(showPreviewLabel);
				showPreviewFrame.add(previewStars);
				showPreviewFrame.setVisible(true);	
			}
		} // end loop when i = shows.length, all shows have been these components added to their buttons
		if (e.getSource() == failWithHaseeb) {
			haseebShowIcon = new ImageIcon(haseebShowIcon.getImage().getScaledInstance(200, 133, 0)); // set new sizes for images
			showPreviewLabel.setIcon(haseebShowIcon);
			showPreviewFrame.setTitle("Failing Comp. Sci. with Haseeb");
			showPreviewLabel.setText("<html>Haseeb is an avid computer science student. Navigating his way through code proves excellence. "
					+ "Which is why this show will include Haseeb teaching you how to fail computer science.<br><br>$5.00 for all episodes<html>");
			showPreviewFrame.setIconImage(haseebShowIcon.getImage());
		}
		if (e.getSource() == jamalSkip) {
			jamalShowIcon = new ImageIcon(jamalShowIcon.getImage().getScaledInstance(200, 133, 0));
			showPreviewLabel.setIcon(jamalShowIcon);
			showPreviewFrame.setTitle("Jamal Caught Skipping Class");
			showPreviewLabel.setText("<html>Jamal runs through and away - cuts the corners - took a right, then a left, then a right, then another right, "
					+ "will it be one lucky night... as a skipper.<br><br>$5.00 for all episodes<html>");
			showPreviewFrame.setIconImage(jamalShowIcon.getImage());
		}
		if (e.getSource() == santaSentence) {
			santaShowIcon = new ImageIcon(santaShowIcon.getImage().getScaledInstance(200, 133, 0));
			showPreviewLabel.setIcon(santaShowIcon);
			showPreviewFrame.setTitle("Santa's Death Sentence");
			showPreviewLabel.setText("<html>Santa has been put on the naughty list. Santa has been caught in a heist stealing presents."
					+ "Santa has seen better days. Santa has been locked up. Santa thinks: will he finish the sen- <br><br>$5.00 for all episodes<html>");
			showPreviewFrame.setIconImage(santaShowIcon.getImage());
		}
		if (e.getSource() == theHeist) {
			heistIcon = new ImageIcon(heistIcon.getImage().getScaledInstance(200,133,0));
			showPreviewLabel.setIcon(heistIcon);
			showPreviewFrame.setTitle("The Heist");
			showPreviewLabel.setText("<html> The Heist: a show adapted game from The Heist by Jamal. Jagga is the powerhouse, you must undergo a heist"
					+ "under his control. Traverse the obstacles in the way, stay alive, and fulfill Jagga's requests. Easy enough, right? <br><br>$5.00 for all episodes<html");
			showPreviewFrame.setIconImage(heistIcon.getImage());
		}
			
		
		if (e.getSource() == clock) {
			JLabel clockLabel = new JLabel();
			clockLabel.setText("Clock");
			clockLabel.setHorizontalTextPosition(JLabel.CENTER);
			clockLabel.setVerticalTextPosition(JLabel.TOP);
			clockLabel.setFont(new Font("SC Amatic", Font.BOLD, 50));
			clockLabel.setForeground(Color.white);
			clockLabel.setHorizontalAlignment(JLabel.CENTER);
			
			JLabel clockTimeLabel = new JLabel();
			clockTimeLabel.setBounds(0, 150, 450, 200);
			clockTimeLabel.setForeground(Color.white);
			clockTimeLabel.setFont(new Font("Arial", Font.BOLD, 30));
			clockTimeLabel.setHorizontalAlignment(JLabel.CENTER);
			
			JLabel clockDayLabel = new JLabel();
			clockDayLabel.setForeground(Color.white);
			clockDayLabel.setFont(new Font("Arial", Font.BOLD, 20));
			clockDayLabel.setHorizontalAlignment(JLabel.CENTER);
		
			Timer calendarTimer = new Timer();
			TimerTask updateCalendar = new TimerTask() {		
				@Override
				public void run() {
					clockFormat = new SimpleDateFormat("hh:mm:ss a"); // date format of hours, month, seconds, AM
					dayFormat = new SimpleDateFormat("yyyy, MMMMM, dd EEEE"); // format of year, month, day, day of the week 
					time = clockFormat.format(Calendar.getInstance().getTime()); // gets time from current date (calendar)
					day = dayFormat.format(Calendar.getInstance().getTime()); // gets day from current date (calendar
					clockTimeLabel.setText(time); // label is set to time of the day according to calendar
					clockDayLabel.setText(day); // label is set to year, month, day, day of week
				}	
			};
			calendarTimer.scheduleAtFixedRate(updateCalendar, 0, 500); // method so that every 0.001 second, the task is done (update calendar time)
			
			
			JPanel clockPanel = new JPanel();
			clockPanel.setBounds(0, 0, 450, 350);
			clockPanel.setBackground(Color.black);
			clockPanel.add(clockLabel);
			clockPanel.add(clockTimeLabel);
			clockPanel.add(clockDayLabel);
			clockPanel.setLayout(new GridLayout(3, 1, 0, -35));
			
			JLabel stopwatch = new JLabel();
			stopwatch.setText("Stopwatch");
			stopwatch.setFont(new Font("Arial", Font.BOLD, 30));
			
			JPanel timeWatchPanel = new JPanel();
			timeWatchPanel.setBounds(0, 0, 450, 45);
			timeWatchPanel.setBackground(Color.white);
			timeWatchPanel.add(stopwatch);
			
			stopwatchLabel = new JLabel();
			stopwatchLabel.setText("00:00:00");
			stopwatchLabel.setForeground(Color.white);
			stopwatchLabel.setFont(new Font("Arial", Font.PLAIN, 30));
			
			JPanel watchPanel = new JPanel();
			watchPanel.setBounds(0, 45, 450, 150);
			watchPanel.setBackground(Color.black);			
			watchPanel.add(stopwatchLabel);
			
			start = new JButton();
			start.setText("Start");
			start.setBounds(0, 195, 225, 120);
			start.setFocusable(false);
			start.addActionListener(this);
			
			stop = new JButton();
			stop.setText("Stop");
			stop.setBounds(225, 195, 225, 120);
			stop.setFocusable(false);
			stop.addActionListener(this);
					
			JPanel stopWatchPanel = new JPanel();
			stopWatchPanel.setBounds(0, 350, 450, 350);
			stopWatchPanel.setBackground(Color.gray);
			stopWatchPanel.setLayout(null);
			stopWatchPanel.add(watchPanel);
			stopWatchPanel.add(timeWatchPanel);
			stopWatchPanel.add(start);
			stopWatchPanel.add(stop);
			
			JFrame clockFrame = new JFrame();
			clockFrame.setTitle("Clock");
			clockFrame.setLayout(null);
			clockFrame.setResizable(false);
			clockFrame.setSize(450,700);
			clockFrame.add(clockPanel);
			clockFrame.add(stopWatchPanel);
			clockFrame.setIconImage(clockIcon.getImage());
			clockFrame.setVisible(true);
		}
		if (e.getSource() == start) { // starts stopwatch
			if (!watchRunning) { // if watchRunning boolean is set to false - the start button will not do anything
				double watchStart = System.currentTimeMillis(); // gets current time
				watchTimer = new Timer();
				TimerTask watchUpd = new TimerTask() {
					@Override
					public void run() {
						double watchTime = (System.currentTimeMillis() - watchStart)/1000; // turns milliseconds passed (since start) into seconds	
						double watchHour = watchTime/3600; // calculate hours 
						double watchMin = (watchTime%3600)/60; // calculate remaining minutes based on how much hours there are
						double watchSec = watchTime%60; // calculates remaining seconds based on amount of minutes
						String watchFormat = String.format("%02.0f:%02.0f:%02.0f", watchHour, watchMin, watchSec);
						stopwatchLabel.setText(watchFormat);
					}
				};	
				watchTimer.scheduleAtFixedRate(watchUpd, 0, 100); // update timer every 0.5 seconds
				watchRunning = true; // declare watch as running
			}
		}
		if (e.getSource() == stop) {
			if (watchRunning) { // only if stopwatch is running, then it is possible to stop
				watchTimer.cancel(); // stop timer
				stopwatchLabel.setText("00:00:00"); // set back to 0 seconds
				watchRunning = false; // declares watch as not running
			}
		}
		
		
		if (e.getSource() == calculator) {
			String operator [] = {"+", "-", "*", "/"}; // array of all the operators
			try { // try block
				double ans = 0;
				double num1 = 0;
				double num2 = 0;
				while (true) { // while loop - stay in loop until break; or return occurs
					String input = JOptionPane.showInputDialog(null, "Calculator (Only 2 numbers)\nEnter your first number:"); // reads input as string
					if (input == null)  // if the input equals cancel option (null)
						return; // exits the loop and calculator app - more specifically exits program before going to further parts of calc app
					try { // code will try to parse the input, if it can't (which is when input is invalid), code will go to catch statement
						num1 = Double.parseDouble(input); // parse the input into a double - used to find sum
						break; // loop will break if input is valid
					}
					catch (NumberFormatException ex) { // catch invalid inputs 
						JOptionPane.showMessageDialog(null, "Please enter number values"); // display error message for invalid input
					}
				} // exit if loop is returned (app is exited) or if loop is broken (valid input)
				while (true) { 
					String input2 = JOptionPane.showInputDialog(null, "Enter your second number:"); // reads input as string
					if (input2 == null)  // checks if input equals cancel option (null)
						return; // exits the loop and calculator app
					try {
						num2 = Double.parseDouble(input2); // parse the input into a double
						break; // loop will break if input is valid
					}
					catch (NumberFormatException ex) { // catch invalid inputs - stay in loop
						JOptionPane.showMessageDialog(null, "Please enter number values"); // display error message
					}
				}
				int operation = JOptionPane.showOptionDialog(null, "Choose operation", "Calculation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, operator, 0); // choose operator
				if (operation == 0)  {// add
					ans = num1+num2;
					JOptionPane.showMessageDialog(null, "Sum is: " + ans); // print ans depending on operation
				}
				else if (operation == 1) {//subtract
					ans = num1-num2;
					JOptionPane.showMessageDialog(null, "Difference is: " + ans); // print ans depending on operation
				}
				else if (operation == 2) {// multiply
					ans = num1*num2;
					JOptionPane.showMessageDialog(null, "Product is: " + ans); // print ans depending on operation
				}
				else if (operation == 3) { // divide
					ans = num1/num2;
					JOptionPane.showMessageDialog(null, "Quotient is: " + ans); // print ans depending on operation
				}
			}
			catch (NumberFormatException | NullPointerException ex) { // catch if there's an exception
				JOptionPane.showMessageDialog(null, "Please enter number values"); // display if there's an error/exception
			}	
		}
		
		if (e.getSource() == contacts) {
			dilraj = new JButton("Dilraj", userIcon);
			jagga = new JButton("Jagga", userIcon);
			haseeb = new JButton("Haseeb", userIcon);
			hashir = new JButton("Hashir", userIcon);
			parth = new JButton("Parth K.", userIcon);
			ben = new JButton("Ben Wallian", userIcon);
			jamal = new JButton("Jamal", userIcon);
			deep = new JButton("Deep", userIcon);
			
			message[0] = dilraj;
			message[1] = jagga;
			message[2] = haseeb;
			message[3] = hashir;
			message[4] = parth;
			message[5] = ben;
			message[6] = jamal;
			message[7] = deep;			
			for (int i = 0; i < message.length; i++) { // i = 0; start loop to add features within the loop
				message[i].addActionListener(this); // action listener to send events to action performer method
				message[i].setFocusable(false); // removes border around text
			} // exit loop when all message buttons get these features included
			
			JPanel messagePanel = new JPanel();
			for (int i = 0; i<message.length; i++) {
				messagePanel.add(message[i]); // add all buttons (messages) to panels
				
			}
			messagePanel.setLayout(new GridLayout(8, 1, 20, 20)); // set grid layout, 8 rows, 1 column 
			messagePanel.setBackground(Color.gray);
			
			JFrame contactFrame = new JFrame();
			contactFrame.setTitle("Messages");
			contactFrame.getContentPane().setBackground(Color.black);
			contactFrame.setSize(450, 700);
			contactFrame.add(messagePanel);
			contactFrame.setIconImage(contactsIcon.getImage());
			contactFrame.setVisible(true);		
			contactFrame.setResizable(false);
		}		
		for (int i  = 0; i < message.length; i++) { // enter loop that ends when all messages are met with the conditions below
			if (e.getSource() == message[i]) { // if any of the user messages are pressed, the following labels, panels, and frames are applied to all of them (default)
				contactAppLabel = new JLabel();
				contactAppLabel.setIcon(userIcon);
				contactAppLabel.setIconTextGap(30);
				contactAppLabel.setHorizontalAlignment(JLabel.LEFT);
				
				contactAppPanel = new JPanel();
				contactAppPanel.setBackground(Color.gray);
				contactAppPanel.setBounds(15, 20, 350, 50);
				contactAppPanel.setBackground(Color.gray);
				contactAppPanel.add(contactAppLabel);
				
				contactAppFrame = new JFrame();
				contactAppFrame.setResizable(false);
				contactAppFrame.setLayout(null);
				contactAppFrame.setSize(450, 200);
				contactAppFrame.add(contactAppPanel);
				contactAppFrame.setVisible(true);
				contactAppFrame.setIconImage(contactsIcon.getImage());
			}
		}
		if (e.getSource() == message [0]) { // unique features for each user in message app
			contactAppLabel.setText("Get ya money up not ya funny up :fire: :100:");
			contactAppFrame.setTitle("Dilraj");
		}
		if (e.getSource() == message [1]) {
			contactAppLabel.setText("I may need some food.");
			contactAppFrame.setTitle("Jagga");
		}
		if (e.getSource() == message [2]) {
			contactAppLabel.setText("can u do my english summative for me ill pay u");
			contactAppFrame.setTitle("Haseeb");
		}
		if (e.getSource() == message [3]) {
			contactAppLabel.setText("lock in bruh");
			contactAppFrame.setTitle("Hashir");
		}
		if (e.getSource() == message [4]) {
			contactAppLabel.setText("which one is the real Parth ? ?");
			contactAppFrame.setTitle("Parth K.");
		}
		if (e.getSource() == message [5]) {
			contactAppLabel.setText("still gotta pay up from that helicopter rescue");
			contactAppFrame.setTitle("Ben Wallian");
		}
		if (e.getSource() == message [6]) {
			contactAppLabel.setText("Yo can u send me ur work");
			contactAppFrame.setTitle("Jamal");
		}
		if (e.getSource() == message [7]) {
			contactAppLabel.setText("2024 already messed up, 2025 my year");
			contactAppFrame.setTitle("Deep");
		}
		
	}
	
	public static void main(String[] args) {
		Phone var = new Phone(); // transfers data to constructor method
	}
}