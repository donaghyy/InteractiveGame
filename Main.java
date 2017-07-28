package InteractiveGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

	}
	
	public void getPlayerDetails() {
		Player p1 = new Player();
		System.out.println("Hello Warrior, what shall thou refer to you as throughout this Quest?");
		String name = "";
		name = getInput(name);
		
		p1.setPlayerName(name);
		p1.setNoOfLifes(1);
		p1.setxVal(0);
		p1.setyVal(0);
	}
	
	public void requestDirection() {
		
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
