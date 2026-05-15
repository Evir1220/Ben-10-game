package ben10StoryModeGame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Lastlevel4 {
	static JLabel counterLabel5;
	static Timer timer6;
	static int seconds6=30;
	static JLabel counterLabel6;
	static Timer timer7;
	static int seconds7=100;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String alien="";
		  String d="";
          String f = "";
          String stop1="";
          String choice8="";
          String choice9="";
          String reply3="";
          String reply4="";
          String reply5="";
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
f=scanner.nextLine();
if(f.equalsIgnoreCase("1")) {
	 System.out.println("\nYou are going to battle the thing now.....");
     Thread.sleep(2000);

     int playerHealth1 = 100;
     int Vilgax = 100;

     while (playerHealth1 > 0 && Vilgax > 0) { // Check if both player and opponent are alive

       System.out.println("\nYour health: " + playerHealth1);
       System.out.println("\nVilgax health: " + Vilgax);
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
       System.out.println("You won the fight by Heatblast");
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
          do {
        	  System.out.println("INSTRUCTIONS!!! Please make sure eclipse is not full screen for this."
              		+ "\n There will be a timer and you have to stop the time at the right time to attack.."
              		+ "Tap 'S' to stop the tim4e.");
        	  System.out.println("Tap 'A' to start the second phase of the level.");
        	  d=scanner.nextLine();
        	  if(d.equalsIgnoreCase("A")) {
        		  JFrame frame6= new JFrame();
        			frame6.setTitle("Countdown");
        			frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        			frame6.setResizable(false);
        			frame6.setSize(420,200);
        			counterLabel5=new JLabel("Timer");
        			counterLabel5.setBounds(500, 300, 200, 100);
        			frame6.add(counterLabel5);
        			counterLabel5.setHorizontalAlignment(JLabel.CENTER);
        			Font font6=new Font("Arial",Font.PLAIN,70);
        			counterLabel5.setFont(font6);
        			frame6.setVisible(true);
        			
        			simpleTimer6();
        			timer6.start();
        	  }
          }while(!d.equalsIgnoreCase("A"));
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
	         		simpleTimer7();
	         		timer7.start();
	         		System.out.println(" ████████████████████████████\r\n"
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
	         				+ "████████████████████████████  ");
	         		do {
	        			
	            		System.out.println("\n1. Up."
	            				+ "\n2. Down."
	            				+ "\n3. Right."
	            				+ "\n4. Left");
	            		move=scanner.nextLine();
	            		if(move.equals("1")) {
	            			System.out.println("That was not the correct option.");
	            			timer7.stop();
	            			return;
	            		}
	            		else if(move.equals("2")) {
	            			System.out.println("That was not the correct option");
	            			timer7.stop();
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
	                    			timer7.stop();
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
	                            			timer7.stop();
	                            			return;
	                            		}
	                            		else if(move3.equals("2")) {
	                            			System.out.println("That wss not the correct option.");
	                            			timer7.stop();
	                            			return;
	                            		}
	                            		else if(move3.equals("3")) {
	                            			System.out.println("That was not the correct option.");
	                            			timer7.stop();
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
	                                    			timer7.stop();
	                                    			return;
	                                    		}
	                                    		else if(move4.equals("2")) {
	                                    			
	                                    				System.out.println("That was the correct option.");
	                                    				do {
	                                            		System.out.println("\n1. Up."
	                                            				+ "\n2. Down."
	                                            				+ "\n3. Right."
	                                            				+ "\n4. Left");
	                                            		move5=scanner.nextLine();
	                                            		if(move5.equals("1")) {
	                                            			System.out.println("That was not the correct option.");
	                                            			timer7.stop();
	                                            			return;
	                                            		}
	                                            		else if(move5.equals("2")) {
	                                            			System.out.println("That was not the correct option.");
	                                            			timer7.stop();
	                                            			return;
	                                            		}
	                                            		else if(move5.equals("3")) {
	                                        				System.out.println("That was the correct option.");
	                                        				do {
	                                                		System.out.println("\n1. Up."
	                                                				+ "\n2. Down."
	                                                				+ "\n3. Right."
	                                                				+ "\n4. Left");
	                                                		move6=scanner.nextLine();
	                                                		if(move6.equals("1")) {
	                                            				System.out.println("That was the correct option.");
	                                            				do {
	                                                    		System.out.println("\n1. Up."
	                                                    				+ "\n2. Down."
	                                                    				+ "\n3. Right."
	                                                    				+ "\n4. Left");
	                                                    		move7=scanner.nextLine();
	                                                    		if(move7.equals("1")) {
	                                                    			System.out.println("That was not the correct option.");
	                                                    			timer7.stop();
	                                                    			return;
	                                                    		}
	                                                    		else if(move7.equals("2")) {
	                                                    			System.out.println("That was not the right option.");
	                                                    			timer7.stop();
	                                                    			return;
	                                                    		}
	                                                    		else if(move7.equals("3")) {
	                                                				System.out.println("That was the correct option.");
	                                                				do {
	                                                        		System.out.println("\n1. Up."
	                                                        				+ "\n2. Down."
	                                                        				+ "\n3. Right."
	                                                        				+ "\n4. Left");
	                                                        		move8=scanner.nextLine();
	                                                        		if(move8.equals("1")) {
	                                                    				System.out.println("That was the correct option.");
	                                                    				do {
	                                                            		System.out.println("\n1. Up."
	                                                            				+ "\n2. Down."
	                                                            				+ "\n3. Right."
	                                                            				+ "\n4. Left");
	                                                            		move9=scanner.nextLine();
	                                                            		if(move9.equals("1")) {
	                                                            			System.out.println("That was not the correct option.");
	                                                            			timer7.stop();
	                                                            			return;
	                                                            		}
	                                                            		else if(move9.equals("2")) {
	                                                            			System.out.println("That was not the right option.");
	                                                            			timer7.stop();
	                                                            			return;
	                                                            		}
	                                                            		else if(move9.equals("3")) {
	                                                        				System.out.println("That was the correct option.");
	                                                        				do {
	                                                                		System.out.println("\n1. Up."
	                                                                				+ "\n2. Down."
	                                                                				+ "\n3. Right."
	                                                                				+ "\n4. Left");
	                                                                		move10=scanner.nextLine();
	                                                                		if(move10.equals("1")) {
	                                                                			System.out.println("That was not the correct option.");
	                                                                			timer7.stop();
	                                                                			return;
	                                                                		}
	                                                                		else if(move10.equals("2")) {
	                                                                			System.out.println("That was the correct option.");
	                                                            				do {
	                                                                    		System.out.println("\n1. Up."
	                                                                    				+ "\n2. Down."
	                                                                    				+ "\n3. Right."
	                                                                    				+ "\n4. Left");
	                                                                    		move11=scanner.nextLine();
	                                                                    		if(move11.equals("1")) {
	                                                                    			System.out.println("That was not the correct option.");
	                                                                    			timer7.stop();
	                                                                    			return;
	                                                                    		}
	                                                                    		else if(move11.equals("2")) {
	                                                                    			System.out.println("That was not the right option.");
	                                                                    			timer7.stop();
	                                                                    			return;
	                                                                    		}
	                                                                    		else if(move11.equals("3")) {
	                                                                				System.out.println("That was the correct option.");
	                                                                				do {
	                                                                        		System.out.println("\n1. Up."
	                                                                        				+ "\n2. Down."
	                                                                        				+ "\n3. Right."
	                                                                        				+ "\n4. Left");
	                                                                        		move12=scanner.nextLine();
	                                                                        		if(move5.equals("1")) {
	                                                                        			System.out.println("That was not the correct option.");
	                                                                        			timer7.stop();
	                                                                        			return;
	                                                                        		}
	                                                                        		else if(move12.equals("2")) {
	                                                                    				System.out.println("That was the correct option.");
	                                                                    				do {
	                                                                            		System.out.println("\n1. Up."
	                                                                            				+ "\n2. Down."
	                                                                            				+ "\n3. Right."
	                                                                            				+ "\n4. Left");
	                                                                            		move13=scanner.nextLine();
	                                                                            		if(move13.equals("1")) {
	                                                                            			System.out.println("That was not the correct option.");
	                                                                            			timer7.stop();
	                                                                            			return;
	                                                                            		}
	                                                                            		else if(move13.equals("2")) {
	                                                                            			System.out.println("That was not the right option.");
	                                                                            			timer7.stop();
	                                                                            			return;
	                                                                            		}
	                                                                            		else if(move13.equals("3")) {
	                                                                        				System.out.println("That was the correct option.");
	                                                                        				do {
	                                                                                		System.out.println("\n1. Up."
	                                                                                				+ "\n2. Down."
	                                                                                				+ "\n3. Right."
	                                                                                				+ "\n4. Left");
	                                                                                		move14=scanner.nextLine();
	                                                                                		if(move14.equals("1")) {
	                                                                                			System.out.println("That was not the correct option.");
	                                                                                			timer7.stop();
	                                                                                			return;
	                                                                                		}
	                                                                                		else if(move14.equals("2")) {
	                                                                            				System.out.println("That was the correct option.");
	                                                                            				do {
	                                                                                    		System.out.println("\n1. Up."
	                                                                                    				+ "\n2. Down."
	                                                                                    				+ "\n3. Right."
	                                                                                    				+ "\n4. Left");
	                                                                                    		move15=scanner.nextLine();
	                                                                                    		if(move15.equals("1")) {
	                                                                                    			System.out.println("That was not the correct option.");
	                                                                                    			timer7.stop();
	                                                                                    			return;
	                                                                                    		}
	                                                                                    		else if(move15.equals("2")) {
	                                                                                    			System.out.println("That was not the right option.");
	                                                                                    			timer7.stop();
	                                                                                    			return;
	                                                                                    		}
	                                                                                    		else if(move15.equals("3")) {
	                                                                                				System.out.println("That was the correct option.");
	                                                                                				do {
	                                                                                        		System.out.println("\n1. Up."
	                                                                                        				+ "\n2. Down."
	                                                                                        				+ "\n3. Right."
	                                                                                        				+ "\n4. Left");
	                                                                                        		move16=scanner.nextLine();
	                                                                                        		if(move16.equals("1")) {
	                                                                                        			System.out.println("That was not the correct option.");
	                                                                                        			timer7.stop();
	                                                                                        			return;
	                                                                                        		}
	                                                                                        		else if(move16.equals("2")) {
	                                                                                        			System.out
	    																										.println("You won the phase 3!!!!!"
	    																												+ "\nCONGRATS!!!!!");
	                                                                                        			timer7.stop();
	                                                                                        			do {
	                                                                                        				System.out
																													.println("HAHAHHAHAH you actually tried to fight me????"
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
	                                                                                        						System.out.println("You are going to there planet...");
	                                                                                        						Thread.sleep(2000);
	                                                                                        						System.out.println("The next part of the game is coming in the fututre.");
	                                                                                        					}
	                                                                                        				}while (!reply4.equals("1"));
	                                                                                        			}
	                                                                                        			}while (!reply3.equals("1")&&!reply3.equals("2"));
	                                                                                        		}
	                                                                                        		else if(move16.equals("3")) {
	                                                                                        			System.out
	    																										.println("That was not the right answer.");
	                                                                                        			timer7.stop();
	                                                                                        			return;
	                                                                                        		}
	                                                                                        		else if(move16.equals("4")) {
	                                                                                        			System.out.println("That was not the right option.");
	                                                                                        			timer7.stop();
	                                                                                        			return;
	                                                                                        		}
	                                                                                        		else
	                                                                                        			System.out.println("Pick an option");
	                                                                                        		} while (!move16.equals("1")&&!move16.equals("2")&&!move16.equals("3")&&!move16.equals("4"));
	                                                                                    		}
	                                                                                    		else if(move15.equals("4")) {
	                                                                                    			System.out.println("That was not the right option.");
	                                                                                    			timer7.stop();
	                                                                                    			return;
	                                                                                    		}
	                                                                                    		else
	                                                                                    			System.out.println("Pick an option");
	                                                                                    		} while (!move15.equals("1")&&!move15.equals("2")&&!move15.equals("3")&&!move15.equals("4"));
	                                                                                		}
	                                                                                		else if(move14.equals("3")) {
	                                                                                			System.out
	    																								.println("That was not the right option");
	                                                                                			timer7.stop();
	                                                                                			return;
	                                                                                		}
	                                                                                		else if(move14.equals("4")) {
	                                                                                			System.out.println("That was not the right option.");
	                                                                                			timer7.stop();
	                                                                                			return;
	                                                                                		}
	                                                                                		else
	                                                                                			System.out.println("Pick an option");
	                                                                                		} while (!move14.equals("1")&&!move14.equals("2")&&!move14.equals("3")&&!move14.equals("4"));
	                                                                            		}
	                                                                            		else if(move13.equals("4")) {
	                                                                            			System.out.println("That was not the right option.");
	                                                                            			timer7.stop();
	                                                                            			return;
	                                                                            		}
	                                                                            		else
	                                                                            			System.out.println("Pick an option");
	                                                                            		} while (!move13.equals("1")&&!move13.equals("2")&&!move13.equals("3")&&!move13.equals("4"));
	                                                                        		}
	                                                                        		else if(move12.equals("3")) {
	                                                                        			System.out.println("That was not the option.");
	                                                                        			timer7.stop();
	                                                                        			return;
	                                                                        		}
	                                                                        		else if(move12.equals("4")) {
	                                                                        			System.out.println("That was not the right option.");
	                                                                        			timer7.stop();
	                                                                        			return;
	                                                                        		}
	                                                                        		else
	                                                                        			System.out.println("Pick an option");
	                                                                        		} while (!move12.equals("1")&&!move12.equals("2")&&!move12.equals("3")&&!move12.equals("4"));
	                                                                    		}
	                                                                    		else if(move11.equals("4")) {
	                                                                    			System.out.println("That was not the right option.");
	                                                                    			timer7.stop();
	                                                                    			return;
	                                                                    		}
	                                                                    		else
	                                                                    			System.out.println("Pick an option");
	                                                                    		} while (!move11.equals("1")&&!move11.equals("2")&&!move11.equals("3")&&!move11.equals("4"));
	                                                                		}
	                                                                		else if(move10.equals("3")) {
	                                                                			System.out.println("That was not the right answer.");
	                                                                			timer7.stop();
	                                                                			return;
	                                                                		}
	                                                                		else if(move10.equals("4")) {
	                                                                			System.out.println("That was not the right option.");
	                                                                			timer7.stop();
	                                                                			return;
	                                                            		
	                                                                		}
	                                                                		else
	                                                                			System.out.println("Pick an option");
	                                                                		} while (!move10.equals("1")&&!move10.equals("2")&&!move10.equals("3")&&!move10.equals("4"));
	                                                            		}
	                                                            		else if(move9.equals("4")) {
	                                                            			System.out.println("That was not the right option.");
	                                                            			timer7.stop();
	                                                            			return;
	                                                            		}
	                                                            		else
	                                                            			System.out.println("Pick an option");
	                                                            		} while (!move9.equals("1")&&!move9.equals("2")&&!move9.equals("3")&&!move9.equals("4"));
	                                                        		}
	                                                        		else if(move8.equals("2")) {
	                                                        			System.out.println("That was not the right option.");
	                                                        			timer7.stop();
	                                                        			return;
	                                                        		}
	                                                        		else if(move8.equals("3")) {
	                                                        			System.out.println("That was not the right option.");
	                                                        			timer7.stop();
	                                                        			return;
	                                                        		}
	                                                        		else if(move8.equals("4")) {
	                                                        			System.out.println("That was not the right option.");
	                                                        			timer7.stop();
	                                                        			return;
	                                                        		}
	                                                        		else
	                                                        			System.out.println("Pick an option");
	                                                        		} while (!move8.equals("1")&&!move8.equals("2")&&!move8.equals("3")&&!move8.equals("4"));
	                                                    		}
	                                                    		else if(move7.equals("4")) {
	                                                    			System.out.println("That was not the right option.");
	                                                    			timer7.stop();
	                                                    			return;
	                                                    		}
	                                                    		else
	                                                    			System.out.println("Pick an option");
	                                                    		} while (!move7.equals("1")&&!move7.equals("2")&&!move7.equals("3")&&!move7.equals("4"));
	                                                		}
	                                                		else if(move6.equals("2")) {
	                                                			System.out.println("That was not the correct option.");
	                                                			timer7.stop();
	                                                			return;
	                                                		}
	                                                		else if(move6.equals("3")) {
	                                                			System.out.println("That was not the correct option.");
	                                                			timer7.stop();
	                                                			return;
	                                                		}
	                                                		else if(move6.equals("4")) {
	                                                			System.out.println("That was not the correct option.");
	                                                			timer7.stop();
	                                                			return;
	                                                		}
	                                                		else
	                                                			System.out.println("Pick an option");
	                                                		} while (!move6.equals("1")&&!move6.equals("2")&&!move6.equals("3")&&!move6.equals("4"));
	                                            		}
	                                            		else if(move5.equals("4")) {
	                                            			System.out.println("That was not the correct option.");
	                                            			timer7.stop();
	                                            			return;
	                                            		}
	                                            		else
	                                            			System.out.println("Pick an option");
	                                            		} while (!move5.equals("1")&&!move5.equals("2")&&!move5.equals("3")&&!move5.equals("4"));
	                                    		}
	                                    		else if(move4.equals("3")) {
	                                    			System.out.println("That was not the correct option.");
	                                    			timer7.stop();
	                                    			return;
	                                    		}
	                                    		else if(move4.equals("4")) {
	                                    			System.out.println("That was not the correct option.");
	                                    			timer7.stop();
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
	                    			timer7.stop();
	                    			return;
	                    		}
	                    		else if(move2.equals("4")) {
	                    			System.out.println("That was not the correct option.");
	                    			timer7.stop();
	                    			return;
	                    		}
	                    		else
	                    			System.out.println("Pick an option");
	                    		} while (!move2.equals("1")&&!move2.equals("2")&&!move2.equals("3")&&!move2.equals("4"));
	            		}
	            		else if(move.equals("4")) {
	            			System.out.println("That was not the correct option.");
	            			timer7.stop();
	            			return;
	            		}
	            		else
	            			System.out.println("Pick an option");
	            		} while (!move.equals("1")&&!move.equals("2")&&!move.equals("3")&&!move.equals("4"));
				}
			}while(!choice9.equalsIgnoreCase("H"));
		
			}
			}while(!choice8.equalsIgnoreCase("F"));
			
			
		}
		}
          } while(!stop1.equalsIgnoreCase("S"));
		
}
	public static void simpleTimer6() {
		timer6=new Timer(150, new ActionListener() {
			

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
	
}
