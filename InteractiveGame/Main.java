package InteractiveGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		Environment e1 = new Environment();
		
		Obstacles o1 = new Obstacles("Hidden Well", "You have fell down a Well! Talk about a bad start. "
				+ "\nSomeone should have put a sign up .. " + "\nLose 1 life", 1, 0, 1);
		Obstacles o2 = new Obstacles("Crazy Metrolink Prices", "You have been caught without a ticket! "
				+ "\nYou are fined 1 life .. ", 1, -2, 5);
		Obstacles o3 = new Obstacles("Poisionous Fruit Pastles", "You could not resist the orange sweets! "
				+ "\nYou lose 1 life .. ", 1, 1, 4);
		Obstacles o4 = new Obstacles("Exploding Galaxy Note7", "You think you found a phone.. unfortunately its a note7 "
				+ "\nIt spontaniously combusts"+"\nYou lose 1 life .. ", 1, 0, 2);
		
		e1.obstacles.add(o1);
		e1.obstacles.add(o2);
		e1.obstacles.add(o3);
		e1.obstacles.add(o4);
		
		m.getPlayerDetails(e1);
		
		

	}
	
	
	public void getPlayerDetails(Environment e1) {
		
		System.out.println("Hello Wanderer, what shall thou refer to you as throughout this Quest?");
		String name = "";
		name = getInput(name);
		
		Player p1 = new Player(name, 3, 0, 0);
		System.out.println("You have "+p1.getNoOfLifes()+" lifes "+p1.getPlayerName()+", make them count!");
		chapterOneStart(p1, e1);
	}
	
	public void requestDirection(Player p1, Environment e1) {
		System.out.println("Please indicate (N)orth (E)ast (W)est or (S)outh ..");
		String direction = "";
		direction = getInput(direction);
		
		if(direction.equals("N")) {
			
			proceedNorth(p1, e1);
		}
		else if (direction.equals("E")) {
			
			proceedEast(p1, e1);
		}
		else if (direction.equals("W")) {
			
			proceedWest(p1, e1);
		}
		else if (direction.equals("S")) {
			
			proceedSouth(p1, e1);
		}
		
	}
	
	public void chapterOneStart(Player p1, Environment e1) {
		System.out.println("\n-- CHAPTER ONE --");
		
		System.out.println("\n" + p1.getPlayerName()+", You awaken, in a groggy state." + 
	"\nYou look around you, only to realise that your surrounded by barren moore ...");
		System.out.println("\nType (look) to look around your surroundings");
		
		String input = "";
		input = getInput(input);
		
		if(input.equals("look")) {
			System.out.println("\nGrey, gloomy clouds hang overhead. " + 
		"\nYou look around to discover errie woodlands lurking in the backdrop, with "+"\nswapland towards the South.");
			System.out.println("\nYou notice a small compass in your left hand, displaying the goal coordinates.");
			
			
			requestDirection(p1, e1);
			e1.showCompass(p1);
			
		}
		else {
			String name = p1.getPlayerName();
			System.out.println("\nYou havent time for grammatical errors " + name
					+ ", you need to get out of here! "+"\nGrammar Nazi takes a life.");
			
			p1.setNoOfLifes(p1.getNoOfLifes()-1);
			
			p1.checkDead(p1);
			
			
				System.out.println("Lifes remaining: "+p1.getNoOfLifes() + "\n");
				requestDirection(p1, e1);
			
			
			
		}
		chapterOneMiddle(p1, e1);
	}
	
	public void chapterOneMiddle(Player p1, Environment e1) {
		String input = "";
		
		System.out.println("\nAs you move towards the " + p1.getDirection() + ", the sun sets infront of you.");
		System.out.println("You hear faint screams in the distance, but you are unsure where they are coming from.");
		requestDirection(p1, e1);
		
		System.out.println("\nAs you travel " + p1.getDirection() + ", the screaming becomes louder and louder .. you begin to run");
		System.out.println("** Running requires you to move twice **\n");
		requestDirection(p1, e1);
		requestDirection(p1, e1);
		Environment e = new Environment();
		e.showCompass(p1);
		
		
		System.out.println("A shadow emerges from behind a tree, you freeze. (-->look)");
		input = getInput(input);
		
		if (!(input.equals("look"))) {
			grammarNazi(p1);	
		}
		
		System.out.println("\nThe silhouette seems to notice you, it begins to creep out from behind a tree");
		System.out.println("You hear a whisper, you cant yet make it out ..");
		System.out.println("You continue moving");
		requestDirection(p1, e1);
		e.showCompass(p1);
		
		chapterOneEnd(p1, e1);
	}
	
	public void chapterOneEnd(Player p1, Environment e1){
		String input = "";
		System.out.println("\n"+p1.getDirection()+" away from the voice, you give a sigh of relief.. "
				+"\n..because that was creepy AF");
		System.out.println("\nYou move towards the:");
		requestDirection(p1, e1);
		System.out.println("\nAs you move "+p1.getDirection()+", everything suddenly goes silent.."
				+"\nYou strain your eyes trying to look into the distance. (-->look)");
		
		input = getInput(input);
		
		if (!(input.equals("look"))) {
			grammarNazi(p1);	
		}
		
		System.out.println("\nYou can just about make out gates ahead, a sense of hope floods your body.");
		System.out.println("BUT THEN ..");
		System.out.println("You can hear the whispers begin to increase in volume" + 
		"\nThey start repeating faster and faster"+"\nIt eventually gets close enough to the point you can hear clearly..");
		requestDirection(p1, e1);
		
		System.out.println("*Whispers* '"+p1.getPlayerName()+"'");
		System.out.println("*Screams* '"+p1.getPlayerName()+"!'");
		
		System.out.println("\nRUN BEFORE ITS TOO LATE!");
		requestDirection(p1, e1);
		requestDirection(p1, e1);
		Environment e = new Environment();
		e.showCompass(p1);
		
		chapterTwoStart(p1, e1);
	}
	
	public void chapterTwoStart(Player p1, Environment e1) {
		System.out.println("\n-- CHAPTER TWO --");
		
		// get to the gates etc whats behind them?
		
		while (!(e1.checkGoal(p1))){
			requestDirection(p1, e1);
			requestDirection(p1, e1);
			e1.showCompass(p1);
		}
		
	}
	
	public void grammarNazi(Player p1) {
		System.out.println("\nYou dont have time for spelling mistakes, grammar nazi takes a life.");
		p1.setNoOfLifes(p1.getNoOfLifes()-1);
		
		
		if(p1.checkDead(p1) == true) {
			System.exit(0);
		}
		else {
			System.out.println("Lifes remaining: "+p1.getNoOfLifes());
			//requestDirection(p1);
		}
	}
	
	public void proceedNorth(Player p1, Environment e1) {
		p1.setyVal(p1.getyVal()+1);
		p1.setDirection("North");
		
		e1.checkGoal(p1);
		e1.checkOutBounds(p1);
		e1.checkObstacles(p1, e1);
	}
	
	public void proceedEast(Player p1, Environment e1) {
		p1.setxVal(p1.getxVal()+1);
		p1.setDirection("East");
		e1.checkGoal(p1);
		e1.checkOutBounds(p1);
		e1.checkObstacles(p1, e1);
	}
	
	public void proceedSouth(Player p1, Environment e1) {
		p1.setyVal(p1.getyVal()-1);
		p1.setDirection("South");
		e1.checkGoal(p1);
		e1.checkOutBounds(p1);
		e1.checkObstacles(p1, e1);
	}
	
	public void proceedWest(Player p1, Environment e1) {
		p1.setxVal(p1.getxVal()-1);
		p1.setDirection("West");
		e1.checkGoal(p1);
		e1.checkOutBounds(p1);
		e1.checkObstacles(p1, e1);
	}
	
	public String getInput(String input) {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		return input;
	}
	public int getInput(int input) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		input = Integer.parseInt(in);
		return input;
	}

}
