public class pokemon
{
    public static void main (String args[])
    {
	new pokemon ();
    }


    int points = 0;



    public void speed (int x, int y, String running)
    {
	for (int i = 0 ; i < running.length () ; i++)
	{
	    try
	    {
		Thread.sleep (x);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }
	    System.out.print (running.charAt (i));
	}
	try
	{
	    Thread.sleep (y);
	}
	catch (InterruptedException m)
	{
	    ;
	}
    }



    public pokemon ()
    {
	while (1 > 0)
	{
	    welcome ();
	    speed (10, 0, "\n                                   ,'\\                       ");
	    speed (10, 0, "\n     _.----.        ____         ,'  _\\   ___    ___     ____");
	    speed (10, 0, "\n _,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
	    speed (10, 0, "\n \\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
	    speed (1, 0, "\n  \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
	    speed (1, 0, "\n    \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
	    speed (1, 0, "\n     \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
	    speed (1, 0, "\n      \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
	    speed (1, 0, "\n       \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
	    speed (1, 0, "\n        \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
	    speed (1, 0, "\n         \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
	    speed (1, 0, "\n                                 `'                            '-._|");
	    speed (45, 500, "\n\nMom: Good morning sleepyhead! ");
	    speed (45, 500, "\nYou: ...");
	    speed (45, 500, "\nMom: Guess you haven't completely woken up yet! \nMom: Go visit professor Oak when you have.");
	    speed (45, 500, "\n");
	    char ready = IBIO.inputChar ("Are you ready to go? (y/n): ");

	    if (ready == 'n')
	    {
		speed (45, 500, "\nToo bad! Lets go!");
	    }
	    else if (ready == 'y')
		speed (45, 500, "\nOk Let's go!");

	    else
		speed (45, 500, "\nI dont even know what that means, But I'll take it as a YES!");
	    speed (45, 500, "\n");
	    speed (45, 500, "\nYou arrive at a lab and knock on the door*");
	    speed (60, 500, "\nknock* Knock* KNOCK*");
	    speed (45, 500, "\nSomeone opens the door*");
	    speed (45, 500, "\n");
	    speed (45, 500, "\nOak: Oh hello there!");
	    speed (45, 500, "\nOak: I'm professor Oak, welcome to my laboratory!");
	    speed (45, 500, "\nProfessor Oak stares at you for a good 10 seconds*");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    char gender = IBIO.inputChar ("\nOak: Hmm....I dont seem to have my glasses, are you a boy or a girl? (B/G): ");
	    speed (1, 1, "\n    .....         ,,,          ");
	    speed (1, 1, "\n    {-.-}        {-.-}        ");
	    speed (1, 1, "\n      |         /  |  \\      ");
	    speed (1, 1, "\n     /|\\          /|\\        ");
	    speed (1, 1, "\n    * | *        * | *       ");
	    speed (1, 1, "\n     /-\\          /-\\         ");
	    speed (1, 1, "\n   _/   \\_      _/   \\_       ");
	    speed (1, 1, "\n");

	    String name = IBIO.inputString ("Oak: And what did you say your name was again? \nPlease enter your name: ");
	    speed (45, 500, "\n");
	    if ((gender == 'b') || (gender == 'B'))
	    {
		speed (45, 500, "\nOak: So you're a boy and your name is " + name + "? Nice to meet you, I'm professor Oak");
	    }
	    else
		speed (45, 500, "\nOak: So you're a girl and your name is '" + name + "'? Nice to meet you '" + name + "', I'm professor Oak.");
	    speed (45, 500, "\nConfused Oak: Oh wait I already said that, hahahahaha....ha...haha");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n");

	    speed (45, 500, "\nOak: Well anyway " + name + ", sorry to call on you so suddenly. But I have a favor to ask. \nOak: Will you go out into the world all by yourself...\nOak: Catch 151 pokemon, some of which could seriously injure you...\nOak: And document it all so I can use it for my research?");
	    int age = IBIO.inputInt ("\nWait, how old are you again? ");
	    if ((age <= 18) && (age >= 1))
		speed (45, 500, "\nOak: Darn! You aren't old enough yet!");
	    else if (age >= 19)
		speed (45, 500, "\nOak: Darn! You're too old!");
	    else
		speed (45, 500, "\nOak: That's not even possible! You look too young anyway.");

	    speed (45, 500, "\nOak: It's a shame you won't be able to help me...");
	    speed (45, 500, "\nOak: ...What's that? Where can you check your mail? \nOak: Well if you want to check your mail, head over to 'Viridian City'");
	    char rdy = IBIO.inputChar ("\nReady to go? (y/n): ");
	    if (rdy == 'y')
		speed (45, 500, "Alright! Let's go!");
	    else if (rdy == 'n')
		speed (45, 500, "Too bad, Lets go!");
	    else
		speed (45, 500, "I don't know what you mean but lets go anyway!");

	    speed (45, 500, "\nYou say goodbye to your mother and promise to stay on the road, your next destination is...VIRIDIAN CITY");
	    speed (45, 500, "\n*\n*\n*\n*\n*");
	    speed (45, 500, "\nYou:......");
	    speed (45, 500, "\n\nYou've arrived at the viridian city mail post, the lady at the cashier hands you your mail*");
	    speed (45, 500, "\nYou open the letter*");
	    speed (45, 500, "\n\nHey " + name + " it's me Jon, I know it's been a while since you moved, ");
	    speed (45, 500, "but I'm writing to ask how you're doing. It's been pretty boring since you've been gone.");
	    speed (45, 500, "\nI know this is a bit out of the blue, but you should come and visit sometime.");
	    speed (45, 500, "\nWe can catch up on each others life, anyway, hopefully I'll see you soon!");
	    speed (45, 500, "\n\nAfter reading the letter you realize it has been quite a while since you've seen Jon");
	    speed (45, 500, "\nYou decide to visit him, your destination is......SAFFRON CITY!.");
	    System.out.println ("\n~~~~~~~~~~~");
	    speed (45, 500, "\nA long journey lies ahead...");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");

	    speed (45, 500, "\nYou arrive at the entrance of viridian forest.");
	    char go = IBIO.inputChar ("\nReady to go? (y/n): ");
	    if (go == 'y')
		speed (45, 500, "Alright! Let's go!");
	    else if (go == 'n')
		speed (45, 500, "Too bad, Lets go!");
	    else
		speed (45, 500, "I don't know what you mean but lets go anyway!\n");

	    speed (45, 500, "\nYou've entered the forest...");
	    speed (45, 500, "\nA bush rustles*");
	    speed (45, 500, "\n*");
	    speed (45, 500, "\n*");
	    speed (45, 500, "\n*");
	    beetle ();
	    speed (45, 500, "\nYou continue on your journey through the forest a few hours later...........it seems you've reached Cerulean City!");
	    speed (45, 500, "\nYou head over to the local pokemart to see if they have anything to offer.");
	    welcome ();
	    speed (45, 500, "\nYou realize you shouldn't waste too much time and you continue on your merry way.");
	    speed (45, 500, "\nAs you near a beach you see something up ahead...\n");
	    RPS ();
	    speed (45, 500, "\nWell that was certainly exciting but you still haven't made much progress, you pick up the pace and walk down the beach looking at people playing in the ocean.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\n.");
	    speed (45, 500, "\nYou see a city sign up ahead...it says...SAFFRON CITY!");
	    speed (45, 500, "\nYou realize you're almost there when all of a sudden you almost trip over a wild pokemon!");
	    sickPoke ();
	    speed (45, 500, "\nAfter your long walk and having to deal with the pokemon you start feeling a bit thirsty.");
	    speed (45, 500, "\nYou decide to head to the local pokemart to see if they're selling any drinks before visiting john.");
	    welcome ();
	    speed (45, 500, "\nDarn it seems like there wasn't anything to drink after all, you head to John's place hoping he can offer you something to sip on.");
	    speed (45, 500, "\nAs you approach your friend's house you smell something burning and hear high pitched screaming that sounds a lot like.....JOHN?!?!?");
	    speed (45, 50, "\nYou rush over to the backyard where you hear the noise and then you see it....A WILD CHARIZARD!!!!");
	    System.out.println ("                 .\"-,.__");
	    System.out.println ("          `.     `.  ,");
	    System.out.println ("       .--'  .._,'\"-' `.");
	    System.out.println ("      .    .'         `'");
	    System.out.println ("      `.   /          ,'");
	    System.out.println ("        `  '--.   ,-\"'");
	    System.out.println ("         `\"`   |  \\");
	    System.out.println ("            -. \\, |");
	    System.out.println ("             `--Y.'      ___.");
	    System.out.println ("                  \\     L._, \\");
	    System.out.println ("        _.,        `.   <  <\\                _");
	    System.out.println ("      ,' '           `, `.   | \\            ( `");
	    System.out.println ("   ../, `.            `  |    .\\`.           \\ \\_");
	    System.out.println ("  ,' ,..  .           _.,'    ||\\l            )  '\".");
	    System.out.println (" , ,'   \\           ,'.-.`-._,'  |           .  _._`.");
	    System.out.println (" ,' /      \\ \\        `' ' `--/   | \\          / /   ..\\");
	    System.out.println (" .'  /        \\ .         |\\__ - _ ,'` `        / /     `.`.");
	    System.out.println (" |  '          ..         `-...-\"  |  `-'      / /        . `.");
	    System.out.println (" | /           |L__           |    |          / /          `. `.");
	    System.out.println ("  , /            .   .          |    |         / /             ` `");
	    System.out.println ("   / /          ,. ,`._ `-_       |    |  _   ,-' /               ` \\");
	    System.out.println ("  / .           \\\"`_/. `-_ \\_,.  ,'    +-' `-'  _,        ..,-.    \\`.");
	    System.out.println (" .  '         .-f    ,'   `    '.       \\__.---'     _   .'   '     \\ \\");
	    System.out.println (" ' /          `.'    l     .' /          \\..      ,_|/   `.  ,'`     L`");
	    System.out.println (" |'      _.-\"\"` `.    \\ _,'  `            \\ `.___`.'\"`-.  , |   |    | \\");
	    System.out.println (" ||    ,'      `. `.   '       _,...._        `  |    `/ '  |   '     .|");
	    System.out.println (" ||  ,'          `. ;.,.---' ,'       `.   `.. `-'  .-' /_ .'    ;_   ||");
	    System.out.println (" || '              V      / /           `   | `   ,'   ,' '.    !  `. ||");
	    System.out.println (" ||/            _,-------7 '              . |  `-'    l         /    `||");
	    System.out.println (" . |          ,' .-   ,' ||               | .-.        `.      .'     ||");
	    System.out.println ("  `'        ,'    `\".'    |               |    `.        '. -.'       `'");
	    System.out.println ("           /      ,'      |               |,'    \\-.._,.'/'");
	    System.out.println ("           .     /        .               .       \\    .''");
	    System.out.println ("        .`.    |         `.             /         :_,'.'");
	    System.out.println ("           \\ `...\\   _     ,'-.        .'         /_.-'");
	    System.out.println ("            `-.__ `,  `'   .  _.>----''.  _  __  /");
	    System.out.println ("                 .'        /\"'          |  \"'   '_");
	    System.out.println ("                /_|.-'\\ ,\".             '.'`__'-( \\");
	    System.out.println ("                  / ,\"'\"\\,'               `/  `-.|\" mh");

	    speed (45, 500, "\nJohn:" + name + " HELP MEEEEEEEEE!!");
	    speed (45, 500, "\nYou:.....");
	    speed (45, 500, "\nJohn: HEEEEEELLLLLPPPPPP!!!!");
	    char final1 = 'a';
	    final1 = IBIO.inputChar ("You suddenly remember something you learned in class, Charizard's love gemstones! Did you purchase any gemstones at the pokemart? (y/n) : ");

	    if (final1 == 'n' || final1 == 'N')
	    {
		speed (45, 500, "\nYou start to lose hope as you realize you wanted to keep all your poke and so you hadn't buy a single gemstone...");
		char final2 = IBIO.inputChar ("\nBut then you think of another idea, Charizard's hate Useless junk!, did you buy any? (y/n) : ");
		if (final2 == 'n' || final2 == 'N' || final2 == 'y' || final2 == 'Y')
		{
		    speed (45, 500, "\nIt doesn't matter either way, Charizard's don't actually hate useless junk,after all it's useless.");
		    speed (45, 500, "\nJohn starts to sob uncontrollably and his tears flow like a mighty waterfall, at the site of this the Charizard's eyes widen.");
		    speed (45, 500, "\nThat's when you remember that Charizard's are scared most of all by water, within a few moment the Charizard flies off with it's tail between it's legs.");
		    speed (45, 500, "\nJohn:..........?");
		    System.out.println ("");
		    speed (45, 500, "\nYou look John in the eye and before you say a word you realize you're too thirsty to speak...");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n.");
		    speed (45, 500, "\n And so your first journey ends here, as John hands you a cup of water and the sun sets behind the mountains...");
		}
	    }



	    else if ((final1 == 'y' || final1 == 'Y'))
	    {
		speed (45, 500, "\nYou try to give the gemstone to the Charizard but it just ignores your efforts and continues chasing John.");
		char final3 = IBIO.inputChar ("\nBut then you think of another idea, Charizard's hate Useless junk!, did you buy any? (y/n) : ");
		if ((final3 == 'n') || (final3 == 'N') || (final3 == 'y') || (final3 == 'Y'))

		    {
			speed (45, 500, "\nIt doesn't matter either way, Charizards don't actually hate useless junk,after all it's useless.");
			speed (45, 500, "\nJohn starts to sob uncontrollably and his tears flow like a mighty waterfall, at the site of this the Charizards eyes widen.");
			speed (45, 500, "\nThat's when you remember that Charizards are scared most of all by water, within a few moment the Charizard flies off with it's tail between it's legs.");
			speed (45, 500, "\nJohn:..........?");
			System.out.println ("");
			speed (45, 500, "\nYou look John in the eye and before you say a word you realize you're too thirsty to speak...");
			speed (45, 500, "\n.\n.\n.\n.\n.\n.\n.\n.\n.");
			speed (45, 500, "\n And so your first journey ends here, as John hands you a cup of water and the sun sets behind the mountains...");
			speed (45, 500, "\n.");
			speed (45, 500, "\n.");
			speed (45, 500, "\n.");
		    }

	    }
	}
    }


    public void beetle ()
    {
	int score1 = 0;
	int score2 = 0;
	int turn = 1;
	Instructions ();
	while ((score1 != 6) && (score2 != 6))
	{
	    if (turn == 1)
	    {
		speed (45, 500, "\nIt is your turn ");
		int enter = IBIO.inputInt ("\nPress 'Enter to continue'");

		score1 = Turn (score1);
		turn = 2;
	    }
	    else if (turn == 2)
	    {
		System.out.println ("");
		speed (45, 500, "\nIt is the Tangela's turn");
		score2 = Turn (score2);
		turn = 1;
		speed (45, 500, "\n");
	    }
	}
	if (score1 == 6)
	{
	    speed (45, 500, "\nYou won! You've also earned 300 poke!");
	    points += 300;
	}

	else
	    speed (45, 500, "\nThe wild Tangela won, too bad!");

    }



    public void Instructions ()
    {
	//Post: Everyone knows the instructions
	System.out.println ("\nA WILD TANGELA APPEARS!!!");
	System.out.println ("                       _____         ____");
	System.out.println ("                   ,\"'     `.   ,-\"'    `\".     ,.");
	System.out.println ("                  .  ,---.   |,'   _...    .    | `.");
	System.out.println ("             _.---'`'\"-._ |  /   .'.---`.  '    '  |");
	System.out.println ("           ,'            `| /...-._____ |  |`\".'   |");
	System.out.println ("          /    _,---+-.   ,'       `-. ||  '   `..-.._");
	System.out.println ("         .   ,`._    `.`,'.   _...    \\` .  `.   `.   `-.");
	System.out.println ("         |_,.-...`---\"'|  ,`.|  .\"`    \\`.`.  `.   \\     \\");
	System.out.println (" ,      ,'             |  |  |  |  \\    \\ `.`._ `.  \\`.   .");
	System.out.println ("| \\    '     __......-\"|  |  |  |`._\\    '. `\"-`. .  . \\,\"'-._");
	System.out.println ("|  `\"'|   .\"'   ___    |  |  '  `-...\\...|_`.._ | |..:-'      `.");
	System.out.println (" `-..-|  .    .\"  _`+.,'  |   `._          `-.,'  |     ,+\"|`. |");
	System.out.println (" ,'  ,|  |  ,' ,\"'     __,'      `'\"\"\"\"'`-.   .  ,'...-' | | | |");
	System.out.println (".   / `  |  | .   ,-'\"'             ____   `. |-'-.| |   ',' `'");
	System.out.println ("|  |   \\ |  | | .'   ,-'\"\"'-.    ,'\"    `.  | |.   | |__     ,.");
	System.out.println ("'  `.   `|  ' | |  .'        \\  .         | | `.`. '  . `\"-.' |");
	System.out.println (" \\ |\\`-..|   .`.|  |    ()    | |   ()    ' `._ ,.' \\  `---' ,");
	System.out.println ("  `| `--\"    | |   '          ' '        .    .' |   |.____,' \\");
	System.out.println ("   `.       ,' '    `.     _,'   `. ___.'_..,'   |   |  | `.   .");
	System.out.println ("     `-...-' .' _...  `---\" _....._  _.'\"    `..'|   |  |  |   |");
	System.out.println ("    ,'    _.\" ,'    |    .-' ___   `'   _..    `/|   |`.|  |   '");
	System.out.println ("  '    ,'/  /   _,.'  ,' .-'   `\".  \\,'   `.   | .  `  .  '  /");
	System.out.println ("  .   ,` ' .'   '    |/  /   ____/ \\  . ,-\"'|   '-.`.__,',' ,'");
	System.out.println ("  |   | |  ||  |`-..\"/  /`.'\"   /   . |'  _,'  /.  `. .\"' .'`..__,.");
	System.out.println ("  `   `.|_..'  `._  /  /   `._ /   /| | ,'/   /  \\   \\  ,\"._    _,'");
	System.out.println ("  ,`.        \\    `-._/ `.    `-.,' | |. /  ,'   /.   \\'  __`--\"");
	System.out.println ("  |  |-..,.\"| `-._    `.  `,      \",  '-j  .   ,',`.   `\"'  '");
	System.out.println ("  |  |   `. `-../ `-.   `.' `\"+-..' .'  |  |_,'.\" | | `._, '");
	System.out.println ("  '   `-._ `._.'   / `.  | _,'  |\"'|`-..|  |   | | |  `\"\"");
	System.out.println ("   `._    `\"'   _.|__.-| |\" `---|  '.   |  '.,'  `.'");
	System.out.println ("      `-.....-\"'  |___,  '       `. \\`+-`.   `.");
	System.out.println ("             .'   '  /  /          \"'/    `\"--'-._");
	System.out.println ("           _,:  ,'   `-\".           .             `._");
	System.out.println ("        ,-'   `\"         |          |                `.");
	System.out.println ("      ,'                 |          '                  `.");
	System.out.println ("     /                 _,'           `._                |");
	System.out.println ("    |               _,\"                 `-..__        _,'");
	System.out.println ("    `.        __..-'                          `\"\"\"`\"''");
	System.out.println ("      `-----\"' mh");
	speed (45, 500, "\nIt challenges you to a drawing game, it seems you'll have to accept!");
	speed (45, 500, "\n");
	speed (45, 500, "\nThe goal of the drawing game is to be the first to draw the art in the correct order. \nIn our game, we will draw a Stick Figure! \nTo be able to draw a body part, you need to roll the correct number at the correct time. ");
	speed (45, 500, "\n");
	speed (45, 500, "\nBody = 1");
	speed (45, 500, "\nHead = 2");
	speed (45, 500, "\nLeft Leg = 3");
	speed (45, 500, "\nRight Leg = 4");
	speed (45, 500, "\nLeft Arm = 5");
	speed (45, 500, "\nRight Arm= 6");

	speed (45, 500, "\nYou must roll the number's 1 through 6 in order \nIf you don't roll what you're looking for, the turn passes on to your opponent");
	speed (45, 500, "\n");
    }


    int RollDice ()
    {
	//Post: The dice is rolled and the number 1-6 is returned
	int roll = (int) (Math.random () * 6) + 1;
	return roll;
    }


    public int Turn (int score)
    {
	//Post: the player's new score after their turn is returned
	int roll = RollDice ();
	if (roll == score + 1)
	{
	    speed (45, 500, "\n\nGood job! The number rolled was a: " + roll + "!");
	    DrawBeetle (score + 1);
	    return (score + 1);
	}

	else
	{
	    speed (45, 500, "\n\nThe number rolled was a " + roll + " ,too bad");
	    return score;
	}


    }


    public void DrawBeetle (int score)
    {
	//Post: the new beetle/human is drawn on the screen
	speed (45, 500, "\nThe score is now " + score);
	if (score == 0)
	    System.out.print ("");

	else if (score == 1)
	{
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	}

	else if (score == 2)
	{
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	}

	else if (score == 3)
	{
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n    **");
	    speed (1, 500, "\n   *");
	    speed (1, 500, "\n   *");
	    speed (1, 500, "\n   *");
	    speed (1, 500, "\n  *");

	}

	else if (score == 4)
	{
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n    ***");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n  *     *");
	}

	else if (score == 5)
	{
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n  ****");
	    speed (1, 500, "\n  *  *");
	    speed (1, 500, "\n  *  *");
	    speed (1, 500, "\n *   *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n    ***");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n  *     *");

	}

	else
	{
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n    *** ");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n  *******");
	    speed (1, 500, "\n  *  *  *");
	    speed (1, 500, "\n  *  *  *");
	    speed (1, 500, "\n *   *   *");
	    speed (1, 500, "\n     *");
	    speed (1, 500, "\n    ***");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n   *   *");
	    speed (1, 500, "\n  *     *");
	}
    }


    public void sickPoke ()
    {
	speed (45, 500, "\nOh no! A sick pokemon is lying in the middle of the road, you have to help it!");
	String which1 = randPoke ();
	speed (45, 500, "\nThe pokemon is a wild " + which1);
	speed (45, 500, "\nGuess how many berries you'll need to feed it! \n(hint: look at it's size.)");
	speed (45, 500, "\nGuess a number from 1 - 15, you have 3 tries to guess \nif you dont guess within 2 berries it doesn't count!");
	speed (45, 500, "\n");
	winner (which1);

    }


    public String randPoke ()
    {
	String ret = "";
	int num = (int) (Math.random () * 4) + 1;
	if (num == 1)
	    ret = "Bulbasaur";
	else if (num == 2)
	    ret = "Jigglypuff";
	else if (num == 3)
	    ret = "Magnemite";
	else if (num == 4)
	    ret = "Gengar";
	else
	    ret = "Onix";

	return ret;

    }


    public int getbid ()
    {

	int bid = IBIO.inputInt ("How many berries will you feed it? : ");
	if (bid > 15 || bid < 1)
	{
	    bid = IBIO.inputInt ("Please enter a value from 1-15");
	}
	return bid;
    }


    public void winner (String which2)
    {
	int i = 0;
	int bid = 3;
	int amount = 0;
	while (Math.abs (bid - amount) > 2)
	{
	    bid = getbid ();
	    System.out.println (which2);
	    if (which2.equals ("Bulbasaur"))
		amount = 6;
	    else if (which2.equals ("Jigglypuff"))
		amount = 3;
	    else if (which2.equals ("Magnemite"))
		amount = 1;
	    else if (which2.equals ("Gengar"))
		amount = 8;
	    else
		amount = 13;

	    if (Math.abs (bid - amount) <= 2)
	    {
		speed (45, 500, "\nCongratulations, you gave the wild " + which2 + " the right amount of berries! \nThey look much happier now!");
		points += 300;
	    }
	    i++;
	    if (i == 3)
	    {
		System.out.println ("Too bad, you didn't guess within 3 tries. Better luck next time!");
		return;
	    }
	}
    }


    public void RPS ()
    {
	int i = 0;
	int x = 0;
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	speed (45, 500, "\n-----FIRE~WATER~GRASS------\n");
	speed (45, 500, "A WILD ODDISH APPEARS!");

	System.out.println ("       .-\"--.__                    ");
	System.out.println ("       _               / '+.--'                      ");
	System.out.println ("       \\.-._          j / |");
	System.out.println ("         \\`-.`._      . j  |");
	System.out.println ("          \\  `. `.    | |  L                        _,,--+='");
	System.out.println ("           L   `. `-. | |   \\                  _.-+'    /");
	System.out.println ("           |     \\   j  |    \\            _,-'\" .'    ,'");
	System.out.println ("           .      \\  |  |     \\         ,'   _,'    ,'");
	System.out.println ("            \\      `j   |      \\      .'   ,'      /");
	System.out.println ("             `.     |   |       \\   ,'   ,'       /");
	System.out.println ("               \\    |   |        \\ /    /        /");
	System.out.println ("_,-''\"\"\"'\"\"'\"\"`--. j    |         V    /      _,+............._");
	System.out.println ("-=`...-----...__     `|    |         .   /   _.-'        _,.--\"\",..=.");
	System.out.println ("   `-.       `._   |    |          L,'  ,'       _,.-'    ,-'");
	System.out.println ("      `.        `. |    |          |  .'     _.-'       ,'");
	System.out.println ("         .        \\|    '          L/    _,-'          /");
	System.out.println ("          `._      `.    L        /   _,'            ,'");
	System.out.println ("             `-._    \\   `       ,' ,'             ,'");
	System.out.println ("                 `-.. `   \\     /,-'           _.-'");
	System.out.println ("                   ,'\"-..  .   /_,..---\"`+'\"\"\"\"");
	System.out.println ("                  /           '           `.");
	System.out.println ("                 j                          .");
	System.out.println ("                .                           |");
	System.out.println ("                |   .-.       ,.            |");
	System.out.println ("                |    -'       `.'           |");
	System.out.println ("                `                           '");
	System.out.println ("                 `.      .--.             ,'");
	System.out.println ("                   `.    `._|          ,-'");
	System.out.println ("                 _.-`   ,..______.. .  `-.");
	System.out.println ("               ,'       |          |      `.");
	System.out.println ("             ,'         '          |        `.");
	System.out.println ("            /         ,'            .         .");
	System.out.println ("            \\     _,-'               `._      |");
	System.out.println ("             `---'                      `-....' mh");
	rules ();
	while (x != 3 && i != 3)
	{
	    while (i <= 3 && x <= 3)
	    {
		char user = userChoice ();
		speed (45, 500, "\nYou have selected " + user);
		char comp = compChoice ();
		speed (45, 500, "\nThe Oddish has selected " + comp);
		char win = winner (comp, user);

		if (win == 'c')
		{
		    i++;
		    cPoint++;
		    speed (45, 500, "\nThe Oddish wins!\n");
		    System.out.println ("The Oddish now has " + i + " points. You have " + x + " points");

		}

		else if (win == 'u')
		{
		    x++;
		    uPoint++;
		    speed (45, 500, "\nYou win!\n");
		    System.out.println ("You now have " + x + " points. The Oddish has " + i + " points");

		}

		else
		    speed (45, 500, "\nIt's a tie, try again!\n");

		if (i == 3)
		{
		    System.out.println ("The wild Oddish won best out of 5, too bad!");
		    return;
		}

		else if (x == 3)
		{
		    System.out.println ("You won best of 5, good job!");
		    System.out.println ("Congrats! You've earned 300 poke!");
		    points += 300;
		    return;
		}
	    }
	}
    }


    public void rules ()
    {
	System.out.println ("The rules of this game are simple: \nLike Rock, Paper, Scissors, the game Fire, Water, Grass is very similar \nGrass beats Water, Water beats Fire and Fire beats Grass");
    }


    public boolean isValid (String c)
    {
	/* All valid data:
	       Rock, ROCK, rock, r, R
	       Paper, PAPER, paper, p, P
	       Scissors, SCISSORS, scissors, s, S
	   return true if valid, false otherwise
	*/
	if (c.equals ("f") || c.equals ("F") || c.equals ("Fire") || c.equals ("FIRE") || c.equals ("fire") || c.equals ("Water") || c.equals ("water") || c.equals ("WATER") || c.equals ("W") || c.equals ("w") || c.equals ("GRASS") || c.equals ("grass") || c.equals ("Grass") || c.equals ("G") || c.equals ("g"))
	    return true;
	else
	    return false;
    }


    public char userChoice ()
    { //returns r, p or s, based on the user's choice

	//print options: rock, paper, scissors
	speed (45, 500, "\nFire, Water or Grass?");
	//ask for user's choice. will need to store in String
	String choice = IBIO.inputString ("\nChoose either Fire, Water or Grass: ");

	//Loop: if invalid input, ask again
	while (!isValid (choice))
	{
	    speed (45, 500, "\nInvalid choice! Please input again.");
	    choice = IBIO.inputString ("\nChoose either Fire, Water or Grass: ");

	}
	//stopping condition is the isValid method!!
	//something like: while(!isValid(choice))

	//If: to standardize values
	//if you've got one of Rock, ROCK, rock, r, R, then return 'r'.
	//else if you've got one of Paper, PAPER, paper, p, P, then return 'p'.
	//else return 's';
	if (choice.equals ("fire") || choice.equals ("Fire") || choice.equals ("f") || choice.equals ("F") || choice.equals ("FIRE"))
	    return 'F';
	else if (choice.equals ("w") || choice.equals ("W") || choice.equals ("Water") || choice.equals ("WATER") || choice.equals ("water"))
	    return 'W';
	else
	    return 'G';
    }


    public char compChoice ()
    { //make a random number between 1 and 3
	//if the number is 1, return r; 2 return s; 3 return p
	int num = (int) (Math.random () * 3) + 1;
	if (num == 1)
	    return 'F';
	else if (num == 2)
	    return 'W';
	else
	    return 'G';
    }


    public char winner (char comp, char user)
    { //comp and user both hold one of r, s, p
	if (comp == user)
	    return 'b';
	else if ((comp == 'F') && (user == 'W'))
	    return 'u';
	else if ((comp == 'W') && (user == 'F'))
	    return 'c';
	else if ((comp == 'G') && (user == 'W'))
	    return 'c';
	else if ((comp == 'W') && (user == 'G'))
	    return 'u';
	else if ((comp == 'G') && (user == 'F'))
	    return 'u';
	else
	    return 'c';
	//returns c for computer, u for user and b for both

    }



    public void welcome ()
    {
	System.out.println ("*********************************");
	System.out.println ("Hi! Welcome to the PokeMart! ");
	System.out.println ("Remember there are no taxes here!");
	System.out.println ("You have " + points + " poke");
	System.out.println ("");
	System.out.println ("");

	char leave = 'y';
	while ((leave != 'y') || (leave != 'Y'))
	{
	    Store ();
	    leave = IBIO.inputChar ("Would you like anything else? (y/n): ");
	    if ((leave == 'n') || (leave == 'N'))
	    {
		System.out.println ("Thanks for visiting!");
		return;
	    }
	}

    }


    public void Store ()
    {

	System.out.println ("Here's a list of items we have.");
	System.out.println ("1. Water Stone - 300 poke\n2. Fire Stone - 300 poke\n3. Grass Stone - 300 poke\n4. Useless junk - 900 poke");
	System.out.println ("");
	char choose = IBIO.inputChar ("Which item would you like?(1, 2, 3, 4): ");


	int waterStone = (300);
	int fireStone = (300);
	int grassStone = (300);
	int junk = (900);

	if (choose == '1')
	{
	    char yesno = IBIO.inputChar ("That will cost 300 poke, are you sure you want a Water Stone? (y/n) ");
	    if ((yesno == 'y') || (yesno == 'Y'))
	    {
		System.out.println ("");
		System.out.println ("Your total is " + waterStone + " poke");
		if (points < waterStone)
		{
		    System.out.println ("Sorry you dont have enough poke for this item.");
		    return;
		}
		else
		    points = -300;
		System.out.println ("Congrats, you bought the Water stone.");
	    }
	    else
		return;
	}
	else if (choose == '2')
	{
	    char yesno = IBIO.inputChar ("That will cost 300 poke, are you sure you want a Fire stone? (y/n) ");
	    if ((yesno == 'y') || (yesno == 'Y'))
	    {
		System.out.println ("");
		System.out.println ("Your total is " + fireStone + " poke");
		if (points < fireStone)
		{
		    System.out.println ("Sorry you dont have enough poke for this item.");
		    return;
		}
		else
		    points = -300;
		System.out.println ("Congrats, you bought the Fire stone.");
	    }
	    else
		return;
	}
	else if (choose == '3')
	{
	    char yesno = IBIO.inputChar ("That will cost 300 poke, are you sure you want a Grass Stone? (y/n) ");
	    if ((yesno == 'y') || (yesno == 'Y'))
	    {
		System.out.println ("");
		System.out.println ("Your total is " + grassStone + " poke");
		if (points < grassStone)
		{
		    System.out.println ("Sorry you dont have enough poke for this item.");
		    return;
		}
		else
		    points = -300;
		System.out.println ("Congrats, you bought the Grass stone.");
	    }
	    else
		return;
	}
	else if (choose == '4')
	{
	    char yesno = IBIO.inputChar ("That will cost 900 poke, are you sure you want Useless Junk? (y/n) ");
	    if ((yesno == 'y') || (yesno == 'Y'))
	    {
		System.out.println ("");
		System.out.println ("Your total is " + junk + " poke");
		if (points < junk)
		{
		    System.out.println ("Sorry you dont have enough poke for this item.");
		    return;
		}
		else
		    points = -900;
		System.out.println ("Congrats, you bought the Useless junk.");
	    }
	    else
		return;
	}
    }
}


