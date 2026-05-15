/*@author: Ekrit Kapoor.
 * @date: May 21,2024
 * @version: 1.0.0
 * Program Description: It is a Ben 10 story line game.
 */
package ben10StoryModeGame;
//We are importing a lot of stuff for the game to work.
import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Project10 {
	//These are global so I can use it in all of the code.
 static String reply="";
 static String choice="";
 static int tries2=0;
 static int tries=0;
 static String character="";
 static int tries3=0;
 static String reply2="";
 static String response1 = "";
 static int tries6=0;
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
 static JLabel counterLabel5;
 static Timer timer6;
 static int seconds6=30;
 static JLabel counterLabel6;
 static Timer timer7;
 static int seconds7=100;
 static JLabel counterLabel7;
 static Timer timer8;
 static int seconds8=150;
 static String move="";
 static String move2="";
 static String move3="";
 static String move4="";
 static String move5="";
 static String move6="";
 static String move7="";
 static String move8="";
 static String move9="";
 static String move10="";
 static String move11="";
 static String move12="";
 static String move13="";
 static String move14="";
 static String move15="";
 static String move16="";
 public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
  // TODO Auto-generated method stub

 Scanner scanner= new Scanner(System.in);


 System.out.println("█████████████████████████████████████████████████████████████████████████████\r\n"
         + "█▌   _    _            __                                                  ▐█\r\n"
         + "█▌  F L  J J    ____   LJ   ____     ____    _ _____     ____              ▐█\r\n"
         + "█▌ J J .. L L  F __ J  FJ  F ___J.  F __ J  J '_  _ `,  F __ J             ▐█\r\n"
         + "█▌ | |/  \\| | | _____JJ  L| |---LJ | |--| | | |_||_| | | _____J            ▐█\r\n"
         + "█▌ F   /\\   J F L___--J  LF L___--.F L__J J F L LJ J J F L___--.           ▐█\r\n"
         + "█▌J___//\\\\___J\\______/J__J\\______/J\\______/J__L LJ J__J\\______/F           ▐█\r\n"
         + "█▌|___/  \\___|J______F|__|J______F J______F|__L LJ J__|J______F            ▐█\r\n"
         + "█▌                                                                         ▐█\r\n"
         + "█▌                          _                                              ▐█\r\n"
         + "█▌                         FJ_     ____                                    ▐█\r\n"
         + "█▌                        J  _|   F __ J                                   ▐█\r\n"
         + "█▌                        | |-'  | |--| |                                  ▐█\r\n"
         + "█▌                        F |__-.F L__J J                                  ▐█\r\n"
         + "█▌                        \\_____J\\______/F                                 ▐█\r\n"
         + "█▌                        J_____FJ______F                                  ▐█\r\n"
         + "█▌                                                                         ▐█\r\n"
         + "█▌   ___                   __                     _    __   ____           ▐█\r\n"
         + "█▌  F _ \",_ ___   ____     LJ    ____     ____   FJ_  / J  F _  ]          ▐█\r\n"
         + "█▌ J `-' J '__ \",F __ J     _   F __ J   F ___J.J  _| LFJ J |/ | L         ▐█\r\n"
         + "█▌ |  __/| |__|-| |--| |   J J | _____J | |---LJ| |-' J  L| | /| |         ▐█\r\n"
         + "█▌ F |__/F L  `-F L__J J   J  LF L___--.F L___--F |__-J  LF  /_J J         ▐█\r\n"
         + "█▌J__|  J__L   J\\______/,-_J  J\\______/J\\______/\\_____J__J\\______/F        ▐█\r\n"
         + "█▌|__L  |__L    J______F\\_____/J______F J______FJ_____|__|J______F         ▐█\r\n"
         + "█▌                      \\_____/                                            ▐█\r\n"
         + "█████████████████████████████████████████████████████████████████████████████");

     System.out.println("Press C to play the game.");
     String answer = scanner.next();
     if (answer.equalsIgnoreCase("C")) {// This is if statement so it is just saying if pick this option it will do this.
       System.out.println("You are going to enter the menu screen....");
       Thread.sleep(2000); 
       
     } else {
       System.out.println("You left the game.");
       return;
     }
     do {
       do {//These are do while loops, we used a lot of them so if you pick something else it will come back to the options.
         tries++;
         System.out.println("The menu screen:");
         System.out.println("1) Press 'S' to start the game\n"
             + "2) Save the level.(not working properly)\n"
             + "3) Press 'Q' to quit the game\n"
             + "4) Press 'M' to start the music(If you start the music \nit is going to work till you finsih one level.)");

         choice = scanner.next();

         if (choice.equalsIgnoreCase("S")) {
           System.out.println("Starting the game...");
           Thread.sleep(2000);
           do {
             tries2++;

             do {

               tries3++;
               System.out.println("Chracters: \n"
                   + "1) Ben 10\n"
                   + "2) Gwen(cominging in the future)\n"
                   + "3) Kevin(coming in the future)\n");
               character = scanner.next();
               if (character.equalsIgnoreCase("1")) {
                 Thread.sleep(1000);

                 System.out.print("Your chracter is Ben Tennyson: "
                     + "⠔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠄⠀⠀⠀⣀⣠⣤⣤⣤⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣴⣾⠃⣠⣴⣶⠿⠿⢛⣯⣉⡙⣛⠋⠻⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⣀⣠⣴⣾⡿⣿⡿⢿⠿⢻⣽⠿⠛⠋⠘⠁⡁⢙⢶⡽⢧⠼⢟⢻⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣉⣥⡾⢿⠛⢄⠀⠀⠘⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡿⠟⠻⠋⠀⠀⠐⠬⠆⠤⠠⠄⠀⠀⠀⠀⠀⠀⠠⠔⠶⢰⣴⣦⣠⣾⡿⠿⢿⣿⣶⣤⣄⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡀⠀⠀⣿⣿⣿⣳⡴⢆⣦⠀⣡⣤⣤⣤⣤⣤⣤⣀⣀⣧⣴⣤⣤⣤⣤⣴⣶⠾⠟⠛⠋⠁⠀⠀⠀⠻⣍⠙⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⢿⣒⠀⠀⠀⠀⢀⣰⣾⠿⠿⠿⠿⣶⣿⠟⠈⠉⢁⣈⣶⣶⠿⠟⠉⠈⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣈⣷⣀⠀⠀⠀⠀⠀⣄⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⢀⣬⠟⠛⠁⠛⠁⠀⠀⢀⣼⣿⣿⣷⣶⡿⠿⠿⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⢿⣿⣿⣿⡆⠀⠀⠀⠀⢸⡄⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠈⠙⠳⢶⣥⣀⣠⡴⣲⠟⠉⠀⠀⠀⣀⣀⣠⣄⣀⣠⣀⣤⣤⣀⣀⡀⠀⠀⠀⠀⢀⣠⣴⣶⣶⣶⣶⣦⣤⣤⣶⣾⠿⠯⠱⢢⣄⠚⣻⣿⣷⡀⠀⠀⣰⣾⣷⡄⠀⠀⠀⠀⠀⠀\r\n"
                     + "⡇⢀⠀⠀⠀⢠⣶⣴⡿⠁⠀⢀⣤⣾⣿⣿⣿⣭⡉⢉⣿⣟⣛⡉⢙⣿⣿⢷⣦⣴⡾⣿⠛⢩⣤⢀⡀⢀⠉⠉⠉⠉⢀⡀⠉⠀⣸⣿⣿⣿⣿⣿⡇⠀⠀⢻⣿⣿⣿⠀⠀⠀⠀⠀⠀\r\n"
                     + "⡁⢸⣦⠀⢰⣶⡿⠿⣷⢀⣴⡿⠟⣁⠀⡤⠀⠈⠉⣿⣿⣿⣿⠂⣸⡟⠠⠠⡏⣭⣠⡄⠋⠟⠉⠀⠀⠈⠀⠀⢸⡆⠈⠁⠀⠆⠻⣿⣿⡎⠻⣿⡇⠀⠀⣾⣿⣿⣏⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠿⠸⠿⣷⢾⡿⠦⢀⣸⣿⢿⣻⡿⠏⢰⠆⡀⢠⡄⢿⣿⡹⣿⣿⣿⣷⣦⣄⣀⠛⢿⣁⣂⣀⢀⣇⣤⣬⣧⣤⣸⣧⣤⠀⠀⠀⠀⢻⣿⣿⠀⠘⠃⠀⣾⣿⣿⣿⣽⣦⡀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠙⢾⣝⣓⡀⠈⢿⣿⢿⣿⣷⠠⠀⡅⠘⠁⠸⣿⡇⠘⣿⣿⣿⡟⠻⣷⣶⣄⣁⠓⠉⠈⠙⢻⣿⡟⠿⣿⣾⣿⡄⣂⣤⡀⣸⡍⣿⡄⠀⢴⣾⣿⠉⣹⠋⣿⣿⡃⠀⠀⠀⠀\r\n"
                     + "⠆⠀⠀⠀⢸⡷⠦⠤⢄⣼⣿⣷⠀⠛⢸⣧⣿⠰⠄⣰⣿⡇⠀⠈⠻⣿⣷⡀⠀⠈⠙⠛⠿⢷⣾⣷⣿⣿⣧⠀⣠⣽⣿⡷⣾⣿⣏⡉⢡⣿⣧⡼⣿⣿⣵⣾⡇⠀⠸⠯⣽⠀⠀⠀⠀\r\n"
                     + "⡀⠀⠀⠀⠀⠀⠀⠀⠐⢚⣙⣿⣷⣦⣬⣥⣥⣴⣴⣿⡿⠁⠀⣄⣤⣼⣻⣿⡄⠀⠀⠀⠀⠀⠈⠛⠻⣿⣿⣶⢿⡿⠛⠛⠒⠿⣿⣿⣿⣿⡥⣶⣿⠿⣿⣿⣷⣧⡄⠀⢁⠀⠀⠀⠀\r\n"
                     + "⡇⠀⠀⢲⣄⠀⣀⠀⠀⠈⣿⠉⣀⣀⠉⢹⣿⣿⣿⣿⡅⣠⠾⠟⠋⣙⣻⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⢀⡽⣿⢏⡴⠛⢲⣆⡼⠋⢹⣿⡿⠋⠉⣠⡾⠋⢸⣿⣿⠻⣦⡀⡀⢀⠀⠀\r\n"
                     + "⣿⠀⠀⠀⣹⣷⣼⠂⠀⠘⣿⠁⠀⠈⠙⠓⣿⣿⣿⠘⡇⠀⠀⣤⠞⠋⢉⣭⣟⡯⣟⡲⠤⠖⠀⠀⠀⠈⢸⣇⣾⣥⡶⠟⠋⠀⠀⢸⡇⠀⣀⣴⣿⣇⣄⢸⣇⠈⠀⠀⠀⠀⠀⠂⡀\r\n"
                     + "⢻⣦⡀⠀⠈⠛⠛⠶⠆⠒⠻⣆⠀⠀⠀⠀⠘⢿⣿⠀⣷⠀⠘⣁⠀⣰⠟⠁⠈⢳⣎⡽⠂⠀⠀⠀⠀⢀⡀⠉⠁⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣾⣿⣿⣿⣿⣧⣄⠀⠀⠀⠂⠂⠀\r\n"
                     + "⠈⠻⣟⠶⠒⠀⠀⠈⠈⠙⠷⠻⣆⠀⠀⠀⠀⠀⠻⡆⠻⣧⠀⠀⠉⠉⠛⠛⠋⠉⠁⠀⠀⠀⠀⠀⠀⠈⡿⠀⠀⠀⠀⠀⠀⠀⠀⢸⡿⢿⠉⣱⣿⠿⠋⢈⣿⠻⣿⣶⣤⣀⡀⠀⠤\r\n"
                     + "⡄⠀⠈⠀⠀⠀⠀⢀⠀⠀⠀⡀⠙⢷⣄⣀⠀⠀⢰⡏⠀⠙⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⣩⣾⣥⣤⣀⠀⠀⠀⠀⠀⢀⡾⠀⣠⣽⠶⠧⠀⠀⢸⣧⡆⠉⠉⠈⠉⠉⠀⠀\r\n"
                     + "⠿⢦⣀⠀⠀⠀⠀⠁⠐⠁⠀⠀⠀⠀⢻⣿⣛⣿⣿⣿⣦⣀⠈⠳⣄⠀⠀⠀⠀⠀⠀⠀⣀⡤⠾⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⣠⡟⠁⠀⠦⣄⠀⠀⠀⣸⣼⡟⠁⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠙⠳⢤⣄⣒⠾⠃⠀⠀⠀⠀⠀⠀⠙⢿⣿⣿⣟⣿⣿⣷⣤⡈⠛⢦⣄⠀⠀⠰⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠚⠉⢐⣢⡤⠶⠟⠳⡾⠿⠋⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠒⡀⠀⠀⠀⠀⠈⠉⠹⠷⡈⠀⠄⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣶⡿⣿⢶⣤⣀⣀⣀⣀⣀⣀⣠⣤⣶⠞⠛⠉⠀⣀⣀⣬⠟⠀⢀⣴⠿⠂⢀⣶⣴⡆⠆⡀⣀⢀⠀⠀⠀⠐\r\n"
                     + "⠈⠋⠀⠀⠀⠀⠀⠀⡀⠀⠉⠂⠠⡤⠤⠀⢶⣾⠌⠛⣿⣿⣿⣿⣿⡿⣛⣲⣼⣶⡶⠾⠟⡿⢿⣿⣿⡿⣿⣿⠆⠀⠀⠀⠀⣾⣤⣴⣿⣟⣯⢠⣴⣿⣿⠟⠑⠆⠘⠉⠀⠀⠀⠋⠀\r\n"
                     + "⠑⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢦⠄⠀⢐⣾⣿⢀⣴⣿⠟⠋⠹⣿⣿⣾⣥⡼⠊⠀⠀⢶⣄⣀⡀⠉⠙⢟⠻⢶⣤⣀⠀⠙⠋⠽⢞⣿⣿⣿⢿⣟⣵⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⣷⠀⠀⠀⠀⠀⠀⠀⢀⣤⡴⠶⠶⠟⠛⢻⣿⣿⠿⡉⠀⠀⠀⠀⠈⠛⡿⠋⠀⠀⠀⣀⠀⠈⢿⡟⢿⣦⡀⠱⣄⢀⠙⢷⡀⠀⠀⠈⠁⠈⠀⢀⡿⠛⠀⠀⠀⠀⠀⠳⣶⣷⣤⠀⠄\r\n"
                     + "⣿⣦⠈⠛⠉⠛⠛⠛⠛⠿⠛⣧⠤⠀⢠⣿⡿⠃⠀⠁⠀⠀⠀⠀⣠⠞⠁⠀⠀⠀⠀⠙⢦⡀⠈⢹⡆⢻⣷⡦⠿⢸⠀⠀⠻⣄⠀⠀⢀⣠⣶⠏⠁⠀⠀⣰⣦⡀⠀⠀⠀⠀⠉⠑⠀\r\n"
                     + "⠘⣿⡆⠀⠀⠀⠁⠀⠀⢀⣠⠷⠶⠒⣿⡿⢡⠄⠀⠀⠀⢀⣠⠞⠁⠀⠀⠀⠀⠀⢦⡀⠀⢻⣄⣼⣀⡠⠟⠀⠀⣿⠀⠀⠀⠈⠳⢮⣉⡾⢃⣠⣤⣶⣴⣿⣿⡇⣦⣀⣀⢀⡀⡀⠀\r\n"
                     + "⠀⠘⢿⣆⠀⠙⠛⢶⣶⣿⣥⣄⣀⣴⠛⠱⠀⠀⣀⡴⠞⠉⠀⠀⠀⠀⢀⣀⣤⣶⡌⢳⡄⢠⣿⠉⠉⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⣉⣿⣿⣿⣿⣿⣿⣿⣿⣧⣿⣿⣿⣿⣿⣿⣶\r\n"
                     + "⠀⠀⠀⢻⣿⡛⠙⠛⠂⠀⣀⣼⣿⣿⡶⠴⠾⠋⠁⠀⠀⣀⣤⠾⠿⠿⠿⣿⣝⣿⣿⣠⣾⣿⣿⠀⠀⠀⠀⢀⡀⣿⣦⣀⠀⢀⣴⣿⣿⡿⠟⠛⠛⠿⣿⡉⠁⠀⠈⠻⢿⣿⣿⣿⣿\r\n"
                     + "⠀⠀⠀⠈⢳⣄⡀⢀⣠⣼⠿⠟⠋⠁⠀⠀⠀⠀⣀⣴⣿⣟⡇⠀⠀⠀⠀⠀⠈⠉⢹⣿⣿⣿⣿⣦⣾⢿⣿⣿⣿⣿⣽⡻⣿⣿⣿⣿⣋⣀⡠⠀⠀⠀⠈⠙⠓⢶⣄⡀⠀⠉⠛⠛⠿\r\n"
                     + "⠀⠀⠀⠀⠀⣈⡿⠋⠉⠀⠀⠀⠀⠀⠀⣀⣴⣾⠿⠉⣾⠏⠇⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣯⣉⠙⢿⣌⢻⣿⣧⣈⣻⣷⡘⣿⣿⡉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⣶⣤⡀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⣰⠟⠀⠀⠀⠀⠀⠀⣠⣴⣛⢻⣿⣿⣄⢠⣿⠀⢸⡀⠀⠀⠀⠀⣠⠞⠋⠁⠀⠙⢿⡄⠈⣿⡇⢿⣿⣿⣿⣿⣿⢸⣾⡇⠀⠀⠀⠀⠀⠀⠀⠀⢀⡤⠔⠋⠉⢻⣿⣦⡀\r\n"
                     + "⠀⠀⠀⢰⡟⠀⢀⡀⠀⣀⣶⠟⣉⣞⣿⣿⣿⣿⣿⣾⣿⠀⠀⡇⠀⠀⣠⠞⠁⠀⠀⠀⢀⣠⣾⡇⠀⣿⣷⢸⣿⣿⣿⣿⡿⣸⣿⡷⠶⣶⣤⣤⣤⣄⣤⣀⣀⣀⣀⣀⣀⣰⠛⠻⠭\r\n"
                     + "⡀⠉⠀⢸⡇⠉⠀⣠⣾⠏⠀⣠⡿⠛⣿⣿⣿⣿⡿⢻⣿⠀⠀⣃⡴⠏⠁⠀⠀⠀⠀⢀⣿⣿⣿⣿⣿⣿⣷⣼⣿⣿⣿⡿⣷⢿⣿⡴⠿⠟⠛⠛⠛⠚⠿⠷⣼⣦⠶⠛⠋⠀⠀⠀⠀\r\n"
                     + "⠁⠀⠀⢸⣧⣀⣾⣿⣷⣶⣾⣿⢳⣤⣿⣿⡏⠉⠁⢼⣿⢀⡼⣫⠀⠀⠀⠀⠀⠀⢠⣾⣯⣿⣿⣿⡟⠿⠟⠉⠉⡇⠀⠀⠀⢸⣿⠀⠀⡄⠀⠀⠀⠀⠀⠀⣿⣿⠀⠀⠀⠀⢀⢀⠐\r\n"
                     + "⢸⡨⠀⠀⢪⣿⣿⢛⣠⡟⠋⣀⣭⣹⣿⣿⣇⡀⠀⣸⣿⡾⠁⡏⠀⢸⠇⢀⠀⢰⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣇⣀⣀⠀⢸⣿⣀⠀⠙⠦⣄⠀⠀⠀⢠⣿⣿⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⢻⣥⣄⣾⣿⣿⣷⡿⣻⣤⣾⣿⣿⣿⣿⣮⡏⠉⠠⣿⣿⠇⢸⠀⠀⡎⠀⢸⠀⣼⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⠁⠈⠳⠜⠞⠉⠀⠀⠀⠉⠛⣛⣶⡾⠛⠻⠾⠦⢄⡀⠀⠐⠀\r\n"
                     + "⣰⣿⣯⡟⠋⣽⠿⢶⣶⣾⡿⠿⣿⣿⣿⣿⣿⣿⣷⣿⣿⠀⢸⠀⠀⡇⠀⢸⡀⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⠒⠲⠦⠄⠀⠀⠀⠀⠀⠠⢴⣯⣀⢠⡤⡤⠤⠤⠀⠀⠀⢀⠀\r\n"
                     + "⣻⣿⣿⣯⡁⣰⣶⡞⢓⣺⣆⠀⠛⠛⠛⠛⠉⠉⠛⢿⣿⠀⠸⡀⠀⣇⠀⠀⣧⣿⣾⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠛⠛⠋⠉⠉⠙⠛⠛⠛⠛⠉⠀⠀⠀⠀⠀⠀⠉⠀⠘⣿⡤⣤⣷⠀⣸⣤⠾⠋⢹⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠉⠁⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠈⡟⠁⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⡂⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠁⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠁⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
                     + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
                 System.out.println("\nYou are joining the game... ");
                 Thread.sleep(2000);//it will just make the code slower.
                 String level2 = "";
                 String level3 = "";
                 int tries = 0;//our first battle

                 String a = "";
                 scanner.nextLine();
                 do {

                   tries++;

                   // First option

                   System.out.println("You are playing as Ben 10."

                       + "\nAlarm is ringin.."

                       + "\nYour options:"

                       + "\n1. Wake up"

                       + "\n2. Go back to sleep");

                   a = scanner.nextLine();

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

                   int tries2 = 0;
                   String b = "";

                   if (a.equals("1") || a.equals("2")) {

                     tries2++;

                     System.out.println("You brush your teeths, get ready and go downstairs."
                         + "\nYou get downstairs and say hello to your mom."
                         + "\n'Hi son, are you ready for the summer break?'");
                     Thread.sleep(2000);
                     System.out.println(
                         "'You are going with your grandpa for a trip. He is going to pick you up after 30 min, and eat your food.'");
                     Thread.sleep(2000);
                     System.out.println("\n\n*30 MINUTES LATER*"
                         + "\n'I am going mom byeee'");
                     Thread.sleep(4000);
                     System.out.println(
                         "'Hi Ben, we are going to camp in the woods and then from there we will decide where to go.'");
                     Thread.sleep(2000);
                     System.out.println("\n\n*AFTER 1 HOUR OF DRIVING*"
                         + "\nGrandpa: 'It is already night, let's setup our camp and then eat.'"
                         + "\nYou set up the camp and then eat."
                         + "\n'Let’s sleep now, we have to wake up early.'");
                     Thread.sleep(2000);
                     System.out.println("\n\n*3 AM*");
                     Thread.sleep(2000);

                     do {

                       // second option

                       System.out.println(
                           "you see a star come towards you, it changes direction and crashes close to you. You wake up your grandpa and you both go to see what is happening. You see a spaceship crashed."

                               + "\nYour options: "

                               + "\n1. Go and check it out"

                               + "\n2. Stay in the camp");

                       b = scanner.nextLine();
                       if (b.equals("1")) {

                         System.out.println("You are going near the spaceship..");

                         Thread.sleep(1500);

                         System.out.println(
                             "A man comes out of it and says ‘you gotta take this watch and keep it safe.’⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
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

                         // Third option

                         int tries3 = 0;

                         String c = "";

                         do {

                           tries++;

                           System.out.println("Your options:"
                               + "\n1. Take the watch."
                               + "\n2. Leave the watch.");

                           c = scanner.nextLine();

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
                             String n = "";
                             int tries4 = 0;
                             do {

                               tries4++;
                               System.out.println("Your options:"
                                   + "\n1. Go to the spaceship."
                                   + "\n2. Run as fast as you can.");
                               n = scanner.nextLine();
                               if (n.equals("1")) {
                                 do {
                                   System.out.println("Are you going to take the watch now?");
                                   System.out.println("1. Yes.");
                                   n = scanner.nextLine();
                                   if (n.equals("1")) {
                                     System.out.println("You take the watch and it attaches to your wrist,"
                                         + " you freak out and accidentally tap the watch. "
                                         + "\nYou suddenly get on fire, "
                                         + "your grandpa screams and someone or something hurts your grandpa. "
                                         + "You go there and battle the thing.\r\n");
                                   }
                                 } while (!n.equals("1") && !n.equals("2") && tries4 < 3);
                               }

                               else if (n.equals("2")) {
                                 System.out.println("You run as fast as you can and you find a rock to hide."
                                     + "\nYou see a shadow on top of you and it looks like a drone."
                                     + "\nIt slowly gets closer to you, you get scared and you try run but that thing kills you."
                                     + "\n\nTry again.");
                                 return;
                               }
                             } while (!n.equals("1") && !n.equals("2") && tries4 < 3);
                           }

                           else {

                             System.out.println("Invalid choice.");

                           }

                         }

                         while (!c.equals("1") && !c.equals("2") && tries3 < 3);

                       }

                       else if (b.equals("2")) {
                         String reply = "";
                         int tries5 = 0;
                         System.out.println("You stay in the camp but your grandpa screams and "
                             + "someone or something hurts your grandpa."
                             + "\nYour granpa tries to fight it but it kills yout grandpa.");
                         do {

                           tries5++;
                           System.out.println("Your options:"
                               + "\n1. Go to the spaceship."
                               + "\n2. Run as fast as you can.");
                           reply = scanner.nextLine();
                           if (reply.equals("1")) {
                             do {
                               System.out.println("Are you going to take the watch now?");
                               System.out.println("1. Yes.");
                               reply = scanner.nextLine();
                               if (reply.equals("1")) {
                                 System.out.println("You take the watch and it attaches to your wrist,"
                                     + " you freak out and accidentally tap the watch. "
                                     + "\nYou suddenly get on fire, "
                                     + "your grandpa screams and someone or something hurts your grandpa. "
                                     + "You go there and battle the thing.\r\n");
                               }
                             } while (!reply.equals("1") && tries5 < 3);
                           }

                           else if (reply.equals("2")) {
                             System.out.println("You run as fast as you can and you find a rock to hide."
                                 + "\nYou see a shadow on top of you and it looks like a drone."
                                 + "\nIt slowly gets closer to you, you get scared and you try run but that thing kills you."
                                 + "\n\nTry again bitch.");
                             return;
                           }
                         } while (!reply.equals("1") && !reply.equals("2") && tries < 3);

                       } else {
                         System.out.println("Invalid choice.");
                       }

                     }

                     while (!b.equals("1") && !b.equals("2") && tries2 < 3);

                   }

                 }

                 while (!a.equals("1") && !a.equals("2") && tries < 3);

                 System.out.println("\nYou are going to battle the thing now.....");
                 Thread.sleep(2000);

                 int playerHealth = 100;
                 int dronesHealth = 100;

	               while (playerHealth > 0 && dronesHealth > 0) { // Check if both player and opponent are alive

	                  System.out.println("\nYour health: " + playerHealth);
	                  System.out.println("\nDrone's health: " + dronesHealth);
	                  Thread.sleep(1000);

	                  System.out.println("\nChoose your move: ");
	                  System.out.println("\n1. Attack\n2. Defend\n");

	                  String playerMove;
	                  do { // Validate player's move
	                    playerMove = scanner.nextLine();
	                    if (!playerMove.equals("1") && !playerMove.equals("2")) {
	                      System.out.println("\nInvalid choice. Please enter 1 or 2: ");
	                    }
	                  } while (!playerMove.equals("1") && !playerMove.equals("2"));

	                  int damage = 0;
	                  int dronesMove = (int) (Math.random() * 3) + 1;
	                  

	                  if (playerMove.equals("1")) { // Player attacks
	                    damage = (int) (Math.random() * 31) + 20; // Damage between 20 and 50
	                    if (dronesMove == 1) { // Opponent defends by 30
	                      damage -= 30;
	                    }
	                    if (damage<0)
	                    	damage=0;
	                    dronesHealth -= damage;
	                   	System.out.println("You attacked the opponent for " + damage + " damage.");
	                  } else { // Player defends
	                    System.out.println("You chose to defend.");
	                  }

	                  if ((dronesMove == 2 ||dronesMove==3) && dronesHealth > 0) { // Opponent attacks
	                    damage = (int) (Math.random() * 31) + 20; // Damage between 20 and 50
	                    if (playerMove.equals("2")) { // Player defends by 30
	                      damage -= 30; 
	                    }
	                    if (damage<0)
	                    	damage=0;
	                    playerHealth -= damage;
	                    System.out.println("The drone attacked you for " + damage + " damage.");
	                  } else if (dronesHealth > 0) { // Opponent defends
	                    System.out.println("The drone chose to defend.");
	                  }
                   }

                   // level ends, check the result
                   if (playerHealth <= 0) {
                     System.out.println("You died. Good luck next time!");
                     return;
                   } else {
                     System.out.println("You won the battle! Congrats!!");
                   // Add your logic here to proceed to the second level
                   System.out.println("You won the fight by Heatblast and a new alien comes.(Dimondhead)");
                   }
                   System.out.println("After the battle the drone speaks to you and it says \"My boss will take care of you\""
                	  + "\nYou realize how big of a threat these drones are and you decide to go alone and fight them."
                	  + "\nYou also decide to find the creater of the watch, so you can give the watch back and live your life peacefully.");

                   System.out.println( "\nYou see a big alien ship and you go to the spaceship but you need to do a challenge to go in the spaceship.");

                   do {
                	   System.out.println("Continue to the second level(Q)?");
                	   level2 = scanner.nextLine();
                	   if (level2.equalsIgnoreCase("Q")) {
                		   System.out.println("You turn into the new alein and you throw you projectiles to stop the timer at the right time.");
                		   System.out.println("You are going to the second level...");
                		   Thread.sleep(2000);
                		   System.out.println("INSTRUCTIONS!!! Please make sure eclipse is not full screen for this."
                				   + "\n There will be a timer and you have to stop the time at the right time to attack..");
                		   int tries13 = 0;
                		   int tries14 = 0;
                		   int tries16 = 0;
                		   int tries12 = 0;
                		   String choice = "";
                		   String choice2 = "";
                		   String challenge2 = "";
                		   String start = "";
                		   String start2 = "";
                		   String start3 = "";
                		   String start4 = "";
                		   String start5 = "";
                		   do {
                			   System.out.println("1.Start the challenge??");
                			   choice = scanner.nextLine();
                			   if (choice.equals("1")) {
                				   JFrame frame = new JFrame();//It is a frame.
                				   frame.setTitle("Countdown");
                				   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                				   frame.setResizable(true);
                				   frame.setSize(420, 200);
                				   counterLabel = new JLabel("Timer");
                				   counterLabel.setBounds(500, 300, 200, 100);
                				   frame.add(counterLabel);
                				   counterLabel.setHorizontalAlignment(JLabel.CENTER);
                				   Font font = new Font("Arial", Font.PLAIN, 70);
                				   counterLabel.setFont(font);
                				   frame.setVisible(true);
                				   simpleTimer();//This is saying that do the code under simpleTimer.
                				   timer.start();//This is starting the timer.
                			   }
                		   } while (!choice.equals("1") && tries12 < 5);
                		   do {
                			   System.out.println("INSTRUCTIONS!!!!! Press 'S' to stop the timer."
                					   + "\nYour task is to stop the timer at 5sec."
                					   + "\nPlease DO NOT put eclipse in full screen, and put the eclipse to the right side."
                					   + "\nThank you. ");
                			   choice2 = scanner.nextLine();
                			   if (choice2.equalsIgnoreCase("S")) {
                				   timer.stop();//This is stopping the timer when you click 'S'.
                				   if (seconds == 5) {
                					   do {
                						   System.out.println("This was a sample of the challenge. Now it is going to get more difficult.");
                						   System.out.println("Press 'N' to play the next challenge.");
                						   challenge2 = scanner.nextLine();
                						   if (challenge2.equalsIgnoreCase("N")) {
                							   JFrame frame1 = new JFrame();
                							   frame1.setTitle("Countdown1");
			                               frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                               frame1.setResizable(true);
			                               frame1.setSize(420, 200);
			                               counterLabel1 = new JLabel("Timer2");
			                               counterLabel1.setBounds(500, 300, 200, 100);
			                               frame1.add(counterLabel1);
			                               counterLabel1.setHorizontalAlignment(JLabel.CENTER);
			                               Font font = new Font("Arial", Font.PLAIN, 70);
			                               counterLabel1.setFont(font);
			                               frame1.setVisible(true);
			                               simpleTimer2();
			                               timer2.start();
			                               do {
			                            	   System.out.println("\nPress 'S' to stop the timer.");

			                            	   start = scanner.nextLine();
			                            	   if (start.equalsIgnoreCase("S")) {
			                            		   timer2.stop();
			                            		   if (seconds2 == 5) {
			                            			   do {
			                            				   System.out.println("You made it till here. Can you win 2 more times?? Now it is going to get more diffucutlt.");
					                                       System.out.println("Press 'V' to play the next challenge.");
					                                       start2 = scanner.nextLine();
					                                       if (start2.equalsIgnoreCase("V")) {
					                                         JFrame frame2 = new JFrame();
					                                         frame2.setTitle("Countdown2");
					                                         frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					                                         frame2.setResizable(true);
					                                         frame2.setSize(420, 200);
					                                         counterLabel2 = new JLabel("Timer1");
					                                         counterLabel2.setBounds(500, 300, 200, 100);
					                                         frame2.add(counterLabel2);
					                                         counterLabel2.setHorizontalAlignment(JLabel.CENTER);
					                                         Font font2 = new Font("Arial", Font.PLAIN, 70);
					                                         counterLabel2.setFont(font2);
					                                         frame2.setVisible(true);
					                                         simpleTimer3();
					                                         timer3.start();
					                                         do {
					                                           System.out.println("Press 'S' to stop the timer.");
					
					                                           start3 = scanner.nextLine();
					                                           if (start3.equalsIgnoreCase("S")) {
					                                             timer3.stop();
					                                             if (seconds3 == 5) {
					                                               do {
					                                                 System.out.println("You are very close, just one more to go.");
					                                                 System.out.println("The last level('R')");
					                                                 start4 = scanner.nextLine();
					                                                 if (start4.equalsIgnoreCase("R")) {
					                                                   JFrame frame3 = new JFrame();
					                                                   frame3.setTitle("Countdown2");
					                                                   frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					                                                   frame3.setResizable(true);
					                                                   frame3.setSize(420, 200);
					                                                   counterLabel3 = new JLabel("Timer3");
					                                                   counterLabel3.setBounds(500, 300, 200, 100);
					                                                   frame3.add(counterLabel3);
					                                                   counterLabel3.setHorizontalAlignment(JLabel.CENTER);
					                                                   Font font3 = new Font("Arial", Font.PLAIN, 70);
					                                                   counterLabel3.setFont(font3);
					                                                   frame3.setVisible(true);
					                                                   simpleTimer4();
					                                                   timer4.start();
					                                                   do {
					                                                	   System.out.println("Press 'S' to stop the timer.");
					                                                	   start5 = scanner.nextLine();
						                                                   if (start5.equalsIgnoreCase("S")) {
						                                                	   timer4.stop();
						                                                       if (seconds4 == 5) {
						                                                         System.out.println("YOU COMPLETED THE CHALLENGE!!!!"
						                                                             + "\nCONGRATS!!!"
						                                                             + "\n1. Go to the level 3?");
						                                                         level3 = scanner.nextLine();
						                                                         if (level3.equals("1")) {
						
						                                                           System.out.println("You are entering level3....");
						                                                           Thread.sleep(2000);
						                                                           System.out.println(
						                                                               "After you unlock the spaceship, you go inside and find a lot of mazes."
						                                                                   + "\nA new alien comes and you use that alien to solve the mazes(Xlr8)"
						                                                                   + "\nYou use the speed of the new alein to complete the mazes fast.");
						                                                           String maze="";
						                                                           
						                                                           do {
								                                                   System.out.println("Press 'H' to start the maze.");
								                                                   maze=scanner.nextLine();
								                                                   if(maze.equalsIgnoreCase("H")) {

								                                                	   JFrame frame6= new JFrame();
								                                                	   frame6.setTitle("Countdown");
									                                                   frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									                                                   frame6.setResizable(true);
									                                                   frame6.setSize(420,200);
									                                                   counterLabel7=new JLabel("Timer");
									                                                   counterLabel7.setBounds(500, 300, 200, 100);
									                                                   frame6.add(counterLabel7);
									                                                   counterLabel7.setHorizontalAlignment(JLabel.CENTER);
									                                                   Font font6=new Font("Arial",Font.PLAIN,70);
									                                                   counterLabel7.setFont(font6);
									                                                   frame6.setVisible(true);
									                                                   simpleTimer8();
									                                                   timer8.start();
																	                   do {
								                                                          System.out.println(""
								                                                                  + " ██████████████████████████████\r\n"
								                                                                  + "X     █     █     █           █\r\n"
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
								                                                                  + "█     █  █  █                 █\r\n"
								                                                                  + "████  █  █  ███████  ███████  █\r\n"
								                                                                  + "█              █        █     █\r\n"
								                                                                  + "████████████████████████████  █");
								
								                                                          System.out.println("1. Up (W)"
								                                                                  + "\n2. Down (S)"
								                                                                  + "\n3. Right (D)"
								                                                                  + "\n4. Left (A)");
								                                                          String move = scanner.nextLine();
								
								                                                          if (move.equalsIgnoreCase("d")) {
								                                                            do {
								                                                               System.out.println("That was the correct option.\n"
								                                                                       + " ██████████████████████████████\r\n"
								                                                                       + "    x █     █     █           █\r\n"
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
								                                                                       + "█              █        █     █\r\n"
								                                                                       + "████████████████████████████  █");
								
								                                                               System.out.println("1. Up (W)"
								                                                                       + "\n2. Down (S)"
								                                                                       + "\n3. Right (D)"
								                                                                       + "\n4. Left (A)");
								                                                               move = scanner.nextLine();
								
								                                                               if (move.equalsIgnoreCase("S")) {
								                                                                 do {
								                                                                    System.out.println("That was the correct option.\n"
								                                                                            + " ██████████████████████████████\r\n"
								                                                                            + "      █     █     █           █\r\n"
								                                                                            + "████  █  ████  ████  ████  █  █\r\n"
								                                                                            + "█  █ x   █              █  █  █\r\n"
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
								                                                                            + "█              █        █     █\r\n"
								                                                                            + "████████████████████████████  █");
								
								                                                                    System.out.println("1. Up (W)"
								                                                                            + "\n2. Down (S)"
								                                                                            + "\n3. Right (D)"
								                                                                            + "\n4. Left (A)");
								                                                                    move = scanner.nextLine();
								
								                                                                    if (move.equalsIgnoreCase("s")) {
								                                                                      do {
								                                                                         System.out.println("That was the correct option.\n"
								                                                                                 + " ██████████████████████████████\r\n"
								                                                                                 + "      █     █     █           █\r\n"
								                                                                                 + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                 + "█  █     █              █  █  █\r\n"
								                                                                                 + "█  █  ████  █████████████  █  █\r\n"
								                                                                                 + "█    x█        █     █     █  █\r\n"
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
								                                                                                 + "█              █        █     █\r\n"
								                                                                                 + "████████████████████████████  █");
								
								                                                                         System.out.println("1. Up (W)"
								                                                                                 + "\n2. Down (S)"
								                                                                                 + "\n3. Right (D)"
								                                                                                 + "\n4. Left (A)");
								                                                                         move = scanner.nextLine();
								
								                                                                         if (move.equalsIgnoreCase("a")) {
								                                                                           do {
								                                                                           System.out.println("That was the correct option.\n"
								                                                                                      + " ██████████████████████████████\r\n"
								                                                                                      + "      █     █     █           █\r\n"
								                                                                                      + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                      + "█  █     █              █  █  █\r\n"
								                                                                                      + "█  █  ████  █████████████  █  █\r\n"
								                                                                                      + "█ x   █        █     █     █  █\r\n"
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
								                                                                                      + "█              █        █     █\r\n"
								                                                                                      + "████████████████████████████  █");
								
								                                                                           System.out.println("1. Up (W)"
								                                                                                      + "\n2. Down (S)"
								                                                                                      + "\n3. Right (D)"
								                                                                                      + "\n4. Left (A)");
								                                                                              move = scanner.nextLine();
								
								                                                                              if (move.equalsIgnoreCase("S")) {
								                                                                                do {
								                                                                                System.out.println("That was the correct option.\n"
								                                                                                           + " ██████████████████████████████\r\n"
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
								                                                                                           + "█ x   █     █           █  █  █\r\n"
								                                                                                           + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                           + "█  █     █        █           █\r\n"
								                                                                                           + "█  █████████████  ███████  ████\r\n"
								                                                                                           + "█  █           █  █  █  █  █  █\r\n"
								                                                                                           + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                           + "█     █  █  █                 █\r\n"
								                                                                                           + "████  █  █  ███████  ███████  █\r\n"
								                                                                                           + "█              █        █     █\r\n"
								                                                                                           + "████████████████████████████  █");
								
								                                                                                System.out.println("1. Up (W)"
								                                                                                           + "\n2. Down (S)"
								                                                                                           + "\n3. Right (D)"
								                                                                                           + "\n4. Left (A)");
								                                                                                   move = scanner.nextLine();
								
								                                                                                   if (move.equalsIgnoreCase("d")) {
								                                                                                     do {
								                                                                                     System.out.println("That was the correct option.\n"
								                                                                                                + " ██████████████████████████████\r\n"
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
								                                                                                                + "█   x █     █           █  █  █\r\n"
								                                                                                                + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                + "█  █     █        █           █\r\n"
								                                                                                                + "█  █████████████  ███████  ████\r\n"
								                                                                                                + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                + "█     █  █  █                 █\r\n"
								                                                                                                + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                + "█              █        █     █\r\n"
								                                                                                                + "████████████████████████████  █");
								
								                                                                                     System.out.println("1. Up (W)"
								                                                                                                + "\n2. Down (S)"
								                                                                                                + "\n3. Right (D)"
								                                                                                                + "\n4. Left (A)");
								                                                                                        move = scanner.nextLine();
								
								                                                                                        if (move.equalsIgnoreCase("w")) {
								                                                                                          do {
								                                                                                          System.out.println("That was the correct option.\n"
								                                                                                                     + " ██████████████████████████████\r\n"
								                                                                                                     + "      █     █     █           █\r\n"
								                                                                                                     + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                     + "█  █     █              █  █  █\r\n"
								                                                                                                     + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                     + "█     █        █     █     █  █\r\n"
								                                                                                                     + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                     + "█  █  █  █        █     █     █\r\n"
								                                                                                                     + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                     + "█  █x       █  █  █  █  █  █  █\r\n"
								                                                                                                     + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                     + "█     █     █           █  █  █\r\n"
								                                                                                                     + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                     + "█  █     █        █           █\r\n"
								                                                                                                     + "█  █████████████  ███████  ████\r\n"
								                                                                                                     + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                     + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                     + "█     █  █  █                 █\r\n"
								                                                                                                     + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                     + "█              █        █     █\r\n"
								                                                                                                     + "████████████████████████████  █");
								
								                                                                                          System.out.println("1. Up (W)"
								                                                                                                     + "\n2. Down (S)"
								                                                                                                     + "\n3. Right (D)"
								                                                                                                     + "\n4. Left (A)");
								                                                                                             move = scanner.nextLine();
								
								                                                                                             if (move.equalsIgnoreCase("d")) {
								                                                                                               do {
								                                                                                               System.out.println("That was the correct option.\n"
								                                                                                                          + " ██████████████████████████████\r\n"
								                                                                                                          + "      █     █     █           █\r\n"
								                                                                                                          + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                          + "█  █     █              █  █  █\r\n"
								                                                                                                          + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                          + "█     █        █     █     █  █\r\n"
								                                                                                                          + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                          + "█  █  █  █        █     █     █\r\n"
								                                                                                                          + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                          + "█  █   x    █  █  █  █  █  █  █\r\n"
								                                                                                                          + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                          + "█     █     █           █  █  █\r\n"
								                                                                                                          + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                          + "█  █     █        █           █\r\n"
								                                                                                                          + "█  █████████████  ███████  ████\r\n"
								                                                                                                          + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                          + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                          + "█     █  █  █                 █\r\n"
								                                                                                                          + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                          + "█              █        █     █\r\n"
								                                                                                                          + "████████████████████████████  █");
								
								                                                                                               System.out.println("1. Up (W)"
								                                                                                                          + "\n2. Down (S)"
								                                                                                                          + "\n3. Right (D)"
								                                                                                                          + "\n4. Left (A)");
								                                                                                                  move = scanner.nextLine();
								
								                                                                                                  if (move.equalsIgnoreCase("d")) {
								                                                                                                    do {
								                                                                                                    System.out.println("That was the correct option.\n"
								                                                                                                               + " ██████████████████████████████\r\n"
								                                                                                                               + "      █     █     █           █\r\n"
								                                                                                                               + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                               + "█  █     █              █  █  █\r\n"
								                                                                                                               + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                               + "█     █        █     █     █  █\r\n"
								                                                                                                               + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                               + "█  █  █  █        █     █     █\r\n"
								                                                                                                               + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                               + "█  █       x█  █  █  █  █  █  █\r\n"
								                                                                                                               + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                               + "█     █     █           █  █  █\r\n"
								                                                                                                               + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                               + "█  █     █        █           █\r\n"
								                                                                                                               + "█  █████████████  ███████  ████\r\n"
								                                                                                                               + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                               + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                               + "█     █  █  █                 █\r\n"
								                                                                                                               + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                               + "█              █        █     █\r\n"
								                                                                                                               + "████████████████████████████  █");
								                                                                                                    System.out.println("1. Up (W)"
								                                                                                                               + "\n2. Down (S)"
								                                                                                                               + "\n3. Right (D)"
								                                                                                                               + "\n4. Left (A)");
								                                                                                                       move = scanner.nextLine();
								
								                                                                                                       if (move.equalsIgnoreCase("w")) {
								                                                                                                         do {
								                                                                                                         System.out.println("That was the correct option.\n"
								                                                                                                                    + " ██████████████████████████████\r\n"
								                                                                                                                    + "      █     █     █           █\r\n"
								                                                                                                                    + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                    + "█  █     █              █  █  █\r\n"
								                                                                                                                    + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                    + "█     █        █     █     █  █\r\n"
								                                                                                                                    + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                    + "█  █  █  █ x      █     █     █\r\n"
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
								                                                                                                                    + "█              █        █     █\r\n"
								                                                                                                                    + "████████████████████████████  █");
								
								                                                                                                         System.out.println("1. Up (W)"
								                                                                                                                    + "\n2. Down (S)"
								                                                                                                                    + "\n3. Right (D)"
								                                                                                                                    + "\n4. Left (A)");
								                                                                                                            move = scanner.nextLine();
								
								                                                                                                            if (move.equalsIgnoreCase("d")) {
								                                                                                                              do {
								                                                                                                              System.out.println("That was the correct option.\n"
								                                                                                                                         + " ██████████████████████████████\r\n"
								                                                                                                                         + "      █     █     █           █\r\n"
								                                                                                                                         + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                         + "█  █     █              █  █  █\r\n"
								                                                                                                                         + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                         + "█     █        █     █     █  █\r\n"
								                                                                                                                         + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                         + "█  █  █  █       x█     █     █\r\n"
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
								                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                              System.out.println("1. Up (W)"
								                                                                                                                         + "\n2. Down (S)"
								                                                                                                                         + "\n3. Right (D)"
								                                                                                                                         + "\n4. Left (A)");
								                                                                                                                 move = scanner.nextLine();
								
								                                                                                                                 if (move.equalsIgnoreCase("S")) {
								                                                                                                                   do {
								                                                                                                                   System.out.println("That was the correct option.\n"
								                                                                                                                              + " ██████████████████████████████\r\n"
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
								                                                                                                                              + "█     █     █   x       █  █  █\r\n"
								                                                                                                                              + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                              + "█  █     █        █           █\r\n"
								                                                                                                                              + "█  █████████████  ███████  ████\r\n"
								                                                                                                                              + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                              + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                              + "█     █  █  █                 █\r\n"
								                                                                                                                              + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                              + "█              █        █     █\r\n"
								                                                                                                                              + "████████████████████████████  █");
								
								                                                                                                                   System.out.println("1. Up (W)"
								                                                                                                                              + "\n2. Down (S)"
								                                                                                                                              + "\n3. Right (D)"
								                                                                                                                              + "\n4. Left (A)");
								                                                                                                                      move = scanner.nextLine();
								
								                                                                                                                      if (move.equalsIgnoreCase("d")) {
								                                                                                                                        do {
								                                                                                                                        System.out.println("That was the correct option.\n"
								                                                                                                                                   + " ██████████████████████████████\r\n"
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
								                                                                                                                                   + "█     █     █      x    █  █  █\r\n"
								                                                                                                                                   + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                   + "█  █     █        █           █\r\n"
								                                                                                                                                   + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                   + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                   + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                   + "█     █  █  █                 █\r\n"
								                                                                                                                                   + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                   + "█              █        █     █\r\n"
								                                                                                                                                   + "████████████████████████████  █");
								
								                                                                                                                        System.out.println("1. Up (W)"
								                                                                                                                                   + "\n2. Down (S)"
								                                                                                                                                   + "\n3. Right (D)"
								                                                                                                                                   + "\n4. Left (A)");
								                                                                                                                           move = scanner.nextLine();
								
								                                                                                                                           if (move.equalsIgnoreCase("S")) {
								                                                                                                                            do {
								                                                                                                                            System.out.println("That was the correct option.\n"
								                                                                                                                                       + " ██████████████████████████████\r\n"
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
								                                                                                                                                       + "█  █     █        █x          █\r\n"
								                                                                                                                                       + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                       + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                       + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                       + "█     █  █  █                 █\r\n"
								                                                                                                                                       + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                       + "█              █        █     █\r\n"
								                                                                                                                                       + "████████████████████████████  █");
								
								                                                                                                                            System.out.println("1. Up (W)"
								                                                                                                                                       + "\n2. Down (S)"
								                                                                                                                                       + "\n3. Right (D)"
								                                                                                                                                       + "\n4. Left (A)");
								                                                                                                                               move = scanner.nextLine();
								
								                                                                                                                               if (move.equalsIgnoreCase("d")) {
								                                                                                                                                do {
								                                                                                                                                System.out.println("That was the correct option.\n"
								                                                                                                                                           + " ██████████████████████████████\r\n"
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
								                                                                                                                                           + "█  █     █        █      x    █\r\n"
								                                                                                                                                           + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                           + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                           + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                           + "█     █  █  █                 █\r\n"
								                                                                                                                                           + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                           + "█              █        █     █\r\n"
								                                                                                                                                           + "████████████████████████████  █");
								
								                                                                                                                                System.out.println("1. Up (W)"
								                                                                                                                                           + "\n2. Down (S)"
								                                                                                                                                           + "\n3. Right (D)"
								                                                                                                                                           + "\n4. Left (A)");
								                                                                                                                                move = scanner.nextLine();
								
								                                                                                                                                   if (move.equalsIgnoreCase("S")) {
								                                                                                                                                    do {
								                                                                                                                                    System.out.println("That was the correct option.\n"
								                                                                                                                                               + " ██████████████████████████████\r\n"
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
								                                                                                                                                               + "█     █  █  █            x    █\r\n"
								                                                                                                                                               + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                               + "█              █        █     █\r\n"
								                                                                                                                                               + "████████████████████████████  █");
								
								                                                                                                                                    System.out.println("1. Up (W)"
								                                                                                                                                               + "\n2. Down (S)"
								                                                                                                                                               + "\n3. Right (D)"
								                                                                                                                                               + "\n4. Left (A)");
								                                                                                                                                    move = scanner.nextLine();
								
								                                                                                                                                       if (move.equalsIgnoreCase("d")) {
								                                                                                                                                        do {
								                                                                                                                                        System.out.println("That was the correct option.\n"
								                                                                                                                                                   + " ██████████████████████████████\r\n"
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
								                                                                                                                                                   + "█     █  █  █               x █\r\n"
								                                                                                                                                                   + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                   + "█              █        █     █\r\n"
								                                                                                                                                                   + "████████████████████████████  █");
								
								                                                                                                                                        System.out.println("1. Up (W)"
								                                                                                                                                                   + "\n2. Down (S)"
								                                                                                                                                                   + "\n3. Right (D)"
								                                                                                                                                                   + "\n4. Left (A)");
								                                                                                                                                           move = scanner.nextLine();
								
								                                                                                                                                           if (move.equalsIgnoreCase("S")) {
								                                                                                                                                             do {
								                                                                                                                                             System.out.println("That was the correct option.\n"
								                                                                                                                                                        + " ██████████████████████████████\r\n"
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
								                                                                                                                                                        + "█              █        █   x █\r\n"
								                                                                                                                                                        + "████████████████████████████  █");
								
								                                                                                                                                             System.out.println("1. Up (W)"
								                                                                                                                                                        + "\n2. Down (S)"
								                                                                                                                                                        + "\n3. Right (D)"
								                                                                                                                                                        + "\n4. Left (A)");
								                                                                                                                                                move = scanner.nextLine();
								
								                                                                                                                                                if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                 do {
								                                                                                                                                                  System.out.println("That was the correct option.\n"
								                                                                                                                                                             + " ██████████████████████████████\r\n"
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
								                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                             + "████████████████████████████x █"
								                                                                                                                                                             + "\n\nYou won!!");
								                                                                                                                                                  timer8.stop();
								
								                                                                                                                                                  String alien="";
								                                                                                                                                                String d="";
								                                                                                                                                                     String f = "";
								                                                                                                                                                     String stop1="";
								                                                                                                                                                     String choice8="";
								                                                                                                                                                     String choice9="";
								                                                                                                                                                     String reply3="";
								                                                                                                                                                     String reply4="";
								                                                                                                                                                    System.out.println("WARNING!!!! A LOT OF ASCHII ART COMING!!!!");
								                                                                                                                                                    System.out.println("After you completed the maze, you reach a door and you open that door."
								                                                                                                                                               + "\nMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKOxxxOXWMMMMMMMMMMWOlcco0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN0xollc::lkNMMMMMMMMMNo'...dWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKdoodooll:,;xKNWMMMMMMK:..ckXWMMMMMMMNXWMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXd,,coo:;;;:oOOOXMMMMMKc..cKMWNNMMMMMMKodKWMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMWXWMMMMMMMMMWKx:;lolll,;xOoc:xXWMMXl..;0MMWklOWMMMMWk,'oKWMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMW0odXKXMMMMMMWXdc;,::::;'';:'...:dO0l..,kWMMMO,.dXMMMMNl..,dXMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMXd''kkl0MMMMMNklclllloolccc;;::;.  .,'.'xWMMMMK; .;OWMMMO,. .:OWMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMWO:..:x,:XMMWN0l;:clclolcol;:c:;::,   .,';oOKXNNO;. ..lk0XXo.. ..oXMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMXo'...c; .lxxo:'.;::c;co;'cl,..:cc:,. .',,,,,;::,...     ..;;...  .:KWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMW0:......   ..,,,.';':c,:o, .cc.  ':c:. .;:;;,,,'    ..        .......:0WMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMWk;.....     .,;:,.,,'c;.:c.  'c,  .;;:;..:lllcc;..   ..................,OWMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMWx,.....      .:lc. .;::..::.   ,:..,:',:..;llcll,.....................  .;0MMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMWk,.....       .:l,  .;c, .:,    .;'.';..;..'lollc.     .........  ..      .dWMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMK:.....        .::.  .;:. .:.     ';.....,...,ccc:.      ....              .cXMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMWx'....         .,;.  .:;..':.     .;.   .'....;c:'         ....            .:XMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMNl....            .   .;...':.     .;.    ...  ..              ..           .lNMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMXc...                 .'.  .;.     .,.    ..                     ..         .xWMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMXc...     .'.          ..   ',     .'.   ..              .,'....  ..    ..  ;KMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMNo..   .',;cc'.             .,.    ..    .        .     'clc;;,,'''... .::..dWMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMWx.,:..:c:;c:,,'.            ..         ..       cOx,  .:lloc;:c;,,,:c,.dk';KMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMOlOx;:lc:;:c;,,,,,;'        ..        ..      .xNMMNOollllll:coc;;,;dOlxKxkWMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMNXN0lcllc;:c;,,,;dX0;       ...      ...     :KWMMMMMMKxool::loc;,,,;lkXWWWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMW0ollclc;;;,,:dXMM0'       .       ..     .OMMMMMMMMWKdlcclolc:,,,,,:dXMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMWXkolclllc;,,,:xNMMMWx.             ...     cNMMMMMMMMMWKdclolll;,,,,;,;kWMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMWKdlolllloc;,,,c0WMMMWx.              ..    .xMMMMMMMMMMMMKollllc,,;,,,,,lKWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMKdlllccllol;,,,;lKMMWO:.              ..    '0MMMMMMMMMMMMKdooll::cc,,,,,;cOWMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMNx:ccll:cllc;,::;;xWW0c;'              ...   ;XMMMMMMMMMMMNkccllccll:;,,,,,,ckXWMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMNxc;cllll:;cc,,::;,oXKl;:'              ...   :NMMMMMMMMMMM0dl::cclll:,,,,,,;;;:xNMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMWOllc;cllll:;;,;:;,:kKo;;;'.             ......;kNMMMMMMMMMWOlol;;lolc;,,,,,,;;;,:0MMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMWklllc;;clllc,,;:,;d0d;;;,;,             ...',,,:dXWMMMMMMMNxcc:;colc;,,'',;::;,',kWMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMWOlllc;,;:cc:;,,;,l0d;;;;:c:'            ..,::;,,;ldddKMMMMXd;;,,;;;;'....,,,'....xWMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMM0olc:,:c:;;;,;,,lOx'..,clcl:'          .,cclc:;,,'.  ;KMMMWkc:;;;;;;'..'''..''..:KMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMXxl:;;lol;,;,,,c0O;   .;cllc;'         ,llllll:'..   .dWMMMXd:;,;;;,,,;;,,,,,'.:0MMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMW0o:;cldo:,,,,;x0c.     .;c:;,'.      .clolcc,. ..    cNMMMMNOo,..';clc:;;,,:::OWMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMNOc:cloo:;;,,cko,.       .,,,,,,:::cclllool'   ..    ,KMMMMMMNx:,,:lc:;;,,okkONMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMNklllllc;,,;kOc'.       .,,,,c0WWMMWKolol;     .    .OMMMMMMMKl,',cl:;;'ckkkKWMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMKl:;,,,,';dN0c'         .',;xNMMMMMNk:;'      ..   .kMMMMMMMWx,'':c:;,'cxkONMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMO'     ...kMKl'.         ...cKMMMMM0:.         .   .kMMMMMMMMKo;',cc:;,,;oKMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMM0,       ;KMXo,.         ..  lNMMMWd.          .   .kMMMMMMMMXd:,':c:;;'.oNMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMX;      .xMMNx;.         ..  :XMMMMO.          .   .kMMMMMMMMNd,..;c:;;,,xWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMWx'..     oWMWO:.         .   lWMMMMNl           .  .OMMMMMMMMWk:,',cc;;,;OMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMK:...  .  cNMMKl'         .  .kMMMMMM0'          .  .OMMMMMMMMWx;;'':c:;';OMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMWk'..   ..,cOWMWXO;       ..  ;KMMMMMMWd'.        .  ,KMMMMMMMNOc''..;:;,.'xWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMNc     .,clccxNMMWo       .  .oWMMMMMMMX0c        .  cNMMMMMMWOl;,,,',;,'..dWMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMXo,,,;;cx0OdclKMMWd.      .  '0MMMMMMMMMMK;          ;KMMMMMNOl;,co:;;;,,'.oNMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMW0lcccllkWMWOldNMMO;.      .  oWMMMMMMMMMMM0,       .  ,kWMMMKl,'lXNx:;,,;..lXMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMW0oc::lccOMMMKd0MMXc..      . '0MMMMMMMMMMMMM0;      .   .dNMMNk::0MMKo;,;;..,xNWMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMWkc:::lc:xNMMNXWMMk.....    . cNMMMMMMMMMMMMMMK;     .... .dNMMXdl0MMNd;,;;'..'lKMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMNd:c:locl0MMMMMMWo         . .dNMMMMMMMMMMMMMXc.      ..  .dNMMNKXMMXo;''''..'dNMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMXkxddOOodXMMMMMWl          . .lXMMMMMMMMMMMMk.            .oNMMMMMW0l;,;;'.,dXMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMWWN0KWN0KWMMMMWd.         ..  :KMMMMMMMMMMNc              .xWMMMMXo:oxl:ox0WMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMO'         ..   ,OWMMMMMMMMX:               ;XMMMMKkKWXOKWMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMNl.         ..   cNMMMMMMMMWd.              .OMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMXl.        ..   oWMMMMMMMMMK;          ..   oWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMk.        ..  .xMMMMMMMMMMWx.         ..   ;XMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMk.        ..  '0MMMMMMMMMMMK;          .   .OMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMx.         .  ,KMMMMMMMMMMMWo          ..  .dWMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMWd          .  :XMMMMMMMMMMMMO'          .   cNMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMWl          .  :XMMMMMMMMMMMMX:          ..  ,KMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMNc          .  :XMMMMMMMMMMMMWd.         ..  .xMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMX;          .  :XMMMMMMMMMMMMMk.          .   lNMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMO.         ..  ;XMMMMMMMMMMMMM0'          ..  ,KMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMWd.         ..  ,KMMMMMMMMMMMMMK;          ..  .xWMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMX:          ..  '0MMMMMMMMMMMMMX;          ..   :XMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMO.          ..  .kMMMMMMMMMMMMMX:          ...  .kMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMWo.          ..   oWMMMMMMMMMMMMNc          ...   cXMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMWNKOkdc.           ..   :XMMMMMMMMMMMMNc           .    .xWMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMW0d:'....             ...  ,KMMMMMMMMMMMMWl           .     ,0MMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMWO:.  ...               ....'xWMMMMMMMMMMMMWo            .     lNMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMW0c.             .,coc,'';lodkXMMMMMMMMMMMMMMMk.            .    :XMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMNx;...         .:xKWMMWWNNWMMMMMMMMMMMMMMMMMMMMNo.           ...  .dNMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMN0ko,.......';oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNk,        ......  .lXMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMN0OO0KKKXXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWo      .cxxo,...  ,KMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKl.   .xWMMMKl....dWMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO:. .xWMMMMNd'.lXMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                               + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0l'cXMMMMMWkdXMMMMMMMMMMMMMMMMMMMMM"
								                                                                                                                                               + " \nA big alien comes from the door and says,"
								                                                                                                                                               + "\n\"You finnaly found me, I am the guy who sent the drones on you and I am going to take the watch from you because it is mine.\""
								                                                                                                                                               + "\nA human is not supposed to have this much power, I will take your watch and rule OVER THE WHOLE UNIVERSE.");
								                                                                                                                                             do {
								                                                                                                                                              System.out.println("Pres 'A' to start the level.");
								                                                                                                                                              alien=scanner.nextLine();
								                                                                                                                                               if(alien.equalsIgnoreCase("A")) {
								                                                                                                                                                System.out.println("\nYour mission is to stop him."
								                                                                                                                                                 + "\nFirst you turn into Heatblast: \nMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWWNXXNWWWWWWWWWWWWWWWWWWWNXXXNNWNXNMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKXWMWXXWWWWWWN0olxKNWWWWWWKodXWWWNXNMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKKXWWXNWWWWWKo'...'l0NWWWWNd.cKWWXNWMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNXNXXXNWWWWWK:.......'lxkkxxc..:KXXWMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXXWWWWWWWWWd...................xXXWWMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXXWWWWWWWWd....,,.............lXXKXMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXXWWWWWWWO,..'kXOc.......'ll.cXXKNMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXNWWWWWWNo...dNWNd......dWK:lNNXWMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKXWWWWWWWKl':dOXWK;....:KM0:xNXNMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOdONWWWWWWWWNOd;.,lc'....'odokXXNMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd';OWWWWWWWWWWNo.............;0XKNMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo...:kXWWWWWWWWWNd';c,......',kWKx0MMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo......;dKNWWWWWWWNKXWKl,,;;xKKWWO:xWMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNd'........,dk0NWWWWWWWWWOlllkNWWW0:.lNMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNKkxO0Okl,.........'cxKNWWXkdc'...cXWNk;..;0MMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMMMWN0d:'...;o0X0o,..........'cxKXOo;',:dKWNx,...,OMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMW0d:.........,lOX0d;...........,lxOOkO0KKOl'....,ONWWMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMWXkc'.............'l0XKd;.............'''',',:;...'d0xco0WMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMW0o,..................,kNNKd;.................;OOl,,dKO;..'dXWMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMXd,...................'cONWWN0ko'..............'dXNK0Kk;.....;kNMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMNd..................':d0XNK0XNWWXx;..............;0WWKd,.......'oXWMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMWk'................;o0XNXkl,';lxO0XKkoc,..........lKNO:...........:OWMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMXc..............'cxKNNKd:........':dOKXKOxl::ccclkKKd,.............;OMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMM0;..........':ldOXWNKd;..............,cdkOOkkkkkkKNx,...............dWMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMNX0l'....':ldxdxOKNWWKl........................'...,od:...............lNMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMKllOXOdodOKKOo;..c0WNKl.......................''..,;;,'..........,'....:XMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMXl..ck000kxl;....'xXNO:......................... .xNNWXo.  ..,:cokKk;...;0MMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMWx'....''.........c0Ol'..................... .. .'..lK0;..'..dOOkOXWNk;..'OMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMXc...............:Ox,....................... .. .:;..do .;;..,;''lKWWNO;..xWMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMWk'..............'kNx................................oXKo'... ...'lxkOKNO:'dWMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMXc...............lXMXc............................ .c0XXKo.  ....;:...cOX0okWMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMWx...............,OMMM0:..........',;:;;::;,.......   ...',......'c'....,oO0NMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMNo...............oNMMMW0:...';ldkO0KXXXXXXXKOd;.........;dx;.....;;.......';xNMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMN0dc;'..........:KMMMMMWKdlkKXXKOkdollcccclxKNXkolloodxkOx;......:,.........'xWMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMWXkddOKK0ko;.......dWMMMMMMMN0xoc;'............c0NXK0Okxdoc;.......,:...........;0MMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMWk;....;lkXNKo.....:KMMMMMMMMWx.................cKKo,'..............cc............oNMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMXo'........oXW0:...'kWMMMMMMMMWx'...............,kNk,...............'xx'...........,OWMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMW0:..........'xNNd'..lNMMMMMMMMMM0,...............oXKc................:KXc...........'xWMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMWO;............:0NKocoKWMMMMMMMMMMXc..............:0Nx'................oNWO,.........'oKWMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMNd'.............:xOO0XMMMMMMMMMMMMNl..............dNKc................'kWMNd........'xXK00NWMMMMM\r\n"
								                                                                                                                                                 + "MNOk0x:...............';kWMMMMMMMMMMMNl.............:0Nk,................:KMMMXl......,dXNx,'c0WMMMM\r\n"
								                                                                                                                                                 + "Xo'.oKKd'...............xWMMMMMMMMMMMNl.............oXNx,................lNMMMMXkxdlco0NNk,...lXMMMM\r\n"
								                                                                                                                                                 + "x....cKKc..............'kMMMMMMMMMMMMNl.............c0NXOc'..............dWMMMXkdk0KXNWNk;....,kWMMM\r\n"
								                                                                                                                                                 + "o....,ONo..............,OMMMMMMMMMMMMNl..............,dKNXkc'............xWMMWk'..',l0NXd......cXMMM\r\n"
								                                                                                                                                                 + "c....,ONd..............,0MMMMMMMMMMMMNl................;dKNXOo;.........'OMMMWd......dNNx'.....'kWMM\r\n"
								                                                                                                                                                 + ";....,OWk'.............,0MMMMMMMMMMMMNl..................,lOKXKko:;'....;0MMMNo......cXW0:......lXMM\r\n"
								                                                                                                                                                 + ",....,OWO,.............;0MMMMMMMMMMMMXc.....................;coxO00OkdllkNMMMNl......;0WXl......,OMM\r\n"
								                                                                                                                                                 + ",....;0W0;.............,0MMMMMMMMMMMMK:..........................';codkOKWMMMXc......'xNNd.......oNM\r\n"
								                                                                                                                                                 + ",....;0WXl.............,OMMMMMMMMMMMM0;................................'lXMMMK:.......lXNO:......;0M\r\n"
								                                                                                                                                                 + ";....;0WWKl............'kMMMMMMMMMMMMO,.................................,0MMM0;.......lXWN0o,.....oN\r\n"
								                                                                                                                                                 + ":....:KWWWKo'...........xWMMMMMMMMMMWx.....'''''........................,OWMM0,....'cxKNNWWNKxc...;0\r\n"
								                                                                                                                                                 + "c...:kXNXXNXOdlc;,,''''c0WMMMMMMMMMMNo..:xO0KKK0Oxo:....................'xWMM0,..:d0XKOdllldOXXk:..x\r\n"
								                                                                                                                                                 + "o..l00d:,;cldxkO0KKK000KNMMMMMMMMMMMNl,xXNNXOddkKNNKl....................xWMMKc:kXXOo;......'ckXKd,l\r\n"
								                                                                                                                                                 + "x;oKk:.........',:o0WWNXNMMMMMMMMMMMW0kXN0d;....;x0XKo...................xWMMNOk0x:'..........,kNXl:\r\n"
								                                                                                                                                                 + "NOko'..............lXWWNXNMMMMMMMMMMMXOdc'........,lKKl................'l0WMMWKo;.............'xNNkx\r\n"
								                                                                                                                                                 + "WO:...............'dXWWWXXWMMMMMMMMMXd,.............oXKl............':oOKXWMMK:..',cdxxdl;....'xNNXN\r\n"
								                                                                                                                                                 + "Xc...',;:;;,,,''';xXWWN0ocdKWMMMMMMWk'..............,xX0c.........;d0XKOdo0WWOccx0XNWWWWNXkc;;cONXKN\r\n"
								                                                                                                                                                 + "Xl.;d0XXNNXXXXKKKKNWWXx;...cKMMMMMMNo................dXNx'.......oKKOo;...oNWX0XWWWWWWWWXKXXXXNXkcoX\r\n"
								                                                                                                                                                 + "WkoONWWWWWWWWWWWWWWXk:......oNMMMMMK;...............'dNW0;.....'dK0l......lNMWXNWWWWWWWKl,cONWWXl.;0\r\n"
								                                                                                                                                                 + "MWXXWWWWWWWWWWWWWNk:.......'cKMMMMWk'...............'xNW0;....'dX0c.......lNMNXNWWWWWWW0c.;xXWWK:.;0\r\n"
								                                                                                                                                                 + "MMNXNWWWNKKXNWWWWKc......:xKKKNMMMNl................'xNW0;...,xKk:........cXMNXWWWWWWWWNKOKNWWWKc.;0\r\n"
								                                                                                                                                                 + "MMWXNWWKo,,;dKNWWNx'...,dKWWWNXNWM0;.................cKWO,.':k0o,.........cXWXXWWWWWWWWWWWWWWWWNk;;0\r\n"
								                                                                                                                                                 + "MMMNXW0c.....dXWWWXxc:o0NWWWWWNXXNd...................dK0ddO0x:...........lNNXWWWWWWWWWWWWWWWWWWXkxN\r\n"
								                                                                                                                                                 + "MMMNXNk,....;ONWWWWWNNNWWWWWWWWNNKo...................,xXKko;.............dNXNWWWWWWNNNNWWWWWWWWNXNM\r\n"
								                                                                                                                                                 + "MMMWXNXd,..'dXWWWWWWWWWWWWWWWWWWWNKd;.................'kXl................oXXNWWWWNXXNXXXXWWWWWWXXWM\r\n"
								                                                                                                                                                 + "MMMMNXWNOodOXWWWWWWWWWWWWWWWWWWWWWWNKd,...............lXK;................lNXXWWWWXXWMMMN0KWWWWWXXWM\r\n"
								                                                                                                                                                 + "MMMMNXNWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWNO,.............'kWK;................lNNXWWWWXNMMMMWKOXWWWWNXWM\r\n"
								                                                                                                                                                 + "MMMMWXXWWWWWWWWWWWWWWWWWWWWNNNNNNWWWWWK:.............;KMK:................lNWXNWWWXXMMMMWKk0NWWWNXNM\r\n"
								                                                                                                                                                 + "MMMMMNXWWWWWWWWWWWWWWWWWWWXXNNNNXXWWWWK:.............oNMNd,...............oNWXXWWWXXWMMMN0O0NWWWXXWM\r\n"
								                                                                                                                                                 + "MMMMMNNWWNNWWWWWNXXNWWWWWNXNMMMMNKNWWWKo;...........,OMMWNOxo:............xWMNXXNNXKNMMWKO0KNWWWXNMM\r\n"
								                                                                                                                                                 + "MMMMMNXWWXKWWWWXKKKNWWWWWNXWMMMNkkNWWWKKKOo;........cXMMMKdxKKx,..........xWMMWNNXXNMMWX00KXWWWNXNMM\r\n"
								                                                                                                                                                 + "MMMMMXXWWKXWWWWXNNXNWWWWWNXWMMMO;oXWWN0xkXNXk:......xWMMM0,.;kXx'........,OMMMMMMMMMMWX00KKXWWWNXWMM\r\n"
								                                                                                                                                                 + "MMMMMXXWWKXWWWNXNNXNWWWWWXKWMMWx';xOOd;..:kXN0c....:KMMMM0,..:KXl........lXMMMMMMMMMWK0KXKKWWWNXNMMM\r\n"
								                                                                                                                                                 + "MMMMMNXNNKXWWWWXXWXNWWWWWNXNMMXc...........lKNk'.;lOWMMMM0,..,ONO:'',:ldkXWMMMMMMMWNK0XNXKNWWNXNWMMM\r\n"
								                                                                                                                                                 + "MMMMMWNXXKXWWWWXXWXXWWWWWWXXWWO,............oXKddKNWMMMMMO,..'kWNKO0KXNKkONMMMMMMNK0KNNXKNWNXXNMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMNXKKNWWWNXNNXNWWWWWNXNXl.............,xKNWMMMMMMMM0,..'xNN0l:ccc;.,kWMMMMMNKKNNKKNWNXNWMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMWX00XWWWNXNNXNWWWWWXXk,..............lXMMMMMMMMMM0,..'xNXl........lXMMMMNKXWNK0XXXNWMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMWK0XWWWNXNNKNWWWWWXx,..............cXMMMMMMMMMMK:..'xN0:........:XMMMMWNXXXXNNXWMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMNKXNWWNXNNXXWWWWW0:.............'kWMMMMMMMMMMXc..'kNx'........cXMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMWNXXNNXKXWXXXXXKd'............'xNMMMMMMMMMMMXc..c0Kc.........xWMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMWNNNNNWMMWNNk;.............;OWMMMMMMMMMMMMNc.:0Xd.........cXMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMMMW0l'...........;0WMMMMMMMMMMMMMNdl0Nk,........,OWMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMMWNXXXOl'........;OWMMMMMMMMMMMMMMNKKNO;.........dNMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMWOloOKNXOc'.....'kWMMMMMMMMMMMMWNXKXN0:.........:KMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMWO,...,cd0KOl'...oNMMMMMMMMMMMMWOc:kNWO,........'xWMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMK:.......,dKXx,.cKMMMMMMMMMMMMXo'..lKWKc........cXMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMNd..........oXNkd0WMMMMMMMMMMMWx'...'xNNk:'.....,OWMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMWOoc:,......,ONXNWMMMMMMMMMMMMWk'....'oOKKOd;...dNMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMWKKNNXkc....,kNXWMMMMMMMMMMMMMMK;......';lOXKl.:KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMXocOXWWKl...:KXXWMMMMMMMMMMMMMMNd.........,xKxckWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMK:..cONWO,.'xNXNMMMMMMMMMMMMMMMMKc.........'lk0NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMK:...lXWXkloKNXNMMMMMMMMMMMMMMMMWKkxoc;'.....c0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMXc...:0WWWNNWXXWMMMMMMMMMMMMMMMMMNXNWNX0xl;...xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMW0o,.;OWWNXXNXNWMMMMMMMMMMMMMMMMMWXXNXXNNNKd'.xWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMWKx;;OWNkccOXNMMMMMMMMMMMMMMMMMMMNX0c;:oONNxl0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMNKxo0W0;.'xXNMMMMMMMMMMMMMMMMMMMNX0c...,ONKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n"
								                                                                                                                                                 + "MMMMMMMMMMMMMMMMMMMMMMMNXXNNWKc'l0XNMMMMMMMMMMMMMMMMMMMNXX0l'.;xXXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\r\n");
								                                                                                                                                               do {
								                                                                                                                                               System.out.println("1.Start the battle?");
								                                                                                                                                               f= scanner.nextLine();
								                                                                                                                                               if(f.equalsIgnoreCase("1")) {
								                                                                                                                                                         System.out.println("\nYou are going to battle the Vilgax now.....");
								                                                                                                                                                            Thread.sleep(2000);
								
								                                                                                                                                                          playerHealth = 100;
								                                                                                                                                                          int vilgaxHealth = 100;
								
								                                                                                                                                                     while (playerHealth > 0 && vilgaxHealth > 0) { // Check if both player and opponent are alive
								
								                                                                                                                                                        System.out.println("\nYour health: " + playerHealth);
								                                                                                                                                                        System.out.println("\nVilgax health: " + vilgaxHealth);
								                                                                                                                                                        Thread.sleep(1000);
								
								                                                                                                                                                        System.out.println("\nChoose your move: ");
								                                                                                                                                                        System.out.println("\n1. Attack\n2. Defend\n");
								
								                                                                                                                                                        String playerMove;
								                                                                                                                                                        do { // Validate player's move
								                                                                                                                                                          playerMove = scanner.nextLine();
								                                                                                                                                                          if (!playerMove.equals("1") && !playerMove.equals("2")) {
								                                                                                                                                                            System.out.println("\nInvalid choice. Please enter 1 or 2: ");
								                                                                                                                                                          }
								                                                                                                                                                        } while (!playerMove.equals("1") && !playerMove.equals("2"));
								
								                                                                                                                                                        int damage = 0;
								                                                                                                                                                        int vilgaxMove = (int) (Math.random() * 2) + 1;
								
								
								                                                                                                                                                        if (playerMove.equals("1")) { // Player attacks
								                                                                                                                                                          damage = (int) (Math.random() * 31) + 20; // Damage between 20 and 50
								                                                                                                                                                          if (vilgaxMove == 1) { // Opponent defends by 30
								                                                                                                                                                            damage -= 30;
								                                                                                                                                                          }
								                                                                                                                                                          if (damage<0)
								                                                                                                                                                           damage=0;
								                                                                                                                                                          vilgaxHealth -= damage;
								                                                                                                                                                          System.out.println("You attacked the opponent for " + damage + " damage.");
								                                                                                                                                                        } else { // Player defends
								                                                                                                                                                          System.out.println("You chose to defend.");
								                                                                                                                                                        }
								
								                                                                                                                                                        if (vilgaxMove == 2 && vilgaxHealth > 0) { // Opponent attacks
								                                                                                                                                                          damage = (int) (Math.random() * 31) + 20; // Damage between 20 and 50
								                                                                                                                                                          if (playerMove.equals("2")) { // Player defends by 30
								                                                                                                                                                            damage -= 30; 
								                                                                                                                                                          }
								                                                                                                                                                          if (damage<0)
								                                                                                                                                                           damage=0;
								                                                                                                                                                          playerHealth -= damage;
								                                                                                                                                                          System.out.println("The opponent attacked you for " + damage + " damage.");
								                                                                                                                                                        } else if (vilgaxHealth > 0) { // Opponent defends
								                                                                                                                                                          System.out.println("The drone chose to defend.");
								                                                                                                                                                        }
								                                                                                                                                                            }
								
								                                                                                                                                                            // level ends, check the result
								                                                                                                                                                            if (playerHealth <= 0) {
								                                                                                                                                                              System.out.println("You died. Good luck next time!");
								                                                                                                                                                              return;
								                                                                                                                                                            } else {
								                                                                                                                                                              System.out.println("You won the battle! Congrats!!");
								                                                                                                                                                              System.out.println("You won the fight with Heatblast"
								                                                                                                                                                                + "\nTo continue press (C):");
								                                                                                                                                                              String c= "";
								                                                                                                                                                              if (c.equalsIgnoreCase(c)) {
								                                                                                                                                                               System.out.println("\n\nIs that all you got from the power of the Omnitrix."
								                                                                                                                                                                          + "\nIf that is all you can do then you will never be able to beat me."
								                                                                                                                                                                          + "\nYou get angry and turn into the next alien(Dimondhead):"
								                                                                                                                                                                          + "\n  .''. .  .     .  .          ..                                         \r\n"
								                                                                                                                                                                          + "                             .cd:. ..    .. ..       .  .c; .                                       \r\n"
								                                                                                                                                                                          + "                          .  'okxl. .   ..';;;::,'...  .ck:. .                                      \r\n"
								                                                                                                                                                                          + "                          .. 'oxkOl..  ...';codxxkkxdlclxOc. ..                                     \r\n"
								                                                                                                                                                                          + "                .  .. .. .....cxkO0o........,ll:cclldxxoxOc. ..                                     \r\n"
								                                                                                                                                                                          + "                   ... . .... 'oxkK0o'.......;clodddoddox0l.............                            \r\n"
								                                                                                                                                                                          + "                    ........ ..:xk0K0d'.....,:lxkkxkOOOkO0o..............                           \r\n"
								                                                                                                                                                                          + "                  .   .........'dkOKK0d'...,ccokkdod0KKOk0o...... ......                            \r\n"
								                                                                                                                                                                          + "             .. ...  .........'ckOO0KKkc''';coOXK0OkOO0OO0d.....''...... ..                         \r\n"
								                                                                                                                                                                          + "           ............,:lodkO0KKKKKOc,'.....:OXXXNNKKXXOo:'.,ldxxxo;...................            \r\n"
								                                                                                                                                                                          + "         ......... .:x0KKXXXXXXXKKXk,         .:x0XXXKX0:. ...,cxkkO0kc..................           \r\n"
								                                                                                                                                                                          + "        ...........:OXXKXXXXXXXKKX0;            .';cxOK0o.      .lxkOKXx,.......................    \r\n"
								                                                                                                                                                                          + "      .............o0KXXXXXXXKK0KXx.                .;OWNo...';.'dkkOOKXO;...... ................   \r\n"
								                                                                                                                                                                          + "      .............:xO0KK00OOOOOOK0c                 .oNWO'..:xc:OOkkkOOKk;.........................\r\n"
								                                                                                                                                                                          + "      .............,dkkkOkkkkkkOOOOx'                 ;KWK;..;xccOkkkkkkOkc.........................\r\n"
								                                                                                                                                                                          + "       ............lkxxkkOOO000OOkd;.                 .kWWk,..;lxOkkkkOOOo'.........................\r\n"
								                                                                                                                                                                          + "       ...........;xOkkk0XXXNNNXXk'                   .xWWWXkxO0Ok000KXNKl..........................\r\n"
								                                                                                                                                                                          + "       ...........;xOkkOKXNXNNNN0l'.                  'OWNNNNNWKOOKXNNXNXl..........................\r\n"
								                                                                                                                                                                          + "       ...........'dOOO0XNNXNNN0c.',,..               :XWNNNNWN0O0KXNNNNXo..........................\r\n"
								                                                                                                                                                                          + "    ..............cOXKOOXNNNNNO;.....','..            :XWWWWW0odO00XNNNNXKd,........................\r\n"
								                                                                                                                                                                          + "   .............'o0XNXK0KNNNXk;.........,.            :XMWWWXc.'lO00XNNXXNNO:.......................\r\n"
								                                                                                                                                                                          + "   .... .......,oOXXXNNXXXXXKo..........,'            ;XMWWWXc..,dOO0KKKXNNNKl......................\r\n"
								                                                                                                                                                                          + "   ...........'okOO0XXNXXNXXXk,.........,'            :XMMWWK:..,dOOOOO0KXNNXKo'....................\r\n"
								                                                                                                                                                                          + "   ...........lkOOOOO0KXNNNNWKc.........,.            :XWWWWK;..,dOO00O000KXNNXl....................\r\n"
								                                                                                                                                                                          + "   ..........'dOOOOOOO0XNNNNNXo........,.             cNMWWWNd,.,x0O0000OO0XNNNd'...................\r\n"
								                                                                                                                                                                          + "   ..........'dOOOOOOO0XNNNNNKc......''.             .oWMWWWWNk;.:x000000O0XNNNk,...................\r\n"
								                                                                                                                                                                          + "   ...........lOOOOOOOOXNNNNNx'......,.              .xWNXXWWWWO;.;d00O0000XNNWO;...................\r\n"
								                                                                                                                                                                          + "   ...........cOOOOOOOOKNNNNNx'.....',.              ;0N00XWMMMKc..cO000000XNNN0;...................\r\n"
								                                                                                                                                                                          + "   ...........:kOOOOOOO0NNNNNO,.....''            ..;d0000XWMWWK:..cO000000XNNWKc...................\r\n"
								                                                                                                                                                                          + "   ...........;xOOOOOOO0XNNNNK:.....'.          ...,k000K0KWMWWKc..cO000000XNNNXl...................\r\n"
								                                                                                                                                                                          + "   ...........'dOOOOOOO0XNNNNXl.....,.         .....l000K0XWWWMK:..:k000O00KNNNXo...................\r\n"
								                                                                                                                                                                          + "   ............lOOOOOOOOKNNNXXk;....,.        .'....;kK0KKNWWWWO,.,oOOOOO00KNNNNd...................\r\n"
								                                                                                                                                                                          + "   ............:kOOOOOOkOXNX0KXKd'..;,       .......'d00KNWWWWXl';dOKXK000O0XNNNd...................\r\n"
								                                                                                                                                                                          + "   ............,dOOkkxdodkK0kxOKKl..',      .'.......c0KXWMWMXl.,dOKXkldkxxxxOKO:...................\r\n"
								                                                                                                                                                                          + "   .............'cddodxkO0k:.;dKXl..'.    ..,........;OKXWWWWk'.'dK0l'.;dOKOxkl'....................\r\n"
								                                                                                                                                                                          + "     .............cdxO0OOX0;..,ll'.,.    .,'.........;k0KNMWWx'..'c;...,x00O00:.....................\r\n"
								                                                                                                                                                                          + "       ...........cxxk00k00:......,.    ..,.........'o00KWWWXo'........lk0Ok0k,.....................\r\n"
								                                                                                                                                                                          + "        ...........;ldOK0O0d....',.      ...........cOKKNWWNk,........;xOO0Od;......................\r\n"
								                                                                                                                                                                          + "          ..... .....';okxc,....;.        .........,x00NWWWWO'.........,:od:........................\r\n"
								                                                                                                                                                                          + "                . ..............,.        '........:O0KNWWWWO,....................................  \r\n"
								                                                                                                                                                                          + "                  ............ .'.       ... .......o00XWWWWO,..................................    \r\n"
								                                                                                                                                                                          + "                    .........  .'.     ..............lk0XWWWO,.........................             \r\n"
								                                                                                                                                                                          + "                     ..  ...   ...    ................ck0XWW0;.......................               \r\n"
								                                                                                                                                                                          + "                               ...   ... ..............oOKNWKc................. .....               \r\n"
								                                                                                                                                                                          + "                                ..   ...  ...... ......cOKXNNx,.............     ...                \r\n"
								                                                                                                                                                                          + "                                ..   ...  ..... ...  .cxO0KXNNKOdc,..... ...                        \r\n"
								                                                                                                                                                                          + "                               ...   ...   ...   ... .oOkOOO0KXXNX0kxkd;....                        \r\n"
								                                                                                                                                                                          + "                            .....    ...             .;odxdlcoxOO0KKNWNO:.  ..                      \r\n"
								                                                                                                                                                                          + "                           ....       ..              .........;ldxO0K0k:..                         \r\n"
								                                                                                                                                                                          + "                           .,.        ..                   ...  ...,,'...                           \r\n"
								                                                                                                                                                                          + "                           ..                     .                .             ");
								                                                                                                                                                                        System.out.println("INSTRUCTIONS!!! Please make sure eclipse is not full screen for this."
								                                                                                                                                                                          + "\n There will be a timer and you have to stop the time at the right time to attack.."
								                                                                                                                                                                          + "Tap 'S' to stop the timer.");
								                                                                                                                                                                        
								                                                                                                                                                                        String r ="";
								                                                                                                                                                                        do {
								                                                                                                                                                                         System.out.println("Tap 'A' to start the second phase of the level.");
								                                                                                                                                                                         r=scanner.nextLine();
								                                                                                                                                                                         if(r.equalsIgnoreCase("A")) {
								                                                                                                                                                                        	 JFrame frame9= new JFrame();
									                                                                                                                                                                         frame9.setTitle("Countdown");
									                                                                                                                                                                         frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									                                                                                                                                                                         frame9.setResizable(false);
									                                                                                                                                                                         frame9.setSize(420,200);
									                                                                                                                                                                         counterLabel5=new JLabel("Timer");
									                                                                                                                                                                         counterLabel5.setBounds(500, 300, 200, 100);
									                                                                                                                                                                         frame9.add(counterLabel5);
									                                                                                                                                                                         counterLabel5.setHorizontalAlignment(JLabel.CENTER);
									                                                                                                                                                                         Font font9=new Font("Arial",Font.PLAIN,70);
									                                                                                                                                                                         counterLabel5.setFont(font9);
									                                                                                                                                                                         frame9.setVisible(true);
									                                                                                                                                                                         simpleTimer6();
									                                                                                                                                                                         timer6.start();
								                                                                                                                                                                         }
								                                                                                                                                                                        }while(!r.equalsIgnoreCase("A"));
								                                                                                                                                                                        do {
								                                                                                                                                                                        System.out.println("Stop the timer at 5 seconds."
								                                                                                                                                                                           + "\nPress 'S' to stop the time.");
								                                                                                                                                                                         stop1=scanner.nextLine();
								                                                                                                                                                                         if(stop1.equalsIgnoreCase("S")) {
								                                                                                                                                                                          timer6.stop();
								                                                                                                                                                                         if(seconds6==5) {
								                                                                                                                                                                          System.out.println("You won the second phase.");
								                                                                                                                                                                          System.out.println("That was good but now our battle really starts.");
								                                                                                                                                                                          do {
								                                                                                                                                                                          System.out.println("Press 'F' to continue to the last phase.");
								                                                                                                                                                                          choice8=scanner.nextLine();
								
								                                                                                                                                                                          if(choice8.equalsIgnoreCase("F")) {
								                                                                                                                                                                            System.out.println("INSTRUCTIONS!!!!You need to complete the maze in a certain amount of time to win and if the time runs out, you will lose the level."
								                                                                                                                                                                                    + "\n Please make sure eclipse is not full screen for the timer, so you can see how much time left."
								                                                                                                                                                                                    + "\nYou will have 4 options UP, DOWN, LEFT, RIGHT, and you must pick the right option to complete the maze."
								                                                                                                                                                                                    + "\nRemember!!!: 1 is for up, 2 is for down, 3 is for right and 4 is for left."
								                                                                                                                                                                                    + "\nGoodluck!!!");
								                                                                                                                                                                           System.out.println("You turn into Xlr8 and fight Vilgax:"
								                                                                                                                                                                             + "\n..................'....'',,''','..',''',,'''''''......',,'',''',,'''''..','..'''',,'.''''...........\r\n"
								                                                                                                                                                                             + "..................'.....',;,'',,..',,'',,,',''''...'..',,',,,',,,,,','.',,'''''',,,'''''............\r\n"
								                                                                                                                                                                             + "...................''...',;;,',,'.',;,',,,,,,,,'..'''',;,,,;,,;;,,,,,'',;,''''',,,,''''...'....'....\r\n"
								                                                                                                                                                                             + "...................'''..'',;,',;,'',;,,,;,,,,,,,'''''',;;,;;',;;,;,'..';;,''',,,,,,,,''.''''''''....\r\n"
								                                                                                                                                                                             + "....................'''.'',;;,',;'',;;,,;;,,;,,,''',',;:;,;,',:;;;;,....,,,,,,,,,,,,,'.'''''',,'....\r\n"
								                                                                                                                                                                             + "......'..'''.''......''''',;;;,,;,',;;;,;;;;;;,,'',,,,;:;;;;,,;;,,,,,.. ..',,,,,',,,'.''',,,,,''....\r\n"
								                                                                                                                                                                             + "..''..',''''''''.....'''''',;;;,;;,,;:;;;;;;;;;,'',,,,:c:;;;;',;'.,,',..  .',,,,''''.''',,,;;,'''''.\r\n"
								                                                                                                                                                                             + "...''''';,,,,,''''''''''''',;:;,,;;,;::;;:;;;;;;'',;;;:c:;:;:'.;,..,,,,..  .',,,'''..'',,;;;;,,,,'''\r\n"
								                                                                                                                                                                             + "...'',,',;;,;;,,,,''''',,,,,;::;;;:;;:::;::;::;;,,;;;;cc:::;c,.';..',,,,..   .,,''..'',;;;:;,,,,,'''\r\n"
								                                                                                                                                                                             + "..''',;;,,::;::;;;;,,,,,,,,,;;::;;::;:::::::::::;;::::cc::::::..,'..';,,,.   ..''...',;;::;;,,,,''''\r\n"
								                                                                                                                                                                             + "...''',;;;;:c::::::;;;;,;;;;;;:::;::::cc:::::ccc;;::::cc:::::c:..'. .,;;;'.   .....',;;:::;;;,,,''''\r\n"
								                                                                                                                                                                             + "...''',,;::;ccccc:::::;;;;:;;;:::;::::ccc:cccccc::cc:::,..;::cl,  .. .,::;.     ..',;::c:;;;;,,,,'''\r\n"
								                                                                                                                                                                             + "...'',,,;:c::clcccc::::::::;;;,;::::::ccccccccclc:c:,..    '::ll' .'. .,::'.    ..';::c:;;;;,,,,,,''\r\n"
								                                                                                                                                                                             + "...'',,;;::cc:cllllc:::::ccc:;;:::::cccclcclclll:'...       .:cll' ',. .';;.     .,,:c:::;;,,,,,,''.\r\n"
								                                                                                                                                                                             + "'''',,;;;::ccc:cllllc:coolc:::::::::ccccllllllc,....         .:cll'.:,.  .'.     .,;:::::;;,;;,,''..\r\n"
								                                                                                                                                                                             + "',,,,,;;::::cclccllldddl:::::::::cc:ccclllllc:.....           'cclc,;l,.    .    .,;::::;;;;;;,''...\r\n"
								                                                                                                                                                                             + ",,;;;;;;::::ccllccdkOkdodoc:::::::cccccclllc,..,'             .,ccc:;:l,.   .'.   '::::;;;:;;,''''''\r\n"
								                                                                                                                                                                             + ";;;;:::::::::cccdkkdooddxkxdoc::::ccccccclc' .c;.              .:c:::;cl;..  ,l;. .;::;;:::;,'''',,'\r\n"
								                                                                                                                                                                             + ":::::::c:::ccclxxdl,.;looodxkxdl;;:ccccccc' .lc.                '::::::::,.. .:ol,';:;;:::;,''',,,''\r\n"
								                                                                                                                                                                             + "::ccc:::ccc:coxdol,...'codooolc,,:::::ccc' .lo.                 .,:::::;,,'....:oxo;;;::;;,,,,;;,,''\r\n"
								                                                                                                                                                                             + ":::cccc:cccldddoc'...'..:ool,.   .,,,;::'  ;d;.                  '::;:;;,,,'...':dxc,;;;,,,,;;;,,,''\r\n"
								                                                                                                                                                                             + "::::ccllcclddol;...';:,.'cd:.        ...  .lo.                   .;;;;,,,,,,,,..':xkl,,,,,;:;;,,''''\r\n"
								                                                                                                                                                                             + ":::::cclllddo:'..,;:cc:,.'lo,             .lc.                   .,;;;,,;;;;::;..'cxkl,,;;;;;,,'''',\r\n"
								                                                                                                                                                                             + "::::::cclddl,..';ccccc::,.'ll.           .....                   .,;;,,;:::::::;'.'cxkl;;;;,,''',,;;\r\n"
								                                                                                                                                                                             + "::ccc:::odc,..,:cccccc:::,.'c,           .....             ..... .,;,,;:::::::::;'.'cxko;,,''',;;;;:\r\n"
								                                                                                                                                                                             + ":::ccc:coc'.,:c::ccccc::::,.',.          .':;..          ......  ';;,,;;:::::::::;'.'cdko,'',;::::cl\r\n"
								                                                                                                                                                                             + "::::::coc'.,cccccccccc::::;,..           '':xc.         ..':,.   .'''',,;:::::::::;..'cdkd;,;::clllc\r\n"
								                                                                                                                                                                             + ":::::;ll'.;cccccloollcc:::;;;.            ..;d:.       .'ldc..           .;c:::::::,..'cdxd:;:cllc:;\r\n"
								                                                                                                                                                                             + ";:::;:c;.,:cccccclooollcc::;;;..         .:l;;''cl:::. .::'                ':::::;;,...'cdxd:;:::;::\r\n"
								                                                                                                                                                                             + ";;;;;:;.,;:::cccccloooolcc::;;;'.         lkdoclddodl'......                .,::;;;:;...,ldxd:;:::::\r\n"
								                                                                                                                                                                             + ",,;,;:'';;;;;::ccccclooollc::;;,.         ,xdccllooo:.......                  ..',:c:'...:ooxo::::::\r\n"
								                                                                                                                                                                             + ",,,;c,..,;;;;;:::cllcclooollc::;.       ...,'.,;;;;;'.....                     .:oxxd:...;oodko:::::\r\n"
								                                                                                                                                                                             + ",,;l;.  .,;;;;;::::cllcclodolcc:'       cd' 'oc::ccc,.    ..                 .:odoooxl'..,ldoxkl::::\r\n"
								                                                                                                                                                                             + ",,:;.   .',,,;;;::::ccllllooolcc,.     .ONO,.'..     ..  .'.             .,:cloooooodc...,ldodkd::::\r\n"
								                                                                                                                                                                             + ",,,.     .,',,,;;:::::cclllllllc;.     '0MW0,.,'      .,clo:             .:lodoooooodc...,ldooxkl;;;\r\n"
								                                                                                                                                                                             + "'...     .''',,,,;;::::::cllllcc:,.    '0MMM0c;.    .:ONNNWx.           ...';cloddoodc...'ldoodkd;,,\r\n"
								                                                                                                                                                                             + "....  . ..,',,,,,,;;;::::::cccccc;.    .kMMMMXOdllclOWMMMMWo           .,,'...',;clodl'...':oooxx:''\r\n"
								                                                                                                                                                                             + "....  ...'',,,,,,,,;;;;;;;:::::::;,..   lWMMWNXXXXXXXWMMMMX;          .;cllc;,'...',;;;'....,codxl',\r\n"
								                                                                                                                                                                             + "'........,,,,,,,;;;;;;;;;;;;,;col;,,'.  '0XkddxkkkkOOOk0NMx.        .':llloollc;,''...........:oxo,,\r\n"
								                                                                                                                                                                             + "''.'..'.',,,,;;;;;;;;;;;,,,,;okkl. ...'. :o...':lllll:;,l0c       .':loooolllcc:::;,'.........,ldo:;\r\n"
								                                                                                                                                                                             + ";;;;,,,,,,,;;;;;;;;;;;;;;'..:c,'.    .:;..'.   .ldo:.  .od.     .':llllccccccc:::::;;;;,,''...'cdo:;\r\n"
								                                                                                                                                                                             + ":::::::::::::::::::::;;;,..ckd'..    ...    . .':c:,.  ,l'     .;cclllc:;;;;:cccccccc:::;;;;;'.:dl;:\r\n"
								                                                                                                                                                                             + ":::::::::::::::cc::::::;..cdl'      ...     .'........',.      .,:::ccccc:,.':ccccccccccc:::::',ol:c\r\n"
								                                                                                                                                                                             + "ccccc:::::::::::::::;;;'.'co;      .'.      .''''','''''.        .;lc:::c:;. 'cccccccccccccccc,'cl:c\r\n"
								                                                                                                                                                                             + "llllllccccccccccccc::;,'..',.    .;,         ..'''''''..         .lkxo:,;,.  'cclllccccccccccl:,clcl\r\n"
								                                                                                                                                                                             + "lllllccccccc:::::;;;;,,'....    ':.             .....            .,:lc'     .,::::::::::::::::;',,;c\r\n"
								                                                                                                                                                                             + "cccc:::::::;;;;;,,,,,,''....   .c'                              .....      .';;;;;;;;;;;;;;;;;,..,;;\r\n"
								                                                                                                                                                                             + "ccccccccccc:::::;;;;,,,,''..  .:,                               .,,,'....',;;;;;;;;;;;;;;;;;;:,,::::\r\n"
								                                                                                                                                                                             + "llllllllccccc::::;;;;;;;;,,'..,c.                ...            .,:::c::::::::::c:::::;;;;;;:::::ccc\r\n"
								                                                                                                                                                                             + "llllcccccccccc:cc::::;;;;;;;;,c:                .,;,.           .,;;;;::::::::::cccccccccccccccccccc\r\n"
								                                                                                                                                                                             + "llcccccccccccccccc::::::::::;;l:                .'....          .,;;;;;;;:::::::ccccccclllllllooooll\r\n"
								                                                                                                                                                                             + "cccccccccccccccccccc::::::::;;c:                .;;'.           .,:;;;;;;;;;;;:::ccccclllllllloooooo\r\n"
								                                                                                                                                                                             + "ccccc:::::::ccccccccccc:::;;:;:c.               .,;;.           .;::::;;;;;;;;;::::ccccllllllllllooo\r\n"
								                                                                                                                                                                             + ":::;:::::ccccccccccccc:::::;,,,:,               .,,,'.          .;:::::;;;;:::::::::cccccclllllloooo\r\n"
								                                                                                                                                                                             + ";;::::::::ccccclllcccccc:;;,,,',;.             .'''''...        ';;;:::::::::::::ccccccccccccllllooo\r\n"
								                                                                                                                                                                             + ":::::::::cccllllcccccc:;;;,,,,'.''.           ...''''.'.        ',;;;;:::::::::::cccccccccccccccclll\r\n"
								                                                                                                                                                                             + ";;::::ccccllccccllcc::;;;;,,''''...          ....''''.''.      ..',;;;;::ccccc:cccccccllcccccccccccc\r\n"
								                                                                                                                                                                             + ";;:::cccccccccllcc::::;;;;,''''''...         '...''''',,.      ...',;;;;::cccccccccccccclllccccccccc\r\n"
								                                                                                                                                                                             + ";;;:::::ccccccc::::::;;;,,,'''''','...       ....''''',.      ....''';;;:::cllllllccclccccclllcccccc\r\n"
								                                                                                                                                                                             + ";;;;;;:::cc::::::::::;;,,,,,''',,,'...    .:lc,....'',,..........'''',;::::ccllllllllccllcccccllcccc\r\n"
								                                                                                                                                                                             + ",,,,;;::::;;:::::::;;,,,,,,,,,,;,'........lkxol:'....,;,..........''',,;:::ccclllolllllccllccccccccc\r\n"
								                                                                                                                                                                             + "',,,,;;;;;;::;;::;;;,,,,,,,,;;;;,'......;oxo;'',;;,'..,;'.........',,,,,;:::cccclllolllllccccccc:ccc\r\n"
								                                                                                                                                                                             + "',,,,,,;;;;;;;;;;;;;,,;;;;;;::;,''.....,okl..   .';,..,;,.........',;;,;;;::cccccllllolllllccccccc::\r\n"
								                                                                                                                                                                             + "'',,,,;;;;;;;;;;;;,;;;;;;;:::;,,''...'',co;.     .....;:;'.......'',,;;;;;;:ccccccclllllllllcccccccc\r\n"
								                                                                                                                                                                             + "''',,,,;;;;;;,;;;;;;;;;:::cc:;,,''..'',,;:,..........,;;;,'.....''',,;::;;:::ccccccclllllllccccc::::\r\n"
								                                                                                                                                                                             + "'''',,,,,,,,,,;;;;::::::ccc:;;,,,'''',,;;;,.........',;;:;'''..'',,,;;::::::::ccccccccllccllccccc:::\r\n"
								                                                                                                                                                                             + "..'''''''',,,,;;;:::::cccc::;;,,,',,,,;;;;,'..'.'''',,;;;;''''''',,,;;::c::::::cccccccccccccccccc:::\r\n"
								                                                                                                                                                                             + ".....'''''',,;;::::::cccc:::;;;,,,,,,;;;;;,''''''''',,;;;;,'''''',;;,;::cc::cc::cccccccccccccccc::::");
								
								                                                                                                                                                                           do {
								                                                                                                                                                                            System.out.println("Press 'H' to start the maze.");
								                                                                                                                                                                            choice9=scanner.nextLine();
								                                                                                                                                                                           if(choice9.equalsIgnoreCase("H")) {
								                                                                                                                                                                           JFrame frame7= new JFrame();
								                                                                                                                                                                            frame6.setTitle("Countdown");
								                                                                                                                                                                            frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								                                                                                                                                                                            frame6.setResizable(true);
								                                                                                                                                                                            frame6.setSize(420,200);
								                                                                                                                                                                            counterLabel7=new JLabel("Timer");
								                                                                                                                                                                            counterLabel7.setBounds(500, 300, 200, 100);
								                                                                                                                                                                            frame6.add(counterLabel7);
								                                                                                                                                                                            counterLabel7.setHorizontalAlignment(JLabel.CENTER);
								                                                                                                                                                                            Font font7=new Font("Arial",Font.PLAIN,70);
								                                                                                                                                                                            counterLabel7.setFont(font6);
								                                                                                                                                                                            frame6.setVisible(true);
								                                                                                                                                                                            simpleTimer8();
								                                                                                                                                                                            timer8.start();
								                                                                                                                                                                            do {
								                                                                                                                                                                                 System.out.println(""
								                                                                                                                                                                                         + " ██████████████████████████████\r\n"
								                                                                                                                                                                                         + "X     █     █     █           █\r\n"
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
								                                                                                                                                                                                         + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                         + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                                                                                                 System.out.println("1. Up (W)"
								                                                                                                                                                                                         + "\n2. Down (S)"
								                                                                                                                                                                                         + "\n3. Right (D)"
								                                                                                                                                                                                         + "\n4. Left (A)");
								                                                                                                                                                                                 move = scanner.nextLine();
								
								                                                                                                                                                                                 if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                	 do {
								                                                                                                                                                                                     System.out.println("That was the correct option.\n"
								                                                                                                                                                                                             + " ██████████████████████████████\r\n"
								                                                                                                                                                                                             + "    x █     █     █           █\r\n"
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
								                                                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                                                             + "████████████████████████████  █");
								
								                                                                                                                                                                                     System.out.println("1. Up (W)"
								                                                                                                                                                                                             + "\n2. Down (S)"
								                                                                                                                                                                                             + "\n3. Right (D)"
								                                                                                                                                                                                             + "\n4. Left (A)");
								                                                                                                                                                                                     move = scanner.nextLine();
								
								                                                                                                                                                                                     if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                    	 do {
								                                                                                                                                                                                         System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                 + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                 + "      █     █     █           █\r\n"
								                                                                                                                                                                                                 + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                 + "█  █ x   █              █  █  █\r\n"
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
								                                                                                                                                                                                                 + "█              █        █     █\r\n"
								                                                                                                                                                                                                 + "████████████████████████████  █");
								
								                                                                                                                                                                                         System.out.println("1. Up (W)"
								                                                                                                                                                                                                 + "\n2. Down (S)"
								                                                                                                                                                                                                 + "\n3. Right (D)"
								                                                                                                                                                                                                 + "\n4. Left (A)");
								                                                                                                                                                                                         move = scanner.nextLine();
								
								                                                                                                                                                                                         if (move.equalsIgnoreCase("s")) {
								                                                                                                                                                                                        	 do {
								                                                                                                                                                                                             System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                     + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                     + "      █     █     █           █\r\n"
								                                                                                                                                                                                                     + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                     + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                     + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                     + "█    x█        █     █     █  █\r\n"
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
								                                                                                                                                                                                                     + "█              █        █     █\r\n"
								                                                                                                                                                                                                     + "████████████████████████████  █");
								
								                                                                                                                                                                                             System.out.println("1. Up (W)"
								                                                                                                                                                                                                     + "\n2. Down (S)"
								                                                                                                                                                                                                     + "\n3. Right (D)"
								                                                                                                                                                                                                     + "\n4. Left (A)");
								                                                                                                                                                                                             move = scanner.nextLine();
								
								                                                                                                                                                                                             if (move.equalsIgnoreCase("a")) {
								                                                                                                                                                                                            	 do {
								                                                                                                                                                                                            		 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                         + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                         + "      █     █     █           █\r\n"
								                                                                                                                                                                                                         + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                         + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                         + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                         + "█ x   █        █     █     █  █\r\n"
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
								                                                                                                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                                                                                                              System.out.println("1. Up (W)"
								                                                                                                                                                                                                         + "\n2. Down (S)"
								                                                                                                                                                                                                         + "\n3. Right (D)"
								                                                                                                                                                                                                         + "\n4. Left (A)");
								                                                                                                                                                                                                 move = scanner.nextLine();
								
								                                                                                                                                                                                                 if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                	 do {	
								                                                                                                                                                                                                		 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                             + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                             + "█ x   █     █           █  █  █\r\n"
								                                                                                                                                                                                                             + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                             + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                             + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                             + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                             + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                             + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                             + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                                                                             + "████████████████████████████  █");
								
								                                                                                                                                                                                                  System.out.println("1. Up (W)"
								                                                                                                                                                                                                             + "\n2. Down (S)"
								                                                                                                                                                                                                             + "\n3. Right (D)"
								                                                                                                                                                                                                             + "\n4. Left (A)");
								                                                                                                                                                                                                     move = scanner.nextLine();
								
								                                                                                                                                                                                                     if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                    	 do {
								                                                                                                                                                                                                    	 	System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                 + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                 + "█   x █     █           █  █  █\r\n"
								                                                                                                                                                                                                                 + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                 + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                 + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                 + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                 + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                 + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                 + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                 + "█              █        █     █\r\n"
								                                                                                                                                                                                                                 + "████████████████████████████  █");
								
								                                                                                                                                                                                                      System.out.println("1. Up (W)"
								                                                                                                                                                                                                                 + "\n2. Down (S)"
								                                                                                                                                                                                                                 + "\n3. Right (D)"
								                                                                                                                                                                                                                 + "\n4. Left (A)");
								                                                                                                                                                                                                         move = scanner.nextLine();
								
								                                                                                                                                                                                                         if (move.equalsIgnoreCase("w")) {
								                                                                                                                                                                                                        	 do {
								                                                                                                                                                                                                          System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                     + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                                     + "      █     █     █           █\r\n"
								                                                                                                                                                                                                                     + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                                     + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                                     + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                                     + "█     █        █     █     █  █\r\n"
								                                                                                                                                                                                                                     + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                                                                                                                     + "█  █  █  █        █     █     █\r\n"
								                                                                                                                                                                                                                     + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                                                                                                                                     + "█  █x       █  █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                     + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                                                                                                                                     + "█     █     █           █  █  █\r\n"
								                                                                                                                                                                                                                     + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                     + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                     + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                     + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                     + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                     + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                     + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                     + "█              █        █     █\r\n"
								                                                                                                                                                                                                                     + "████████████████████████████  █");
								
								                                                                                                                                                                                                          System.out.println("1. Up (W)"
								                                                                                                                                                                                                                     + "\n2. Down (S)"
								                                                                                                                                                                                                                     + "\n3. Right (D)"
								                                                                                                                                                                                                                     + "\n4. Left (A)");
								                                                                                                                                                                                                             move = scanner.nextLine();
								
								                                                                                                                                                                                                             if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                            	 do {	
								                                                                                                                                                                                                            	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                         + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                                         + "      █     █     █           █\r\n"
								                                                                                                                                                                                                                         + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                                         + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                                         + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                                         + "█     █        █     █     █  █\r\n"
								                                                                                                                                                                                                                         + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                                                                                                                         + "█  █  █  █        █     █     █\r\n"
								                                                                                                                                                                                                                         + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                                                                                                                                         + "█  █   x    █  █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                         + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                                                                                                                                         + "█     █     █           █  █  █\r\n"
								                                                                                                                                                                                                                         + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                         + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                         + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                         + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                         + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                         + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                         + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                                                                                                                              System.out.println("1. Up (W)"
								                                                                                                                                                                                                                         + "\n2. Down (S)"
								                                                                                                                                                                                                                         + "\n3. Right (D)"
								                                                                                                                                                                                                                         + "\n4. Left (A)");
								                                                                                                                                                                                                                 move = scanner.nextLine();
								
								                                                                                                                                                                                                                 if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                                	 do {
								                                                                                                                                                                                                                	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                             + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                                             + "      █     █     █           █\r\n"
								                                                                                                                                                                                                                             + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                                             + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                                             + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                                             + "█     █        █     █     █  █\r\n"
								                                                                                                                                                                                                                             + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                                                                                                                             + "█  █  █  █        █     █     █\r\n"
								                                                                                                                                                                                                                             + "█  ████  █  ████  █  ████  █  █\r\n"
								                                                                                                                                                                                                                             + "█  █       x█  █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                             + "█  █  ███████  █  ████  █  ████\r\n"
								                                                                                                                                                                                                                             + "█     █     █           █  █  █\r\n"
								                                                                                                                                                                                                                             + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                             + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                             + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                             + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                             + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                             + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                             + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                                                                                             + "████████████████████████████  █");
								                                                                                                                                                                                                                  System.out.println("1. Up (W)"
								                                                                                                                                                                                                                             + "\n2. Down (S)"
								                                                                                                                                                                                                                             + "\n3. Right (D)"
								                                                                                                                                                                                                                             + "\n4. Left (A)");
								                                                                                                                                                                                                                     move = scanner.nextLine();
								
								                                                                                                                                                                                                                     if (move.equalsIgnoreCase("w")) {
								                                                                                                                                                                                                                    	 do {
								                                                                                                                                                                                                                    	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                 + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                                                 + "      █     █     █           █\r\n"
								                                                                                                                                                                                                                                 + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                                                 + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                                                 + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                                                 + "█     █        █     █     █  █\r\n"
								                                                                                                                                                                                                                                 + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                                                                                                                                 + "█  █  █  █ x      █     █     █\r\n"
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
								                                                                                                                                                                                                                                 + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                 + "████████████████████████████  █");
								
								                                                                                                                                                                                                                      System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                 + "\n2. Down (S)"
								                                                                                                                                                                                                                                 + "\n3. Right (D)"
								                                                                                                                                                                                                                                 + "\n4. Left (A)");
								                                                                                                                                                                                                                         move = scanner.nextLine();
								
								                                                                                                                                                                                                                         if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                                        	 do {
								                                                                                                                                                                                                                        	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                     + " ██████████████████████████████\r\n"
								                                                                                                                                                                                                                                     + "      █     █     █           █\r\n"
								                                                                                                                                                                                                                                     + "████  █  ████  ████  ████  █  █\r\n"
								                                                                                                                                                                                                                                     + "█  █     █              █  █  █\r\n"
								                                                                                                                                                                                                                                     + "█  █  ████  █████████████  █  █\r\n"
								                                                                                                                                                                                                                                     + "█     █        █     █     █  █\r\n"
								                                                                                                                                                                                                                                     + "█  █  ████  ███████  █  ████  █\r\n"
								                                                                                                                                                                                                                                     + "█  █  █  █       x█     █     █\r\n"
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
								                                                                                                                                                                                                                                     + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                     + "████████████████████████████  █");
								
								                                                                                                                                                                                                                          System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                     + "\n2. Down (S)"
								                                                                                                                                                                                                                                     + "\n3. Right (D)"
								                                                                                                                                                                                                                                     + "\n4. Left (A)");
								                                                                                                                                                                                                                             move = scanner.nextLine();
								
								                                                                                                                                                                                                                             if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                                            	 do {
								                                                                                                                                                                                                                            	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                         + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                         + "█     █     █   x       █  █  █\r\n"
								                                                                                                                                                                                                                                         + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                         + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                                         + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                                         + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                                         + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                                         + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                                         + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                                                                                                                                              System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                         + "\n2. Down (S)"
								                                                                                                                                                                                                                                         + "\n3. Right (D)"
								                                                                                                                                                                                                                                         + "\n4. Left (A)");
								                                                                                                                                                                                                                                 move = scanner.nextLine();
								
								                                                                                                                                                                                                                                 if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                                                	 do {
								                                                                                                                                                                                                                                	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                             + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                             + "█     █     █      x    █  █  █\r\n"
								                                                                                                                                                                                                                                             + "█  █  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                             + "█  █     █        █           █\r\n"
								                                                                                                                                                                                                                                             + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                                             + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                                             + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                                             + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                                             + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                             + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                  System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                             + "\n2. Down (S)"
								                                                                                                                                                                                                                                             + "\n3. Right (D)"
								                                                                                                                                                                                                                                             + "\n4. Left (A)");
								                                                                                                                                                                                                                                     move = scanner.nextLine();
								
								                                                                                                                                                                                                                                     if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                                                    	 do {
								                                                                                                                                                                                                                                    	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                 + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                 + "█  █     █        █x          █\r\n"
								                                                                                                                                                                                                                                                 + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                                                 + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                                                 + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                                                 + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                                                 + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                                 + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                                 + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                      System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                                 + "\n2. Down (S)"
								                                                                                                                                                                                                                                                 + "\n3. Right (D)"
								                                                                                                                                                                                                                                                 + "\n4. Left (A)");
								                                                                                                                                                                                                                                         move = scanner.nextLine();
								
								                                                                                                                                                                                                                                         if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                                                        	 do {
								                                                                                                                                                                                                                                        	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                     + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                     + "█  █     █        █      x    █\r\n"
								                                                                                                                                                                                                                                                     + "█  █████████████  ███████  ████\r\n"
								                                                                                                                                                                                                                                                     + "█  █           █  █  █  █  █  █\r\n"
								                                                                                                                                                                                                                                                     + "█  ████  ██████████  █  █  █  █\r\n"
								                                                                                                                                                                                                                                                     + "█     █  █  █                 █\r\n"
								                                                                                                                                                                                                                                                     + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                                     + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                                     + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                          System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                                     + "\n2. Down (S)"
								                                                                                                                                                                                                                                                     + "\n3. Right (D)"
								                                                                                                                                                                                                                                                     + "\n4. Left (A)");
								                                                                                                                                                                                                                                          move = scanner.nextLine();
								
								                                                                                                                                                                                                                                             if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                                                            	 do {
								                                                                                                                                                                                                                                            	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                         + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                         + "█     █  █  █            x    █\r\n"
								                                                                                                                                                                                                                                                         + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                                         + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                                         + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                              System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                                         + "\n2. Down (S)"
								                                                                                                                                                                                                                                                         + "\n3. Right (D)"
								                                                                                                                                                                                                                                                         + "\n4. Left (A)");
								                                                                                                                                                                                                                                              move = scanner.nextLine();
								
								                                                                                                                                                                                                                                                 if (move.equalsIgnoreCase("d")) {
								                                                                                                                                                                                                                                                	 do {
								                                                                                                                                                                                                                                                	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                             + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                             + "█     █  █  █               x █\r\n"
								                                                                                                                                                                                                                                                             + "████  █  █  ███████  ███████  █\r\n"
								                                                                                                                                                                                                                                                             + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                                             + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                                  System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                                             + "\n2. Down (S)"
								                                                                                                                                                                                                                                                             + "\n3. Right (D)"
								                                                                                                                                                                                                                                                             + "\n4. Left (A)");
								                                                                                                                                                                                                                                                     move = scanner.nextLine();
								
								                                                                                                                                                                                                                                                     if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                                                                    	 do {
								                                                                                                                                                                                                                                                    	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                                 + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                                 + "█              █        █   x █\r\n"
								                                                                                                                                                                                                                                                                 + "████████████████████████████  █");
								
								                                                                                                                                                                                                                                                      System.out.println("1. Up (W)"
								                                                                                                                                                                                                                                                                 + "\n2. Down (S)"
								                                                                                                                                                                                                                                                                 + "\n3. Right (D)"
								                                                                                                                                                                                                                                                                 + "\n4. Left (A)");
								                                                                                                                                                                                                                                                         move = scanner.nextLine();
								
								                                                                                                                                                                                                                                                         if (move.equalsIgnoreCase("S")) {
								                                                                                                                                                                                                                                                        	 do {
								                                                                                                                                                                                                                                                        	 System.out.println("That was the correct option.\n"
								                                                                                                                                                                                                                                                                     + " ██████████████████████████████\r\n"
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
								                                                                                                                                                                                                                                                                     + "█              █        █     █\r\n"
								                                                                                                                                                                                                                                                                     + "████████████████████████████x █"
								                                                                                                                                                                                                                                                                     + "\n\nYou won!!");
								                                                                                                                                                                                                                                                          timer8.stop();
								                                                                                                                                                                                                                                                          do {
								                                                                                                                                                                                                                                                        System.out.println("HAHAHHAHAH you actually tried to fight me????"
								                                                                                                                                                                                          + "\nThis is the end mortal, now you will die and I WILL RULE OVER THE WHOLE UNIVEWRSE.");
								                                                                                                                                                                                                                                                        System.out.println("Are you ready to give up?"
								                                                                                                                                                                                                                                                          + "\n1.YES."
								                                                                                                                                                                                                                                                          + "\n2. NO.");
								                                                                                                                                                                                                                                                        reply3=scanner.nextLine();
								                                                                                                                                                                                                                                                       if(reply3.equals("1")) {
								                                                                                                                                                                                                                                                        System.out.println("Vilgax takes your watch and keeps you alive so you can see how he will rule the whole world."
								                                                                                                                                                                                                                                                          + "\nThe end.");
								                                                                                                                                                                                                                                                        return;
								                                                                                                                                                                                                                                                       }
								                                                                                                                                                                                                                                                       else if(reply3.equals("2")) {
								                                                                                                                                                                                                                                                        System.out.println("You run from Vilgax and then you hear a voice coming out of the watch, it says:"
								                                                                                                                                                                                                                                                          + "\"I am the creater of the watch and Vilgax was one of my students."
								                                                                                                                                                                                                                                                          + "\nHe tried to take the watch from me but I sent the watch in Earth, so it will be safe there."
								                                                                                                                                                                                                                                                          + "\nOrinally your grandpa was supposed to get it but since you have the same DNA you can also get it."
								                                                                                                                                                                                                                                                          + "\nI do not want Vilgax to get the watch, so I am going to unlock a new alien for you and turn into that alien."
								                                                                                                                                                                                                                                                          + "\nYou unlock(WayBig):"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccc,............................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccc,............................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccc;. ..........................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccc:.  .........................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccc:.   ........................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc'    .......................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc'    .......................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc.    .......................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccccccccccccccccccccccc'    .......................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccc.   .......................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccc'.  .......................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccclcccc:... .......................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccccccccccccccccccccclc,... .......................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccccccccccccccccccccc;'',cl..c;.....................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccc;';:cccccccccccccccccc,.',;dlco:,'...................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccc;...,:cccccccccccccllc;..,lO00x:.....................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccc:.   .,:cccccccccccccc,..';xOOo'.........  ..........................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccl;     .,clccccccccc:'  ',.ckx,........   ...........................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccl:.     .':ccccccc:;'.     .''........   ............................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccc;.      .;ccccl:.......    .......     ............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccc,       .,:;,,......''.  .......     .............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccc:,'.        ........'''''. .'....     ..............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccl:'............ .';:llc:;,',..',,'''..  .'''''.........................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccc;......'.,,,,;lkO0KKK00k:''',;;,';odolc:,''','........................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccc:.....','''',lOKKKKKKOkl,,':o:::,;o0KKKx,''','........................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccc,,ccccccc:....',;ldxocoOKKK00xc;,,':o,,;'',:kKOdc'',..........................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccc,..:ccccccc:'..;dOKKkoolldOKKKK0x:,''',,'''cxOkkKO:............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccc;...:cccccccccllkKKKOllddoloxkOOOkxl:,'''';lxkxx0XO;......''....................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc:'...:cccccccccox0KK0d::lodddkkkkkOOOOo,'.'o0xox0KKx,......,l:...................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc;...';clcccccccok0KKxccc:cloooxOO00kkOOc'':kd;;kKKKo......'cOd'..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc,';,',:ccccccc:oOKKklcccccc:clx00OkOKKKd,,d0c.;kKKO:......,xXk;..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc:oxl,';ccccccc:o0KOo:cccccccccoxdx0KKKKO:;kk,.,xKKx'.....,o0K0:..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccoOOc',;ccccc:cx00dcccccccccc:clcdKKKKKKlc0x'.'lOKx,....'o0KK0c..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccokKO:',:cccclodOxccccccccc::::;cx0KKKKKOOKx,..;kK0x,..'oOKKK0c..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccclccok0Kkc',::codkkxxoccccccc:'....':d0KKKKKKKO:',:okkOd' 'kXKKKk;..................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc:lx0KKO:.'cllllllodc:cccccc:,..'',;cx0KKKK0xc'.....'ol..dKKK0c...................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccc:cdkKKKc 'l,..   ..';cccccccc:,',cxkk0KKK00xc'......oo.'kKKOc....................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccc:lx0KO, ;o,........;ccccccc;....'cOKKOxxxkd;'. ...'o;.xKKOc.....................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccox0Kl.'o;.......;cccccc:,...';oO0Kkl:cdO0d;. ...;:'dKKx;......................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccc::ox00:.::......,:cccccc:...',oKK0klc:cdOKd,.....,,dKOl'.......................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccc:lx0O;.,.....':ccccccc:...:dOKKklcc:cx0k;...','.o0x;.........................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccoOO;..',,',ccccccccc'.'d0KKxcccc:lO0l;'..,'.lOo'..........................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccdk:..',',ccccccccc,.:0XKdccccc:d0x:c,.'''cd:............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccc:lx:..,',:ccccclcc::k0Odccccc:ckkccc,.',:l,.............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccl:.',':ccccccc:''ddccccccc:;,:c::'.',;'..............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccclccccc:,',,,:ccccc:.  .:cccccc:'  .;'..... ...............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccc;.......,ccc;...':lcccc:c;..':;.....................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccc:,.......;ccodlcocclccc:ldkoolco:',,.................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccc,.',,,'lxdOKKK0oclcccldOKKXOdo:;:::'...............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccc:,,;,,,,lxk0KKK0occc:ldk0KK0Kkl:lxxd;...............................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccc:cldl:olldk0KKKOoclccddOKKOcdkl:oxo;................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccc::dolxxxccOKKKOlcc:lddkKKl.'xl:oo;.................................\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccc;coclo, ,OKKKxccl:codx0x. .:l:cc;.................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccc:ccc:' ,OKKklcccc:coxx;....:ccc:'................,;,,::;;;;'.....\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccl:cc'.'.,OKxlcccccccod;..,..:cccc,...............;:,,'cd,,;,;;,;;.\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccccc;'.',.,Oxcclccccc:l;..',',ccclc,..............cl.',.:o':o'';',:.\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccl:..',,.'olcccccccc:,..',,,;ccccc;..............co.;c.:d.:d';d,,:'\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccc,..,,,..,ccccccccc,  .,,',:cccc:;..............lx:oxcdkcdkcoklll'\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccccccccccccc'..,,,..;cccccccc:. ..,,''','''................;dxxxxxxxxxxxxxd:.\r\n"
								                                                                                                                                                                                                                                                          + "cccccccccccccccccccccccccccccccccc,.;ol;,'';;,,,,'''.....','','.....................................\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccccccccccccccc::::;;;;;:oOKKkc'.................'cOOo,...................,;;;;',;;;;'....\r\n"
								                                                                                                                                                                                                                                                          + "ccccccccccccc::::;;;,,,'''.......';::cokk:...........     .;dk0x:'.................'docc;cxo::::;...\r\n"
								                                                                                                                                                                                                                                                          + "::::;;;,,,,''......................,,'',:'.............   'ldo;..'.................,xxoo',xkoo'':,..\r\n"
								                                                                                                                                                                                                                                                          + "...............................  ..'''''...................','.  ..................,o;'oxkO:.oxkx,..\r\n"
								                                                                                                                                                                                                                                                          + "..............................          ...........................................,dl;lldkl;looo,..\r\n"
								                                                                                                                                                                                                                                                          + "...................................................................................'okxxxxkkxxxxo'..\r\n"
								                                                                                                                                                                                                                                                          + ".....................................................................................'..............\r\n");
								                                                                                                                                                                                                                                                        System.out.println("\n\nYou use this alien to destroy Vilgax."
								                                                                                                                                                                                                                                                          + "\nCreater of the watch: If you want to learn more about the watch then come to my planet.");
								
								                                                                                                                                                                                                                                                        do {
								                                                                                                                                                                                                                                                         System.out.println("1.Go to the planet to learn more about them.");
								                                                                                                                                                                                                                                                         reply4=scanner.nextLine();
								                                                                                                                                                                                                                                                         if(reply4.equals("1")) {
								                                                                                                                                                                                                                                                          System.out.println("You are going to their planet...");
								                                                                                                                                                                                                                                                          Thread.sleep(2000);
								                                                                                                                                                                                                                                                          System.out.println("The next part of the game is coming in the fututre.");
								                                                                                                                                                                                                                                                          return;
								                                                                                                                                                                                                                                                         }
								                                                                                                                                                                                                                                                        }while (!reply4.equals("1"));
								                                                                                                                                                                                                                                                       }
								                                                                                                                                                                                                                                                       }while (!reply3.equals("1")&&!reply3.equals("2"));
								                                                                                                                                                                                                                                                        	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                                         }
								                                                                                                                                                                                                                                                        	 
								                                                                                                                                                                                                                                                    	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                                    } else {
								                                                                                                                                                                                                                                                         System.out.println("Wrong move!"
								                                                                                                                                                                                                                                + "\nYou lost!");
								                                                                                                                                                                                                                                                         timer8.stop();
								                                                                                                                                                                                                                              return;
								                                                                                                                                                                                                                                                        }
								                                                                                                                                                                                                                                                    	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                                    } else {
								                                                                                                                                                                                                                                                     System.out.println("Wrong move!"
								                                                                                                                                                                                                                            + "\nYou lost!");
								                                                                                                                                                                                                                                                     timer8.stop();
								                                                                                                                                                                                                                          return;
								                                                                                                                                                                                                                                                    }
								                                                                                                                                                                                                                                                     } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                                } else {
								                                                                                                                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                                                                                                                        + "\nYou lost!");
								                                                                                                                                                                                                                                                 timer8.stop();
								                                                                                                                                                                                                                                                 return;
								                                                                                                                                                                                                                                                }
								                                                                                                                                                                                                                                                	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                            } else {
								                                                                                                                                                                                                                                             System.out.println("Wrong move!"
								                                                                                                                                                                                                                    + "\nYou lost!");
								                                                                                                                                                                                                                                             timer8.stop();
								                                                                                                                                                                                                                                             return;
								                                                                                                                                                                                                                                            }
								                                                                                                                                                                                                                                                 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                        } else {
								                                                                                                                                                                                                                                         System.out.println("Wrong move!"
								                                                                                                                                                                                                                + "\nYou lost!");
								                                                                                                                                                                                                                                         timer8.stop();
								                                                                                                                                                                                                                                         return;                                                                
								                                                                                                                                                                                                                                        }
								                                                                                                                                                                                                                                            	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                    } else {
								                                                                                                                                                                                                                                     System.out.println("Wrong move!"
								                                                                                                                                                                                                            + "\nYou lost!");
								                                                                                                                                                                                                                                     timer8.stop();
								                                                                                                                                                                                                                                     return;
								                                                                                                                                                                                                                                    }
								                                                                                                                                                                                                                                             } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                                } else {
								                                                                                                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                                                                                                        + "\nYou lost!");
								                                                                                                                                                                                                                                 timer8.stop();
								                                                                                                                                                                                                                                 return;
								                                                                                                                                                                                                                                }
								                                                                                                                                                                                                                                        	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                            } else {
								                                                                                                                                                                                                                             System.out.println("Wrong move!"
								                                                                                                                                                                                                    + "\nYou lost!");
								                                                                                                                                                                                                                             timer8.stop();
								                                                                                                                                                                                                                             return;
								                                                                                                                                                                                                                            }
								                                                                                                                                                                                                                                         } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                        } else {
								                                                                                                                                                                                                                         System.out.println("Wrong move!"
								                                                                                                                                                                                                + "\nYou lost!");
								                                                                                                                                                                                                                         timer8.stop();
								                                                                                                                                                                                                                         return;
								                                                                                                                                                                                                                        }
								                                                                                                                                                                                                                                    	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                    } else {
								                                                                                                                                                                                                                     System.out.println("Wrong move!"
								                                                                                                                                                                                            + "\nYou lost!");
								                                                                                                                                                                                                                     timer8.stop();
								                                                                                                                                                                                                                     return;
								                                                                                                                                                                                                                    }
								                                                                                                                                                                                                                                     } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                                } else {
								                                                                                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                                                                                        + "\nYou lost!");
								                                                                                                                                                                                                                 timer8.stop();
								                                                                                                                                                                                                                 return;
								                                                                                                                                                                                                                }
								                                                                                                                                                                                                                                	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                            } else {
								                                                                                                                                                                                                             System.out.println("Wrong move!"
								                                                                                                                                                                                    + "\nYou lost!");
								                                                                                                                                                                                                             timer8.stop();
								                                                                                                                                                                                                             return;
								                                                                                                                                                                                                            }
								                                                                                                                                                                                                                                 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                        } else {
								                                                                                                                                                                                                         System.out.println("Wrong move!"
								                                                                                                                                                                                   + "\nYou lost!");
								                                                                                                                                                                                                         timer8.stop();
								                                                                                                                                                                                                         return;
								                                                                                                                                                                                                        }
								                                                                                                                                                                                                     } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                    } else {
								                                                                                                                                                                                                     System.out.println("Wrong move!"
								                                                                                                                                                                                  + "\nYou lost!");
								                                                                                                                                                                                                     timer8.stop();
								                                                                                                                                                                                                     return;
								                                                                                                                                                                                                    }
								                                                                                                                                                                                                                             } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                                } else {
								                                                                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                                                                                 + "\nYou lost!");
								                                                                                                                                                                                                 timer8.stop();
								                                                                                                                                                                                                 return;
								                                                                                                                                                                                                }
								                                                                                                                                                                                                                        	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                            } else {
								                                                                                                                                                                                             System.out.println("Wrong move!"
								                                                                                                                                                                                + "\nYou lost!");
								                                                                                                                                                                                             timer8.stop();
								                                                                                                                                                                                             return;
								                                                                                                                                                                                            }
								                                                                                                                                                                                                                         } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                        } else {
								                                                                                                                                                                                         System.out.println("Wrong move!"
								                                                                                                                                                                               + "\nYou lost!");
								                                                                                                                                                                                         timer8.stop();
								                                                                                                                                                                                         return;
								                                                                                                                                                                                        }
								                                                                                                                                                                                	 } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                    } else {
								                                                                                                                                                                                     System.out.println("Wrong move!"
								                                                                                                                                                                              + "\nYou lost!");
								                                                                                                                                                                                     timer8.stop();
								                                                                                                                                                                                     return;
								                                                                                                                                                                                    }
								                                                                                                                                                                            } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                                                } else {
								                                                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                                                                             + "\nYou lost!");
								                                                                                                                                                                                 timer8.stop();
								                                                                                                                                                                                 return;
								                                                                                                                                                                                }
								
								
								                                                                                                                                                                          }while(!choice9.equalsIgnoreCase("H"));
								
								                                                                                                                                                                          }
								                                                                                                                                                                          }while(!choice8.equalsIgnoreCase("F"));
								
								
								                                                                                                                                                                         }
								                                                                                                                                                                         else {
								                                                                                                                                                                          System.out.println("You lost!!"
								                                                                                                                                                                            + "\nTry again!");
								                                                                                                                                                                          return;
								                                                                                                                                                                         }
								                                                                                                                                                                         }
								                                                                                                                                                                         }
								                                                                                                                                                                        while(!stop1.equalsIgnoreCase("S"));
								                                                                                                                                                              }
								                                                                                                                                                              else {
								                                                                                                                                                               System.out.println("You quitted the game!");
								                                                                                                                                                               return;
								                                                                                                                                                              }
								
								                                                                                                                                                            }
								                                                                                                                                               }
								                                                                                                                                               else {
								                                                                                                                                                        System.out.println("Pick an option!!");
								                                                                                                                                                       }
								                                                                                                                                                        }while(!f.equalsIgnoreCase("1"));
								                                                                                                                                                        }
								                                                                                                                                                        else {
								                                                                                                                                                         System.out.println("Pick an option.");
								                                                                                                                                                        }
								                                                                                                                                                       }while(!alien.equalsIgnoreCase("A"));
								                                                                                                                                                  } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                                } else {
								                                                                                                                                                 System.out.println("Wrong move!"
								                                                                                                                        + "\nYou lost!");
								                                                                                                                                                 timer8.stop();
								                                                                                                                      return;
								                                                                                                                                                }
								                                                                                                                                                } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                           } else {
								                                                                                                                                            System.out.println("Wrong move!"
								                                                                                                                   + "\nYou lost!");
								                                                                                                                                            timer8.stop();
								                                                                                                                 return;
								                                                                                                                                           }
								                                                                                                                                            } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                       } else {
								                                                                                                                                        System.out.println("Wrong move!"
								                                                                                                               + "\nYou lost!");
								                                                                                                                                        timer8.stop();
								                                                                                                                                        return;
								                                                                                                                                       }
								                                                                                                                                           } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                                   } else {
								                                                                                                                                    System.out.println("Wrong move!"
								                                                                                                           + "\nYou lost!");
								                                                                                                                                    timer8.stop();
								                                                                                                                                    return;
								                                                                                                                                   }
								                                                                                                                                        } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                               } else {
								                                                                                                                                System.out.println("Wrong move!"
								                                                                                                       + "\nYou lost!");
								                                                                                                                                timer8.stop();
								                                                                                                                                return;                                                                
								                                                                                                    }
								                                                                                                                                       } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                           } else {
								                                                                                                                            System.out.println("Wrong move!"
								                                                                                                   + "\nYou lost!");
								                                                                                                                            timer8.stop();
								                                                                                                                            return;
								                                                                                                                           }
								                                                                                                                       } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                      } else {
								                                                                                                                       System.out.println("Wrong move!"
								                                                                                              + "\nYou lost!");
								                                                                                                                       timer8.stop();
								                                                                                                                       return;
								                                                                                                                      }
								                                                                                                                  }while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                                 } else {
								                                                                                                                  System.out.println("Wrong move!"
								                                                                                         + "\nYou lost!");
								                                                                                                                  timer8.stop();
								                                                                                                                  return;
								                                                                                                                 }
								                                                                                                             }while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                            } else {
								                                                                                                             System.out.println("Wrong move!"
								                                                                                    + "\nYou lost!");
								                                                                                                             timer8.stop();
								                                                                                                             return;
								                                                                                                            }
								                                                                                                        }while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                       } else {
								                                                                                                        System.out.println("Wrong move!"
								                                                                               + "\nYou lost!");
								                                                                                                        timer8.stop();
								                                                                                                        return;
								                                                                                                       }
								                                                                                                   } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                                  } else {
								                                                                                                   System.out.println("Wrong move!"
								                                                                          + "\nYou lost!");
								                                                                                                   timer8.stop();
								                                                                                                   return;
								                                                                                                  }
								                                                                                              }while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                             } else {
								                                                                                              System.out.println("Wrong move!"
								                                                                     + "\nYou lost!");
								                                                                                              timer8.stop();
								                                                                                              return;
								                                                                                             }
								                                                                                         } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                        } else {
								                                                                                         System.out.println("Wrong move!"
								                                                                   + "\nYou lost!");
								                                                                                         timer8.stop();
								                                                                                         return;
								                                                                                        }
								                                                                                    } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                                   } else {
								                                                                                    System.out.println("Wrong move!"
								                                                                 + "\nYou lost!");
								                                                                                    timer8.stop();
								                                                                                    return;
								                                                                                   }
								                                                                               } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                              } else {
								                                                                               System.out.println("Wrong move!"
								                                                               + "\nYou lost!");
								                                                                               timer8.stop();
								                                                                               return;
								                                                                              }
								                                                                          } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                         } else {
								                                                                          System.out.println("Wrong move!"
								                                                             + "\nYou lost!");
								                                                                          timer8.stop();
								                                                                          return;
								                                                                         }
								                                                                     } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                                    } else {
								                                                                     System.out.println("Wrong move!"
								                                                           + "\nYou lost!");
								                                                                     timer8.stop();
								                                                                     return;
								                                                                    }
								                                                                } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                               } else {
								                                                                System.out.println("Wrong move!"
								                                                         + "\nYou lost!");
								                                                                timer8.stop();
								                                                                return;
								                                                               }
								                                                           }while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                          } else {
								                                                           System.out.println("Wrong move!"
								                                                       + "\nYou lost!");
								                                                           timer8.stop();
								                                                           return;
								                                                          } 
																	                   } while (!move.equalsIgnoreCase("w")||!move.equalsIgnoreCase("a")||!move.equalsIgnoreCase("s")||!move.equalsIgnoreCase("d"));
								                                                   }
						                                                           }while(!maze.equalsIgnoreCase("H"));
						                                                         }
						                                                       }
						                                                       else {
						                                                    	   System.out.println("You lost!");
						                                                    	   return;
						                                                       }
						                                                   }
					                                                   } while (!start5.equalsIgnoreCase("S"));
					                                                 }
					                                               } while (!start4.equalsIgnoreCase("R"));
					                                             }
					                                             else {
			                                                    	   System.out.println("You lost!");
			                                                    	   return;
			                                                       }
					                                           }
					                                         } while (!start3.equalsIgnoreCase("S"));
					                                       }
			                            			   } while (!start2.equalsIgnoreCase("V"));
			                            		   }
			                            		   else {
                                                	   System.out.println("You lost!");
                                                	   return;
                                                   }
			                            	   }
			                               } while (!start.equalsIgnoreCase("S"));
                						   }
                					   } while (!challenge2.equalsIgnoreCase("N"));
                				   }
                				   else {
                                	   System.out.println("You lost!");
                                	   return;
                                   }
                			   }
                		   } while (!choice2.equalsIgnoreCase("S"));
                	   }
                   } while (!level2.equalsIgnoreCase("Q"));
                   return;
                   }
               else if (character.equalsIgnoreCase("2")) {
                 System.out.println("Coming soon!!!");
                 Thread.sleep(2000);
                 System.out.println("    ________\r\n"
                     + "        _jgN########Ngg_\r\n"
                     + "      _N##N@@\"\"  \"\"9NN##Np_\r\n"
                     + "     d###P            N####p\r\n"
                     + "     \"^^\"              T####\r\n"
                     + "                       d###P\r\n"
                     + "                    _g###@F\r\n"
                     + "                 _gN##@P\r\n"
                     + "               gN###F\"\r\n"
                     + "              d###F\r\n"
                     + "             0###F\r\n"
                     + "             0###F\r\n"
                     + "             0###F\r\n"
                     + "             \"NN@'\r\n"
                     + "\r\n"
                     + "              ___\r\n"
                     + "             q###r\r\n"
                     + "              \"\"");
               }

               else if (character.equalsIgnoreCase("3")) {
                 System.out.println("Coming soon!!!");
                 Thread.sleep(2000);
                 System.out.println("    ________\r\n"
                     + "        _jgN########Ngg_\r\n"
                     + "      _N##N@@\"\"  \"\"9NN##Np_\r\n"
                     + "     d###P            N####p\r\n"
                     + "     \"^^\"              T####\r\n"
                     + "                       d###P\r\n"
                     + "                    _g###@F\r\n"
                     + "                 _gN##@P\r\n"
                     + "               gN###F\"\r\n"
                     + "              d###F\r\n"
                     + "             0###F\r\n"
                     + "             0###F\r\n"
                     + "             0###F\r\n"
                     + "             \"NN@'\r\n"
                     + "\r\n"
                     + "              ___\r\n"
                     + "             q###r\r\n"
                     + "              \"\"");
               } else {
                 System.out.println("Pick a character!!!");
               }
             }

             while (character.equalsIgnoreCase("2") || character.equalsIgnoreCase("3") && tries3 <= 3);

           }

           while (!character.equalsIgnoreCase("1") && !character.equalsIgnoreCase("2")
               && !character.equalsIgnoreCase("3") && tries2 <= 3);
         }

         else if (choice.equals("2")) {
        	 System.out.println("NOT WORKING!!");
        	 return;
         } else if (choice.equalsIgnoreCase("Q")) {
           System.out.println("You quit the game.");
           return;
         }
         else if (choice.equalsIgnoreCase("M")) {
           File file = new File("Ben 10.wav");
           AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
           Clip clip = AudioSystem.getClip();
           clip.open(audioStream);
           do {
             System.out.println("P = play, S = Stop(Stop option is not working properly.)");
             System.out.print("Enter your choice: ");

             response1 = scanner.next();

             if (response1.equalsIgnoreCase("P")) {
               System.out.println("You play the music.");
               clip.start();
               clip.loop(Clip.LOOP_CONTINUOUSLY);
             } 
             else if (response1.equalsIgnoreCase("S")) {
             System.out.println("You stop the music.");
             clip.close();

             } else {
               System.out.println("Invalid");
             }
           } while (!response1.equalsIgnoreCase("S") && !response1.equalsIgnoreCase("P") && tries6 <= 3);

           System.out.println("Byeeee!");
         }
         else {
           System.out.println("Pick an option!!!");

         }
       } while (!choice.equalsIgnoreCase("S") && !choice.equalsIgnoreCase("2") && !choice.equalsIgnoreCase("Q")
           && tries <= 3);
     } while (!response1.equalsIgnoreCase("S") && !response1.equalsIgnoreCase("P") && tries6 <= 3);

 }
  public static void simpleTimer() {
      timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          seconds--;
          counterLabel.setText("" + seconds);
          if (seconds == 0) {
            System.out.println("You lose the level.");
            timer.stop();
            return;
          }

        }
      });
    }

    public static void simpleTimer2() {
      timer2 = new Timer(500, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          seconds2--;
          counterLabel1.setText("" + seconds2);
          if (seconds2 == 0) {
            System.out.println("You lose the level.");
            timer2.stop();
            return;
          }

        }
      });
    }

    public static void simpleTimer3() {
      timer3 = new Timer(300, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          seconds3--;
          counterLabel2.setText("" + seconds3);
          if (seconds3 == 0) {
            System.out.println("You lose the level.");
            timer3.stop();
            return;
          }

        }
      });
    }

    public static void simpleTimer4() {
      timer4 = new Timer(200, new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          seconds4--;
          counterLabel3.setText("" + seconds4);
          if (seconds4 == 0) {
            System.out.println("You lose the level.");
            timer4.stop();
            return;
          }

        }
      });
    }


    public static void simpleTimer6() {
    timer6=new Timer(200, new ActionListener() {


     public void actionPerformed(ActionEvent e) {
      seconds6--;
      counterLabel5.setText(""+ seconds6);
      if (seconds6==0) {
       timer6.stop();
       System.out.println("You lose the game.");
       return;
      }
     }
    });}
   public static void simpleTimer7() {
    timer7=new Timer(1000, new ActionListener() {


     public void actionPerformed(ActionEvent e) {
      seconds7--;
      counterLabel6.setText(""+ seconds7);
      if (seconds7==0) {
       System.out.println("You lose the level.");
       timer7.stop();
       return;
      }

     }
    });}
    public static void simpleTimer8() {
       timer8 = new Timer(1000, new ActionListener() {

         public void actionPerformed(ActionEvent e) {
           seconds8--;
           counterLabel7.setText("" + seconds8);
           if (seconds8 == 0) {
             System.out.println("You lose the level.");
             timer8.stop();
             return;
           }

         }
       });
     }

}