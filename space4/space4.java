import sun.audio.*;
import java.io.*;
import java.io.FileInputStream.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class space4 extends Applet implements ActionListener
{
    Panel p_screen; //holds all the screens
    Panel screen1, screen2, screen3, screen4, screen5, screen6; //the screens
    CardLayout cdLayout = new CardLayout ();

    int row = 6;
    int col = 7;
    int counter = 1;
    int b[] [] = new int [row] [col];
    int available[] = new int [7];
    int turn = 1;
    char sound = 0;
    JButton a[] = new JButton [row * col];
    Color gamegray = new Color (182, 173, 166);
    char piece = 'b';
    char AI = 'n';
    String player1name = "1:", player2name = "2:";

    public void init ()
    {
	playMusic ("kahoot");
	p_screen = new Panel ();
	p_screen.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	resize (700, 800);
	setLayout (new BorderLayout ());
	add ("Center", p_screen);
    }


    public void screen1 ()
    {
	screen1 = new Panel ();
	screen1.setBackground (gamegray);
	JLabel title = new JLabel (createImageIcon ("title.png"));

	JLabel planet = new JLabel (createImageIcon ("planet.gif"));

	JButton play = new JButton (createImageIcon ("play.png"));
	play.setActionCommand ("s6");
	play.addActionListener (this);
	play.setBorder (null);

	JButton instruct = new JButton (createImageIcon ("instruct.png"));
	instruct.setActionCommand ("s2");
	instruct.addActionListener (this);
	instruct.setBorder (null);

	JButton credits = new JButton (createImageIcon ("credits.png"));
	credits.setActionCommand ("s3");
	credits.addActionListener (this);
	credits.setBorder (null);

	screen1.add (title);
	screen1.add (planet);
	screen1.add (play);
	screen1.add (instruct);
	screen1.add (credits);
	p_screen.add ("1", screen1);
    }


    public void screen2 ()
    {
	screen2 = new Panel ();
	screen2.setBackground (Color.black);

	JLabel title = new JLabel (createImageIcon ("instruc.png"));

	JButton next = new JButton (createImageIcon ("play.png"));
	next.setActionCommand ("s4");
	next.addActionListener (this);
	next.setBorder (null);

	screen2.add (title);
	screen2.add (next);

	p_screen.add ("2", screen2);
    }


    public void screen3 ()
    {
	screen3 = new Panel ();
	screen3.setBackground (gamegray);

	JLabel pic = new JLabel (createImageIcon ("creds.png"));

	JButton next1 = new JButton (createImageIcon ("menu.png"));
	next1.setActionCommand ("s1");
	next1.addActionListener (this);
	next1.setBorder (null);

	screen3.add (pic);
	screen3.add (next1);

	p_screen.add ("3", screen3);
    }


    public void screen4 ()
    {
	screen4 = new Panel ();
	screen4.setBackground (gamegray);

	JLabel title = new JLabel (createImageIcon ("title.png"));
	title.setFont (new Font ("Times New Roman", Font.PLAIN, 70));

	Panel g = new Panel (new GridLayout (row, row));
	addgrid (g);

	JButton secretpage = new JButton ("                          ");
	secretpage.setBackground (gamegray);
	secretpage.setBorder (null);
	secretpage.setActionCommand ("s5");
	secretpage.addActionListener (this);

	JLabel spacing1 = new JLabel ("                          ");

	JButton next = new JButton (createImageIcon ("menu.png"));
	next.setBorder (null);
	next.setActionCommand ("s1");
	next.addActionListener (this);

	JButton reset = new JButton (createImageIcon ("resetbutton.png"));
	reset.setBorder (null);
	reset.setActionCommand ("3");
	reset.addActionListener (this);

	JButton instruct = new JButton (createImageIcon ("instruct.png"));
	instruct.setActionCommand ("s2");
	instruct.addActionListener (this);
	instruct.setBorder (null);




	screen4.add (title);
	screen4.add (secretpage);
	screen4.add (g);
	screen4.add (spacing1);
	screen4.add (reset);
	screen4.add (instruct);
	screen4.add (next);

	p_screen.add ("4", screen4);
    }


    public void screen5 ()
    {
	Color spacegray = new Color (41, 42, 52);

	screen5 = new Panel ();
	screen5.setBackground (spacegray);

	JButton secret = new JButton ("SECRET PAGE");
	secret.setFont (new Font ("Gill", Font.PLAIN, 50));
	secret.setBackground (spacegray);
	secret.setForeground (Color.white);
	JLabel troll1 = new JLabel ("There's nothing here");
	troll1.setFont (new Font ("Gill", Font.PLAIN, 50));
	troll1.setForeground (Color.white);
	JLabel troll2 = new JLabel ("And you can't go back either!");
	troll2.setFont (new Font ("Gill", Font.PLAIN, 50));
	troll2.setForeground (Color.white);
	JLabel troll3 = new JLabel ("MWAHAHAHAHAHA!");
	troll3.setFont (new Font ("Gill", Font.PLAIN, 50));
	troll3.setForeground (Color.white);
	JLabel spin = new JLabel (createImageIcon ("secret.gif"));

	secret.setActionCommand ("s1");
	secret.addActionListener (this);
	secret.setBorder (null);

	screen5.add (secret);
	screen5.add (spin);
	screen5.add (troll1);
	screen5.add (troll2);
	screen5.add (troll3);

	p_screen.add ("5", screen5);

    }


    public void screen6 ()
    {
	screen6 = new Panel ();
	screen6.setBackground (gamegray);
	JButton onep = new JButton (createImageIcon ("player.png"));
	onep.setActionCommand ("uno");
	onep.addActionListener (this);
	onep.setBorder (null);
	JButton twop = new JButton (createImageIcon ("player2.png"));
	twop.setActionCommand ("dos");
	twop.addActionListener (this);
	twop.setBorder (null);
	JButton next = new JButton (createImageIcon ("menu.png"));
	next.setBorder (null);
	next.setActionCommand ("s1");
	next.addActionListener (this);
	screen6.add (onep);
	screen6.add (twop);
	screen6.add (next);

	p_screen.add ("6", screen6);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = space4.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }


    public void actionPerformed (ActionEvent e)
    {
	highlight ();
	if (e.getActionCommand ().equals ("11"))
	    AI = 'y';
	{ //button to screens
	    if (e.getActionCommand ().equals ("s1"))
	    {
		cdLayout.show (p_screen, "1");
		reset ();
	    }
	    else if (e.getActionCommand ().equals ("s2"))
	    {
		cdLayout.show (p_screen, "2");
	    }
	    else if (e.getActionCommand ().equals ("s3"))
		cdLayout.show (p_screen, "3");
	    else if (e.getActionCommand ().equals ("s4"))
		cdLayout.show (p_screen, "4");
	    else if (e.getActionCommand ().equals ("s5"))
		cdLayout.show (p_screen, "5");
	    else if (e.getActionCommand ().equals ("s6"))
		cdLayout.show (p_screen, "6");
	    else if (e.getActionCommand ().equals ("uno"))
	    {
		cdLayout.show (p_screen, "4");
		AI = 'y';
	    }
	    else if (e.getActionCommand ().equals ("dos"))
	    {
		cdLayout.show (p_screen, "4");
		AI = 'n';
	    }
	    else //grid handling
	    {
		int n = Integer.parseInt (e.getActionCommand ());
		gridhandle (n);
	    }
	    if (counter % 4 == 0)
	    {
		int rand = (int) (Math.random () * 42) + 1;
		JLabel djk = new JLabel ("Did ya know?");
		add (djk);
		JOptionPane.showMessageDialog (null, createImageIcon (rand + ".jpg"));
	    }
	} //check for reset
	if (e.getActionCommand ().equals ("3"))

	    reset ();
	highlight ();
	win ();
	//winning condition
    }


    public void win ()  //executes check for reset if winning condition is true
    {
	if (horizontalwin () != 0)
	    JOptionPane.showMessageDialog (null, "Player #" + horizontalwin () + " wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
	else if (verticalwin () != 0)
	    JOptionPane.showMessageDialog (null, "Player #" + verticalwin () + " wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
	else if (downrightwin () != 0)
	    JOptionPane.showMessageDialog (null, "Player #" + downrightwin () + " wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
	else if (downleftwin () != 0)
	    JOptionPane.showMessageDialog (null, "Player #" + downleftwin () + " wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);

	if (horizontalwin () != 0 || verticalwin () != 0 || downrightwin () != 0 || downleftwin () != 0)
	{
	    int input2 = JOptionPane.showConfirmDialog (null, "Play again?", "Do you want to play again??", JOptionPane.YES_NO_OPTION);
	    if (input2 == JOptionPane.NO_OPTION)

		cdLayout.show (p_screen, "1");
	    reset ();

	}
    }


    public int horizontalwin ()  //Horizontal winning condition
    {
	int winner = 0;
	for (int x = 0 ; x < row ; x++)
	{
	    for (int y = 0 ; y < 4 ; y++)
	    {
		if (b [x] [y] == b [x] [y + 1] && b [x] [y] == b [x] [y + 2] && b [x] [y] == b [x] [y + 3] && b [x] [y] != 0)
		    winner = b [x] [y];
	    }
	}


	return winner;
    }


    public int verticalwin ()  //Vertical winning condition
    {
	int winner = 0;
	for (int y = 0 ; y < col ; y++)
	{
	    for (int x = 0 ; x < 3 ; x++)
	    {
		if (b [x] [y] == b [x + 1] [y] && b [x] [y] == b [x + 2] [y] && b [x] [y] == b [x + 3] [y] && b [x] [y] != 0)
		    winner = b [x] [y];
	    }
	}


	return winner;
    }


    public int downrightwin ()  //diagonal winning condition
    {
	int winner = 0;
	for (int y = 0 ; y < 4 ; y++)
	{
	    for (int x = 0 ; x < 3 ; x++)
	    {
		if (b [x] [y] == b [x + 1] [y + 1] && b [x] [y] == b [x + 2] [y + 2] && b [x] [y] == b [x + 3] [y + 3] && b [x] [y] != 0)
		    winner = b [x] [y];
	    }
	}


	return winner;
    }


    public int downleftwin ()  //second diagonal winning conditon
    {
	int winner = 0;
	for (int y = 3 ; y < col ; y++)
	{
	    for (int x = 0 ; x < 3 ; x++)
	    {

		if (b [x] [y] == b [x + 1] [y - 1] && b [x] [y] == b [x + 2] [y - 2] && b [x] [y] == b [x + 3] [y - 3] && b [x] [y] != 0)
		    winner = b [x] [y];

	    }
	}


	return winner;
    }


    public void gridhandle (int n)  //grid handling method
    {
	int x = n / col;
	int y = n % col;
	showStatus ("(" + x + ", " + y + ")");

	// if (AI == 'y' && turn == 2)
	// {
	//
	// }


	if (x == 5 || b [x + 1] [y] != 0)
	{
	    if (b [x] [y] == 0)
	    {
		if (turn == 1)
		{
		    a [n].setIcon (createImageIcon ("1" + piece + ".png"));
		    b [x] [y] = 1;
		    turn = 2;
		    counter++;
		    if (AI == 'y')
		    {
			n = available [computermove ()];
			x = n / col;
			y = n % col;
			a [n].setIcon (createImageIcon ("2" + piece + ".png"));
			b [x] [y] = 2;
			turn = 1;

		    }
		}

		else if (turn == 2)
		{
		    a [n].setIcon (createImageIcon ("2" + piece + ".png"));
		    b [x] [y] = 2;
		    turn = 1;
		    counter++;
		}
	    }
	}
    }



    public void highlight ()
    {
	int u = 0;

	for (int g = 0 ; g < a.length ; g++)
	{
	    int x = g / col;
	    int y = g % col;
	    if (x == 5 || b [x + 1] [y] != 0)
	    {
		if (b [x] [y] == 0)
		{
		    a [g].setIcon (createImageIcon ("empty.png"));
		    available [u] = g;
		    u++;
		}
		else if (b [x] [y] != 1 && b [x] [y] != 2)
		{
		    a [g].setEnabled (false);
		    a [g].setDisabledIcon (createImageIcon ("0b.png"));
		}
	    }
	}
    }


    public int computermove ()
    {
	int q = 0;
	if (turn == 2)
	    q = (int) (Math.random () * 6);
	return q;
    }


    public void reset ()
    {
	for (int x = 0 ; x < col ; x++)
	{
	    for (int y = 0 ; y < row ; y++)
	    {
		b [y] [x] = 0;
	    }
	}


	for (int z = 0 ; z < a.length ; z++)
	{
	    a [z].setIcon (createImageIcon ("0b.png"));
	}
    }


    public void addgrid (Panel g)
    {
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton (createImageIcon ("0b.png"));
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setPreferredSize (new Dimension (50, 50));
	    a [i].setBackground (Color.white);
	    a [i].setForeground (Color.white);
	    a [i].setBorder (null);
	    a [i].setBorderPainted (true);
	    g.add (a [i]);

	}
    }


    public static void playMusic (String filepath)  // Method to allow music of 1MB size or smaller
    {
	AudioPlayer MGP = AudioPlayer.player;
	AudioStream BGM;
	AudioData MD;
	ContinuousAudioDataStream loop = null;
	try
	{
	    BGM = new AudioStream (new FileInputStream (filepath + ".wav")); //set song
	    MD = BGM.getData (); //get data fom song
	    loop = new ContinuousAudioDataStream (MD); //set as loop
	}


	catch (IOException error)    //error
	{
	    System.out.println ("Audio - File not found.");
	}


	MGP.start (loop); //start running loop
    }
}


